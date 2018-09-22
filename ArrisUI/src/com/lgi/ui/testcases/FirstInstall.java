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

public class FirstInstall {
	public String masterIP = null;
	Logger log = null;
	CommonFunctionality fun = new CommonFunctionality();
	String response = null;

	@BeforeClass
	public void testInitBrowser() {

		
		log = Driver.getLogger();
		log.info("+++++++++++++++++ Gateway Model: " + runAut.modem + " - Home Page +++++++++++++++++");

	}

	@BeforeMethod
	public void testFactoryReset() {

		log.info("+++++++++++++++++ START TEST +++++++++++++++++");

	
		Driver.openModel();

	}


	@Test(priority = 1)
	public void test_Part_1_No_Modification() {
	

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		response = TestAction.getLoginAction().getTestResult(test_case);	
		Assert.assertEquals(response, "Pass", response);
	}
	@Test(priority = 2)
	public void test_Part_2_Modem_Password_Changed() {
	

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		response = TestAction.getLoginAction().getTestResult(test_case);	
		Assert.assertEquals(response, "Pass", response);
	}
	@Test(priority = 3)
	public void test_Part_3_WiFi_Credentials_Changed() {
	

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		response = TestAction.getLoginAction().getTestResult(test_case);	
		Assert.assertEquals(response, "Pass", response);
	}
	@Test(priority = 4)
	public void test_Part_3_Modem_Password_And_WiFi_Credentials_Changed() {
	

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		response = TestAction.getLoginAction().getTestResult(test_case);	
		Assert.assertEquals(response, "Pass", response);
	}
	@Test(priority = 5)
	public void test_Part_4_Exit_Button() {
	

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		response = TestAction.getLoginAction().getTestResult(test_case);	
		Assert.assertEquals(response, "Pass", response);
	}
	@Test(priority = 6)
	public void test_Part_5_Settings_Applied_Close_Button() {
	

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		response = TestAction.getLoginAction().getTestResult(test_case);	
		Assert.assertEquals(response, "Pass", response);
	}
	@Test(priority = 7)
	public void test_Part_6_Settings_Are_Applied_Close_Button() {

	

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		response = TestAction.getLoginAction().getTestResult(test_case);	
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
