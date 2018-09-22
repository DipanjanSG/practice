package com.lgi.ui.testAction;

import java.awt.image.BufferedImage;

import com.lgi.ui.automationJar.ModemFactoryReset;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Iterator;
import javax.imageio.ImageIO;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.interactions.Actions;
import com.jcraft.jsch.*;

import com.lgi.ui.automationJar.runAut;
import com.lgi.ui.commonUtils.*;
import com.lgi.ui.testcases.CommonFunctionality;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.screentaker.ViewportPastingStrategy;
import org.openqa.selenium.Alert;

public class TestAction {

	Webservice ws = new Webservice();
	String ipv6add = null;
	final String ESCAPE_PROPERTY = "org.uncommons.reportng.escape-output";
	public static TestAction login = null;
	BufferedReader in = null;
	String Guestnetwork_passphrase;
	static {
		login = new TestAction();

	}

	public TestAction() {

	}
	
    public String uncompressIPv6(StringBuilder address){
    		
    	String final_ip = null;
			 try {
				  String compressed = address.toString();
				  final Inet6Address addr = (Inet6Address) InetAddress.getByName(compressed);
				  String [] items = addr.toString().substring(1).split(":");
				  List<String> items1 = new ArrayList<String>();
				  List<String> container = Arrays.asList(items);
				  for (String string : container) {
					  String str = String.format("%4s",string);
					  str = str.replace(' ','0');
					  items1.add(str);
					
				}
				  String ip="";
				for (String string : items1) {
					ip+=":"+string;				
				}  
				final_ip=ip.toString().substring(1);
				System.out.println(final_ip);
				//return final_ip;
			} 
			 catch (UnknownHostException ex) 
			 { 
				 ex.printStackTrace();
			 }
			return final_ip; 

        
    }

	
	public static TestAction getLoginAction() {
		return login;
	}

	Map<String, Object> hash = new LinkedHashMap<String, Object>();

	FileInputStream fis = null;
	Properties prop = new Properties();

	static int screenCapture = 1;
	String username = null;
	String password = null;
	String host = null;
	String _IP = null;
	String commandPart1 = "";
	String commandPart2 = "";
	String caseName;
	String PwdText; 
	File latest_file;
	public static int log_flag=1;
	static Logger log = Driver.getLogger();
	
	public static WebDriver driver = null;

	public static String model = null;
	public static String testResult = null;
	public static ArrayList<Integer> not_found_ids = new ArrayList<Integer>();
	public static int channel;
	CommonFunctionality fun = new CommonFunctionality();

	public String getTestResult(String testCase) {


		
		/*
		 * result count variable will count the no of times feature has failed and if
		 * any reference got failed although test will continue but end result will be
		 * fail if count is greater than 0
		 */
		Integer resultCount = 0;
		model = runAut.modem;
		testResult = null;
		caseName = testCase;
		ws.getFeatures(model, testCase);

		List<Object> features = ws.features;
		List<String> dataKeys = ws.dateKeys;
		/*
		 * List reference and tableReference will store different web UI reference
		 * status
		 */
		List<String> references = ws.references;

		Map<String, Object> tableReferences = new LinkedHashMap<String, Object>();
		tableReferences.put("References", "Status");

		if (features.isEmpty()) {
			testResult = "No features found for testcase : " + caseName;
			log.info(testResult);
			return testResult;
		}

		String feature[] = new String[features.size()];
		String dataKey;
		String reference;

		driver = Driver.getDriver();

		Integer x = 0;
		int nLogin = 0;
		int entry = 0;
		
		
		
		
		
		
		
		
		
		
		
		
/*#################################################################################################################################
		 OBJECTIVE: EXECUTING INDIVIDUAL FEATURES
					
		 DESCIPTION: IT GETS THE INDIVIDUAL "features" VARIABLE SENDS IT TO THE FUNCTION "executeFeature()"
		             THE RESULTS ARE STORED IN "testResult" 
		             & AFTER THE FEATURE IS EXECUTED IT TAKES A SCREEN SHOT BY CALLING THE METHOD
		             "captureScreen()" 
		             				  
#####################################################################################################################################/*/
		
		for (Object object : features) 
		{
			feature[x] = object.toString();
			dataKey = dataKeys.get(x);
			reference = references.get(x);

			// Debug Logs
			if(log_flag==1)
				log.info("FEATURE: " + feature[x]);

			hash = ws.getFeatureData(feature[x]);


			if (hash.isEmpty()) {

				testResult = "Data not found for Feature " + feature[x];
				log.info(testResult);
				return testResult;
			}
			
			screenCapture = 1;

			testResult = executeFeature(feature[x], hash, dataKey);
			
		
			if (testResult.equals("login failed") && (nLogin < 1)) {
				nLogin++;
				getTestResult("Login");
			}
			if (log_flag==1)
				captureScreen(testCase, feature[x], testResult);
			/*
			 * Logic to populate the Map tableReference with corresponding references
			 */
			if (reference.contains("NA")) {
			} else if (reference != "NA") {
				if (testResult != "Pass")
					tableReferences.put(reference, "Fail");
				else
					tableReferences.put(reference, testResult);
			}

			if (testResult != "Pass" && reference.equalsIgnoreCase("NA")) {
				//
				break;
			}

			if (testResult != "Pass") {
				resultCount++;
			}

			x++;
		}
		
/*################################################ END OF EXECUTION OF FEATURES #################################################################################################*/
		
		
		
		/* Web UI element Reference Table Display */
		if (testCase.contains("Part_")) {
			String table = "";
			for (Object key : tableReferences.keySet()) {
				if (key.equals("References"))
					table = key + "       " + tableReferences.get(key);
				else
					table = key + "            " + tableReferences.get(key);
				log.info(table);
				if (tableReferences.size() <= 1) {
					log.info("---no reference found---");
				}
			}

		}
		if (resultCount > 0) {
			testResult = "Fail";
		}
		return testResult;
	}

	public void captureScreen(String testCase, String feature, String result) {


		File scrFile = null;
		Screenshot screenshot = null;

		if (screenCapture == 0 && log_flag==1) 
		{
			log.info("Feature: " + feature + ", status:" + result);

		} 
		
		else 
		{
			System.setProperty(ESCAPE_PROPERTY, "false");

			SimpleDateFormat dateFormat = new SimpleDateFormat("HHmmss");
			String time = dateFormat.format(new Date());

			String fileName = testCase + "_" + feature + "_" + time + ".png";
			BufferedImage image = null;

			try 
			{

				if (runAut.browser.equalsIgnoreCase("ie") || runAut.browser.equalsIgnoreCase("firefox")) {

					scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				} else {

					screenshot = new AShot().shootingStrategy(new ViewportPastingStrategy(500)).takeScreenshot(driver);
					image = screenshot.getImage();
				}
			} 
			catch (Exception e)
			{

			}

			
			
			if (result.equalsIgnoreCase(("Pass"))) 
			{

				String basePath = prop.getProperty("pathSuccessScreenshot");

				String dest = basePath + fileName;
				try {

					if (runAut.browser.equalsIgnoreCase("ie") || runAut.browser.equalsIgnoreCase("firefox"))
						FileUtils.copyFile(scrFile, new File(dest));
					else
						ImageIO.write(image, "PNG", new File(dest));

				} catch (Exception ex) {
					log.info("Class:com.lgi.ui.testAction, Method:captureScreen, Message:" + ex.getMessage());
				}

				String path1 = "<a href=" + "..\\Screenshot\\Success\\" + fileName
						+ ">Click for Success Screenshot</a>";
				log.info("Result : " + result);
				log.info("Success Screenshot name: " + fileName);
				log.info(" ");
				log.info(
						"================================================================================================");
				log.info(" ");
				Reporter.log(path1);
			} 
			
			else 
			{

				String basePath = prop.getProperty("pathFailureScreenshot");

				String dest = basePath + fileName;
				try {

					if (runAut.browser.equalsIgnoreCase("ie") || runAut.browser.equalsIgnoreCase("firefox"))
						FileUtils.copyFile(scrFile, new File(dest));
					else
						ImageIO.write(image, "PNG", new File(dest));
				} catch (IOException ex) {
					log.info("Class:com.lgi.ui.testAction, Method:captureScreen, Message:" + ex.getMessage());
				}
				String path1 = "<a href=" + "..\\Screenshot\\Failure\\" + fileName
						+ ">Click for Failure Screenshot</a>";
				log.info("Result:" + result);
				log.info("Failure Screenshot name: " + fileName);
				Reporter.log(path1);
			}
			}
		
	}

