package com.lgi.ui.commonUtils;

import java.io.BufferedReader;


import com.lgi.ui.automationJar.*;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import com.lgi.ui.automationJar.runAut;
import com.lgi.ui.commonUtils.Driver;
import com.lgi.ui.commonUtils.Webservice;
import com.lgi.ui.testAction.TestAction;

public class Driver {

	private static String modem = null;
	private static String browser = null;
	private static FirefoxProfile profile = null;
	public static Map<String, Object> hashFirmware = new LinkedHashMap<String, Object>();
	public static String firmwareVersionColumnName = null;
	public static Webservice ws = new Webservice();
	private static Logger log = null;
	private static BufferedReader br = null;
	private static FileInputStream fis = null;
	private static Properties prop = new Properties();
	public static String pathEncryptionFile = "";
    public 
	Driver() {

	}

	static {
		try {
			modem = runAut.modem;
			browser = runAut.browser;

			fis = new FileInputStream("testSetup.properties");
			prop.load(fis);

			String path = prop.getProperty("DownloadPath");
			profile = new FirefoxProfile();
			profile.setPreference("browser.download.folderList", 2);
			profile.setPreference("browser.download.dir", path);
			profile.setPreference("browser.upload.dir", path);

		} catch (IOException ex) {
			// TODO Auto-generated catch block
			log.info("Class: " + new Object() {
			}.getClass().getEnclosingClass().getName() + ", Static Block, Message:" + ex.getMessage());
		}
	}

	private static WebDriver driver = null;

	public static WebDriver getDriver() {


		return driver;
	}

	public static void closeDriver() {
		

			driver.quit();
		

		
	}

	public static void resetmodem()  
	{


		ModemFactoryReset reset = new ModemFactoryReset();
		reset.FactoryResetModem();
		driver.quit();
	}

	// Strate the web driver and access the gateway UI
	public static WebDriver openModel() 

	{
		if (runAut.lan_or_wan.compareTo("wan")==0)
		{
			ResetPassword reset= new ResetPassword();
			reset.ResetPasswordLanOrWan("wan");
			
		}

		try 
		{

			switch (browser.toLowerCase()) {

			case "firefox":
				driver = new FirefoxDriver(profile);
				break;

			case "chrome":
				System.setProperty("webdriver.chrome.driver", prop.getProperty("pathChromeDriver"));
				driver = new ChromeDriver();
				break;

			case "ie":
				System.setProperty("webdriver.ie.driver", prop.getProperty("pathIEDriver"));
				driver = new InternetExplorerDriver();
				break;

			default:
				driver = new FirefoxDriver(profile);
			}

			// Gateway IP
			String url;
			
			
			if (runAut.lan_or_wan.equals("lan"))
					url = parsingCSVFile("DefaultGateway");
			else
			{	
				
				
			url = parsingCSVFile("CMIPAddress")+":8080";
			}
			if (!url.contains("http"))
				url = "http://" + url + "/";
			//log.info("Default gateway is " + url);
			driver.get(url);
			driver.manage().window().maximize();

			driver.manage().deleteAllCookies();

			Thread.sleep(1000 * 5);

			driver.navigate().refresh();
			Thread.sleep(1000 * 8);
			// driver.get(url);

		} 
		catch (Exception ex) 
		{
			log.info("Class: " + new Object() {
			}.getClass().getEnclosingClass().getName() + ", Method: " + new Object() {
			}.getClass().getEnclosingMethod().getName() + ", Message: " + ex.getMessage());
		}

		return driver;
	}

	public static WebDriver openMasterModel() {
		try {
			log.info("Login through master URL");
			switch (browser.toLowerCase()) {

			case "firefox":
				driver = new FirefoxDriver(profile);
				break;

			case "chrome":
				System.setProperty("webdriver.chrome.driver", prop.getProperty("pathChromeDriver"));
				driver = new ChromeDriver();
				break;

			case "ie":
				System.setProperty("webdriver.ie.driver", prop.getProperty("pathIEDriver"));
				driver = new InternetExplorerDriver();
				break;

			default:
				driver = new FirefoxDriver(profile);
			}

			String url = prop.getProperty("masterURL");

			if (!url.contains("http"))
				url = "http://" + url + "/";

			driver.get(url);
			driver.manage().window().maximize();

			driver.manage().deleteAllCookies();

			Thread.sleep(1000 * 10);

		} catch (Exception ex) {
			log.info("Class: " + new Object() {
			}.getClass().getEnclosingClass().getName() + ", Method: " + new Object() {
			}.getClass().getEnclosingMethod().getName() + ", Message: " + ex.getMessage());
		}

		return driver;
	}

