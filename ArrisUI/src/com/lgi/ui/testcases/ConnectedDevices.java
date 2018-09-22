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

public class ConnectedDevices {
	
	Logger log = null;
	CommonFunctionality fun = new CommonFunctionality();
	String response = null;
	
	@BeforeClass
	public void testInitBrowser() {

		log = Driver.getLogger();
		log.info("+++++++++++++++++ Gateway Model: " + runAut.modem + " - Connected Devices Page +++++++++++++++++");
	}

	@BeforeMethod
	public void testFactoryReset() {

		log.info("+++++++++++++++++ START TEST +++++++++++++++++");

		fun.RebootGateWay();
		
		Driver.openModel();
		fun.MercuryInitialSetup();
		//fun.MercuryLogin();
	}

	@Test(priority = 1)
	public void webUI_Mercury_Connected_devices_335() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		String response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 2)
	public void webUI_Mercury_Connected_devices_Refresh_1672() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		String response = TestAction.getLoginAction().getTestResult("webUI_Mercury_Connected_devices_335");

		if (response.equals("Pass")) {

			response = fun.ConnectTo24GHzWiFiNetwork();
			if (response.equals("Pass")) {

				response = TestAction.getLoginAction().getTestResult(test_case);
			}
		}

		Assert.assertEquals(response, "Pass", response);
	}
	
	
	
	//UPnP
	@Test(priority = 3)
	public void webUI_Mercury_Advanced_settings_UPnP_Default_values_1992() {

		log.info("Test Case: "+ new Object(){}.getClass().getEnclosingMethod().getName());
		
		String test_case = new Demo() {
		}.getClass().getEnclosingMethod().getName();

		String response = TestAction.getLoginAction().getTestResult(test_case); 
		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 4)
	public void webUI_Mercury_Advanced_settings_UPnP_Add_rule_1993() {

		log.info("Test Case: "+ new Object(){}.getClass().getEnclosingMethod().getName());
		
		String test_case = new Demo() {
		}.getClass().getEnclosingMethod().getName();

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 5)
	public void webUI_Mercury_Advanced_settings_UPnP_Disable_UPnP_1994() {

		log.info("Test Case: "+ new Object(){}.getClass().getEnclosingMethod().getName());
		
		String test_case = new Demo() {
		}.getClass().getEnclosingMethod().getName();

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	
	//DMZ
	@Test(priority = 6)
	public void webUI_Mercury_Advanced_settings_Security_DMZ_Default_Status_1988() {

		log.info("Test Case: "+ new Object(){}.getClass().getEnclosingMethod().getName());
		
		String test_case = new Demo() {
		}.getClass().getEnclosingMethod().getName();
		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 7)
	public void webUI_Mercury_Advanced_settings_Security_DMZ_Enable_1989() {

		log.info("Test Case: "+ new Object(){}.getClass().getEnclosingMethod().getName());
		
		String test_case = new Demo() {
		}.getClass().getEnclosingMethod().getName();
		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 8)
	public void webUI_Mercury_Advanced_settings_Security_DMZ_Disable_1990() {

		log.info("Test Case: "+ new Object(){}.getClass().getEnclosingMethod().getName());
		
		String test_case = new Demo() {
		}.getClass().getEnclosingMethod().getName();
		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 9)
	public void webUI_Mercury_Advanced_settings_Security_DMZ_Invalid_IP_1991() {

		log.info("Test Case: "+ new Object(){}.getClass().getEnclosingMethod().getName());
		
		String test_case = new Demo() {
		}.getClass().getEnclosingMethod().getName();
		String response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	
	//WPS
	@Test(priority = 10)
	public void WPSDefaultStatus_1800() {

		log.info("Test Case: "+ new Object(){}.getClass().getEnclosingMethod().getName());
		
		String test_case = new Demo() {}.getClass().getEnclosingMethod().getName();
		String response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	
	
	@AfterMethod
	public void testCloseBrowser() {
		try {
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
