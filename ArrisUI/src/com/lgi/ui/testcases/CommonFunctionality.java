package com.lgi.ui.testcases;

import java.util.ArrayList;







import java.util.concurrent.TimeUnit;

import com.lgi.ui.automationJar.ModemFactoryReset;
import com.lgi.ui.commonUtils.Driver;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import java.util.Collections;
import com.lgi.ui.commonUtils.Driver;
import com.lgi.ui.testAction.TestAction;
import com.lgi.ui.testAction.TestAction;

public class CommonFunctionality {

	Logger log = Driver.getLogger();

	

	WebDriver driver;//aded
	static
	{

		//hello
		//hello 2
		int x=0;

		

	}

	public void RebootGateWay() {


		System.out.println("modem is rebooted");
		log.info("modem is rebooted");

		String reboot = null;
		int t = 0;

		try {

			Thread.sleep(30 * 1000);

			String clas = new Exception().getStackTrace()[1].getClassName();
			if (clas.split("\\.")[4].equals("Admin"))
				Thread.sleep(90 * 1000);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		while (t < 15) {

			reboot = Driver.parsingCSVFile("ModemRebooted");

			// Debugging
			log.info("modem online: " + reboot);
			// Debugging

			if (reboot.equals("true")) {

				try {
					Thread.sleep(60 * 1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				break;
			} else {
				log.info("Modem rebooted. Wait for it to come online");

				try {
					Thread.sleep(60 * 1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				t++;
			}

			if (t == 14) {
				log.info("Modem didn't come online in 15mins");
				break;
			}
		}

		return;
	}

	/*
	 * Following method prints string "ModemMode_Status" or
	 * "ModemModem_Revert_Status" to hand over the control of execution and waits
	 * for the response: Pass or Fail, approximate time for getting the control of
	 * execution and GUI to come online is 1 hour.
	 */

	public String modemMode(String testDataValue) 

	{

		String modemMode = "Fail";
		int countMode = 1;

		log.info(testDataValue);
		System.out.println(testDataValue);

		/* Delay for selenium configuration file to get update */
		try {
			Thread.sleep(30 * 1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		/* To check whether Modem Mode test is passed or Failed */
		while (countMode < 61) {

			modemMode = Driver.parsingCSVFile(testDataValue);

			log.info(testDataValue + ":" + modemMode);

			if (modemMode.equalsIgnoreCase("Pass")) {

				try {
					Thread.sleep(60 * 1000);
					log.info(countMode
							+ " minute passed while waiting for AutomationLAN mac address is displayed in the list of CPE or not.");
				} catch (InterruptedException e) {

					log.info("Class: " + new Object() {
					}.getClass().getEnclosingClass().getName() + ", Method: " + new Object() {
					}.getClass().getEnclosingMethod().getName() + ", Message: " + e.getMessage()
							+ ", Supporting Message: Thread interuption exception");
				}
				countMode++;
				break;
			} else {
				log.info(testDataValue + " is still in running mode. Wait for it to complete");

				try {
					Thread.sleep(60 * 1000);
					log.info(countMode
							+ " minute passed while waiting for AutomationLAN mac address is displayed in the list of CPE or not.");
				} catch (InterruptedException e) {

					log.info("Class: " + new Object() {
					}.getClass().getEnclosingClass().getName() + ", Method: " + new Object() {
					}.getClass().getEnclosingMethod().getName() + ", Message: " + e.getMessage()
							+ ", Supporting Message: Thread interuption exception");
				}
				countMode++;

			}

		}

		if (countMode > 60)
			log.info(testDataValue + " is " + modemMode + " even after " + countMode + " mins");

		// log.info("countMode no:"+countMode);
		if (testDataValue.contains("Mode_Status")
				&& (modemMode.equalsIgnoreCase("Fail") || modemMode.equalsIgnoreCase("NA")))
			return "Even after setting the mode bridge , Automation LAN is not displayed in the list of CPE.";
		else if (testDataValue.contains("_Revert_Status") && modemMode.equalsIgnoreCase("Fail"))
			return "Even after setting the mode router mode , Automation LAN is displayed in the list of CPE.";

		else
			return "Pass";
	}

	public void Start_AFtr_Reboot() throws InterruptedException 


	{

		this.ReloadAndReboot();
		log.info("going to close window");
		
		//Driver.resetmodem();
		//Driver.closeDriver();
		Driver.openModel();
				
	    
		
		
		
		
//		while (!driver.findElement(By.xpath("//*[@id=\"FirstInstall_Frame_0\"]/div[1]/div")).isDisplayed()) 
//		{
//			driver.navigate().refresh();
//			System.out.println("Waiting for Hello page");
//		}
		log.info("Modem Page displayed");
		this.MercuryInitialSetup();
		log.info("+++++++++++++++++ START TEST +++++++++++++++++");

	}

	
	public String factoryReset() 



	{
		Driver.closeDriver();
		ModemFactoryReset mfr = new ModemFactoryReset();
		mfr.FactoryResetModem();
		
		

		
		
		
		
		Driver.openModel();
		return MercuryInitialSetup();

	}
	// new code for reboot
	public String ReloadAndReboot() throws InterruptedException {

		log.info("**********************************STARTED FACTORY RESET******************************");
		String test_case = new Object() {


		}.getClass().getEnclosingMethod().getName();
		String response = TestAction.getLoginAction().getTestResult(test_case);
		
		
		log.info("**********************************COMPLETED FACTORY RESET****************************");
		Driver.closeDriver();
		Thread.sleep(360 * 1000);
		Driver.openModel();
		return response;

	}

	public String ReloadAndRebootLogInWithChangedPassword () throws InterruptedException {
		log.info("Entered ReloadAndReboot Section");
		String test_case = new Object() {

		}.getClass().getEnclosingMethod().getName();
		String response = TestAction.getLoginAction().getTestResult(test_case);
		log.info("completed ReloadAndReboot");
		return response;

	}
	
	
	public String MercuryInitialSetup() {

		if(TestAction.log_flag==1)
			log.info("**********************************STARTED FIRST INSTALL*****************************");
		String test_case = new Object() {


		}.getClass().getEnclosingMethod().getName();
		
		String response = TestAction.getLoginAction().getTestResult(test_case);
		if(TestAction.log_flag==1)
			log.info("**********************************COMPLETED FIRST INSTALL**************************");
		return response;

	}

	
	
	public void logout() throws InterruptedException
	{
		log.info("*****************Logging out of page******************");
		String response = TestAction.getLoginAction().getTestResult("logout");
		
		if(!response.equals("Pass")) 
		{
			
			this.factoryReset();
			
			
		}
		
	}
	public String MercuryLogin()  {



		String response ;
		
		String test_case = new Object() {

		}.getClass().getEnclosingMethod().getName();
		response = TestAction.getLoginAction().getTestResult(test_case);
		
		if(!response.equals("Pass")) 
		{
			response=this.MercuryInitialSetup();
			if(response!="Pass")
				this.factoryReset();
		
			
		}
		
		return response;
	}
	
	public String webUI_Mercury_Admin_Change_password()
	{
		log.info("**********************************CHANGING PASSWORD************************************");
		String test_case = new Object() {

		}.getClass().getEnclosingMethod().getName();
		
		String response = TestAction.getLoginAction().getTestResult(test_case);
		log.info("**********************************COMPLETED CHANGING PASSWORD**************************");
		return response;

	}
	
	public String MercuryLoginNewPassword() {



	

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		String response = TestAction.getLoginAction().getTestResult(test_case);
		

		if (!response.equals("Pass"))
		{
			this.MercuryInitialSetup();
			closeAndOpenDriver();

			response=this.MercuryLoginNewPassword();
		}
	
		
		return response;
	
	}
	
	public void closeAndOpenDriver() 
	{
		Driver.closeDriver();
		Driver.openModel();
	}

	public String MercuryMasterLogin() {


		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		String response = TestAction.getLoginAction().getTestResult(test_case);

		return response;
	}
	public String disableGuestNetwork() throws InterruptedException {


		MercuryLogin();
		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		String response = TestAction.getLoginAction().getTestResult(test_case);
		Driver.closeDriver();
		Driver.openModel();
		return response;
	}
	
	public String ConnectTo24GHzWiFiNetwork() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		String response = TestAction.getLoginAction().getTestResult(test_case);

		return response;
	}

	public String ConnectTo5GHzWiFiNetwork() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		String response = TestAction.getLoginAction().getTestResult(test_case);

		return response;
	}

	public String WirelessSecurity24GHzDefaultWiFiConfiguration() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		String response = TestAction.getLoginAction().getTestResult(test_case);

		return response;
	}

	public String WirelessSecurity5GHzDefaultWiFiConfiguration() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		String response = TestAction.getLoginAction().getTestResult(test_case);

		return response;
	}

	public String WirelessSecurityDefaultMACFilteringConfiguration() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		String response = TestAction.getLoginAction().getTestResult(test_case);

		return response;
	}

	public String webUI_Mercury_Modem_mode_Disable_modem_mode() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		String response = TestAction.getLoginAction().getTestResult(test_case);

		return response;
	}

	public String DownstreamFrequency(int noOfCh, String ch_csv) {


	

		TestAction.log_flag=0;

		


		String chId = "Not Found";
		int i = 0;
		for (i = 1; i <= noOfCh; i++) {

			String downstreamChFreq = Driver.parsingCSVFile("DownstreamFrequency_F" + i);

			chId = downstreamChFreq;
			//System.out.println(ch_csv + " "+ ch_csv.length()+" "+ downstreamChFreq + " "+ downstreamChFreq.length());

			if (chId.equals(ch_csv)) 
			{
				break;
			}
		}
		TestAction.log_flag=1;

		if (!chId.equals(ch_csv)) {
			return "Frequency not Matched";
		}

		return chId;
	}

	public String UpstreamFrequency(int noOfCh, String ch_csv) {



		TestAction.log_flag=0;



		String chId = "Not Found";
		int i = 0;
		for (i = 1; i <= noOfCh; i++) {

			String downstreamChFreq = Driver.parsingCSVFile("UpstreamFrequency_F" + i);

			chId = downstreamChFreq;
			//System.out.println(ch_csv + " "+ ch_csv.length()+" "+ downstreamChFreq + " "+ downstreamChFreq.length());
			if (chId.equals(ch_csv)) {
				break;
			}
		}
		TestAction.log_flag=1;

		if (!chId.equals(ch_csv)) {
			return "Frequency not Matched";
		}

		return chId;
	}

	public String checkDownstreamChannelData(int noOfCh)
	{
      
		
		
		String result = null;
		int i,chId = 0;
		TestAction.log_flag=0;
		int min=Integer.parseInt(TestAction.getLoginAction().getTestResult("findDownstreamChannelID_1"));
		String testCh;
		
		for (i = 2; i <= noOfCh; i++) 
		{
			testCh = "findDownstreamChannelID_" + (i);
			chId=Integer.parseInt(TestAction.getLoginAction().getTestResult(testCh));
			if (min>chId)
				min=chId;
			
		}
		
		
		
		//log.info("Minimum channel Id is "+ min);
		

		
		for (i = 1; i <= noOfCh; i++) 
		{

			//log.info(">>>>>>>>>Searching for DownstreamChannelID" + i);
			String downstreamChId = Driver.parsingCSVFile("DownstreamChannelID_F" + i);
			//log.info("Downstream ChannelId" + i + " from csv " + downstreamChId);

			String downstreamChFreq = Driver.parsingCSVFile("DownstreamFrequency_F" + i);
			//log.info("Downstream ChannelFreq" + i + " from csv " + downstreamChFreq);

			int freq;
			int j = 0;

			for (j = 1; j <= noOfCh; j++) 
			{
				
				//log.info("---------------inside for loop----------------------");
				testCh = "findDownstreamChannelID_" + (j);
				
				chId = Integer.parseInt(TestAction.getLoginAction().getTestResult(testCh));
				
				
				if (chId+min-1 == Integer.parseInt(downstreamChId)) 
				{   
					
					log.info("                Channel Id found in row " + j);
					String testFreq = "findDownstreamChannelFrequency_" + (j);
					freq = Integer.parseInt(TestAction.getLoginAction().getTestResult(testFreq));
						
					if (freq == Integer.parseInt(downstreamChFreq)) 
					{
						
						String testPowerSNR = "checkDownstreamChannelData_" + (j);
						result = TestAction.getLoginAction().getTestResult(testPowerSNR);
					} 
					
					else
						result = "Frequency is not aligned with Channel Id";
					
					break;
				} 
				
//				else
//					result = "Fail - Channel Id not found";
			}
			TestAction.log_flag=1;
			log.info("               SEARCHING DONE");
			log.info("");
			log.info("");
			log.info("");
			if (!result.equals("Pass"))
				break;
		}
		
		
		return result;
	}












	

	public String checkUpstreamChannelData(int noOfCh) 

	{
		
		
		String result = null;
		int i = 0;
		TestAction.log_flag=0;

		TestAction.not_found_ids.clear();
		for (i = 1; i <= noOfCh; i++) 
		{
			String testCh = "findUpstreamChannelID_" + (i);
			
			TestAction.not_found_ids.add(Integer.parseInt(TestAction.getLoginAction().getTestResult(testCh)));
			
					}
		
		//Collections.sort(TestAction.not_found_ids);
		
//		log.info("Minimum character will be " +TestAction.not_found_ids.get(0));
//		String min =TestAction.not_found_ids.get(0);

		
		
		
		for (i = 1; i <= noOfCh; i++) 
		{

			log.info(">>>>>>>>>Searching for UpstreamChannelID" + i);
			int upstreamChId = TestAction.not_found_ids.get(i-1);//Driver.parsingCSVFile("UpstreamChannelID_F" + i);
			
			log.info("ChannelId" + i + " from csv " + upstreamChId);

			String upstreamChFreq = Driver.parsingCSVFile("UpstreamFrequency_F" + i);
			log.info("ChannelFreq" + i + " from csv " + upstreamChFreq);

			int chId, freq;
			int j = 0;
            int found =0;
            
			for (j = 1; j <= noOfCh; j++) 
			{

				String testCh = "findUpstreamChannelID_" + (j);
				chId = Integer.parseInt(TestAction.getLoginAction().getTestResult(testCh));
								
				if (chId == TestAction.not_found_ids.get(i-1)) 
				{   
					found =1;
					log.info("               Channel Id found in row " + j);

					String testFreq = "findUpstreamChannelFrequency_" + (j);
					freq = Integer.parseInt(TestAction.getLoginAction().getTestResult(testFreq));

					if (freq >0) //if (freq==Integer.parseInt(upstreamChFreq))
					{
						
						String testPowerSNR = "checkUpstreamChannelData_" + (j);
						result = TestAction.getLoginAction().getTestResult(testPowerSNR);

					} else
						result = "Frequency is not aligned with Channel Id";

					break;
				} 
				else
					result = "Fail - Channel Id not found";
			}
			
			
			TestAction.log_flag=1;

			log.info("               SEARCHING DONE");
			log.info("");
			log.info("");
			log.info("");
			if (!result.equals("Pass"))
				break;

		}
	
	return result;
	}


	public String webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		String response = TestAction.getLoginAction().getTestResult(test_case);

		return response;
	}