	public static Logger getLogger() {
		log = Logger.getLogger("uitestlogger");
		return log;
	}

	// Gets the data from TestData.xls
	public static String getTestData(FileInputStream fis, String feature_name, String data_key) {
		
		org.apache.poi.ss.usermodel.Workbook wb = null;
		org.apache.poi.ss.usermodel.Sheet ws = null;
		Row row = null;
		Cell cell, cell0;

		int i = 0, j = 0;
		String str = null;

		boolean found = false;

		try {

			wb = WorkbookFactory.create(fis);
			ws = wb.getSheetAt(0);

			// Total no.of rows in sheet
			int nRow = ws.getLastRowNum() + 1;

			// Debugging purpose
			// log.info("No. of rows in Testdata file: " + nRow);
			// Debugging purpose

			for (i = 0; i < nRow; i++) {
				row = ws.getRow(i);
				cell0 = row.getCell(0);

				if (cell0 != null) {
					//log.info(cell0.getStringCellValue());
					if (cell0.getStringCellValue().equalsIgnoreCase((feature_name))) {

						found = true;
						break;
					}
				}
			}

			int nCol;

			if (found) 
			{

				nCol = ws.getRow(i).getLastCellNum(); // Total no.of columns in that row
				
				 //Debugging purpose
				 //log.info("No. of cols in the found row: " + nCol);
				 //Debugging purpose

				String key = null;
				for (j = 2; j < nCol; j = j + 2) 
				{
					cell = row.getCell(j - 1);
					key = cell.getStringCellValue();

					// Debugging purpose
//					log.info("cell values are: "+cell);
//					log.info("key from xls: " + key);
//					
					// Debugging purpose

					if (cell != null) 
					{
						if (key.equals((data_key))) 
						{ // If data_key is keyDynamic, gets data from csv file
													// else gets data from TestData xls file

							if ((data_key.contains("keyDynamic"))) 
							{

								str = parsingCSVFile(row.getCell(j).getStringCellValue());

								if (data_key.equals("keyDynamic") || data_key.equals("keyDynamic1")
										|| data_key.equals("keyDynamic2")) {

								} else if (data_key.contains("keyDynamicIPfield4+")) {

									int ip4 = Integer.parseInt(str.split("\\.")[3]);
									int n = Integer.parseInt(data_key.split("\\+")[1]);

									ip4 = ip4 + n;
									str = Integer.toString(ip4);
								} else if (data_key.equals("keyDynamic_Append")) {

									str = str + "automation";
								} else if (data_key.equals("keyDynamicIPfield4")) {

									str = str.split("\\.")[3];
								}
                                else if (data_key.equals("keyDynamic_Append/24")) {

									str = str + "/24";
								} 
								 else if (data_key.equals("keyDynamicMACAddress1")) {

										str = str.split(":")[0];
										
									} 
								 else if (data_key.equals("keyDynamicMACAddress2")) {

										str = str.split(":")[1];
										
									} else if (data_key.equals("keyDynamicMACAddress3")) {

										str = str.split(":")[2];
										
									}else if (data_key.equals("keyDynamicMACAddress4")) {

										str = str.split(":")[3];
										
									}else if (data_key.equals("keyDynamicMACAddress5")) {

										str = str.split(":")[4];
										
									}else if (data_key.equals("keyDynamicMACAddress6")) {

										str = str.split(":")[5];
										
									}
								
								//rushi
                                    else if (data_key.equals("keyDynamicAutomationLANAddress5")) {

                                           str = str.split(":")[4];
                                           
                                    } else if (data_key.equals("keyDynamicAutomationLANAddress6")) {

                                           str = str.split(":")[5];
                                           
                                    } else if (data_key.equals("keyDynamicAutomationLANAddress7")) {

                                           str = str.split(":")[6];
                                           
                                    } else if (data_key.equals("keyDynamicAutomationLANAddress8")) {

                                           str = str.split(":")[7];
                                           
                                    }

								
								 else if (data_key.contains("keyDynamicIP+")) {

									String ip1 = str.split("\\.")[0];
									String ip2 = str.split("\\.")[1];
									String ip3 = str.split("\\.")[2];
									int ip4 = Integer.parseInt(str.split("\\.")[3]);

									int n = Integer.parseInt(data_key.split("\\+")[1]);

									ip4 = ip4 + n;

									str = ip1 + "." + ip2 + "." + ip3 + "." + ip4;
								} else if (data_key.contains("keyDynamicMACfield_")) {

									int field = Integer.parseInt(key.split("_")[1]);
									str = str.split(":")[field - 1];
								} else if (data_key.contains("keyDynamic_trimMAC")) {

									str = str.replaceAll(":", "");
								} else if (data_key.contains("keyDynamicPassword")) {

									str = str.substring(0, 4);
								}

								break;
							} 
							
							else {
								cell = row.getCell(j);
								if (cell != null) {
									switch (cell.getCellType()) {

									case Cell.CELL_TYPE_NUMERIC:
										int n_val = (int) cell.getNumericCellValue();
										str = Integer.toString(n_val);
										break;

									case Cell.CELL_TYPE_STRING:

										str = cell.getStringCellValue();
										break;
									}
								}
								break;
							}
						}
					} else
						break;
				}

			}
		} catch (Exception ex) {
			log.info("Class: " + new Object() {
			}.getClass().getEnclosingClass().getName() + ", Method: " + new Object() {
			}.getClass().getEnclosingMethod().getName() + ", Message: " + ex.getMessage()
					+ ", Supporting Message: SeleniumConfigData read error.");

		}
		return str;
	}

