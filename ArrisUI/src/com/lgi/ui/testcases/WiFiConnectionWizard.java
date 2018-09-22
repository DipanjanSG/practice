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

public class WiFiConnectionWizard {

	Logger log = null;
	CommonFunctionality fun = new CommonFunctionality();
	String response = null;
	TestAction action;

	@BeforeClass
	public void testInitBrowser() {

		log = Driver.getLogger();
		log.info("+++++++++++++++++ Gateway Model: " + runAut.modem
				+ " - WiFi Connection Wizard Page +++++++++++++++++");

	}

	@BeforeMethod
	public void testFactoryReset() {

		log.info("+++++++++++++++++ START TEST +++++++++++++++++");
		Driver.openModel();
	}

	// This refers to CAUT-6057
	@Test(priority = 1)
	public void FA03_WiFi_Connection_Wizard_WIFI_Connect_Content() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");
		String response = fun.MercuryLogin();
		response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}

	// This refers to CAUT-6058
	@Test(priority = 2)
	public void FA03_WiFi_Connection_Wizard_Wifi_Connect_Func_Close_Btn() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		log.info(
				"Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Functionality – Close button – ");

		String response = fun.MercuryLogin();
		response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}

	// This refers to CAUT-6059
	@Test(priority = 3)
	public void FA03_WiFi_Connection_Wizard_Wifi_Connect_Func_ChangeLink() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		log.info(
				"Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Functionality – Change Link – ");

		String response = fun.MercuryLogin();
		response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}

	// This refers to CAUT-6061
	@Test(priority = 4)
	public void FA03_WiFi_Connection_Wizard_Connect_Func_NewWiFi_NetworkName_InfoIcon() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		log.info(
				"Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Functionality – New WiFi Network Name – info icon – ");

		String response = fun.MercuryLogin();
		response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}

	// This refers to CAUT-6062
	@Test(priority = 5)
	public void FA03_WiFi_Connection_Wizard_Connect_Func_NewWiFi_NetworkName_CancelLink() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		log.info(
				"Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Functionality – New WiFi Network Name – Cancel Link – ");

		String response = fun.MercuryLogin();
		response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}

	// This refers to CAUT-6064
	@Test(priority = 6)
	public void FA03_WiFi_Connection_Wizard_Connect_Func_NewPwd_StrengthBar() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		log.info(
				"Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Functionality – New Password – Strength bar – ");

		String response = fun.MercuryLogin();
		response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}

	// This refers to CAUT-6065
	@Test(priority = 7)
	public void FA03_WiFi_Connection_Wizard_Connect_Func_NewPassword_InfoIcon() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		log.info(
				"Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Functionality – New Password – info icon – ");

		String response = fun.MercuryLogin();
		response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}

	// This refers to CAUT-6066
	@Test(priority = 8)
	public void FA03_WiFi_Connection_Wizard_WiFiConnect_ApplyButton() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		log.info(
				"Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Functionality – Apply button – ");

		String response = fun.MercuryLogin();
		response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}

	// This refers to CAUT-6067
	@Test(priority = 9)
	public void FA03_WiFi_Connect_Wizard_WiFiConnect_Func_Apply_Btn_ErrICon_Text_NetName() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		log.info(
				"Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Functionality – Apply button – Error icon and text for Network name – ");

		String response = fun.MercuryLogin();
		response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}

	// This refers to CAUT-6068
	@Test(priority = 10)
	public void FA03_WiFi_Connect_Wizard_WiFiConnect_Func_Apply_Btn_ErrICon_Text_Pwd() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		log.info(
				"Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Functionality – Apply button – Error icon and text for Password – ");

		String response = fun.MercuryLogin();
		response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}

	// This refers to CAUT-6069
	@Test(priority = 11)
	public void FA03_WiFi_Connect_Wizard_WiFiConnect_Func_Apply_Btn_ErrICon_Text_Pwd_Same_GuestWifiPwd() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		log.info(
				"Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Functionality – Apply button – Error icon and text for Password same as Guest WiFi password – ");

		String response = fun.MercuryLogin();
		response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}

	// This refers to CAUT-6070
	@Test(priority = 12)
	public void FA03_WiFi_Connect_Wizard_WiFiConnect_Setting_changeApply_Contents() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		log.info(
				"Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – settings changes applying – Content – ");

		String response = fun.MercuryLogin();
		response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}

	// This refers to CAUT-6071
	@Test(priority = 13)
	public void FA03_WiFi_Connection_Wizard_WiFiConnect_Setting_Changes_Applying_CloseBtn() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		log.info(
				"Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – settings changes applying – Close button –");

		String response = fun.MercuryLogin();
		response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}

	// This refers to CAUT-6060
	@Test(priority = 14)
	public void FA03_WiFi_Connection_Wizard_Wifi_Connect_Func_NewWiFiNetworkName_InputBox() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		log.info(
				"Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Functionality – New WiFi Network Name – input box – ");

		String response = fun.MercuryLogin();
		response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}

	// This refers to CAUT-6063
	@Test(priority = 15)
	public void FA03_WiFi_Connection_Wizard_Wifi_Connect_Func_NewPassword_InputBox() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		log.info(
				"Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Functionality – New Password – input box – ");

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

	}

}