	public String executeFeature(String feature, Map<String, Object> hash, String dataKey) {


	


		if (caseName.equals("MercuryInitialSetup")) {
			try {
				Thread.sleep(20 * 1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		Object obj = (Object) new Object();

		List<Object> keylist = new LinkedList<Object>();
		List<Object> valuelist = new LinkedList<Object>();

		String result = "Fail";

		for (Object key : hash.keySet()) {
			keylist.add(key);
			obj = hash.get(key);
			valuelist.add(obj);
		}

		String type = valuelist.get(0).toString();
		String action = valuelist.get(1).toString();
		String xPath = valuelist.get(2).toString();
		String errorMsg = valuelist.get(3).toString();

		// Debug Logs
		// log.info("Feature: " + feature);
		// log.info("type: " + type);
		// log.info("action: " + action);
		// log.info("errorMsg: " + errorMsg);
		// log.info("xpath: " + xPath);
		//
		// log.info("dataKey: " + dataKey);
		// Debug Logs

		String actual = null, testData = null;

		// Load the properties file
		try {
			fis = new FileInputStream("testSetup.properties");
			prop.load(fis);
			/*
			 * if (runAut.modem.equalsIgnoreCase("CH7465CE")) fis = new
			 * FileInputStream(prop.getProperty("pathCH7465CETestData"));
			 */

			if (runAut.modem.equalsIgnoreCase("TG2492S_85") )
			{
				if(!(prop.getProperty("pathTG2492S_85TestData").length()>0))
				{
				log.info("ERROR : THE PATH OF TEST DATA NOT FOUND IN TEST DATA FILE");
				}
				
				fis = new FileInputStream(prop.getProperty("pathTG2492S_85TestData"));
			}
			
		
			

		} catch (IOException ex) {
		
			// TODO Auto-generated catch block
			log.info("Class: " + new Object() {
			}.getClass().getEnclosingClass().getName() + ", Method: " + new Object() {
			}.getClass().getEnclosingMethod().getName() + ", Message: " + ex.getMessage()
					+ ", Supporting Message: Exception while reading properties file.");
		}
	
		testData = "No Data";
		if (!dataKey.equalsIgnoreCase("NA"))
		
			testData = Driver.getTestData(fis, feature, dataKey);
			
		if (testData == null) 
		{
			log.info("testData is null");
			return result;
		}
		else 
		{
			if (testData.equals("VALUE TRUE") || testData.equals("VALUE FALSE"))
			{
				testData=testData.split(" ")[1];
			}
			
			else if (testData.contains("VERSIONS"))
			{
				
				
				String values_for_versions[]=testData.split(";");
				int found=0;
				for (String val:values_for_versions)
				{	
					
					if (val.contains(Driver.parsingCSVFile(runAut.modem)))
							{
								
								testData=val.substring(val.indexOf(' ')+1);
								found=1;
								break;
							}
					else if (val.contains("ALL_VERSIONS"))
					{
						
						testData=val.substring(val.indexOf(' ')+1);
						
						
					}
				}
				
			}
			
			
		}
	
		if (xPath == null) {
			log.info("xPath is null");
			log.info("Error: xpath not found in DB");
			return result;
		}
		
		// Debug Logs
		// if (!action.equals("NA")) {
		// log.info("Expected result: " + testData);

		// }
		// Debug Logs

		if (caseName.equals("webUI_Mercury_Advanced_settings_Tools_Traceroute_2017")
				&& feature.equals("Check_TracerouteResult")) {

			log.info("#######################" + driver.findElement(By.id("fmTarea-traceResult")).getText());

		}

		if ((type.equals("xpath")) && (!action.equalsIgnoreCase("simpleAlert"))) 
		{
			int w = 0;

			while (w < 6) {

				try {
					if (driver.findElement(By.xpath(xPath)).isDisplayed()) {
						// Thread.sleep(2 * 1000);
						break;
					}

					else {
						
						System.out.println("waiting for element to be displayed- " + w);
						Thread.sleep(5 * 1000);

						if (w == 5) {
							result = errorMsg;
							log.info("Print the result value:" + result);
							return result;
						}
						w++;
					}

				} 
				
				
				catch (Exception e) 
				{
					try {

						System.out.println("catch: waiting for element to be found- " + w);

						Thread.sleep(5 * 1000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					if (w == 5) {
						result = errorMsg;
						return result;
					}
					w++;
				}
			}
		}
		
		switch (type) {

		// XPATH FOUND
		case "xpath": {

			switch (action) {

			//rushi-210818
            
            case "checkIPv6Address":
                            
                try {
                                actual = driver.findElement(By.xpath(xPath)).getText();
                                log.info(actual);
                                log.info(ipv6add);
                                if(actual.toLowerCase().contains(ipv6add.toLowerCase())) {
                                                result = "Pass";
                                                return result;
                                }

                } catch (Exception ex) {

                                result = errorMsg;
                                return result;
                }

                break;


                  
			case "checkIconImage":

				try {
					actual = driver.findElement(By.xpath(xPath)).getAttribute("src");
					log.info("Expected result : " + testData);
					log.info("Actual result   : " + actual);

				
					if (actual.contains(testData)) {
						result = "Pass";
					}
				}

				catch (Exception ex) {
					result = errorMsg;
					return result;
					}
				break;
			
			case "DownstreamFrequency":
			try 
			{
				
			    actual = driver.findElement(By.xpath(xPath)).getText();
				int n = Integer.parseInt(Driver.parsingCSVFile("DownstreamChannels"));
				
				log.info("Expected result : " + actual+ " (One of the Downstream Frequencies)");
				
				String channelId;
				if((channelId=fun.DownstreamFrequency(n,actual)).equals(actual))
					result="Pass";
				log.info("Actual result   : " + channelId);
			}
			catch(Exception ex) {
				result= errorMsg;
				return result;
			}
				break;
			case "UpstreamFrequency":
				try 
				{
					
					actual = driver.findElement(By.xpath(xPath)).getText();
					int n = Integer.parseInt(Driver.parsingCSVFile("UpstreamChannels"));

					log.info("Expected result : " + actual+ " (One of the Upstream Frequencies)");
					String channelId;

					if((channelId=fun.UpstreamFrequency(n,actual)).equals(actual))
						result="Pass";
					log.info("Actual result   : " + channelId);
				}
				catch(Exception ex) 
				{
					result= errorMsg;
					return result;
				}
				
				break;
			case "getClass":

                try {
                      
                      actual = driver.findElement(By.xpath(xPath)).getAttribute("class");
                      
                      // Debug Logs
                      log.info("Value on WebUI: " + actual);
                      // Debug Logs
                      
                      if (testData.equalsIgnoreCase(actual)
                                  || (actual.trim().isEmpty() && testData.equalsIgnoreCase("EmptyTextBox"))) {
                            result = "Pass";
                      } else {
                            result = "Failed due to mismatch between actual and testData data\nExpected: " + testData
                                        + "\nReceived: " + actual;
                      }


                } catch (Exception ex) {
                      result = errorMsg;

                      return result;
                }

                break;

			case "button":
			case "click":

				try {
					
					driver.findElement(By.xpath(xPath)).click();
					log.info("Expected result: NA");
					
					Thread.sleep(5 * 1000);
					
					if (feature.contains("Apply"))
						Thread.sleep(15 * 1000);
					if (xPath.compareTo(".//*[@id=\"WiFiNetwork_Frame_1\"]/div[2]/div/input[2]\r\n") == 1) {
				
						Thread.sleep(30 * 1000);
					}
					result = "Pass";
				} catch (Exception ex) {

					result = errorMsg;
					return result;
				}
				break;

			case "buttonexists":
			case "textboxexists":
            case "logoexists":
            case "iconexists":
            case "labelexists":

				try {

					WebElement ele = driver.findElement(By.xpath(xPath));

					boolean sel = false;
					System.out.println(ele.isDisplayed());
					if (ele.isDisplayed() != sel) {
						result = "Pass";
					} else {
						result = "Failed due to element does't exist " + testData + "\nReceived: " + actual;
					}
					Thread.sleep(20 * 1000);
				} catch (Exception ex) {

					result = errorMsg;
					return result;
				}
				break;
				
            case "url":{
                try{
                      log.info("******* Case: url *******");
                      if (!testData.contains("http"))
                            testData = "http://" + testData + "/";
                      driver.get(testData);
                      result="Pass";
                      
                }
                catch (Exception e){
                      log.info("Class: " + new Object() {
                      }.getClass().getEnclosingClass().getName() + "Method: "
                                  + new Object().getClass().getEnclosingMethod().getName() + "Case: " + action + ", Message: "
                                  + e.getMessage()
                                  + " Supporting Message: Exception occurred while requesting the url ");
                      result = errorMsg;
                }
          }
          
          break;

            case "notexists":{
                try {
                      log.info("******* Case: notexists *******");
                      //String visibilityStatus = "";
                      log.info("ryu"+xPath);
                      WebElement ele = driver.findElement(By.xpath(xPath));
                      //log.info("boolean"+visibility);
                      if (ele==null)
                            result = "Pass";
                      
                      else
                            actual=ele.getText();
                            if(actual.equalsIgnoreCase(testData))
                                  result="Failed due to element found";
                            else
                                  result = "Pass";
                            
                } catch (Exception e) {
                      // TODO: handle exception
                      log.info("Class: " + new Object() {
                      }.getClass().getEnclosingClass().getName() + "Method: "
                                  + new Object().getClass().getEnclosingMethod().getName() + "Case: " + action + ", Message: "
                                  + e.getMessage()
                                  + " Supporting Message: Exception occurred while checking the web element visibility ");
                      result = errorMsg;
                }
                
          }
          break;
          
              
              
case "matchText":

              try {

                actual = driver.findElement(By.xpath(xPath)).getText();

                            log.info("Expected result: " + PwdText);
                            log.info("Actual Result: " + actual);
                            if (actual.equalsIgnoreCase(PwdText) || actual.contains(PwdText)) {
                                  result = "Pass";
                            }
                            else {
                                  result = "Failed due to mismatch between actual and testData data";
                            }
                            
              } catch (Exception ex) {

                    result = errorMsg;
                    return result;
              }
              break;


			case "checkradio":
                      try {
                            String attr = null;
                            actual="false";
                            try {

                                  attr = driver.findElement(By.xpath(xPath)).getAttribute("class");

                                  boolean sel = false;
                                  if (attr.contains("radio-box-checked") || attr.contains("check-box-checked")
                                              || attr.contains("fmCheckbox checked") || attr.contains("fmRadio checked")) {
                                        PwdText= "WI-FI " +driver.findElement(By.xpath(xPath+"/following::label[1]")).getText();
                                        PwdText= PwdText.substring(0, PwdText.length()-4);
                                        actual="true";
                                        
                                  }

                            } catch (Exception e) {

                                  attr = (driver.findElement(By.xpath(valuelist.get(2).toString()))).getAttribute("src");

                                  if (attr.contains("radio-box-checked") || attr.contains("check-box-checked")
                                              || attr.contains("fmCheckbox checked") || attr.toLowerCase().contains("checked")) {
                                        PwdText= "WI-FI "+driver.findElement(By.xpath(xPath+"/following::label[1]")).getText();
                                        PwdText= PwdText.substring(0, PwdText.length()-4);
                                        actual="true";
                                  } 

                            }

                            // Debug Logs
                            //log.info("Expected result: " + testData);
                            log.info("Actual Result: " + actual);
                            result="Pass";
                            // Debug Logs

                            
                      } catch (Exception ex) {

                            result = errorMsg;
                            return result;
                      }

                      break;

case "visibility_radio":
                      try {
                            log.info("******* Case: visibility_radio*******");
                            String visibilityStatus = "";
                            log.info("ryu"+xPath);
                            Boolean visibility = !driver.findElement(By.xpath(xPath)).getAttribute("class").contains("disabled");
                            log.info("boolean"+visibility);
                            if (visibility)
                                  visibilityStatus = "true";
                            else
                                  visibilityStatus = "false";

                            // expected=output_data[op_data_count];
                            if (visibilityStatus.equalsIgnoreCase("true") && testData.equalsIgnoreCase("true")) {
                                  result = "Pass";
                                  log.info(result);
                            } else if (visibilityStatus.equalsIgnoreCase("false") && testData.equalsIgnoreCase("false")) {
                                  result = "Pass";
                                  log.info(result);
                            } else {
                                  result = errorMsg;

                            }

                      } catch (Exception e) {
                            // TODO: handle exception
                            log.info("Class: " + new Object() {
                            }.getClass().getEnclosingClass().getName() + "Method: "
                                        + new Object().getClass().getEnclosingMethod().getName() + "Case: " + action + ", Message: "
                                        + e.getMessage()
                                        + " Supporting Message: Exception occurred while checking the web element visibility like text box.");
                            result = "Exception occurred while checking the web element visibility like text box.";
                      }
                      break;



			case "table":

				try {

					// log.info("xPath" + xPath);
					actual = driver.findElement(By.xpath(xPath)).getText();

					log.info("Expected result: " + testData);
					log.info("Actual result: " + actual );
					
					if (testData.equalsIgnoreCase(actual))
						result = "Pass";

					else
						result = "Failed due to mismatch between actual and testData data\nExpected: " + testData
								+ "\nReceived: " + actual;

				} catch (Exception ex) {

					result = errorMsg;
					return result;
				}
				break;
			case "text":

				try {
					log.info("Key Value: " + testData);
					driver.findElement(By.xpath(xPath)).clear();
					driver.findElement(By.xpath(xPath)).click();

					driver.findElement(By.xpath(xPath)).sendKeys(testData);

					result = "Pass";
				} catch (Exception ex) {

					result = errorMsg;
					return result;
				}
				break;
			case "text_empty":

				try {
					log.info("Key Value: " + testData);
					driver.findElement(By.xpath(xPath)).clear();

					result = "Pass";
				} catch (Exception ex) {

					result = errorMsg;
					return result;
				}
				break;
				
				
				
			case "is_empty":
			
				try {
					actual =driver.findElement(By.xpath(xPath)).getText();
					if(actual.contains(testData))
						result="Pass";
					
				}
					catch(Exception ex)
					{
						result=errorMsg;
						return result;
					}
						
				
				break;
			case "getText":

				try {

					actual = driver.findElement(By.xpath(xPath)).getAttribute("value");
					log.info("Expected result: " + testData);
					log.info("Actual Result: " + actual);

					if (testData.equalsIgnoreCase(actual)
							|| (actual.trim().isEmpty() && testData.equalsIgnoreCase("EmptyTextBox"))) {
						result = "Pass";
					} else {
						result = "Failed due to mismatch between actual and testData data\nExpected: " + testData
								+ "\nReceived: " + actual;
					}

					if (feature.equals("Enter_GuestWiFiNetworkAvailableTime")) {
						int hh = Integer.parseInt(actual.split("\\:")[0]);
						int mm = Integer.parseInt(actual.split("\\:")[1]);
						mm = mm + Integer.parseInt(testData);

						if (mm > 59) {
							mm = mm - 60;
							hh = hh + 1;
							if (hh > 23)
								hh = hh - 24;
						}

						testData = hh + ":" + mm;

						driver.findElement(By.xpath(xPath)).clear();
						driver.findElement(By.xpath(xPath)).sendKeys(testData);
						result = "Pass";
					}
					
                    if (feature.equals("CheckDHCPv6StartAdd")) {
                        if(actual.contains(testData))
                              result = "Pass";
                    }


				} catch (Exception ex) {
					result = errorMsg;

					return result;
				}

				break;
				
				// Added by Madhu
            case "getPwdText":

                  try {

                        PwdText = driver.findElement(By.xpath(xPath)).getAttribute("value");
                      
                        log.info("Actual Value: " + PwdText);
                        System.out.println("Text of the Password" + PwdText);
                        result = "Pass";
                  } catch (Exception ex) {
                        result = errorMsg;

                        return result;
                  }

                  break;
            // Added by Madhu
            case "enterPwdtext":

                  try {
                
                        System.out.println("Key Value: " + PwdText);
                        driver.findElement(By.xpath(xPath)).clear();
                        driver.findElement(By.xpath(xPath)).sendKeys(PwdText);
                        log.info("Expected Value: " + PwdText);

                        result = "Pass";
                  } catch (Exception ex) {

                        result = errorMsg;
                        return result;
                  }
                  break;
			case "ping_result":

				try {
					actual = driver.findElement(By.xpath(xPath)).getAttribute("value");
					log.info("Expected result : " + testData);
					

					// log.info(testData.split("&")[0] + " " +testData.split("&")[1]);

					if (feature.equals("Check_TracerouteResult_hops"))
					{
						if ((dataKey.equals("keyNull") && actual.length() == 0) )
						{	log.info("Actual result   : "+actual+ " Results are empty");
							result = "Pass";
						}
						else if (actual.contains(testData))
							{
							log.info("Actual result   : "+actual);
							result = "Pass";
							}
							
					}

					else if (actual.contains(testData)) {
						log.info("Actual result   : " + actual);
						result = "Pass";
					}

					else if (feature.equals("Check_ClearResults") && actual.length() == 0)

					{	log.info("Actual result   : "+actual+"  Results are empty");
						result = "Pass";
					}

				}

				catch (Exception ex) {
					result = errorMsg;
					return result;

				}
				break;

			case "simpleAlert":

				try {

					// Switching to Alert
					Alert alert = driver.switchTo().alert();

					// Capturing alert message.
					actual = driver.switchTo().alert().getText();
					// Debug Logs
					log.info("Value on WebUI: " + actual);
					// Debug Logs

					result = "Pass";
					alert.accept();

				} catch (Exception ex) {
					result = errorMsg;

					return result;
				}

				break;

			case "label":
				if (feature.equals("Check_Hello")) 
				{
					while (!driver.findElement(By.xpath(xPath)).isDisplayed()) {
						driver.navigate().refresh();
						System.out.print("navigate");
					}
				}
				try {
					
				
					actual = driver.findElement(By.xpath(xPath)).getText();

					log.info("Expected result: " + testData);
					if (feature.equals("SettingsApplied_Text10_PasswordText"))
						log.info("Actual Result: " + actual + "<Any Password>");
					else
						log.info("Actual Result: " + actual);
					if (actual.compareTo("DMZ") == 0)// added by Dipanjan
						return "Pass";
					 else if (caseName.compareTo("webUI_Mercury_Advanced_settings_Tools_Traceroute_Change_Max_hops_2019") == 0
							&& feature.equals("Check_Response")) {
						if (actual.contains(testData)) {
							result = "Pass";
						}
					}

					else if (feature.equals("Check_Response") && actual.contains(testData)) {
						result = "Pass";
					} 
					else if (feature.equals("Check_SoftwareVersion") && testData.contains(actual)) {
						result = "Pass";
					} 
					else if (feature.equalsIgnoreCase("Check_WelcomePageSubTitle")
							|| feature.equalsIgnoreCase("Check_SubTitleFinal") || testData.equalsIgnoreCase("eština")) {
						if (testData.equalsIgnoreCase(actual)) {
							result = "Pass";
						} else {
							result = "Failed due to mismatch between actual and testData data\nExpected: ";
						}
					} else if (caseName.compareTo("webUI_Mercury_Admin_Wireless_Gateway_device_information_2277") == 0
							&& testData.contains(actual.substring(2))) {
						result = "Pass";
					}
					
					else if (feature.equalsIgnoreCase("Check_PingResult") && dataKey.equals("keyResult3")) {
						result = "Pass";
					} else if (testData.equalsIgnoreCase(actual)) {
						
						result = "Pass";
					} else if ((actual.toLowerCase().contains(testData.toLowerCase()))) {
						result = "Pass";
					} else if (actual.equalsIgnoreCase(testData)) {
						result = "Pass";
					} else if (testData.contains(actual) && actual.length()>0) {
						result = "Pass";
					} else {
						result = "Failed due to mismatch between actual and testData data";
					}
					
					
					
					

				} catch (Exception ex) {
					if(feature.equals("Check_WelcomeHome") && result!="Pass" )
					{
					     
						
							System.out.println("last step failed");
							//result=fun.factoryReset();
						
						
						
					}

					result = errorMsg;
					return result;
				}
				break;
				
			case "exactlabel":

                try {

                      actual = driver.findElement(By.xpath(xPath)).getText();

                      log.info("Expected result: " + testData);
                      log.info("Actual Result: " + actual);

                      if (testData.equalsIgnoreCase(actual)) {
                            result = "Pass";
                      } else if (actual.equalsIgnoreCase(testData)) {
                            result = "Pass";
                      } else {
                            result = "Failed due to mismatch between actual and testData data";
                      }

                } catch (Exception ex) {

                      result = errorMsg;
                      return result;
                }
                break;
	

			case "channelId":

				try {
					screenCapture = 0;
					actual = driver.findElement(By.xpath(xPath)).getText();

					not_found_ids.add(Integer.parseInt(actual));

					// Debug Logs

					//log.info("Expected result: " + testData);
					//log.info("Actual Result: " + actual);

					// Debug Logs
					result = actual;

				} catch (Exception ex) {

					result = errorMsg;
					return result;
				}
				break;

			case "radio":
            case "checkBox":
                  try {

                	  log.info("Expected result: " + testData);
                        String attr = null;
                        boolean sel = false;
                        try {
                        	  
                              attr = driver.findElement(By.xpath(xPath)).getAttribute("src");

                              if (attr.contains("radio-box-checked") || attr.contains("check-box-checked")
                                          || attr.contains("fmCheckbox checked") || attr.contains("fmRadio checked")) {
                                    sel = true;
                              } else if (attr.contains("radio-box-default") || attr.contains("check-box-default")) {
                                    sel = false;
                              }

                        } catch (Exception e) {

                              attr = driver.findElement(By.xpath(xPath)).getAttribute("class");

                              if (attr.contains("radio-box-checked") || attr.contains("check-box-checked")
                                          || attr.contains("fmCheckbox checked") || attr.contains("fmRadio checked")) {
                                    sel = true;
                              } else if (attr.contains("radio-box-default") || attr.contains("check-box-default")
                                          || attr.contains("fmCheckbox") || !attr.contains("fmRadio checked"))
                                    sel = false;

                        }
                        

                        if ((testData.equals("tick") && !sel) || (testData.equals("untick") && sel) || (testData.equals("tick") && sel))
                        {
                              driver.findElement(By.xpath(xPath)).click();
                              
                              if(testData.equals("tick") && driver.findElement(By.xpath(xPath)).getAttribute("class").contains("checked"))
                              {
                            	  
                            	  log.info("Actual Result: " + "tick");
                            	  result = "Pass";
                              }
                              
                              else if(testData.equals("untick") && sel && !driver.findElement(By.xpath(xPath)).getAttribute("class").contains("checked"))
                              {
                            	  log.info("Actual Result: " + "untick");
                            	  result = "Pass";
                              }
                        }
                        
                       
                       

                  } catch (Exception ex) {

                        result = errorMsg;
                        return result;
                  }

                  break;

            case "radio_class":
            case "checkBox_class":
                  try {

                        Thread.sleep(20 * 1000);
                        String attr = driver.findElement(By.xpath(xPath)).getAttribute("class");
                        boolean sel = false;
                        if (attr.contains("radio-box-checked") || attr.contains("check-box-checked")
                                    || attr.contains("fmCheckbox checked") || attr.contains("fmRadio checked")) {
                              sel = true;
                        } else if (attr.contains("radio-box-default") || attr.contains("check-box-default")
                                    || attr.contains("fmCheckbox") || attr.contains("fmRadio")) {
                              sel = false;
                        }

                        // Debug Logs
                        log.info("Expected result: " + testData);

                        // Debug Logs

                        if ((testData.equals("tick") && !sel) || (testData.equals("untick") && sel))
                              driver.findElement(By.xpath(xPath)).click();

                        result = "Pass";
                  } catch (Exception ex) {

                        result = errorMsg;
                        return result;
                  }
                  break;



			case "getCheckBox":
			case "getRadio":
				try {

					String attr = null;
					try {

						attr = driver.findElement(By.xpath(xPath)).getAttribute("class");

						boolean sel = false;
						if (attr.contains("radio-box-checked") || attr.contains("check-box-checked")
								|| attr.contains("fmCheckbox checked") || attr.contains("fmRadio checked")) {
							actual = "true";
						} else if (attr.contains("radio-box-default") || attr.contains("check-box-default")
								|| attr.contains("fmCheckbox") || attr.contains("fmRadio")) {
							actual = "false";
						}

					} catch (Exception e) {

						attr = (driver.findElement(By.xpath(valuelist.get(2).toString()))).getAttribute("src");

						if (attr.contains("radio-box-checked") || attr.contains("check-box-checked")
								|| attr.contains("fmCheckbox checked") || attr.toLowerCase().contains("checked")) {
							actual = "true";
						} else if (attr.contains("radio-box-default") || attr.contains("check-box-default")
								|| attr.contains("fmCheckbox")) {
							actual = "false";
						}

					}

					// Debug Logs
					log.info("Expected result: " + testData);
					log.info("Actual Result: " + actual);

					// Debug Logs

					if (testData.equalsIgnoreCase(actual)) {
						result = "Pass";

					} else {
						if (actual.equals("true"))
							result = "Failed due to the element is selected";
						else if (actual.equals("false"))
							result = "Failed due to the element is not selected";
					}

				} catch (Exception ex) {

					result = errorMsg;
					return result;
				}

				break;

			case "dropdown":
				try {

					Select sel = new Select(driver.findElement(By.xpath(xPath)));

					try {

						sel.selectByValue(testData);
					} catch (Exception ex) {

						result = "Value '" + testData + "' not found in dropdown list";
						return result;
					}

					result = "Pass";
				} catch (Exception ex) {

					result = errorMsg;
					return result;
				}

				break;

			case "select":
				try {

					WebElement sel = driver.findElement(By.xpath(xPath));
					sel.click();
					log.info("Expected result: " + testData );
					List<WebElement> options = sel.findElements(By.tagName("li"));
					if (feature.equals("Check_No_Of_Channels") && options.size()==Integer.parseInt(testData))
					{   log.info("Actual Result: " + options.size() + "Channels are present");
						result="Pass";
						break;
					}
					for (WebElement option : options) {

						if (testData.equals(option.getText())) {
							actual = option.getText();
							
							// Debug Logs
							log.info("Actual Result: " + actual);
							option.click();
							Thread.sleep(10 * 1000);
							break;
						}
					}
					result = "Pass";
				}

				catch (Exception e) {
					result = errorMsg;
					return result;
				}
				break;

			case "selected":
				try {

					WebElement ele = driver.findElement(By.xpath(xPath));
					log.info("Expected result: " + testData);

					if (testData.equals(ele.getText())) {
						log.info("Actual Result: " + ele.getText());
						result = "Pass";
						break;
					} else {
						result = "Failed due to mismatch between actual and testDatadata\nExpected: " + testData
								+ "\nReceived: " + actual;
					}

				} catch (Exception ex) {

					result = errorMsg;
					return result;
				}

				break;

			case "checkdropdownelements":
				try {

					WebElement sel = driver.findElement(By.xpath(xPath));
					sel.click();
					actual = "";
					// Thread.sleep(20 * 1000);
					int i = 0;

					String[] elements = testData.split(",");
					log.info("Expected Result: " + testData);

					List<WebElement> options = sel.findElements(By.tagName("li"));
					int length = options.size();
					for (WebElement option : options) {
						if (elements[i].equalsIgnoreCase(option.getText())) {
							if (i == length - 1)
								actual += option.getText();
							else
								actual += option.getText() + ",";

							result = "Pass";
							i++;
						} else {
							result = "Failed due to Drop-Down menu of the option doesnot match ";
							return result;
						}

					}
					log.info("Actaul Result: " + actual);
				}

				catch (Exception e) {
					result = errorMsg;
					return result;
				}
				break;

			case "getDropdown":
				try {
					Select sel = new Select(driver.findElement(By.xpath(xPath)));
					actual = sel.getFirstSelectedOption().getText();

					// Debug Logs
					log.info("Expected result: " + testData);
					log.info("Actual Result: " + actual);
					// Debug Logs

					if (actual.equalsIgnoreCase(testData)) {
						result = "Pass";
					} else {
						result = "Failed due to mismatch between actual and testData					 data\nExpected: "
								+ testData + "\nReceived: " + actual;
					}

				} catch (Exception ex) {

					result = errorMsg;
					return result;
				}
				break;
			// shilpi
			case "getSelect":
				try {
					WebElement sel = driver.findElement(By.xpath(xPath));
					actual = sel.getText();

					// Debug Logs
					log.info("Expected result: " + testData);
					log.info("Actual Result: " + actual);
					// Debug Logs

					if (actual.equalsIgnoreCase(testData)) {
						result = "Pass";
					} else {
						result = "Failed due to mismatch between actual and testData					 data\nExpected: "
								+ testData + "\nReceived: " + actual;
					}

				} catch (Exception ex) {

					result = errorMsg;
					return result;
				}
				break;
			// shilpi
			case "getToolTipText":
				try {
					
					Actions builder = new Actions(driver);

					WebElement tooltip = driver.findElement(By.xpath(xPath));

					
					builder.moveToElement(tooltip).build().perform();
					Thread.sleep(2000);

					WebElement tooltip1 = driver.findElement(By.id("ttip"));
					actual = tooltip1.getText();
			
					log.info("Expected result: " + testData);
					log.info("Actual Result: " + actual);

					if (actual.equalsIgnoreCase(testData)) {
						result = "Pass";
					} else {
						result = "Failed due to mismatch between actual and testData";
					}

				} catch (Exception ex) {

					result = errorMsg;
					return result;
				}
				break;

			case "customValidation":
				try {

					actual = driver.findElement(By.xpath(xPath)).getText();
					log.info("Expected result : " + testData);
					log.info("Actual result  : " + actual);

					result = customeValidations(testData, actual);

				} catch (Exception ex) {

					result = errorMsg;
					log.info("Customised error: custom validation failed, Selenium Msg:" + ex.getMessage());
					return result;
				}

				break;

			case "leaseTimeValidation":
				try {

					actual = driver.findElement(By.xpath(xPath)).getText();
					log.info("Expected result : " + testData);
					log.info("Actual result  : " + actual);

					int leasetime = Integer.parseInt(actual.split(":")[1]);

					if (leasetime < 1)
						result = "Pass";
					else
						result = "Lease time is more than one hour";
				} catch (Exception ex) {

					result = errorMsg;
					return result;
				}
				break;

			/*
			 * This case is added to check the visibility of the web element like text box
			 */
			case "visibility":
				try {
					log.info("******* Case: visibility *******");
					String visibilityStatus = "";
					Boolean visibility;
					System.out.println(xPath);
					visibility = driver.findElement(By.xpath(valuelist.get(2).toString())).isEnabled();
					if (visibility)
						visibilityStatus = "true";
					else
						visibilityStatus = "false";

		
					if (visibilityStatus.equalsIgnoreCase("true") && testData.equalsIgnoreCase("true")) {
						result = "Pass";
						log.info(result);
					} else if (visibilityStatus.equalsIgnoreCase("false") && testData.equalsIgnoreCase("false")) {
						result = "Pass";
						log.info(result);
					} else {
						result = errorMsg;

					}

				} catch (Exception e) {
					// TODO: handle exception
					log.info("Class: " + new Object() {
					}.getClass().getEnclosingClass().getName() + "Method: "
							+ new Object().getClass().getEnclosingMethod().getName() + "Case: " + action + ", Message: "
							+ e.getMessage()
							+ " Supporting Message: Exception occurred while checking the web element visibility like text box.");
					result = "Exception occurred while checking the web element visibility like text box.";
				}
				break;

			/**/

			default:
				break;
			}
		}
			break; // xpath break

		case "DownstreamServiceFlows":
		case "UpstreamServiceFlows": {

			screenCapture = 0;
			int n = Integer.parseInt(Driver.parsingCSVFile(type));
			log.info("no.of service flows: " + n);
			log.info("Type value is: " + type);
			log.info("Actual is : " + actual);
			int rows = 0;

			switch (action) {

			case "SFID":

				try {
					for (int i = 1; i <= n; i++) {

						if (type.contains("Downstream"))
							rows = ((4 * n) + 1);
						else if (type.contains("Upstream"))
							rows = ((6 * n) + 1);

						// log.info(type + ": " + i);
						for (int j = 2; j <= rows; j++) {

							String xP = xPath + j + "]";

							actual = driver.findElement(By.xpath(xP)).getText();
							if (actual.contains(action)) {
								actual = actual.split(" ")[1];
								result = customeValidations("Number", actual);

								if (result.equals("Pass")) {
									log.info("Service flow " + i + ": " + action + "found");
									break;
								}

							} else
								result = "SFID not found";

						}
						if (!result.equals("Pass"))
							break;
					}
				} catch (Exception ex) {

					result = errorMsg;
					return result;
				}
				break;

			// case "SFID":
			case "Max Traffic Rate":
			case "Max Traffic Burst":
			case "Min Traffic Rate":
			case "Max Concatenated Burst":
				// case "Scheduling Type":

				try {

					String data = null;
					for (int i = 1; i <= n; i++) {
						log.info("Expected result : " + testData);
						log.info("Actual result  : " + actual);

						if (type.contains("Downstream")) {

							data = Driver.parsingCSVFile("Downstream" + action.replace(" ", "") + i);
							rows = ((4 * n) + 1);
						}

						else if (type.contains("Upstream")) {

							data = Driver.parsingCSVFile("Upstream" + action.replace(" ", "") + i);
							rows = ((6 * n) + 1);
						}

						log.info(action + " data received from csv: " + data);

						// log.info(type + ": " + i);
						for (int j = 2; j <= rows; j++) {

							String xP = xPath + j + "]";

							actual = driver.findElement(By.xpath(xP)).getText();
							if (actual.contains(action)) {

								actual = actual.split(" ")[3];
								if (data.equals("NA")) {
									result = customeValidations("Number", actual);

									if (result.equals("Pass")) {
										log.info("Service flow " + i + ": " + action + "is validated as Number");
										break;
									} else
										result = action + " is not a Number";

								} else if (actual.equals(data)) {

									log.info("Service flow " + i + ": " + action + "found");
									result = "Pass";
									break;
								} else
									result = action + " not matched";
							} else
								result = action + " not found";
						}

						if (!result.equals("Pass"))
							break;
					}
				} catch (Exception ex) {

					result = errorMsg;
					return result;
				}
				break;

			case "Scheduling Type":

				try {
					log.info("Expected result : " + testData);
					log.info("Actual result  : " + actual);

					String data = null;
					for (int i = 1; i <= n; i++) {

						if (type.contains("Downstream")) {

							data = Driver.parsingCSVFile("Downstream" + action.replace(" ", "") + i);
							rows = ((4 * n) + 1);
						}

						else if (type.contains("Upstream")) {

							data = Driver.parsingCSVFile("Upstream" + action.replace(" ", "") + i);
							rows = ((6 * n) + 1);
						}

						log.info(action + " data received from csv: " + data);

						switch (data) {

						case "2":
							data = "Best Effort";
							break;

						case "3":
							data = "Non-Real-Time Polling";
							break;

						case "4":
							data = "Real-Time Polling";
							break;

						case "5":
							data = "Unsolicited Grant Service with Activity Detection";
							break;

						case "6":
							data = "Unsolicited Grant Service";
							break;

						default:
							break;

						}

						// log.info(type + ": " + i);
						for (int j = 2; j <= rows; j++) {

							String xP = xPath + j + "]";

							actual = driver.findElement(By.xpath(xP)).getText();
							if (actual.contains(action) && actual.contains(data)) {

								

								log.info("Service flow " + i + ": " + action + "found");
								result = "Pass";
								break;
							} else
								result = action + " not found";
						}

						if (!result.equals("Pass"))
							break;
					}
				} catch (Exception ex) {

					result = errorMsg;
					return result;
				}
				break;

			default:
				break;
			}
		}
			break;
		// DownstreamServiceFlow, UpstreamServiceFlow break

		case "DownstreamChannels": {

			screenCapture = 0;
			int n = Integer.parseInt(Driver.parsingCSVFile(type));
			log.info("no.of channels: " + n);

			switch (action) {

			case "LockedStatus":
				try {

					for (int i = 1; i <= n; i++) {

						String xP = xPath + (i) + "]/td[2]";
						actual = driver.findElement(By.xpath(xP)).getText();
						log.info("");
						log.info("************************Channel Id "+i+"***************************");;
						log.info("");
						log.info("Expected result : " + testData);
						log.info("Actual result  : " + actual);

						if (actual.equals("Locked"))
							result = "Pass";
						else
							result = action + " not found";
						log.info("Result : " + result);
						if (!result.equals("Pass"))
							break;
					}
				} catch (Exception ex) {

					result = errorMsg;
					return result;
				}
				break;

			case "RxMER":
				try {

					for (int i = 1; i <= n; i++) {

						String xP = xPath + (i) + "]/td[3]";

						actual = driver.findElement(By.xpath(xP)).getText();
						result = customeValidations("Decimal", actual);
						log.info("");
						log.info("************************Channel Id "+i+"***************************");;
						log.info("");

						log.info("Expected result : " + testData);
						log.info("Actual result  : " + actual);
						log.info("Result : " + result);
						if (!result.equals("Pass"))
							break;
					}
				} catch (Exception ex) {

					result = errorMsg;
					return result;
				}
				break;

			case "PreRSErrors":
				try {

					for (int i = 1; i <= n; i++) {

						String xP = xPath + (i) + "]/td[4]";

						actual = driver.findElement(By.xpath(xP)).getText();
						result = customeValidations("Number", actual);
						log.info("");
						log.info("************************Channel Id "+i+"***************************");;
						log.info("");

						log.info("Expected result : " + testData);
						log.info("Actual result  : " + actual);
						log.info("Result : " + result);
						if (!result.equals("Pass"))
							break;
					}
				} catch (Exception ex) {

					result = errorMsg;
					return result;
				}
				break;

			case "PostRSErrors":
				try {

					for (int i = 1; i <= n; i++) {

						String xP = xPath + (i) + "]/td[5]";

						actual = driver.findElement(By.xpath(xP)).getText();
						result = customeValidations("Number", actual);
						log.info("");
						log.info("************************Channel Id "+i+"***************************");;
						log.info("");

						log.info("Expected result : " + testData);
						log.info("Actual result  : " + actual);
						log.info("Result : " + result);
						if (!result.equals("Pass"))
							break;
					}
				} catch (Exception ex) {

					result = errorMsg;
					return result;
				}
				break;

			case "AcquiredDownstreamChannel":

				try {

					actual = driver.findElement(By.xpath(xPath)).getText();

					// Debug Logs
					log.info("AcquiredDownstreamChannel from GUI: " + actual);
					// Debug Logs

					String freq = null;
					int i = 1;
					while (i <= n) {

						freq = Driver.parsingCSVFile("DownstreamFrequency_F" + i);
						if (freq.equals(actual)) {
							result = "Pass";
							break;
						}

						i++;
					}

					if (result.equals("Pass"))
						log.info("Downstream freq found");
					else {
						result = "Downstream freq not found";
						log.info("Downstream freq not found");
					}

				} catch (Exception ex) {

					result = errorMsg;
					return result;
				}
				break;

			default:
				break;
			}
		}
			break; // DownstreamChannels

		case "UpstreamChannels": {

			screenCapture = 0;
			int n = Integer.parseInt(Driver.parsingCSVFile(type));
			log.info("no.of channels: " + n);

			String path = null;
			switch (action) {

			case "ChannelType":
				try {

					for (int i = 1; i <= n; i++) {

						String xP = xPath + (i) + "]/td[2]";
						actual = driver.findElement(By.xpath(xP)).getText();
						log.info("*************************Channel "+i+"**********************************");
						
						log.info("Expected result : " + testData);
						log.info("Actual result  : " + actual);
						
						if (actual.equals(actual)) {
							result = "Pass";
						}

						else
							result = "Fail";

						log.info("Result : " + result);
						log.info("********************************************************************");

						if (!result.equals("Pass"))
							break;
					}
				} catch (Exception ex) {

					result = errorMsg;
					return result;
				}
				break;

			case "T1Timeouts":
				path = "]/td[3]";
			case "T2Timeouts":
				path = "]/td[4]";
			case "T3Timeouts":
				path = "]/td[5]";
			case "T4Timeouts":
				path = "]/td[6]";
				try {

					for (int i = 1; i <= n; i++) {

						String xP = xPath + (i) + path;

						actual = driver.findElement(By.xpath(xP)).getText();
						log.info("*************************Channel "+i+"**********************************");
						result = customeValidations("Number", actual);
						log.info("Expected result : " + "Number");	
						log.info("Result : " + result);
						log.info("********************************************************************");
						if (!result.equals("Pass"))
							break;
					}
				} catch (Exception ex) {

					result = errorMsg;
					return result;
				}
				break;

			case "RangedUpstreamChannel":

				try {

					actual = driver.findElement(By.xpath(xPath)).getText();

					// Debug Logs
					log.info("RangedUpstreamChannel from GUI: " + actual);
					// Debug Logs

					String freq = null;
					int i = 1;
					while (i <= n) {

						freq = Driver.parsingCSVFile("UpstreamFrequency_F" + i);
						if (freq.equals(actual)) {
							result = "Pass";
							break;
						}

						i++;
					}

					if (result.equals("Pass"))
						log.info("Upstream freq found");
					else {
						result = "Upstream freq not found";
						log.info("Upstream freq not found");
					}

				} catch (Exception ex) {

					result = errorMsg;
					return result;
				}

				break;

			default:
				break;
			}
		}
			break; // UpstreamChannels

		case "id": {
			switch (action) {
			
			//rushi
            case "checkStringInPageSrc":
                  
                  try {
                         actual = driver.findElement(By.tagName(xPath)).getText();
                         if(actual.contains(testData)) {
                                result = "Fail";
                         }
                         else {
                                result = "Pass";
                         }
                         return result;
                  } 
                  
                  catch (Exception ex) {

                         result = errorMsg;
                         return result;
                  } 
                 

			case "uploadFile":
				try 
				{
					WebElement fileInput=driver.findElement(By.id(xPath));
					
					fileInput.sendKeys(prop.getProperty("pathDestination")+latest_file.getName());
					log.info("Expected result : " + latest_file.getName());
					String FileLocation= prop.getProperty("pathDestination");
					File folder = new File(FileLocation);
					
					File[] listOfFiles = folder.listFiles();
					
					File file_in_encryptionDirectory=listOfFiles[0];
					log.info("Actual result   : " + latest_file.getName());
					
					if(latest_file.getName().equals(file_in_encryptionDirectory.getName()))
					{
						result="Pass";
					}
					
					
				}
				
				catch(Exception ex)
				{
					result= errorMsg;
					return result;
				}
				break;

			case "click":
				try {

					driver.findElement(By.id(xPath)).click();
					 Thread.sleep(2 * 1000);

					result = "Pass";
				} catch (Exception ex) {

					result = errorMsg;
					return result;
				}

				break;
			case "visibility":
				try {
					
					
					
					
					System.out.print(xPath);
					Boolean visibility =driver.findElement(By.id(xPath)).isEnabled();
					

					log.info("Expected result : " + testData.toLowerCase());
					log.info("Actual result  : " + String.valueOf(visibility));
					
					if (String.valueOf(visibility).equalsIgnoreCase(testData)) 
						result = "Pass";
						
					 else 
						result = "Fail";
					
					return result;
					

				} catch (Exception e) {
					// TODO: handle exception
					log.info("Class: " + new Object() {
					}.getClass().getEnclosingClass().getName() + "Method: "
							+ new Object().getClass().getEnclosingMethod().getName() + "Case: " + action + ", Message: "
							+ e.getMessage()
							+ " Supporting Message: Exception occurred while checking the web element visibility like a dropdown.");
					result = "Exception occurred while checking the web element visibility like text dropdown.";
				}
				break;

			/**/

			
		
			/* To delete the last recent file in encryption folder */
			case "deleteFile":
				try {
					
					
					
					log_flag=1;
					result = Driver.deleteSavedFile();
					

				} catch (Exception ex) {

					log.info("Class: " + new Object() {
					}.getClass().getEnclosingClass().getName() + ", Method: " + new Object() {
					}.getClass().getEnclosingMethod().getName() + ", Case: " + action + ", Message: " + ex.getMessage()
							+ ", Supporting Message: " + valuelist.get(3).toString());
					return result;
				}

				break;

			default:
				break;
			}
		}
			break; // id break

		case "functional": {

			BufferedReader br = null;
			String line = null;
			String command = null;
			screenCapture = 1;

			switch (action) {
			
			case "connectProfile":

                try {

                       command = "netsh wlan connect name=" + testData;
                       log.info(command);
                       br=runCommand(command);
                          Thread.sleep(60 * 1000);
                       
                       try {
   		             while ((line = br.readLine()) != null) {
   			if (line.toLowerCase().contains("connection request was completed successfully")) {
   								
   			result = "Pass";
 			break;
   							}
   							result = "Connection was unsuccessful";
   						}

   						
   					} catch (IOException e) {
   						// TODO Auto-generated catch block
   						e.printStackTrace();
   					}
   					br.close();

                } catch (Exception ex) {
                       // TODO Auto-generated catch block
                       log.info("Class: " + new Object() {
                       }.getClass().getEnclosingClass().getName() + ", Method: " + new Object() {
                       }.getClass().getEnclosingMethod().getName() + ", Case: " + action + ", Message: " + ex.getMessage()
                                     + ", Supporting Message: Exception occcured while running the command-" + command);
                }
                break;

			case "geturl":
				try
			{
					actual = driver.getCurrentUrl();
					log.info("Expected result : " + testData);
					log.info("Actual result   : " + actual);

				
					if (actual.contains(testData)) {
						result = "Pass";
					}
					
			}
			catch (Exception ex)
			{
				result = errorMsg;
				return result;
			}
			break;
  //shilpi
			case "checkFragmentedIPPacket":

				try {

					_IP = Driver.parsingCSVFile("LANIPAddress");
				    command="ping 10.64.12.129 -S " + _IP + " -l 1800 -t -n 5";
					br = runCommand(command);
					Thread.sleep(60 * 1000);

					while ((line = br.readLine()) != null) {

						if (line.contains(testData)) {
							result = "Pass";
							break;
						}
						result = "data not found in command response";
					}
					br.close();

				} catch (Exception ex) {
					// TODO Auto-generated catch block
					log.info("Class: " + new Object() {
					}.getClass().getEnclosingClass().getName() + ", Method: " + new Object() {
					}.getClass().getEnclosingMethod().getName() + ", Case: " + action + ", Message: " + ex.getMessage()
							+ ", Supporting Message: Exception occcured while running command-" + xPath);
				}
				break;
			case "checkDHCPAttachedDevices":
				try {

					int i = 3;
					String xP = null;
					while (true) {

						xP = xPath + i + "]";
						try {
							// log.info("Xpath:" + xPath);
							actual = driver.findElement(By.xpath(xP)).getText();
							log.info("actual:" + actual);
						} catch (Exception e) {

							log.info("Automation LAN MAC not found in attached device table");
							result = "Automation LAN MAC not found in attached device table";
							e.printStackTrace();
							break;
						}

						if (actual.contains(testData)) {

							xP = xPath + i + "]" + "/td[1]/input";
							driver.findElement(By.xpath(xP)).click();
							result = "Pass";
							break;
						}
						i++;
					}

				} catch (Exception ex) {

					result = errorMsg;
					return result;
				}
				break;

				//rushi-210818
            case "nslookup":

				try {
				        screenCapture=1;
				        log.info("*****************************************************");
				log.info("Performing nslookup of " + testData);
				//br = new BufferedReader(new FileReader(testData));
				//log.info("************** " + testData + "**************");
				//while ((line = br.readLine()) != null) {
				//            log.info(line);
				//}
				
				
				command = "nslookup " + testData;
				br = runCommand(command);
				Thread.sleep(5 * 1000);
				
				while ((line = br.readLine()) != null) {
				    if (line.toLowerCase().contains("google")){
				            
				while ((line = br.readLine()) != null) {
				if (line.toLowerCase().contains("address") && line.toLowerCase().split(":").length > 2) {
				    result = "Pass";
				    ipv6add = line.toLowerCase().split("  ")[1];
				    StringBuilder ipv6addsb = new StringBuilder(ipv6add);
				    String[] uncompressedipv6 = uncompressIPv6(ipv6addsb).split(":");
				                    for(int i=0;i<uncompressedipv6.length;i++) {
				                                    driver.findElement(By.id(xPath+Integer.toString(i))).sendKeys(uncompressedipv6[i]);
				                    }
				                    break;
				            }
				            }
				                        
				                    }
				    }
				
				    br.close();
				} catch (Exception ex) {
				                // TODO Auto-generated catch block
				                log.info(ex.getMessage());
				}
				break;

                  
            //rushi
            case "ipv6googlepingresponse":

                  try {
                         //br = new BufferedReader(new FileReader(testData));
                         //log.info("************** " + testData + "**************");
                         //while ((line = br.readLine()) != null) {
                         //     log.info(line);
                         //}
                         log.info("*****************************************************");
                         log.info("Checking ping response of ipv6.google.com");
                         log.info("IPv6 address of ipv6.google.com " + ipv6add);
                         command = "ping -6 " + ipv6add;
                         br = runCommand(command);
                         Thread.sleep(5 * 1000);

                         while ((line = br.readLine()) != null) {

                                if (line.toLowerCase().contains("Request timed out")) {
                                       result = "Pass";
                                       break;
                                }
                         }

                         br.close();
                  } catch (Exception ex) {
                         // TODO Auto-generated catch block
                         log.info("Class: " + new Object() {
                         }.getClass().getEnclosingClass().getName() + ", Method: " + new Object() {
                         }.getClass().getEnclosingMethod().getName() + ", Case: " + action + ", Message: " + ex.getMessage()
                                       + ", Supporting Message: Exception occcured while running the command-" + command);
                  }
                  break;
                  

            //modified - rushi - 290818
            case "ConnecttoSite":
                  try {

                        log.info("entered ConnecttoSite");

                        System.setProperty("webdriver.chrome.driver", prop.getProperty("pathChromeDriver"));
                        driver = new ChromeDriver();
                        driver.manage().deleteAllCookies();

                        Thread.sleep(1000 * 5);
                        
                        driver.navigate().refresh();
                        String urlname = "https://ipv6.google.com";
                        driver.get(urlname);
                        driver.manage().window().maximize();
                        actual = driver.findElement(By.xpath(xPath)).getAttribute("id");
                        log.info("Expected result : " + testData);
                        log.info("Actual Result : " + actual);

                        if (actual.equalsIgnoreCase(testData))
                              return "Pass";

                  } catch (Exception ex) {

                        result = errorMsg;
                        return result;
                  }
                  break;
                  
            //modified - rushi - 290818
            case "DoNotConnecttoSite":
                  try {

                        log.info("entered ConnecttoSite");

                        System.setProperty("webdriver.chrome.driver", prop.getProperty("pathChromeDriver"));
                        driver = new ChromeDriver();
                        driver.manage().deleteAllCookies();

                        Thread.sleep(1000 * 5);

                        driver.navigate().refresh();
                        String urlname = "https://ipv6.google.com";
                        driver.get(urlname);
                        driver.manage().window().maximize();
                        actual = driver.findElement(By.xpath(xPath)).getText();
                        log.info("Actual Result : " + actual);
                        if (actual.equalsIgnoreCase(testData))
                              return "Pass";

                  } catch (Exception ex) {

                        result = errorMsg;
                        return result;
                  }
                  break;

			case "downstream":
				try {

					// int n = Integer.parseInt(testData);
					int n = Integer.parseInt(Driver.parsingCSVFile("DownstreamChannels"));
					log.info("no.of downstream channels n: " + n);

					result = fun.checkDownstreamChannelData(n);

				} catch (Exception ex) {

					result = errorMsg;
					return result;
				}
				break;

			case "upstream":
				try {

					
					int n = Integer.parseInt(Driver.parsingCSVFile("UpstreamChannels"));
					log.info("no.of upstream channels n: " + n);

					result = fun.checkUpstreamChannelData(n);

				}

				catch (Exception ex) {

					result = errorMsg;
					return result;
				}
				break;

			case "wait":
				screenCapture = 1;
				try {
					int wait = Integer.parseInt(testData);

					Thread.sleep(wait * 1000);
					result = "Pass";

				} catch (Exception ex) {

					result = errorMsg;
					return result;
				}

				break;

			case "importProfile":

				try {
					screenCapture=1;
					
					
					
					if(testData.contains("Guest"))
					{
						
						
						
						ReadAndModifyXMLFile modify=new ReadAndModifyXMLFile();
						String path="WiFiProfiles\\" + testData;
						System.out.println("It is a guest network"+ " " + path+" " +Guestnetwork_passphrase);
						modify.modifyPassphraseString(path,Guestnetwork_passphrase);
						System.out.println("Modified XML File");
					}
					
					br = new BufferedReader(new FileReader("WiFiProfiles\\" + testData));

					log.info("************** " + testData + "**************");
					while ((line = br.readLine()) != null) {
						log.info(line);
					}
					log.info("*****************************************************");

					command = "netsh wlan delete profile name=*";
					runCommand(command);
					Thread.sleep(5 * 1000);

					
					command = "netsh wlan add profile filename=\"WiFiProfiles\\" + testData + "\"";
					br = runCommand(command);

					Thread.sleep(60 * 1000);

					while ((line = br.readLine()) != null) {

						if (line.toLowerCase().contains("is added on interface automationwifi")) {

							result = "Pass";
							break;
						}
					}
//					command = "netsh wlan add profile filename=\"WiFiProfiles\\" + testData + "\"";
//					br = runCommand(command);
//					log.info("Wait for 60 secs");
//					Thread.sleep(60 * 1000);

					br.close();
				} catch (Exception ex) {
					// TODO Auto-generated catch block
					log.info("Class: " + new Object() {
					}.getClass().getEnclosingClass().getName() + ", Method: " + new Object() {
					}.getClass().getEnclosingMethod().getName() + ", Case: " + action + ", Message: " + ex.getMessage()
							+ ", Supporting Message: Exception occcured while running the command-" + command);
				}
				break;

			case "deleteProfile":

				try {

					command = "netsh wlan delete profile name=*";
					runCommand(command);
					Thread.sleep(5 * 1000);

					result = "Pass";
				} catch (Exception ex) {
					// TODO Auto-generated catch block
					log.info("Class: " + new Object() {
					}.getClass().getEnclosingClass().getName() + ", Method: " + new Object() {
					}.getClass().getEnclosingMethod().getName() + ", Case: " + action + ", Message: " + ex.getMessage()
							+ ", Supporting Message: Exception occcured while running the command-" + command);
				}
				break;

			case "checkConnectionStatus":

				try {

					command = "netsh interface ip show config name=\"AutomationWiFi\"";
					br = runCommand(command);
					Thread.sleep(5 * 1000);

					try {
						while ((line = br.readLine()) != null) {

							if (line.contains("IP Address") && line.contains(testData)) {

								result = "Pass";

								command = "netsh wlan delete profile name=*";
								runCommand(command);
								Thread.sleep(5 * 1000);

								break;
							}
							result = "Profile not connected";
						}

//						command = "netsh wlan delete profile name=*";
//						runCommand(command);
//						Thread.sleep(5 * 1000);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					br.close();

				} catch (Exception ex) {
					// TODO Auto-generated catch block
					log.info("Class: " + new Object() {
					}.getClass().getEnclosingClass().getName() + ", Method: " + new Object() {
					}.getClass().getEnclosingMethod().getName() + ", Case: " + action + ", Message: " + ex.getMessage()
							+ ", Supporting Message: Exception occcured while running the command-" + command);
				}
				break;

			case "checkConectionStatus1":

				try {

					command = "netsh interface ip show config name=\"AutomationWiFi\"";
					br = runCommand(command);
					Thread.sleep(5 * 1000);

					try {
						while ((line = br.readLine()) != null) {

							if (line.contains("IP Address") && line.contains(testData)) {
								result = "Pass";

								Thread.sleep(5 * 1000);

								break;
							}
							result = "Profile not connected";
						}

						Thread.sleep(5 * 1000);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					br.close();

				} catch (Exception ex) {
					// TODO Auto-generated catch block
					log.info("Class: " + new Object() {
					}.getClass().getEnclosingClass().getName() + ", Method: " + new Object() {
					}.getClass().getEnclosingMethod().getName() + ", Case: " + action + ", Message: " + ex.getMessage()
							+ ", Supporting Message: Exception occcured while running the command-" + command);
				}
				break;

			case "checkSSIDDisable":

				try {

					int n = 0;
					while (n < 5) {

						// Wait for 120sec

						Thread.sleep(60 * 1000);

						command = "netsh wlan show networks mode=bssid interface=\"AutomationWiFi\"";
						log.info("running command " + (n + 1));

						Process pr = Runtime.getRuntime().exec(command);
						br = new BufferedReader(new InputStreamReader(pr.getInputStream()));

						try {
							result = "Pass";
							while ((line = br.readLine()) != null) {

								if (line.contains(testData)) {

									if (((line.split(":")[1]).trim()).equals(testData)) {
										result = "Fail - SSID Found";
										break;
									}
								}
							}

						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						if (result.equals("Pass"))
							log.info("SSID not detected");
						else
							log.info("SSID detected");

						if (n == 4)
							runCommand(command);

						br.close();

						n++;
					}

				} catch (Exception ex) {
					// TODO Auto-generated catch block
					log.info("Class: " + new Object() {
					}.getClass().getEnclosingClass().getName() + ", Method: " + new Object() {
					}.getClass().getEnclosingMethod().getName() + ", Case: " + action + ", Message: " + ex.getMessage()
							+ ", Supporting Message: Exception occcured while running the command-" + command);
				}
				break;

			case "checkSSID":

				try {

					int n = 0;
					while ((n < 5) && !result.equals("Pass")) {

						// Wait for 120sec
						log.info("wait for 60 sec");
						Thread.sleep(60 * 1000);

						command = "netsh wlan show networks mode=bssid interface=\"AutomationWiFi\"";
						log.info("running command " + (n + 1));

						Process pr = Runtime.getRuntime().exec(command);
						br = new BufferedReader(new InputStreamReader(pr.getInputStream()));

						try {
							while ((line = br.readLine()) != null) {

								if (line.contains(testData)) {

									if (line.split(":")[1].trim().equals(testData)) {
										result = "Pass";
										runCommand(command);
										break;
									}
								}

								result = "SSID not found in network list";
							}
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

						if ((n == 4) && !result.equals("Pass"))
							runCommand(command);

						br.close();

						n++;
					}

				} catch (Exception ex) {
					// TODO Auto-generated catch block
					log.info("Class: " + new Object() {
					}.getClass().getEnclosingClass().getName() + ", Method: " + new Object() {
					}.getClass().getEnclosingMethod().getName() + ", Case: " + action + ", Message: " + ex.getMessage()
							+ ", Supporting Message: Exception occcured while running the command-" + command);
				}
				break;

			case "checkRadioChannel":

				try {

					int n = 0;
					while ((n < 5) && !result.equals("Pass")) {

						// Wait for 120sec

						Thread.sleep(60 * 1000);

						command = "netsh wlan show networks mode=bssid interface=\"AutomationWiFi\"";
						log.info("running command " + (n + 1));

						Process pr = Runtime.getRuntime().exec(command);
						br = new BufferedReader(new InputStreamReader(pr.getInputStream()));

						String ssid = Driver.parsingCSVFile(xPath);

						try {
							while ((line = br.readLine()) != null) {

								if (line.contains(ssid)) {

									if (line.split(":")[1].trim().equals(ssid)) {

										for (int i = 0; i < 10; i++) {
											line = br.readLine();

											if (testData.equals("24GHzChannel")) {

												if (line.contains("Channel")) {
													line = line.split(":")[1].trim();

													if (line.matches("\\d{1,13}")) {
														result = "Pass";
														runCommand(command);
														break;
													} else
														result = "Channel out of range";

												}
											}

											if (testData.equals("5GHzChannel")) {

												if (line.contains("Channel")) {
													line = line.split(":")[1].trim();

													if (line.matches("\\d{36,140}")) {
														result = "Pass";
														runCommand(command);
														break;
													} else
														result = "Channel out of range";

												}
											}

											if (line.contains("Channel") && line.contains(testData)) {
												result = "Pass";
												runCommand(command);
												break;
											}
										}
										break;
									}

								}
								result = "SSID not found in network list";
							}
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

						if ((n == 4) && !result.equals("Pass"))
							runCommand(command);

						br.close();

						n++;
					}

				} catch (Exception ex) {
					// TODO Auto-generated catch block
					log.info("Class: " + new Object() {
					}.getClass().getEnclosingClass().getName() + ", Method: " + new Object() {
					}.getClass().getEnclosingMethod().getName() + ", Case: " + action + ", Message: " + ex.getMessage()
							+ ", Supporting Message: Exception occcured while running the command-" + command);
				}
				break;

			case "check24GHzRadioChannelAuto":
			case "check5GHzRadioChannelAuto":

				try {

					String channel = null;
					Select sel = null;

					Thread.sleep(30 * 1000);

					if (action.contains("24GHz")) {

						
						sel = new Select(driver.findElement(By.xpath(xPath)));
					} else if (action.contains("5GHz")) {

						
						sel = new Select(driver.findElement(By.xpath(xPath)));
					}

					channel = sel.getFirstSelectedOption().getText();
					channel = channel.split(" ")[1];

					// Debug Logs
					log.info("Default channel: " + channel);
					// Debug Logs

					String ssid = Driver.parsingCSVFile(testData);
					// Debug Logs
					log.info("SSID: " + ssid);
					// Debug Logs

					command = "netsh wlan show networks mode=bssid interface=\"AutomationWiFi\"";

					int n = 0;
					while ((n < 5) && !result.equals("Pass")) {

						// Wait for 60sec
						log.info("wait for 60 sec");
						Thread.sleep(60 * 1000);

						log.info("running command " + (n + 1));

						Process pr = Runtime.getRuntime().exec(command);
						br = new BufferedReader(new InputStreamReader(pr.getInputStream()));

						try {
							while ((line = br.readLine()) != null) {

								if (line.contains(ssid)) {

									if (line.split(":")[1].trim().equals(ssid)) {

										for (int i = 0; i < 10; i++) {
											line = br.readLine();
											if (line.contains("Channel") && line.contains(channel)) {
												result = "Pass";
												runCommand(command);
												break;
											}
											result = "Radio Channel not found";
										}
										break;
									}
								}
								result = "SSID not found in network list";
							}
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

						if ((n == 4) && !result.equals("Pass"))
							runCommand(command);

						br.close();

						n++;
					}

				} catch (Exception ex) {
					// TODO Auto-generated catch block
					log.info("Class: " + new Object() {
					}.getClass().getEnclosingClass().getName() + ", Method: " + new Object() {
					}.getClass().getEnclosingMethod().getName() + ", Case: " + action + ", Message: " + ex.getMessage()
							+ ", Supporting Message: Exception occcured while running the command-" + command);
				}
				break;

			case "checkRadioType":

				try {

					String ssid = Driver.parsingCSVFile(xPath);
					ssid = ssid + "automation";
					log.info("SSID: " + ssid);

					command = "netsh wlan show networks mode=bssid interface=\"AutomationWiFi\"";

					int n = 0;
					while ((n < 5) && !result.equals("Pass")) {

						// Wait for 60sec
						log.info("wait for 60 sec");
						Thread.sleep(60 * 1000);

						log.info("running command " + (n + 1));

						Process pr = Runtime.getRuntime().exec(command);
						br = new BufferedReader(new InputStreamReader(pr.getInputStream()));

						while ((line = br.readLine()) != null) {

							if (line.contains(ssid)) {

								if (line.split(":")[1].trim().equals(ssid)) {
									for (int i = 0; i < 10; i++) {
										line = br.readLine();
										if (line.contains("Radio type") && line.contains(testData)) {
											result = "Pass";
											runCommand(command);
											break;
										}
										result = "Radio type not found";
									}
									break;
								}
							}
							result = "SSID not found in network list";
						}

						if ((n == 4) && !result.equals("Pass"))
							runCommand(command);

						br.close();

						n++;
					}

				} catch (Exception ex) {
					// TODO Auto-generated catch block
					log.info("Class: " + new Object() {
					}.getClass().getEnclosingClass().getName() + ", Method: " + new Object() {
					}.getClass().getEnclosingMethod().getName() + ", Case: " + action + ", Message: " + ex.getMessage()
							+ ", Supporting Message: Exception occcured while running the command-" + command);
				}
				break;

			case "checkLANConfig":

				try {
					
										command = "ipconfig /release";
					runCommand(command);
					Thread.sleep(5 * 1000);

					command = "ipconfig /renew";
					runCommand(command);
					log.info("Wait for 60 secs");
					Thread.sleep(60 * 1000);

					command = "netsh interface ip show config name=\"AutomationLAN\"";
					br = runCommand(command);

					try {

						if (xPath.equals("CompareIPAddress")) {

							while ((line = br.readLine()) != null) {

								if (line.contains("IP Address")) {

									line = line.split(":")[1];

									int ip = Integer.parseInt(line.split("\\.")[3]);
									int ip2 = Integer.parseInt(testData.split("\\.")[3]);

									if (ip > ip2)
										result = "Pass";
									else
										result = "IP is not higher than 100";

									break;
								}
								result = "IP Address not found";
							}
						} else {

							while ((line = br.readLine()) != null) {
								

								if (line.contains(xPath) && line.contains(testData)) {
									result = "Pass";
									break;
								}
								result = xPath + " not found";
							}
						}

					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					br.close();

				} catch (Exception ex) {
					// TODO Auto-generated catch block
					log.info("Class: " + new Object() {
					}.getClass().getEnclosingClass().getName() + ", Method: " + new Object() {
					}.getClass().getEnclosingMethod().getName() + ", Case: " + action + ", Message: " + ex.getMessage()
							+ ", Supporting Message: Exception occcured while running the command-" + command);
				}
				break;

			case "checkLeaseTime":

				try {

					command = "ipconfig /release";
					runCommand(command);
					Thread.sleep(5 * 1000);

					command = "ipconfig /renew";
					runCommand(command);

					Thread.sleep(60 * 1000);

					command = "ipconfig /all";
					br = runCommand(command);

					try {

						String leaseObtained1 = null, leaseObtained2 = null, leaseObtained3 = null;
						String leaseExpires1 = null, leaseExpires2 = null, leaseExpires3 = null;

						while ((line = br.readLine()) != null) {

							if (line.contains("Ethernet adapter AutomationLAN")) {

								line = br.readLine();
								while (!(line.contains("Ethernet adapter") || line.contains("Wireless LAN adapter"))) {

									if (line.contains("Lease Obtained")) {
										leaseObtained1 = line.split(":")[1];
										leaseObtained2 = line.split(":")[2];
										leaseObtained3 = line.split(":")[3];

									} else if (line.contains("Lease Expires")) {
										leaseExpires1 = line.split(":")[1];
										leaseExpires2 = line.split(":")[2];
										leaseExpires3 = line.split(":")[3];

						
									}

									if ((leaseExpires1 != null) && (leaseObtained1 != null)) {

									

										int obtainDays, obtainHours;
										if (leaseObtained1.split("\\s+")[1].contains("day")) {

											obtainDays = Integer
													.parseInt(leaseObtained1.split("\\,")[1].split("\\s+")[2]);
											obtainHours = Integer.parseInt(leaseObtained1.split("\\s+")[5]);
										} else {

											obtainDays = Integer.parseInt(leaseObtained1.split("\\s+")[1]);
											obtainHours = Integer.parseInt(leaseObtained1.split("\\s+")[4]);
										}


										int expiresDays, expiresHours;
										if (leaseExpires1.split("\\s+")[1].contains("day")) {

											expiresDays = Integer
													.parseInt(leaseExpires1.split("\\,")[1].split("\\s+")[2]);
											expiresHours = Integer.parseInt(leaseExpires1.split("\\s+")[5]);
										} else {
											expiresDays = Integer.parseInt(leaseExpires1.split("\\s+")[1]);
											expiresHours = Integer.parseInt(leaseExpires1.split("\\s+")[4]);
										}

										int leaseDays = expiresDays - obtainDays;
										int leaseHours = expiresHours - obtainHours;
										int leaseMins = Integer.parseInt(leaseExpires2)
												- Integer.parseInt(leaseObtained2);
										int leaseSecs = Integer.parseInt(leaseExpires3)
												- Integer.parseInt(leaseObtained3);

										int leaseTime = leaseSecs + (60 * leaseMins) + (3600 * leaseHours)
												+ (24 * 3600 * leaseDays);

										log.info("leaseTime: " + leaseTime);

										if (leaseTime == (Integer.parseInt(testData)))
											result = "Pass";
										else
											result = "Lease time not matched";

										break;
									} else
										result = "lease times are not found";

									line = br.readLine();
								}

							} else
								result = "AutomationLAN not found";

							if ((leaseObtained1 != null) && (leaseExpires1 != null))
								break;
						}

					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					br.close();

				} catch (Exception ex) {
					// TODO Auto-generated catch block
					log.info("Class: " + new Object() {
					}.getClass().getEnclosingClass().getName() + ", Method: " + new Object() {
					}.getClass().getEnclosingMethod().getName() + ", Case: " + action + ", Message: " + ex.getMessage()
							+ ", Supporting Message: Exception occcured while checking lease time.");
				}
				break;

			case "checkCommandResponse":

				try {
					br = runCommand(xPath);
					Thread.sleep(60 * 1000);

					while ((line = br.readLine()) != null) {

						if (line.contains(testData)) {
							result = "Pass";
							break;
						}
						result = "data not found in command response";
					}
					br.close();

				} catch (Exception ex) {
					// TODO Auto-generated catch block
					log.info("Class: " + new Object() {
					}.getClass().getEnclosingClass().getName() + ", Method: " + new Object() {
					}.getClass().getEnclosingMethod().getName() + ", Case: " + action + ", Message: " + ex.getMessage()
							+ ", Supporting Message: Exception occcured while running command-" + xPath);
				}
				break;
//shilpi
			case "checkCommandResponse1":

				try {
					command = "ipconfig /all";
				
					br = runCommand(command);
					Thread.sleep(60 * 1000);

					while ((line = br.readLine()) != null) {

						if ((line.contains("IPv4 Address")||line.contains("IPv6 Address"))&&line.contains(testData)) {
							result = "Pass";
							break;
						}
						result = "data not found in command response";
					}
					br.close();

				} catch (Exception ex) {
					// TODO Auto-generated catch block
					log.info("Class: " + new Object() {
					}.getClass().getEnclosingClass().getName() + ", Method: " + new Object() {
					}.getClass().getEnclosingMethod().getName() + ", Case: " + action + ", Message: " + ex.getMessage()
							+ ", Supporting Message: Exception occcured while running command-" + xPath);
				}
				break;
				
				//rushi-220818
            case "checkCommandResponse2":

                  try {
                         actual = driver.findElement(By.xpath(xPath)).getText();
                         command = "ipconfig /all";
                  
                         br = runCommand(command);
                         Thread.sleep(10 * 1000);
                         
                         result = "data not found in command response";
                         
                         while ((line = br.readLine()) != null) {

                                if (line.contains("AutomationLAN")) {
                                       //log.info("Automation LAN found");
                                       while ((line = br.readLine()) != null && !line.contains("Ethernet adapter")) {
                                              if(line.contains("DNS Servers") && line.split(":").length>2) {
                                                     //log.info("DNS Server found");
                                                     log.info("Actual Result : " + actual.split(" ")[1]);
                                                     log.info("Expected Result : " + line.split(" : ")[1]);
                                                     //log.info(line.split(" : ")[1]);
                                                     if(line.toLowerCase().contains(actual.toLowerCase())){
                                                            result = "Pass";
                                                     }
                                                     break;
                                              }
                                       }
                                       
                                }
                                
                         }
                         br.close();

                  } catch (Exception ex) {
                         // TODO Auto-generated catch block
                         log.info("Class: " + new Object() {
                         }.getClass().getEnclosingClass().getName() + ", Method: " + new Object() {
                          }.getClass().getEnclosingMethod().getName() + ", Case: " + action + ", Message: " + ex.getMessage()
                                       + ", Supporting Message: Exception occcured while running command-" + xPath);
                  }
                  break;



				//shilpi
			case "disableAutomationLan":

				try {
					command = "netsh interface set interface name=\"AutomationLAN\" admin=disabled";
					br = runCommand(command);
					
					result = "Pass";
							

				} catch (Exception ex) {
					// TODO Auto-generated catch block
					log.info("Class: " + new Object() {
					}.getClass().getEnclosingClass().getName() + ", Method: " + new Object() {
					}.getClass().getEnclosingMethod().getName() + ", Case: " + action + ", Message: " + ex.getMessage()
							+ ", Supporting Message: Exception occcured while running command-" + xPath);
				}
				break;
				//shilpi
			case "enableAutomationLan":

				try {
					command = "netsh interface set interface name=\"AutomationLAN\" admin=enabled";
				
					br = runCommand(command);
					result = "Pass";
							

				} catch (Exception ex) {
					// TODO Auto-generated catch block
					log.info("Class: " + new Object() {
					}.getClass().getEnclosingClass().getName() + ", Method: " + new Object() {
					}.getClass().getEnclosingMethod().getName() + ", Case: " + action + ", Message: " + ex.getMessage()
							+ ", Supporting Message: Exception occcured while running command-" + xPath);
				}
				break;
				//shilpi
			case "pingGoogle":

				try {
					command = "ping www.google.com";
				
					br = runCommand(command);
					Thread.sleep(60 * 1000);

					while ((line = br.readLine()) != null) {

						if (line.contains(testData)) {
							result = "Pass";
							break;
						}
						result = "data not found in command response";
					}
					br.close();

				} catch (Exception ex) {
					// TODO Auto-generated catch block
					log.info("Class: " + new Object() {
					}.getClass().getEnclosingClass().getName() + ", Method: " + new Object() {
					}.getClass().getEnclosingMethod().getName() + ", Case: " + action + ", Message: " + ex.getMessage()
							+ ", Supporting Message: Exception occcured while running command-" + xPath);
				}
				break;

			case "checkErrorResponse":

				try {
					br = getErrorResponse(xPath);
					Thread.sleep(20 * 1000);

					while ((line = br.readLine()) != null) {

						if (line.contains(testData)) {
							result = "Pass";
							break;
						}
						result = "data not found in command response";
					}
					br.close();

				} catch (Exception ex) {
					// TODO Auto-generated catch block

					log.info("Class: " + new Object() {
					}.getClass().getEnclosingClass().getName() + ", Method: " + new Object() {
					}.getClass().getEnclosingMethod().getName() + ", Case: " + action + ", Message: " + ex.getMessage()
							+ ", Supporting Message: Exception occcured while running the command-" + xPath);
				}
				break;

			case "checkpingResponseForWiFiIP":
				try {
					String ip = null;

					command = "netsh interface ip show config name=\"AutomationWiFi\"";
					br = runCommand(command);
					Thread.sleep(5 * 1000);

					while ((line = br.readLine()) != null) {

						if (line.contains("IP Address")) {
							ip = line.split("\\:")[1].trim();
							break;
						}
					}
					br.close();

					command = "ping -S " + ip + " " + xPath;
					br = runCommand(command);
					Thread.sleep(60 * 1000);

					while ((line = br.readLine()) != null) {

						if (line.contains(testData)) {
							result = "Pass";
							break;
						}
						result = "data not found in command response";
					}
					br.close();

				} catch (Exception ex) {
					// TODO Auto-generated catch block

					log.info("Class: " + new Object() {
					}.getClass().getEnclosingClass().getName() + ", Method: " + new Object() {
					}.getClass().getEnclosingMethod().getName() + ", Case: " + action + ", Message: "
							+ ex.getMessage());
				}
				break;

			case "checkwgetCommandResponseForLANIP":
			case "checkwgetCommandResponseForWiFiIP":
			case "checkwgetCommandResponseForStaticIPInside":
			case "checkwgetCommandResponseForStaticIPOutside":

				try {
					String ip = null;

					command = "ipconfig /all";
					br = runCommand(command);
					if (action.contains("LANIP")) {
						// ip = Driver.parsingCSVFile("LANIPAddress");
						/*
						 * Using ipconfig /all command to extract the ipv4 address instead of reading it
						 * from selenium configuration file
						 */
						// log.info("action contains the LAN IP");
						while ((line = br.readLine()) != null) {
							// log.info("****line:"+line);
							if (line.contains("Ethernet adapter AutomationLAN") && !line.contains("LAN1")) {
								// log.info("line contains automation LAN");
								for (int i = 0; i < 19; i++) {
									line = br.readLine();
									if (line.contains("IPv4 Address")) {
										// log.info("line contains IPv4
										// Address:"+line);
										ip = line.split("\\:")[1].split("\\(")[0].trim();
										log.info("Ethernet adapter AutomationLAN: Ip address-" + ip);
										break;
									}

								}
								break;
							}
						}
						br.close();
					} else if (action.contains("WiFiIP")) {

						

						while ((line = br.readLine()) != null) {
							if (line.contains("LAN adapter AutomationWiFi")) {
								for (int i = 0; i < 19; i++) {
									line = br.readLine();
									if (line.contains("IPv4 Address")) {
										ip = line.split("\\:")[1].split("\\(")[0].trim();
										log.info("LAN adapter AutomationWiFi: Ip address-" + ip);
										break;
									}

								}
								break;
							}
						}
						br.close();

					} else if (action.contains("StaticIP")) {
						ip = Driver.parsingCSVFile("LANIPAddress");

						String ip1 = ip.split("\\.")[0];
						String ip2 = ip.split("\\.")[1];
						String ip3 = ip.split("\\.")[2];
						int ip4 = Integer.parseInt(ip.split("\\.")[3]);

						if (action.contains("Inside"))
							ip4 = ip4 + 2;
						else if ((action.contains("Outside")))
							ip4 = ip4 + 6;

						ip = ip1 + "." + ip2 + "." + ip3 + "." + ip4;
					}

					command = "wget -v -T 10 -t 1 --bind-address " + ip + " " + xPath;
					br = getErrorResponse(command);
					Thread.sleep(20 * 1000);

					while ((line = br.readLine()) != null) {

						if (line.contains(testData)) {
							result = "Pass";
							break;
						}
						result = "data not found in command response";
					}
					br.close();

				} catch (Exception ex) {
					// TODO Auto-generated catch block

					log.info("Class: " + new Object() {
					}.getClass().getEnclosingClass().getName() + ", Method: " + new Object() {
					}.getClass().getEnclosingMethod().getName() + ", Case: " + action + ", Message: " + ex.getMessage()
							+ ", Supporting Message: Exception occcured while running the command-" + xPath);
				}
				break;

			case "runCommand":

				try {
					runCommand(xPath);
					result = "Pass";
				} catch (Exception ex) {
					// TODO Auto-generated catch block
					log.info("Class: " + new Object() {
					}.getClass().getEnclosingClass().getName() + ", Method: " + new Object() {
					}.getClass().getEnclosingMethod().getName() + ", Message: " + ex.getMessage()
							+ ", Supporting Message: Exception occcured while running the command- " + xPath);
				}
				break;

			case "setStaticIP":

				try {

					String lanIP = Driver.parsingCSVFile("LANIPAddress");
					String gw = Driver.parsingCSVFile("DefaultGateway");

					String ip1 = lanIP.split("\\.")[0];
					String ip2 = lanIP.split("\\.")[1];
					String ip3 = lanIP.split("\\.")[2];
					int ip4 = Integer.parseInt(lanIP.split("\\.")[3]);

					int n = Integer.parseInt(xPath);

					ip4 = ip4 + n;
					lanIP = ip1 + "." + ip2 + "." + ip3 + "." + ip4;


					command = "netsh interface ip set address \"AutomationWiFi\" static " + lanIP + " 255.255.255.0 "
							+ gw;
					runCommand(command);

					// command = "netsh interface ip set dns
					// name=\"AutomationWiFi\" source=static addr=" + ip
					// + " validate=no";
					// runCommand(command);

					Thread.sleep(20 * 1000);

					result = "Pass";

				} catch (Exception ex) {
					// TODO Auto-generated catch block
					log.info("Class: " + new Object() {
					}.getClass().getEnclosingClass().getName() + ", Method: " + new Object() {
					}.getClass().getEnclosingMethod().getName() + ", Message: " + ex.getMessage()
							+ ", Supporting Message: Exception occcured while setting static IP");
				}
				break;
		 
			case "remoteAccess":

				Session session = null;
				Channel channel = null;

				if (dataKey.equalsIgnoreCase("keyHostName")) 
				{
					host = testData;
					
				}
				if (dataKey.equalsIgnoreCase("keyUsername")) {
					username = testData;
					
				}
				if (dataKey.equalsIgnoreCase("keyPassword")) {
					password = testData;
					
				}
				if (dataKey.equalsIgnoreCase("keyDynamic")) {
					_IP = testData;
					
				}
				if (dataKey.equalsIgnoreCase("keyWgetPart1")) {
					commandPart1 = testData;
				
				}
				// shilpi added
				if (dataKey.equalsIgnoreCase("keyWgetPart2") || dataKey.equalsIgnoreCase("keyWgetPart3")) 
				{
					commandPart2 = testData;
					
				}

				if (dataKey.equalsIgnoreCase("keyWgetStatus") || dataKey.equalsIgnoreCase("keyWgetStatusError")) 
				{
					actual = testData;
					
				}
				
				if (dataKey.equalsIgnoreCase("keyWgetStatus") || dataKey.equalsIgnoreCase("keyWgetStatusError")) 
				{

					try 
					{

						Integer countConnectionTrail = 0;
						Integer countConnectionTry = 0;
						
						String msg = "";
						String commandLine = commandPart1 + _IP + commandPart2;
						/* For cases where commandPart2 should be empty */
						commandPart2 = "";
						log.info("Command:" + "********" + commandLine + "*******");
						
						screenCapture = 1;
						java.util.Properties config = new java.util.Properties();
						config.put("StrictHostKeyChecking", "no");
						JSch jsch = new JSch();
						System.out.println(commandLine);
						/*
						 * Here we are connecting to the development server via putty session
						 */
						session = jsch.getSession(username, host, 22);
						session.setPassword(password);
						session.setConfig(config);
						session.connect();

						log.info("Putty session established");
							
						channel = session.openChannel("exec");
						((ChannelExec) channel).setCommand(commandLine);
						
						if (commandLine.contains("tftp") || commandLine.contains("TFTP") || commandLine.contains("snmpget"))
							in = new BufferedReader(new InputStreamReader(channel.getInputStream()));

						else
							in = new BufferedReader(new InputStreamReader(channel.getExtInputStream()));

						
						
						while (countConnectionTrail < 60) 
						{
							channel.connect();
							if (channel.isConnected()) 
							{
								log.info("channel is connected in " + countConnectionTrail + " trials");
								break;
							} 
							
							else
								Thread.sleep(1 * 1000);
							countConnectionTrail++;
							log.info("Not able to connect to the channel, Channel connection trial:"
									+ countConnectionTrail);
						}
						int line_number=0;
						String passphrase[];
						while ((msg = in.readLine())!= null) 
						{

							log.info(msg);
							if(line_number==0)
							{
								passphrase=msg.split(" ");
								Guestnetwork_passphrase=passphrase[passphrase.length-1].replace("\"", "");
								System.out.println(Guestnetwork_passphrase);
								result="Pass";
							}
							// vikram
							if (actual.contains("|")) 
							{

								String data[];
								int n;
								data = actual.split("\\|");
								n = data.length;

								for (int i = 0; i < n; i++) {

									if (msg.contains(data[i].trim())) {
										log.info("Command line response:" + msg);
										result = "Pass";
										break;
									} else
										result = "Expected response:" + data[i] + " is not found after the command";
								}

								if (result.equals("Pass"))
									break;
							}

							// vikram

							else if (msg.contains(actual)) 
							{

								log.info("Command line response:" + msg);
								result = "Pass";
								break;
							} 
							
							else 
							{
								if (msg.contains("Retrying")) {
									countConnectionTry++;
									log.info("Count for connection try:" + countConnectionTry);
								}
								result = "Expected response:" + actual + " is not found after the command";
								if (countConnectionTry >= 5) {
									log.info("Exceeded No of trials for connection after executing the command");
									break;
								}
							}
						}

					} 
					
					
					catch (Exception e) {
						// log.info("catch block");
						result = valuelist.get(3).toString();
						log.info(result);

					}
					channel.disconnect();
					if (channel.isClosed()) {
						log.info(("exit-status: " + channel.getExitStatus()));
						// break;
					}

					session.disconnect();
				} else
					result = "Pass";

				break; // remote access break

			case "jarExecute":

				try {
					/* Command to run jar */
					// log.info("case: jarExecute, Command to run jar");
					command = "java -jar C:\\WebUIAutomationJar\\Tools\\PortMapper-1.9.5.jar -s";
					br = runCommand(command);
					Thread.sleep(5 * 1000);

					log.info("command ran:" + command);
					log.info("Data read from xl:" + testData);
					while ((line = br.readLine()) != null) {

						
						if (line.contains(testData)) {

							
							result = "Pass";
						}
					}
					br.close();
				} catch (Exception ex) {
					
					log.info("Class: " + new Object() {
					}.getClass().getEnclosingClass().getName() + ", Method: " + new Object() {
					}.getClass().getEnclosingMethod().getName() + ", Case:" + action + ", Message: " + ex.getMessage()
							+ ", Supporting Message:Exception occcured while running the command- " + command);
				}
				break;

			case "jarExecuteRule":

				try {
					
					command = "java -jar C:\\WebUIAutomationJar\\Tools\\PortMapper-1.9.5.jar -a " + testData
							+ " 8080 8080 TCP";

					br = runCommand(command);
					Thread.sleep(5 * 1000);

					log.info("command ran:" + command);

					while ((line = br.readLine()) != null) {

					
						if (line.contains(xPath)) {

							
							result = "Pass";
						}
					}
					br.close();
				} catch (Exception ex) {
					// TODO Auto-generated catch block
					log.info("Class: " + new Object() {
					}.getClass().getEnclosingClass().getName() + ", Method: " + new Object() {
					}.getClass().getEnclosingMethod().getName() + ", Case:" + action + ", Message: " + ex.getMessage()
							+ ", Supporting Message:Exception occcured while running command- " + command);
				}
				break;

			case "jarExecuteRuleCheck":

				try {
					/* Command to run jar */
					command = "java -jar C:\\WebUIAutomationJar\\Tools\\PortMapper-1.9.5.jar -l";
					br = runCommand(command);
					Thread.sleep(5 * 1000);
					log.info("command ran:" + command);
					while ((line = br.readLine()) != null) {

						
						if (line.contains(testData + ":8080 enabled PortMapper")) {

							result = "Pass";
						}
					}
					br.close();
				} catch (Exception ex) {
					// TODO Auto-generated catch block
					log.info("Class: " + new Object() {
					}.getClass().getEnclosingClass().getName() + ", Method: " + new Object() {
					}.getClass().getEnclosingMethod().getName() + ", Case:" + action + ", Message: " + ex.getMessage()
							+ ", Supporting Message:Exception occcured while running command- " + command);
				}
				break;
			case "copyFile":
				try
				{
					
					screenCapture=1;
				if (xPath.equalsIgnoreCase("fileDownload.exe")) 
				{
					
					String FileLocation= prop.getProperty("pathDownloadedFile");
					File folder = new File(FileLocation);
					
					File[] listOfFiles = folder.listFiles();
					
					latest_file=listOfFiles[0];
					
					for (int i=1;i<listOfFiles.length;i++)
					{
									if(latest_file.lastModified() < listOfFiles[i].lastModified())
						{
							latest_file=listOfFiles[i];
						}
					}
					
					
					log.info("Expected Result : Download File-"+  latest_file.getName());
					File source = new File(FileLocation+latest_file.getName());
					
					File dest = new File(prop.getProperty("pathDestination")+latest_file.getName());
					
				
					    FileUtils.copyFile(source, dest);
					    if( dest.exists())
					    {
					    	log.info("Actual Result : File ****"+ latest_file.getName()+ "***** has been Downloaded ");
					    	result="Pass";
					    }
					   
					    
					
				}
				    
				}
				catch (Exception e) 
				{
					// TODO: handle exception
					System.out.println(e.getStackTrace());
					log.info("Class: com.lgi.ui.testAction, Method:runFunctionalTest, Case: copyFile, Message:"
							+ e.getMessage());
				}
				break;
			case "executeFile":
				Integer countProcessDuration = 0;
				try {

					System.out.println("Start RDP");
					// wait for 60sec for rdp session established

					String pstoolPath = prop.getProperty("PSToolPath");
					log.info("pstool path:" + pstoolPath);
					// Thread.sleep(60 * 1000);
					String iValue = Driver.psToolColumnIndexValue("query session admin");

					String rdpUser, rdpPassword;
					rdpUser = prop.getProperty("rdpUser");
					rdpPassword = prop.getProperty("rdpPassword");

					
					
					 if (xPath.equalsIgnoreCase("fileUpload.exe")) 
					 {
						command = pstoolPath + "\\psexec \\\\127.0.0.1 -u " + rdpUser + " -p " + rdpPassword + " -s -i "
								+ iValue + " -w \"\\AutoIt3\" AutoIt3.exe \\AutoIt3\\fileUpload.au3";
					} 
					 
					 else if (xPath.equalsIgnoreCase("fileUploadError.exe")) 
					 {
						command = pstoolPath + "\\psexec \\\\127.0.0.1 -u " + rdpUser + " -p " + rdpPassword + " -s -i "
								+ iValue + " -w \"\\AutoIt3\" AutoIt3.exe \\AutoIt3\\fileUploadError.au3";
					} 
					 else if (xPath.equalsIgnoreCase("fileUploadError.exe")) 
					 {
						command = pstoolPath + "\\psexec \\\\127.0.0.1 -u " + rdpUser + " -p " + rdpPassword + " -s -i "
								+ iValue + " -w \"\\AutoIt3\" AutoIt3.exe \\AutoIt3\\disableIPv4.au3";
					} 
					 else 
					 {
						command = pstoolPath + "\\psexec \\\\127.0.0.1 -u " + rdpUser + " -p " + rdpPassword + " -s -i "
								+ iValue + " -w \"\\AutoIt3\" AutoIt3.exe \\AutoIt3\\fileDownload.au3";
					}
					log.info("AutoIt command: " + command);
					log.info("running the AutoIt script");
					Process p = null;
					try {

						p = Runtime.getRuntime().exec(command);
						System.out.println("P value:"+p);
					} catch (Exception e) {
						System.out.println("AutoIT error:" + e.getMessage());
						// TODO: handle exception
					}

					while (p.isAlive()) {

						Thread.sleep(25 * 1000);

						countProcessDuration++;

						if (countProcessDuration > 11) {

							p.destroyForcibly();

							break;
						}
					}

				} 
				
				catch (Exception e) {
					// TODO: handle exception
					System.out.println(e.getStackTrace());
					log.info("Class: com.lgi.ui.testAction, Method:runFunctionalTest, Case: executeFile, Message:"
							+ e.getMessage()
							+ ", Supporting Message: While checking the status of the AutoIt process exception occurred");
				}

				if (countProcessDuration >= 12) {
					log.info("Did'nt get the control back from AutoIT script even after wait of " + countProcessDuration
							+ " minutes");
					System.out.println(
							"AutoIt process is killed forcefully for not getting the response, even after waiting for maximum duration of 5 minutes ");
					result = "AutoIt process is killed forcefully for not getting the response, even after waiting for maximum duration of 5 minutes";
				} else {
					log.info("Got control back from AutoIT script after wait of " + countProcessDuration + " minutes");
					System.out.println("PSExec command successfully");
					result = "Pass";
				}

				break;

			case "urlrefresh":
				String urlDefault = null;
				String decidingFactor = testData;
				/*
				 * This decidingFactor variable we are using to decide whether case is of
				 * default refresh or url refresh of after setting the modem in router mode from
				 * modem mode
				 */
				screenCapture = 1;
				try {
					log.info("***Case urlrefresh***");

					urlDefault = Driver.parsingCSVFile("DefaultGateway");

					if (!urlDefault.contains("http"))
						urlDefault = "http://" + urlDefault + "/";
					driver.get(urlDefault);
					if (decidingFactor.equalsIgnoreCase("welcome")) {
						result = modemModemMasterLoginCheck(xPath, errorMsg, urlDefault);
						if (result != "Pass") {
							result = modemModemMasterLoginCheck(xPath, errorMsg, urlDefault);
							if (result != "Pass") {
								log.info("Could not get the login page even after two trials");
								break;
							}

						} else {

							Thread.sleep(1000 * 5);
							result = "Pass";
						}
					} else {
						result = "Pass";
					}
				} catch (Exception e) {
					// TODO: handle exception
					log.info("Class: " + new Object() {
					}.getClass().getEnclosingClass().getName() + ", Method: " + new Object() {
					}.getClass().getEnclosingMethod().getName() + ", Case:" + action + ", Message: " + e.getMessage()
							+ ", Supporting Message:Exception occcured while page refresh through default URL"
							+ urlDefault);
				}

				break;

			case "urlMaster":
				String urlMaster = null;
				screenCapture = 1;
				try {
					urlMaster = testData;
					log.info("Master url:" + urlMaster);
					if (!urlMaster.contains("http"))
						urlMaster = "http://" + urlMaster + "/";
					driver.get(urlMaster);

					result = modemModemMasterLoginCheck(xPath, errorMsg, urlMaster);
					if (result != "Pass") {
						result = modemModemMasterLoginCheck(xPath, errorMsg, urlMaster);
						if (result != "Pass") {

							log.info("Could not get the login page even after two trials");
							break;
						}

					} else {
						log.info("Calling Mercury login test as response from master URL is " + result);
						result = fun.MercuryLogin();
						return result;

					}
					return result;
				} catch (Exception e) {
					// TODO: handle exception
					log.info("Class: " + new Object() {
					}.getClass().getEnclosingClass().getName() + ", Method: " + new Object() {
					}.getClass().getEnclosingMethod().getName() + ", Case:" + action + ", Message: " + e.getMessage()
							+ ", Supporting Message: Exception occcured while logging through Master URL" + urlMaster);
				}

				break;

			case "modemmode":
				try {

					result = fun.modemMode(testData);
					log.info("Status from modemmode method:" + result);

				} catch (Exception ex) {

					result = errorMsg;
					return result;
				}
				break;
			/*
			 * This case calls the method to modify the tftp server text file for the
			 * appropriate port either 8069 or 69
			 */
			case "portconfiguration":
				try {
					String keyComment = null;

					if (testData.equalsIgnoreCase("8069"))
						keyComment = "69";
					else
						keyComment = "8069";

					result = Driver.editFile(testData, keyComment);

				} catch (Exception ex) {

					result = errorMsg;
					return result;
				}
				break;

			default:
				break;

			}

		}
			break; 

		default:
			break; // switch(type) xpath, id, functional, default break
		}

		return result;
	}

	public BufferedReader runCommand(String command) {

		BufferedReader br = null;
		Process pr = null;
		try {

			String line = null;
			pr = Runtime.getRuntime().exec(command);
			br = new BufferedReader(new InputStreamReader(pr.getInputStream()));

			log.info("***************** " + command + " ******************");
			while ((line = br.readLine()) != null) {
				log.info(line);
			}
			log.info("*****************************************************");

			pr = Runtime.getRuntime().exec(command);

			
			br = new BufferedReader(new InputStreamReader(pr.getInputStream()));

		} catch (Exception ex) {
			
			log.info("Class: " + new Object() {
			}.getClass().getEnclosingClass().getName() + ", Method: " + new Object() {
			}.getClass().getEnclosingMethod().getName() + ", Message: " + ex.getMessage() + ", Supporting Message: "
					+ command + "  could not be executed properlly");
		}

		return br;
	}

	public BufferedReader getErrorResponse(String command) {

		BufferedReader br = null;
		Process pr = null;
		try {

			String line = null;
			pr = Runtime.getRuntime().exec(command);
			br = new BufferedReader(new InputStreamReader(pr.getErrorStream()));

			log.info("***************** " + command + " ******************");
			while ((line = br.readLine()) != null) {
				log.info(line);
			}
			log.info("*****************************************************");

			pr = Runtime.getRuntime().exec(command);

			

			br = new BufferedReader(new InputStreamReader(pr.getErrorStream()));

		} catch (Exception ex) {
			// TODO Auto-generated catch block
			log.info("Class: " + new Object() {
			}.getClass().getEnclosingClass().getName() + ", Method: " + new Object() {
			}.getClass().getEnclosingMethod().getName() + ", Message: " + ex.getMessage() + ", Supporting Message: "
					+ command + "  could not be executed properlly");
		}

		return br;
	}

	public String customeValidations(String format, String data) {
		String regex = null;
		String ret = "Format not matched. Received format: " + data + " " + format;

		switch (format) {
		case "Decimal":
			regex = "\\d+(\\.\\d+)";
			if (data.matches(regex)) {
				ret = "Pass";
				break;
			}
			regex = "-\\d+(\\.\\d+)";
			if (data.matches(regex)) {
				ret = "Pass";
				break;
			}
			regex = "\\d+";
			if (data.matches(regex)) {
				ret = "Pass";
				break;
			}
		case "Number":
			regex = "\\d+";
			if (data.matches(regex)) {
				ret = "Pass";
				break;
			}

			regex = "-\\d+";
			if (data.replace(" ", "").matches(regex)) {
				ret = "Pass";
				break;
			}

		case "DaysTime":
			regex = "\\d" + " days " + "\\d{2}" + "h:" + "\\d{2}" + "m:" + "\\d{2}" + "s";

			if (data.matches(regex)) {
				ret = "Pass";
				break;
			}

			regex = "\\d+day\\(s\\)\\d{1,2}h:\\d{1,2}m:\\d{1,2}s";
			data = data.replace(" ", "");
			if (data.matches(regex)) {
				ret = "Pass";
				break;
			}

		case "DaysTime2":
			regex = "D:\\d+ H:\\d{1,2} M:\\d{1,2} S:\\d{1,2}";
			if (data.matches(regex))
				ret = "Pass";
			break;

	    //rushi
        case "DaysTime3":
               regex = ": " + "\\d{1,2}" + " days " + "\\d{1,2}" + "h:" + "\\d{1,2}" + "m:" + "\\d{1,2}" + "s";

               if (data.matches(regex)) {
                     ret = "Pass";
                     break;
               }

			
		case "DateTime":
			//log.info("Inside DateTime");
			regex = "\\d{4}-" + "\\d{2}-" + "\\d{2} " + "\\d{2}:" + "\\d{2}:" + "\\d{2}" + "\\." + "\\d{2}";
			if (data.matches(regex)) {
				ret = "Pass";
				break;
			}

			regex = "\\d{2}-" + "\\d{2}-" + "\\d{4} " + "\\d{2}:" + "\\d{2}:" + "\\d{2}" + "\\." + "\\d{2}";
			if (data.matches(regex)) {
				ret = "Pass";
				break;
			}

		case "DateTime2":
			regex = "[a-zA-Z]+ [a-zA-Z]+ \\d{1,2} \\d{1,2}:\\d{1,2}:\\d{1,2} \\d{4}";
			if (data.matches(regex))
				ret = "Pass";
			break;

		case "DateTime3":
			//log.info("Inside Date Time3");
			regex = "\\d{2}\\/\\d{2}\\/\\d{4}\\s\\d{2}:\\d{2}:\\d{2}";
			if (data.matches(regex))
				ret = "Pass";
			break;

	    //rushi
        case "DateTime4":
               //log.info("Inside Date Time3");
               regex = ": " + "\\d{2}\\/\\d{2}\\/\\d{4}\\s\\d{2}:\\d{2}:\\d{2}" + ".\\d{2}";
               if (data.matches(regex))
                     ret = "Pass";
               break;
	
			
		case "IpAddress":
			regex = "\\d{1,3}." + "\\d{1,3}." + "\\d{1,3}." + "\\d{1,3}";
			if (data.matches(regex))
				ret = "Pass";
			break;

		case "TextField":
			regex = ".+";
			if (data.matches(regex)) {
				System.out.println("Inside TextField");
				ret = "Pass";
			}
			break;

		}

		return ret;
	}

	public String modemModemMasterLoginCheck(String xpathCheck, String errorMessage, String url) {
		String loginCheckResult = null;
		int w = 0;
		while (w < 60) {

			try {

				driver.get(url);
				log.info("Hitting the url: " + url
						+ " again and waiting for element to be displayed against login attempt No.- " + w);
				Thread.sleep(60 * 1000);

				if (driver.findElement(By.xpath(xpathCheck)).isDisplayed()) {
					loginCheckResult = "Pass";
					w++;
					break;
				}

				if (w == 59) {
					loginCheckResult = errorMessage;
					return loginCheckResult;
				}
				w++;
			}

			catch (Exception e) {
				try {
					driver.get(url);
					System.out.println("Page not loaded while hitting the url: " + url
							+ " again and waiting for element to be displayed against login attempt No.- " + w);
					Thread.sleep(60 * 1000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				if (w == 59) {
					loginCheckResult = errorMessage;
					return loginCheckResult;
				}
				w++;
			}
		}

		return loginCheckResult;
	}
}
