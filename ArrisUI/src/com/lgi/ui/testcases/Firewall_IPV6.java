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

public class Firewall_IPV6 {
	// static WebDriver driver = null;
	Logger log = null;
	CommonFunctionality fun = new CommonFunctionality();
	String response = null;

	@BeforeClass
	public void testInitBrowser() {

		// driver = Driver.openModel();
		log = Driver.getLogger();
		log.info("+++++++++++++++++ Gateway Model: " + runAut.modem
				+ " - Firewall Page: IPV6 Testcases +++++++++++++++++");

	}

	@BeforeMethod
	public void testFactoryReset() {

		log.info("+++++++++++++++++ START TEST +++++++++++++++++");

		Driver.openModel();

	}

	// This refers to CAUT-6407
	@Test(priority = 1)
	public void Sec_AdSet_Sec_Firewall_Content_IPV6_6407() {
		
		
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
		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}

	// This refers to CAUT-6408
	@Test(priority = 2)
	public void Sec_AdSet_Sec_Firewall_Func_IPV6_Firewa_Prote_Chec_Box_6408() {


		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	

	// This refers to CAUT-6409
	@Test(priority = 6)
	public void Sec_AdSet_Sec_Firewall_Func_IPV6_Apply_Chnages_Btn_6409() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		String response = fun.MercuryLogin();

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
