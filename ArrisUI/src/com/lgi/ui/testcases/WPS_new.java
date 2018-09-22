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

public class WPS_new {
	
	Logger log = null;
	CommonFunctionality fun= new CommonFunctionality();
	String response=null;
	
	@BeforeClass
	public void testInitBrowser() {

		log = Driver.getLogger();
		log.info("+++++++++++++++++ Gateway Model: " + runAut.modem + " - WPS Page +++++++++++++++++");
		
	}

	@BeforeMethod
	public void testFactoryReset() {

		log.info("+++++++++++++++++ START TEST +++++++++++++++++");
		
		//fun.RebootGateWay();
		Driver.openModel();
		response = fun.MercuryLogin();
		//fun.MercuryInitialSetup();
	}

	@Test(priority = 1)
	public void LGI_webUI_Mercury_FA07_Wireless_Signal_7_1_4_Advanced_Settings_Wireless_WPS_Content_5885() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		String response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 2)
	public void LGI_webUI_Mercury_FA07_Wireless_Signal_7_1_4_Advanced_Settings_Wireless_WPS_Functionality_Wi_FI_Protected_Setup_Radio_buttons_5886 () {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		String response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 3)
	public void LGI_webUI_Mercury_FA07_Wireless_Signal_7_1_4_Advanced_Settings_Wireless_WPS_Functionality_WPS_Push_button_Information_icon_5887 () {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		String response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 4)
	public void LGI_webUI_Mercury_FA07_Wireless_Signal_7_1_4_Advanced_Settings_Wireless_WPS_Functionality_WPS_PIN_Information_icon_5888 () {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		String response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	
	
	@Test(priority = 5)
	public void LGI_webUI_Mercury_FA07_Wireless_Signal_7_1_4_Advanced_Settings_Wireless_WPS_Functionality_PIN_Error_Icon_and_text_5892 () {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		String response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 6)
	public void LGI_webUI_Mercury_FA07_Wireless_Signal_7_1_4_Advanced_Settings_Wireless_WPS_Functionality_Add_client_button_5893 () {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		String response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 7)
	public void LGI_webUI_Mercury_FA07_Wireless_Signal_7_1_4_Advanced_Settings_Wireless_WPS_Functionality_Apply_changes_button_5894 () {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		String response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}

	@AfterMethod
	public void testCloseBrowser() {
		try {
			Driver.closeDriver();
			Thread.sleep(1000 * 15);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			log.info("Messsage: Thread interrupted exception");
		}
		log.info("+++++++++++++++++ END TEST +++++++++++++++++\n");
	}
}