	public String webUI_Mercury_Advanced_settings_Security_EnableAutomationLAN() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		String response = TestAction.getLoginAction().getTestResult(test_case);

		return response;
	}

	public String DHCPV4_IPv4RGAndDSLite_DefaultValues() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		String response = TestAction.getLoginAction().getTestResult(test_case);

		return response;
	}

	public String DHCPV4_IPv4RGAndDSLite_Disabled() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		String response = TestAction.getLoginAction().getTestResult(test_case);

		return response;
	}

	public String DHCPV4_IPv4RGAndDSLite_ChangeStartingLocalAddressWithoutChangingNoOfCPEs() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		String response = TestAction.getLoginAction().getTestResult(test_case);
		if (response.equals("Pass"))
			TestAction.getLoginAction().getTestResult("DHCPV4_IPv4RGAndDSLite_ChangeStartingLocalAddressDefault");

		return response;
	}

	public String DHCPV4_IPv4RGAndDSLite_ChangeStartingLocalAddressInvalidIP() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		String response = TestAction.getLoginAction().getTestResult(test_case);

		return response;
	}

	public String DHCPV4_IPv4RGAndDSLite_ChangeNoOfCPEs() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		String response = TestAction.getLoginAction().getTestResult(test_case);

		return response;
	}

	public String DHCPV4_IPv4RGAndDSLite_ChangeNoOfCPEsInvalid() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		String response = TestAction.getLoginAction().getTestResult(test_case);
		if (response.equals("Pass"))
			TestAction.getLoginAction().getTestResult("DHCPV4_IPv4RGAndDSLite_ChangeNoOfCPEsDefault");

		return response;
	}

	public String DHCPV4_IPv4RGAndDSLite_ChangeStartingLocalAddress() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		String response = TestAction.getLoginAction().getTestResult(test_case);

		return response;
	}

	public String DHCPV4_IPv4RGAndDSLite_ReservedIPAddressesAttachedDeviceDefault() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		String response = TestAction.getLoginAction().getTestResult(test_case);

		return response;
	}

	public String DHCPV4_IPv4RGAndDSLite_ReservedIPAddressesAttachedDeviceRefresh() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		String response = TestAction.getLoginAction().getTestResult(test_case);

		return response;
	}

	public String DHCPV4_IPv4RGAndDSLite_ReservedIPAddRuleDefault() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		String response = TestAction.getLoginAction().getTestResult(test_case);

		return response;
	}

	public String DHCPV4_IPv4RGAndDSLite_ReservedIPAddRuleAttachedDevice() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		String response = TestAction.getLoginAction().getTestResult(test_case);
		if (response.equals("Pass"))
			TestAction.getLoginAction()
					.getTestResult("DHCPV4_IPv4RGAndDSLite_ReservedIPAddRuleAttachedDeviceRevertDefault");

		return response;
	}

	public String DHCPV4_IPv4RGAndDSLite_ReservedIPAddRuleManully() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		String response = TestAction.getLoginAction().getTestResult(test_case);
		if (response.equals("Pass"))
			TestAction.getLoginAction()
					.getTestResult("DHCPV4_IPv4RGAndDSLite_ReservedIPAddRuleAttachedDeviceRevertDefault");

		return response;
	}

	public String DHCPV4_IPv4RGAndDSLite_ReservedIPAddRuleManullyInvalidMac() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		String response = TestAction.getLoginAction().getTestResult(test_case);

		return response;
	}

	public String DHCPV4_IPv4RGAndDSLite_ReservedIPAddRuleManullyInvalidIP() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		String response = TestAction.getLoginAction().getTestResult(test_case);

		return response;
	}

	public String DHCPV4_IPv4RGAndDSLite_ReservedIPReservedListDefault() {

		String test_case = new Object() {

		}.getClass().getEnclosingMethod().getName();
		String response = TestAction.getLoginAction().getTestResult(test_case);

		return response;
	}

	public String DHCPV4_IPv4RGAndDSLite_ReservedIPReservedListDelete() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		String response = TestAction.getLoginAction().getTestResult(test_case);

		return response;
	}

	public String DHCPV4_IPv4RGAndDSLite_ChangeLeaseTimeInvalid() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		String response = TestAction.getLoginAction().getTestResult(test_case);

		return response;
	}

	public String DHCPV4_IPv4RGAndDSLite_LeaseTime() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		String response = TestAction.getLoginAction().getTestResult(test_case);

		return response;
	}

	public String DHCPV4_IPv4RGAndDSLite_ChangeLeaseTimeValid() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		String response = TestAction.getLoginAction().getTestResult(test_case);

		return response;
	}

	public String webUI_Mercury_Advanced_settings_Security_Port_forwarding_RevertBack() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		String response = TestAction.getLoginAction().getTestResult(test_case);

		return response;
	}

	public String webUI_Mercury_Advanced_settings_Security_Port_Triggering_RevertBack() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		String response = TestAction.getLoginAction().getTestResult(test_case);

		return response;
	}
	//shilpi
		public String webUI_Mercury_Advanced_settings_Security_MAC_Filtering_RevertBack() {

			String test_case = new Object() {
			}.getClass().getEnclosingMethod().getName();
			String response = TestAction.getLoginAction().getTestResult(test_case);

			return response;
		}
		//shilpi
			public String webUI_Mercury_Advanced_settings_DHCP_Add_Rule_RevertBack() {


				String test_case = new Object() {
				}.getClass().getEnclosingMethod().getName();
				String response = TestAction.getLoginAction().getTestResult(test_case);

				return response;
			}
	    //shilpi
			public String DHCPV4_IPv4RGAndDSLite_ChangeToDefault() {

				String test_case = new Object() {
				}.getClass().getEnclosingMethod().getName();
				String response = TestAction.getLoginAction().getTestResult(test_case);

				return response;
			}

	public String webUI_Mercury_Admin_Remote_access_Revertback() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		String response = TestAction.getLoginAction().getTestResult(test_case);

		return response;
	}

	public String webUI_Mercury_Advanced_settings_UPnP_Enable_Back_UPnP() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		String response = TestAction.getLoginAction().getTestResult(test_case);

		return response;

	}

}
