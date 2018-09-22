package com.lgi.ui.automationJar;

import java.io.File;


import java.io.FileInputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.collections.Lists;
import com.beust.testng.TestNG;
import com.lgi.ui.commonUtils.Driver;
import com.lgi.ui.commonUtils.Webservice;
import com.lgi.ui.automationJar.removeDuplicatesTestData;
import java.util.*;

class runTimer implements Runnable {

	int time = runAut.execTime;

	int wait = 10; // for every 10 mins

	public runTimer() {

	}

	public void run() {

		// code in the other thread, can reference "var" variable\
		if (time > 0) {

			System.out.println("Time left(approx.): " + time + "mins");
			time = time - wait;
		}

		try {
			Thread.sleep(wait * 60 * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (time < 0) {

			System.out.println("Done");
			return;
		}
		run();
	}
}

public class runAut {
	public static String lan_or_wan;
	public static String modem = null;
	public static String browser = null;
	public static String firmwareResult = null;
	public static String target = null;
	public static Logger log = null;
	static Webservice ws;
	public static boolean keepChangingPassword = true;
	public static int execTime;
	
	public static void main(String[] args) throws IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException 
	{

		
		modem = args[0];
		
		if(modem.contains("TestData"))
		{

			removeDuplicatesTestData tdata= new removeDuplicatesTestData();
			int val=tdata.readfile(modem);
			System.out.print("\nNumber of Duplicates are " + val+"\n");
			System.exit(0);
			
			
		}
		
		target = args[1];
		
		
		browser = args[2];
		try
		{
			lan_or_wan=args[3];
			System.out.println("\nAccessing through WAN SIDE");	
		}
		catch(Exception ex)
		{
			lan_or_wan = "lan";
				
			
		}
		
	
		

		
		
		
		TestNG testng = new TestNG();
		List<String> suites = Lists.newArrayList();

		FileInputStream fis = new FileInputStream("testSetup.properties");
		Properties prop = new Properties();
		prop.load(fis);

		File dir;

		// if the directory does not exist, creates it
		// else cleans it

		// To store the logs
		dir = new File("Logs");
		boolean dirRes = false;

		if (!dir.exists()) {
			dirRes = dir.mkdir();

			if (dirRes) {
				System.out.println("created directory- Logs");
			}
		} else
			FileUtils.cleanDirectory(new File(prop.getProperty("pathLogs")));
		
		dir = new File("encryptionDirectory");
		if (!dir.exists()) {
			dirRes = dir.mkdir();

			if (dirRes) {
				System.out.println("created directory- encryptionDirectory");
			}
		} 
		// To store the DB tables
		dir = new File("Database");
		dirRes = false;

		if (!dir.exists()) {
			dirRes = dir.mkdir();

			if (dirRes) {
				System.out.println("created directory- DataBase");
			}
		} 
			else
			  FileUtils.cleanDirectory(new File(prop.getProperty("pathDatabase")));

		// To store the screenshot of every action
		dir = new File("Screenshot");
		if (!dir.exists()) {
			dirRes = dir.mkdir();

			new File("Screenshot\\Success").mkdir();
			new File("Screenshot\\Failure").mkdir();

			if (dirRes) {
				System.out.println("created directory- Screenshot");
			}
		} else {
			FileUtils.cleanDirectory(new File(prop.getProperty("pathFailureScreenshot")));
			FileUtils.cleanDirectory(new File(prop.getProperty("pathSuccessScreenshot")));
		}

		// To store the required WiFi profiles (xml files)
		dir = new File("WiFiProfiles");
		if (!dir.exists()) {
			dirRes = dir.mkdir();

			if (dirRes) {
				System.out.println("created directory- Reports");
			}
		}

/*##################################################################################################################################
		 OBJECTIVE: GENERATING THE REPORTS FOLDER
		 
		 DESCRIPTION : the "Reports" FOLDER CONTAINS REPORTS BASED ON TIME STAMP
################################################################################################################################/*/

		dir = new File("Reports");
		if (!dir.exists()) {
			dirRes = dir.mkdir();

			if (dirRes) {
				System.out.println("created directory- Reports");
			}
		}
/*##############################END OF CREATION OF "Reports" FOLDER##########################################################################################*/
	    

		File screenshots = new File(prop.getProperty("pathScreenshot"));
		File logs = new File(prop.getProperty("pathLogs"));
		File html = new File(prop.getProperty("pathHTML"));
		File jUintreports = new File(prop.getProperty("pathJUnitReports"));
		File reports = new File("Reports");

		// Verify the current firmware version of gateway to get xpaths
		firmwareResult = Driver.firmwareControlling();

		if (firmwareResult != "Pass") {
			System.out.println(firmwareResult);
			exit(1);
		}
		
		
		
	
		
/*#################################################################################################################################
		 OBJECTIVE: CONNECTING TO DATABSE
					
		 DESCIPTION: THE BELOW TABLE IS FETCHING THE 2 TABLES FROM THE DATABASE
					 AND IS CREATING THE 2 xlsx FILE IN THE "Database Folder"
#####################################################################################################################################/*/
						ws = new Webservice();
				
						if (!(ws.getDatabaseTable(modem))) {
							System.out.println("Error in getting DB tables");
							exit(1);
						} else
							System.out.println("Dumped DB tables successfully");

		

/*############################  END OF ESTABLISHING DATABASE CONNECTION ################################################################################################################*/
		
		
		String key = "executionTime" + target.toLowerCase() + "_" + modem;

		String str = prop.getProperty(key, "30");

		execTime = Integer.parseInt(str);

		runTimer myRunnable = new runTimer();
		Thread t = new Thread(myRunnable);
		t.interrupt();

		t.start();
		
/*#################################################################################################################################
		 OBJECTIVE: ADDING THE .XML FILES TO THE TEST SUITE AND STARING THE TEST
					
		 DESCIPTION: THE .xml FILE TO BE USED IS DERIVED FROM THE SECOND PARAMETER 
		 			 PASSED TO THE MAIN FUNCTION. IT HAS TO HAVE THE SAME NAME AS THE TEST CASE
		 			 CLASS NAME. THE .xml FILE IS IN THE "TestNGConfiguration" FOLDER 
		 			 THE INDIVIDUAL .xml FILES HAVE THE TARGET CLASS NAME (and sometimes the
		 			 individual Test cases name, if all are not supposed to be executed).
#####################################################################################################################################/*/

			 
		
		switch (target.toLowerCase()) {

		case "home":

			System.out.println("Please Wait......");

			suites.add(System.getProperty("user.dir").concat("//TestNGConfiguration//home.xml"));
			testng.setTestSuites(suites);
			testng.run();

			break;

		case "connecteddevices":

			System.out.println("Please Wait......");

			suites.add(System.getProperty("user.dir").concat("//TestNGConfiguration//connecteddevices.xml"));
			testng.setTestSuites(suites);
			testng.run();

			break;
		case "connecteddevices_new":

			System.out.println("Please Wait......");

			suites.add(System.getProperty("user.dir").concat("//TestNGConfiguration//connecteddevices_new.xml"));
			testng.setTestSuites(suites);											 
			testng.run();

			break;
		
		case "wirelesssignal":

			System.out.println("Please Wait......");

			suites.add(System.getProperty("user.dir").concat("//TestNGConfiguration//wirelesssignal.xml"));
			testng.setTestSuites(suites);
			testng.run();

			break;

		case "wirelesssecurity":

			System.out.println("Please Wait......");

			suites.add(System.getProperty("user.dir").concat("//TestNGConfiguration//wirelesssecurity.xml"));
			testng.setTestSuites(suites);
			testng.run();

			break;
		case "wirelesssecurity_new":

			System.out.println("Please Wait......");

			suites.add(System.getProperty("user.dir").concat("//TestNGConfiguration//wirelesssecurity_new.xml"));
			testng.setTestSuites(suites);
			testng.run();

			break;
		case "guestnetwork":

			System.out.println("Please Wait......");

			suites.add(System.getProperty("user.dir").concat("//TestNGConfiguration//guestnetwork.xml"));
			testng.setTestSuites(suites);
			testng.run();

			break;

		case "wps":

			System.out.println("Please Wait......");

			suites.add(System.getProperty("user.dir").concat("//TestNGConfiguration//wps.xml"));
			testng.setTestSuites(suites);
			testng.run();

			break;

		case "dhcp_ipv4":

			System.out.println("Please Wait......");

			suites.add(System.getProperty("user.dir").concat("//TestNGConfiguration//dhcp_ipv4.xml"));
			testng.setTestSuites(suites);
			testng.run();

			break;
			

		case "dhcp_ipv6":

			System.out.println("Please Wait......");

			suites.add(System.getProperty("user.dir").concat("//TestNGConfiguration//dhcp_ipv6.xml"));
			testng.setTestSuites(suites);
			testng.run();

			break;
			
			
			case "dhcpv4_new":

			System.out.println("Please Wait......");

			suites.add(System.getProperty("user.dir").concat("//TestNGConfiguration//dhcpv4_new.xml"));
			testng.setTestSuites(suites);
			testng.run();

			break;
	case "dhcpv6_new":

			System.out.println("Please Wait......");

			suites.add(System.getProperty("user.dir").concat("//TestNGConfiguration//dhcpv6_new.xml"));
			testng.setTestSuites(suites);
			testng.run();

			break;








		case "wificonnectionwizard":

			System.out.println("Please Wait......");

			suites.add(System.getProperty("user.dir").concat("//TestNGConfiguration//wificonnectionwizard.xml"));
			testng.setTestSuites(suites);
			testng.run();

			break;

		case "upnp":

			System.out.println("Please Wait......");

			suites.add(System.getProperty("user.dir").concat("//TestNGConfiguration//upnp.xml"));
			testng.setTestSuites(suites);
			testng.run();

			break;

		case "tools":

			System.out.println("Please Wait......");
			suites.add(System.getProperty("user.dir").concat("//TestNGConfiguration//tools.xml"));
			testng.setTestSuites(suites);

			testng.run();

			break;

		case "firewall_old":

			System.out.println("Please Wait......");

			suites.add(System.getProperty("user.dir").concat("//TestNGConfiguration//firewall_old.xml"));
			testng.setTestSuites(suites);
			testng.run();

			break;

		case "firewall_new":

			System.out.println("Please Wait......");

			suites.add(System.getProperty("user.dir").concat("//TestNGConfiguration//firewall_new.xml"));
			testng.setTestSuites(suites);
			testng.run();

			break;

		case "firewall_ipv6":

			System.out.println("Please Wait......");

			suites.add(System.getProperty("user.dir").concat("//TestNGConfiguration//firewall_ipv6.xml"));
			testng.setTestSuites(suites);
			testng.run();

			break;

		case "dmz":

			System.out.println("Please Wait......");

			suites.add(System.getProperty("user.dir").concat("//TestNGConfiguration//dmz.xml"));
			testng.setTestSuites(suites);
			testng.run();

			break;
			
		case "dev_qa_dslite":

            System.out.println("Please Wait......");

            suites.add(System.getProperty("user.dir").concat("//TestNGConfiguration//dev_qa_dslite.xml"));
            testng.setTestSuites(suites);
            testng.run();

            break;

			
			
		case "wififorall":

			System.out.println("Please Wait......");

			suites.add(System.getProperty("user.dir").concat("//TestNGConfiguration//wififorall.xml"));
			testng.setTestSuites(suites);
			testng.run();

			break;

		case "ipandportfiltering":

			System.out.println("Please Wait......");

			suites.add(System.getProperty("user.dir").concat("//TestNGConfiguration//ipandportfiltering.xml"));
			testng.setTestSuites(suites);
			testng.run();

			break;

		case "ipandportfiltering_new":

			System.out.println("Please Wait......");

			suites.add(System.getProperty("user.dir").concat("//TestNGConfiguration//ipandportfiltering_new.xml"));
			testng.setTestSuites(suites);
			testng.run();

			break;
			
			
		case "demo":

			System.out.println("Please Wait......");

			suites.add(System.getProperty("user.dir").concat("//TestNGConfiguration//demo.xml"));
			testng.setTestSuites(suites);
			testng.run();

			break;
			
			
		case "ipandportfiltering_new_ipv6":

			System.out.println("Please Wait......");

			suites.add(System.getProperty("user.dir").concat("//TestNGConfiguration//ipandportfiltering_new_ipv6.xml"));
			testng.setTestSuites(suites);
			testng.run();

			break;
		case "macfiltering":

			System.out.println("Please Wait......");

			suites.add(System.getProperty("user.dir").concat("//TestNGConfiguration//macfiltering.xml"));
			testng.setTestSuites(suites);
			testng.run();

			break;
		case "macfiltering_new":

            System.out.println("Please Wait......");

            suites.add(System.getProperty("user.dir").concat("//TestNGConfiguration//macfiltering_new.xml"));
            testng.setTestSuites(suites);
            testng.run();

            break;


		case "portforwarding":

			System.out.println("Please Wait......");

			suites.add(System.getProperty("user.dir").concat("//TestNGConfiguration//portforwarding.xml"));
			testng.setTestSuites(suites);
			testng.run();

			break;
			
		case "admin_new":

			System.out.println("Please Wait......");

			suites.add(System.getProperty("user.dir").concat("//TestNGConfiguration//admin_new.xml"));
			testng.setTestSuites(suites);
			testng.run();

			break;
		case "tools_new":

			System.out.println("Please Wait......");

			suites.add(System.getProperty("user.dir").concat("//TestNGConfiguration//tools_new.xml"));
			testng.setTestSuites(suites);
			testng.run();

			break;
		case "portforwarding_new":

			System.out.println("Please Wait......");

			suites.add(System.getProperty("user.dir").concat("//TestNGConfiguration//portforwarding_new.xml"));
			testng.setTestSuites(suites);
			testng.run();

			break;

		case "porttriggering":

			System.out.println("Please Wait......");

			suites.add(System.getProperty("user.dir").concat("//TestNGConfiguration//porttriggering.xml"));
			testng.setTestSuites(suites);
			testng.run();

			break;

		case "porttriggering_new":

			System.out.println("Please Wait......");

			suites.add(System.getProperty("user.dir").concat("//TestNGConfiguration//porttriggering_new.xml"));
			testng.setTestSuites(suites);
			testng.run();

			break;

		case "admin":

			System.out.println("Please Wait......");

			suites.add(System.getProperty("user.dir").concat("//TestNGConfiguration//admin.xml"));
			testng.setTestSuites(suites);

			testng.run();

			break;

		case "modemmode":

			System.out.println("Please Wait......");
			suites.add(System.getProperty("user.dir").concat("//TestNGConfiguration//modemmode.xml"));
			testng.setTestSuites(suites);
			testng.run();

			break;

		case "mercury":

			System.out.println("Please Wait......");
			suites.add(System.getProperty("user.dir").concat("//TestNGConfiguration//mercury.xml"));
			testng.setTestSuites(suites);
			testng.run();
			break;

		case "firstinstall":

			System.out.println("Please Wait......");

			suites.add(System.getProperty("user.dir").concat("//TestNGConfiguration//firstInstall.xml"));
			testng.setTestSuites(suites);
			testng.run();

			break;
		case "diagnosticwizard":

			System.out.println("Please Wait......");

			suites.add(System.getProperty("user.dir").concat("//TestNGConfiguration//diagnosticwizard.xml"));
			testng.setTestSuites(suites);
			testng.run();

			break;

		case "guestnetwork_new":

			System.out.println("Please Wait......");

			suites.add(System.getProperty("user.dir").concat("//TestNGConfiguration//GuestNetwork_new.xml"));
			testng.setTestSuites(suites);
			testng.run();

			break;
		case "firstinstall_newtestplan":
			System.out.println("Please Wait......");

			suites.add(System.getProperty("user.dir").concat("//TestNGConfiguration//FirstInstall_NewTestPlan.xml"));
			testng.setTestSuites(suites);
			testng.run();

			break;

		case "dashboard":

			System.out.println("Please Wait......");

			suites.add(System.getProperty("user.dir").concat("//TestNGConfiguration//FirstInstall_NewTestPlan.xml"));
			testng.setTestSuites(suites);
			testng.run();

			break;
			
		case "wirelesssignal_new":

			System.out.println("Please Wait......");

			suites.add(System.getProperty("user.dir").concat("//TestNGConfiguration//wirelesssignal_new.xml"));
			testng.setTestSuites(suites);
			testng.run();

			break;
			
		case "Wireless_GuestNetwork_new":

			System.out.println("Please Wait......");

			suites.add(System.getProperty("user.dir").concat("//TestNGConfiguration//Wireless_GuestNetwork_new.xml"));
			testng.setTestSuites(suites);
			testng.run();

			break;
		case "wps_new":

			System.out.println("Please Wait......");

			suites.add(System.getProperty("user.dir").concat("//TestNGConfiguration//wps_new.xml"));
			testng.setTestSuites(suites);
			testng.run();

			break;
		case "dev_qa":

			System.out.println("Please Wait......");

			suites.add(System.getProperty("user.dir").concat("//TestNGConfiguration//dev_qa.xml"));
			testng.setTestSuites(suites);
			testng.run();

			break;
		case "multiple_test_cases":

			System.out.println("Please Wait......");

			suites.add(System.getProperty("user.dir").concat("//TestNGConfiguration//multiple_test_cases.xml"));
			testng.setTestSuites(suites);
			testng.run();

			break;
		default:
			System.out.println("Invalid Option. Please enter in the following format");
			System.out.println("java -jar *.jar [Modem] [Target] [Browser] [lan or wan]");
			exit(1);
		}
/*################################################## END OF TEST CASE EXECUTION ###################################################################################*/
		
		

		
		
		
		
		
/*#################################################################################################################################
		 OBJECTIVE: GENERATION OF REPORTS
					
		 DESCIPTION: IT GENERATES REPORTS IN THE "Reports" FOLDER
		             IT WILL CONTAIN :
		             				   1. html (IT CONTAINS THE INDEX FOLDER WHICH GIVES THE REPORTS SUMMARY)
		             				   2. 
		             				   3.
		             				   4.
		             				   5.
		             				   6.
		             				   7.
#####################################################################################################################################/*/

		Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMMyyyy_HHmmss");
		String time = dateFormat.format(now);
		dir = new File(time);
		dir.mkdir();

		FileUtils.copyDirectoryToDirectory(html, dir);
		FileUtils.copyDirectoryToDirectory(screenshots, dir);
		FileUtils.copyDirectoryToDirectory(logs, dir);
		FileUtils.copyDirectoryToDirectory(jUintreports, dir);

		// Copying Files used for run to Reports directory
		FileUtils.copyDirectoryToDirectory(new File("TestData"), dir);
		FileUtils.copyDirectoryToDirectory(new File("TestNGConfiguration"), dir);
		FileUtils.copyFileToDirectory(new File("test-output\\testng-results.xml"), dir);

		FileUtils.moveDirectoryToDirectory(dir, reports, false);
/*############################################### END OF REPORTS GENERATION ####################################################################*/
		if (t.isAlive())
			t.stop();
		log = Driver.getLogger();
		log.info("Test Execution Completed. Please go to Reports/" + dir + " folder for test reports");
		Thread.sleep(0);

		Thread.sleep(1.1);
  	Thread.sleep(2.1);

		System.out.println("Test Execution Completed. Please go to Reports/" + dir + " folder for test reports");

		exit(1);
	}

	private static void exit(int i) {
		// TODO Auto-generated method stub
		System.exit(i);

	}

}
