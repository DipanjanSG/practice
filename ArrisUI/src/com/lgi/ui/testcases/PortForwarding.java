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

public class PortForwarding {

	Logger log = null;
	CommonFunctionality fun = new CommonFunctionality();
	String response = null;

	@BeforeClass
	public void testInitBrowser() {

		log = Driver.getLogger();
		log.info("+++++++++++++++++ Gateway Model: " + runAut.modem + " - Port Forwarding Page +++++++++++++++++");
	}

	@BeforeMethod
	public void testFactoryReset() throws InterruptedException {


		log.info("+++++++++++++++++ START TEST +++++++++++++++++");

		Driver.openModel();
		
	}
	//////////////////////////////////////////////////////////////////////////////////////
						//XAMPP SERVER NEEDS TO BE RUNNING FOR THIS TESTCASE//
	//////////////////////////////////////////////////////////////////////////////////////

	@Test(priority = 1)
	public void webUI_Mercury_Advanced_settings_Security_Port_forwarding_Default_status_1947() {
		try {
			fun.ReloadAndReboot();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Driver.closeDriver();
		try {
			Thread.sleep(360 * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Driver.openModel();
		fun.MercuryInitialSetup();
		Driver.closeDriver();
		Driver.openModel();	
		response = fun.MercuryLogin();
		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 2)
	public void webUI_Mercury_Advanced_settings_Security_Port_forwarding_add_rule_TCP_Enable_1948() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		response = fun.MercuryLogin();
		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_Port_forwarding_RevertBack();
		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 3)
	public void webUI_Mercury_Advanced_settings_Security_Port_forwarding_add_rule_UDP_Enable_1949() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		response = fun.MercuryLogin();
		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_Port_forwarding_RevertBack();
		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 4)
	public void webUI_Mercury_Advanced_settings_Security_Port_forwarding_add_rule_Both_Enable_1950() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		response = fun.MercuryLogin();
		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_Port_forwarding_RevertBack();
		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 5)
	public void webUI_Mercury_Advanced_settings_Security_Port_forwarding_add_rule_range_of_TCP_Enable_1951() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		response = fun.MercuryLogin();
		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_Port_forwarding_RevertBack();
		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 6)
	public void webUI_Mercury_Advanced_settings_Security_Port_forwarding_add_rule_range_of_UDP_Enable_1952() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		response = fun.MercuryLogin();
		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_Port_forwarding_RevertBack();
		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 7)
	public void webUI_Mercury_Advanced_settings_Security_Port_forwarding_add_rule_range_of_Both_Enable_1953() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		response = fun.MercuryLogin();
		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_Port_forwarding_RevertBack();
		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 8)
	public void webUI_Mercury_Advanced_settings_Security_Port_forwarding_add_rule_range_local_unique_external_Enable_1954() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		response = fun.MercuryLogin();
		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 9)
	public void webUI_Mercury_Advanced_settings_Security_Port_forwarding_add_rule_unique_local_range_external_Enable_1955() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		response = fun.MercuryLogin();
		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 10)
	public void webUI_Mercury_Advanced_settings_Security_Port_forwarding_add_rule_Invalid_IP_1956() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		response = fun.MercuryLogin();
		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 11)
	public void webUI_Mercury_Advanced_settings_Security_Port_forwarding_add_rule_Invalid_local_start_port_1957() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		response = fun.MercuryLogin();
		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 12)
	public void webUI_Mercury_Advanced_settings_Security_Port_forwarding_add_rule_Invalid_local_end_port_1958() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		response = fun.MercuryLogin();
		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 13)
	public void webUI_Mercury_Advanced_settings_Security_Port_forwarding_add_rule_Invalid_external_start_port_1959() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		response = fun.MercuryLogin();
		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 14)
	public void webUI_Mercury_Advanced_settings_Security_Port_forwarding_add_rule_Invalid_External_end_port_1960() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		response = fun.MercuryLogin();
		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 15)
	public void webUI_Mercury_Advanced_settings_Security_Port_forwarding_add_rule_TCP_Enable_1961() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		response = fun.MercuryLogin();
		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_Port_forwarding_RevertBack();
		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 16)
	public void webUI_Mercury_Advanced_settings_Security_Port_forwarding_Existing_rules_Disable_1962() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		response = fun.MercuryLogin();
		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_Port_forwarding_RevertBack();
		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 17)
	public void webUI_Mercury_Advanced_settings_Security_Port_forwarding_Existing_rules_Enable_1963() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		response = fun.MercuryLogin();
		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_Port_forwarding_RevertBack();
		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 18)
	public void webUI_Mercury_Advanced_settings_Security_Port_forwarding_Existing_rules_Delete_1964() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		response = fun.MercuryLogin();
		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 19)
	public void webUI_Mercury_Advanced_settings_Security_Port_forwarding_add_rule_Maximum_Rules_1965() {


		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		response = fun.MercuryLogin();
		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}

		Assert.assertEquals(response, "Pass", response);
	}

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
