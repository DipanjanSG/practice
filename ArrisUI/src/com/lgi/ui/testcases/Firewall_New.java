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

public class Firewall_New {
	// static WebDriver driver = null;
	Logger log = null;
	CommonFunctionality fun = new CommonFunctionality();
	String response = null;

	@BeforeClass
	public void testInitBrowser() {

		// driver = Driver.openModel();
		log = Driver.getLogger();
		log.info("+++++++++++++++++ Gateway Model: " + runAut.modem
				+ " - Firewall Page: New Test Plan+++++++++++++++++");

	}

	@BeforeMethod
	public void testFactoryReset() {

		log.info("+++++++++++++++++ START TEST +++++++++++++++++");

		Driver.openModel();

	}

	// This refers to CAUT-5664
	@Test(priority = 1)
	public void Sec_AdSet_Sec_Firewall_Content_IPV4_5664() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}

	// This refers to CAUT-5665
	@Test(priority = 2)
	public void Sec_AdSet_Sec_Firewall_Func_IPV4_Firewa_Prote_Chec_Box_5665() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}

	// This refers to CAUT-5666
	 @Test(priority = 3)
	 public void
	 Sec_AdSet_Sec_Firewall_Func_Bloc_Prote_Frag_IPPack_CheckBox_5666() {
	
	 String test_case = new Object() {
	 }.getClass().getEnclosingMethod().getName();
	 log.info("Test Case: " + test_case);
	 String response = fun.MercuryLogin();
	
	 response = TestAction.getLoginAction().getTestResult(test_case);
	
	 Assert.assertEquals(response, "Pass", response);
	 }
	
	 // This refers to CAUT-5667
	 @Test(priority = 4)
	 public void Sec_AdSet_Sec_Firewall_Func_Port_Scan_detect_CheckBox_5667()
	 {
	
	 String test_case = new Object() {
	 }.getClass().getEnclosingMethod().getName();
	 log.info("Test Case: " + test_case);
	 String response = fun.MercuryLogin();
	
	 response = TestAction.getLoginAction().getTestResult(test_case);
	
	 Assert.assertEquals(response, "Pass", response);
	 }
	
	 // This refers to CAUT-5668
	 @Test(priority = 5)
	 public void Sec_AdSet_Sec_Firewall_Func_IP_Flood_Detect_CheckBox_5668() {
	
	 String test_case = new Object() {
	 }.getClass().getEnclosingMethod().getName();
	 log.info("Test Case: " + test_case);
	 String response = fun.MercuryLogin();
	
	 response = TestAction.getLoginAction().getTestResult(test_case);
	
	 Assert.assertEquals(response, "Pass", response);
	 }

	// This refers to CAUT-5669
	@Test(priority = 3)
	public void Sec_AdSet_Sec_Firewall_Func_IPV4_Apply_Chnages_Btn_5669() {

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
