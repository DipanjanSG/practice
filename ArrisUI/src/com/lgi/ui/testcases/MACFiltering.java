package com.lgi.ui.testcases;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.lgi.ui.automationJar.runAut;
import com.lgi.ui.commonUtils.Driver;
import com.lgi.ui.testAction.TestAction;

public class MACFiltering {
	Logger log = null;
	CommonFunctionality fun = new CommonFunctionality();
	String response = null;
	public static int nChannel;
	TestAction action;
	
	@BeforeClass
	public void testInitBrowser() {

		log = Driver.getLogger();
		log.info("+++++++++++++++++ Gateway Model: " + runAut.modem + " - Tools Page +++++++++++++++++");
	}

	@BeforeMethod
	public void testFactoryReset() 
	{

		log.info("+++++++++++++++++ START TEST +++++++++++++++++");

		log.info("Enabling DHCP for AutomationLAN and AutomationWiFi");
		
		action = new TestAction();
//		
//		String command = "netsh interface ip set address \"AutomationLAN\" dhcp";
//		action.runCommand(command);
//				
//		command = "netsh interface ip set address \"AutomationWiFi\" dhcp";
//		action.runCommand(command);
//		
//		command="netsh interface ip set dnsservers name = \"AutomationWiFi\" source=dhcp";
//		action.runCommand(command);
		
		//fun.RebootGateWay();
		Driver.openModel();
		//response = fun.MercuryInitialSetup();
		response = fun.MercuryLogin();
	}

	@Test(priority = 1)
	public void webUI_Mercury_Advanced_settings_Security_MAC_Filtering_default_status_1824() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 2)
	public void webUI_Mercury_Advanced_settings_Security_MAC_Filtering_Attached_device_Refresh_1825() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 3)
	public void webUI_Mercury_Advanced_settings_Security_MAC_Filtering_add_filter_rule_always_on_1826() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		String response = TestAction.getLoginAction().getTestResult(test_case);
		
		if(response.equals("Pass")){
			Driver.closeDriver();
			Driver.openModel();
			response = TestAction.getLoginAction().getTestResult("webUI_Mercury_Advanced_settings_Security_MAC_Filtering_add_filter_rule_always_on_1826_1");
		}

		fun.webUI_Mercury_Advanced_settings_Security_EnableAutomationLAN();
		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 4)
	public void webUI_Mercury_Advanced_settings_Security_MAC_Filtering_add_filter_rule_invalid_MAC_address_1834() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 5)
	public void webUI_Mercury_Advanced_settings_Security_MAC_Filtering_add_filter_rule_duplicate_Device_name_1835() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 6)
	public void webUI_Mercury_Advanced_settings_Security_MAC_Filtering_add_filter_rule_duplicate_MAC_address_1836() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		System.out.println("Response:"+response);

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
    
	/*Cannot be automated
	@Test(priority = 7)
	public void webUI_Mercury_Advanced_settings_Security_MAC_Filtering_add_filter_rule_maximum_list_1837() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	*/
	@AfterMethod
	public void testCloseBrowser() {
		try {
			response = "";
			Driver.closeDriver();
			Thread.sleep(1000 * 5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			log.info("Messsage: Thread interrupted exception");
		}
		log.info("+++++++++++++++++ END TEST +++++++++++++++++\n");
		// driver.close();
	}
}
