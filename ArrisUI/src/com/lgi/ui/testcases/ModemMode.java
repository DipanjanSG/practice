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

public class ModemMode {
	public String masterIP = null;
	Logger log = null;
	CommonFunctionality fun = new CommonFunctionality();
	String response = null;

	@BeforeClass
	public void testInitBrowser() {

		// driver = Driver.openModel();
		log = Driver.getLogger();
		log.info("+++++++++++++++++ Gateway Model: " + runAut.modem + " - Home Page +++++++++++++++++");

	}

	@BeforeMethod
	public void testFactoryReset() {

		log.info("+++++++++++++++++ START TEST +++++++++++++++++");

		// fun.MercuryInitialSetup();

	}

	@Test(priority = 1)
	public void webUI_Mercury_Modem_mode_Enable_modem_mode_2262() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);

		fun.RebootGateWay();
		Driver.openModel();

		response=fun.MercuryInitialSetup();

		if (response.equals("Pass")) {
			response = TestAction.getLoginAction().getTestResult(test_case);	
			}
		fun.webUI_Mercury_Modem_mode_Disable_modem_mode();
		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 2)
	public void webUI_Mercury_Modem_mode_Disable_modem_mode_2263() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		fun.RebootGateWay();
		Driver.openModel();

		response=fun.MercuryInitialSetup();

		if (response.equals("Pass")) {
		response = TestAction.getLoginAction().getTestResult(test_case);	
		}
		if(response.equals("Pass"))
		response=fun.webUI_Mercury_Modem_mode_Disable_modem_mode();
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
