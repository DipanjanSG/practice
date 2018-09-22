package com.lgi.ui.testcases;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.lgi.ui.automationJar.runAut;
import com.lgi.ui.commonUtils.Driver;
import com.lgi.ui.testAction.TestAction;

public class DMZ {

	Logger log = null;
	CommonFunctionality fun = new CommonFunctionality();
	String response = null;
	WebDriver driver;
	int test_case_no = 1;

	@BeforeClass
	public void testInitBrowser() {

		log = Driver.getLogger();
		log.info("+++++++++++++++++ Gateway Model: " + runAut.modem + " - DMZ Page +++++++++++++++++");
	}

	@BeforeMethod
	public void testFactoryReset() throws InterruptedException {

		log.info("+++++++++++++++++ START TEST +++++++++++++++++");

		Driver.openModel();

		
		log.info("Now going to mercury initial setup");
		
		
	}

	@Test(priority = 1)
	public void webUI_Mercury_Advanced_settings_Security_DMZ_Default_Status_1988() throws InterruptedException {
		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
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
		
		
		fun.MercuryLogin();
		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 2)
	public void webUI_Mercury_Advanced_settings_Security_DMZ_Enable_1989() throws InterruptedException 
	{

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		fun.MercuryLogin();
		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 3)
	public void webUI_Mercury_Advanced_settings_Security_DMZ_Disable_1990() throws InterruptedException 
	{

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		fun.MercuryLogin();
		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 4)
	public void webUI_Mercury_Advanced_settings_Security_DMZ_Invalid_IP_1991() throws InterruptedException {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		fun.MercuryLogin();
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
