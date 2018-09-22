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

public class UPnP {
	
	Logger log = null;
	String response = null;
	CommonFunctionality fun= new CommonFunctionality();
	
	@BeforeClass
	public void testInitBrowser() {

		log = Driver.getLogger();
		log.info("+++++++++++++++++ Gateway Model: " + runAut.modem + " - UPnP Page +++++++++++++++++");
	}

	@BeforeMethod
	public void testFactoryReset() {

		log.info("+++++++++++++++++ START TEST +++++++++++++++++");
		
		
		Driver.openModel();

	}
	//Done by shilpi
	@Test(priority = 1)
	public void webUI_Mercury_Advanced_settings_UPnP_Default_values_1992() {

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
		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		String response = TestAction.getLoginAction().getTestResult(test_case); 
		Assert.assertEquals(response, "Pass", response);
	}
	
	//DEPRECATED
	@Test(priority = 2)
	public void webUI_Mercury_Advanced_settings_UPnP_Add_rule_1993() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	
	//DEPRECATED
	@Test(priority = 3)
	public void webUI_Mercury_Advanced_settings_UPnP_Disable_UPnP_1994() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
		fun.webUI_Mercury_Advanced_settings_UPnP_Enable_Back_UPnP();

		
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