	// Get data from Selenium cofig file
	public static String parsingCSVFile(String key) 
	{

		String ret = "Data not found in csv file";

		try {
			br = new BufferedReader(new FileReader(prop.getProperty("pathSeleniumConfigData")));

			String line = "";
			String cvsSplitBy = ",";
			String[] data = null;

			while ((line = br.readLine()) != null) {

				data = line.split(cvsSplitBy);
				if (data[0].equalsIgnoreCase(key)) {
					ret = data[1];
					break;
				}
			}
		} catch (Exception ex) {

			log.info("Class: " + new Object() {
			}.getClass().getEnclosingClass().getName() + ", Method: " + new Object() {
			}.getClass().getEnclosingMethod().getName() + ", Message: " + ex.getMessage()
					+ ", Supporting Message: SeleniumConfigData read error.");
			System.exit(0);
		}

		return ret;

	}

	public static String firmwareControlling() 
	{
		
		String fversion = null;
		log = Driver.getLogger();
		String res = "Pass";

		try 
		{
			// get the current firmware version from selenium config file
			fversion = Driver.parsingCSVFile(runAut.modem);

			if (fversion.equals("Data not found in csv file")) {
				res = "Gateway model is not found in Selenium config file";
				log.info("Class: " + new Object() {
				}.getClass().getEnclosingClass().getName() + ", Method: " + new Object() {
				}.getClass().getEnclosingMethod().getName() + ", Message: " + res);
				return res;
			} else {

				hashFirmware = ws.firmwareFunctional(runAut.modem, fversion);
				Object obj = (Object) new Object();

				List<Object> keylistWeb_Firmware = new LinkedList<Object>();
				List<Object> valuelistWeb_Firmware = new LinkedList<Object>();
				for (Object key : hashFirmware.keySet()) {
					keylistWeb_Firmware.add(key);
					obj = hashFirmware.get(key);
					valuelistWeb_Firmware.add(obj);

				}

				firmwareVersionColumnName = (String) valuelistWeb_Firmware.get(1);
				
			}

		} 
		catch (Exception ex) 
		{
			res = "Fail as exception occurred in firmwareControlling method";
		}

		return res;
	}

	public static String psToolColumnIndexValue(String psToolCmdvalue) {
		String line = null;
		BufferedReader br = new TestAction().runCommand(psToolCmdvalue);
		String output = null;
		try {
			int indexStart = -1;
			while ((line = br.readLine()) != null) {

				if (line.contains("ID")) {
					indexStart = line.indexOf("ID");

				}
				if (!line.contains("ID")) {
					output = line.substring(indexStart, indexStart + 2).trim();
					log.info("Value received for PSTool -i:" + output);
					Integer i = Integer.parseInt(output);
				}
				try {

				} catch (Exception ex) {
					log.info("Value received for PSTool -i is not an integer. So default value is passed=2");
					output = "2";
				}
			}
		} catch (Exception ex) {
			log.info("Class: " + new Object() {
			}.getClass().getEnclosingClass().getName() + ", Method: " + new Object() {
			}.getClass().getEnclosingMethod().getName() + ", Message: " + ex.getMessage()
					+ ", Supporting Message: Value received for PSTool Id is not appropriate, thus default value 2 is assigned.");
			output = "2";
		}
		return output;

	}

