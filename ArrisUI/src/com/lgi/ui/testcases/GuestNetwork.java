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

public class GuestNetwork {

	Logger log = null;
	CommonFunctionality fun = new CommonFunctionality();

	@BeforeClass
	public void testInitBrowser() {

		log = Driver.getLogger();
		log.info("+++++++++++++++++ Gateway Model: " + runAut.modem + " - Guest Network Page +++++++++++++++++");

		Driver.openModel();
		fun.MercuryInitialSetup();
		Driver.closeDriver();
	}

	@BeforeMethod
	public void testFactoryReset() {

		log.info("+++++++++++++++++ START TEST +++++++++++++++++");
	}

	@Test(priority = 1)
	public void webUI_Mercury_Advanced_settings_Wireless_Guest_network_Default_status_1783() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		fun.RebootGateWay();
		Driver.openModel();

		String response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 2)
	public void webUI_Mercury_Advanced_settings_Wireless_Guest_network_Check_default_24GHz_WiFi_Network_Name_1784() {
		
		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);

		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();

		
		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 3)
	public void webUI_Mercury_Advanced_settings_Wireless_Guest_network_Change_Guest_Network_Name_1785() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);

		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();
		// String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 4)
	public void webUI_Mercury_Advanced_settings_Wireless_Guest_network_change_SSID_with_invalid_SSID_1786() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();
		// String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 5)
	public void webUI_Mercury_Advanced_settings_Wireless_Guest_network_change_SSID_with_SSID_too_long_1787() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();
		


		response = TestAction.getLoginAction().getTestResult(test_case);

		if (response.equals("ssid error message not found"))
			response = TestAction.getLoginAction().getTestResult("GuestNetworkChangeSSIDToTooLong_1787_1");
		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 6)
	public void webUI_Mercury_Advanced_settings_Wireless_Guest_network_change_SSID_with_SSID_changed_to_primary_SSID_1788() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		fun.RebootGateWay();
		Driver.openModel();

		String response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 7)
	public void webUI_Mercury_Advanced_settings_Wireless_Guest_network_change_Guest_SSID_to_Hotspot_SSID_1789() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		fun.RebootGateWay();
		Driver.openModel();

		String response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 8)
	public void webUI_Mercury_Advanced_settings_Wireless_Guest_network_Broadcast_of_SSID_default_status_1790() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		fun.RebootGateWay();
		Driver.openModel();

		String response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 9)
	public void webUI_Mercury_Advanced_settings_Wireless_Guest_network_Broadcast_of_SSID_disable_1791() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();
		// String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 10)
	public void webUI_Mercury_Advanced_settings_Wireless_Guest_network_Broadcast_of_SSID_enable_1792() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();
		// String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult("webUI_Mercury_Advanced_settings_Wireless_Guest_network_Broadcast_of_SSID_disable_1791");

		if (response.equals("Pass"))
			response = TestAction.getLoginAction().getTestResult(test_case);
		else
			response = "Failed - SSID is not disabled";

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 11)
	public void webUI_Mercury_Advanced_settings_Wireless_Guest_network_Default_Security_1793() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();
		// String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 12)
	public void webUI_Mercury_Advanced_settings_Wireless_Guest_network_WPA_PSKWPA2_PSK_1794() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		Driver.openModel();

		String response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 13)
	public void webUI_Mercury_Advanced_settings_Wireless_Guest_network_No_Security_1795() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		Driver.openModel();

		String response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 14)
	public void webUI_Mercury_Advanced_settings_Wireless_Guest_network_WPA2_PSK_1796() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);

		Driver.openModel();

		String response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 15)
	public void webUI_Mercury_Advanced_settings_Wireless_Guest_network_Default_security_key_1797() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();
		// String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 16)
	public void webUI_Mercury_Advanced_settings_Wireless_Guest_network_Change_security_key_Valid_value_1798() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		Driver.openModel();

		String response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 17)
	public void webUI_Mercury_Advanced_settings_Wireless_Guest_network_Change_security_key_Invalid_value_1799() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		Driver.openModel();

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