	/* This method will give the last file modified in the directory passed */
	public static File lastFileModified(String dir) {
		File fl = new File(dir);
		File[] files = fl.listFiles(new FileFilter() {
			public boolean accept(File file) {
				return file.isFile();
			}
		});
		long lastMod = Long.MIN_VALUE;
		File choice = null;
		for (File file : files) {
			if (file.lastModified() > lastMod) {
				choice = file;
				lastMod = file.lastModified();
			}
		}
		return choice;
	}

	/* Method to call the lastFileModified method to retrieve the file name */
	public static String deleteSavedFile() {

		String result = null;
		try {
			try 
			{
				
				String pathEncryptionDirectory = prop.getProperty("pathEncryptionDirectory");
				
				
				

				
				File folder = new File(pathEncryptionDirectory);

				
				
				File[] listOfFiles = folder.listFiles();
				
				
				log.info("Expected Result: Delete "+ listOfFiles.length+ " file(s)"); 
				for (int i=0;i<listOfFiles.length;i++)
				{	
					log.info("....................Deleting File-"+listOfFiles[i].getName());
					File file = new File(pathEncryptionDirectory+listOfFiles[i].getName() );
					file.delete();
				}
				
				listOfFiles = folder.listFiles();
				if(listOfFiles.length==0)
				{ 
					
					log.info("Actual Result: All Files are Deleted"); 
					result="Pass";
				}
			} 
			
			catch (Exception ex) 
			{
				log.info("No file found in at location:" + prop.getProperty("pathEncryptionDirectory"));

			}

			//boolean success = new File(pathEncryptionFile).delete();

//			if (success) {  
//				result = "Pass";
//
//			} else {
//				log.info("File not deleted in first attempt");
//				result = "File not deleted";
//				File file = new File(pathEncryptionFile);
//				boolean successCheck = file.delete();
//				log.info("successCheck=" + successCheck);
//				if (successCheck)
//					result = "Pass";
//				else
//					result = "File not deleted in second attempt";
//			}
		} catch (Exception ex) {
			// TODO Auto-generated catch block
			result = "File not deleted";
			log.info("Class: " + new Object() {
			}.getClass().getEnclosingClass().getName() + ", Method: " + new Object() {
			}.getClass().getEnclosingMethod().getName() + ", Message: " + ex.getMessage() + ", Supporting Message: "
					+ result);

		}

		return result;

	}

	public static String editFile(String portSearch, String portDelete) {
		String status = null;
		try {

			String lanIP = parsingCSVFile("LANIPAddress");
			String portSearchFinal = lanIP + ":" + portSearch;
			String portDeleteFinal = lanIP + ":" + portDelete;
			ArrayList<String> fileList = new ArrayList<String>();

			BufferedReader fileRead = new BufferedReader(new FileReader(prop.getProperty("TFTPFilePath")));
			String line = "";
			String newLine = "\n";
			while ((line = fileRead.readLine()) != null) {

				if (line.contains(portSearchFinal)) {

					fileList.add(portSearchFinal);

				}

				else if (line.contains(portDeleteFinal)) {

					fileList.add("#" + portDeleteFinal);

				} else
					fileList.add(line);

			}
			FileOutputStream fileWrite = new FileOutputStream(prop.getProperty("TFTPFilePath"));
			for (String str : fileList) {
				fileWrite.write(str.getBytes());
				fileWrite.write(newLine.getBytes());

			}
			status = "Pass";
			fileRead.close();
			fileWrite.close();
		} catch (Exception e) {
			log.info("Class: " + new Object() {
			}.getClass().getEnclosingClass().getName() + ", Method: " + new Object() {
			}.getClass().getEnclosingMethod().getName() + ", Message: " + e.getMessage()
					+ ", Supporting Message: Failed as tftp server file could not be edited");
			status = "Failed as tftp server file could not be edited";
		}
		return status;
	}

}
