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

public class PortForwarding_New {

	Logger log = null;
	CommonFunctionality fun = new CommonFunctionality();
	String response = null;
	int test_number = 1;

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

	// CAUT-5739
	@Test(priority = 1)
	public void FA07_Security_AdvSettings_Sec_PortForwarding_Content() throws InterruptedException {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();

		log.info("Test Case: " + test_case);
		log.info(
				"Jira Name: LGI-webUI – Mercury – FA07 – Security – 7.2.4 Advanced Settings – Security – Port forwarding – Content – ");
		response = fun.factoryReset();
		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}

		Assert.assertEquals(response, "Pass", response);
	}

	// CAUT-5740
	@Test(priority = 2)
	public void FA07_Security_AdvSettings_Sec_PortForwarding_CreateNewRule() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		log.info(
				"Jira Name: LGI-webUI – Mercury – FA07 – Security – 7.2.4 Advanced Settings – Security – Port forwarding – Functionality – Create a new rule – ");
		response = fun.MercuryLogin();
		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}

		Assert.assertEquals(response, "Pass", response);
	}

	// CAUT-5741
	@Test(priority = 3)
	public void FA07_Security_AdvSettings_Sec_PortForwarding_Protocol_DropDownMenu() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		log.info(
				"Jira Name: LGI-webUI – Mercury – FA07 – Security – 7.2.4 Advanced Settings – Security – Port forwarding – Functionality – Protocol Drop-Down menu – ");
		response = fun.MercuryLogin();
		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}

		Assert.assertEquals(response, "Pass", response);
	}

	// CAUT-5742
	@Test(priority = 4)
	public void FA07_Security_AdvSettings_Sec_PortForwarding_Enabled_DropDownMenu() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		log.info(
				"Jira Name: LGI-webUI – Mercury – FA07 – Security – 7.2.4 Advanced Settings – Security – Port forwarding – Functionality – Enabled Drop-Down menu – ");
		response = fun.MercuryLogin();
		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}

		Assert.assertEquals(response, "Pass", response);
	}

	// CAUT-5744
	@Test(priority = 5)
	public void FA07_Security_AdvSettings_Sec_PortForwarding_ErrorIcon_InvalidIP() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		log.info(
				"Jira Name: LGI-webUI – Mercury – FA07 – Security – 7.2.4 Advanced Settings – Security – Port forwarding – Functionality – Local IP – Error icon and Text – Invalid IP – ");
		response = fun.MercuryLogin();
		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}

		Assert.assertEquals(response, "Pass", response);
	}

	// CAUT-5745
	@Test(priority = 6)
	public void FA07_Security_AdvSettings_Sec_PortForwarding_ErrorIcon_InvalidPort() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		log.info(
				"Jira Name: LGI-webUI – Mercury – FA07 – Security – 7.2.4 Advanced Settings – Security – Port forwarding – Functionality – Local IP – Error icon and Text – Invalid port – ");
		
		response = fun.MercuryLogin();
		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}

		Assert.assertEquals(response, "Pass", response);
	}

	// CAUT-5746
	@Test(priority = 7)
	public void FA07_Security_AdvSettings_Sec_PortForwarding_ErrorIcon_NotAuthorizedPort() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		log.info(
				"Jira Name: LGI-webUI – Mercury – FA07 – Security – 7.2.4 Advanced Settings – Security – Port forwarding – Functionality – Local IP – Error icon and Text – Not authorized port – ");
		response = fun.MercuryLogin();
		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}

		Assert.assertEquals(response, "Pass", response);
	}

	// CAUT-5747
	@Test(priority = 8)
	public void FA07_Security_AdvSettings_Sec_PortForwarding_ErrorIcon_EndportMustGreaterThanStartport() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		log.info(
				"Jira Name: LGI-webUI – Mercury – FA07 – Security – 7.2.4 Advanced Settings – Security – Port forwarding – Functionality – Local IP – Error icon and Text – End port must be greater than Start port– ");
		
		response = fun.MercuryLogin();
		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}

		Assert.assertEquals(response, "Pass", response);
	}

	// CAUT-5748
	@Test(priority = 9)
	public void FA07_Security_AdvSettings_Sec_PortForwarding_ErrorIcon_PortRangeMatch() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		log.info(
				"Jira Name: LGI-webUI – Mercury – FA07 – Security – 7.2.4 Advanced Settings – Security – Port forwarding – Functionality – Local IP – Error icon and Text – The port range should match – ");
		response = fun.MercuryLogin();
		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}

		Assert.assertEquals(response, "Pass", response);
	}

	// CAUT-5755
	@Test(priority = 10)
	public void FA07_Security_AdvSettings_Sec_PortForwarding_Cancel_button() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		log.info(
				"Jira Name: LGI-webUI – Mercury – FA07 – Security – 7.2.4 Advanced Settings – Security – Port forwarding – Functionality – Cancel button – ");
		response = fun.MercuryLogin();
		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}

		Assert.assertEquals(response, "Pass", response);
	}

	// CAUT-5756
	@Test(priority = 11)
	public void FA07_Security_AdvSettings_Sec_PortForwarding_AddRule_button() {


		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		log.info(
				"Jira Name: LGI-webUI – Mercury – FA07 – Security – 7.2.4 Advanced Settings – Security – Port forwarding – Functionality – Add rule button – ");
		response = fun.MercuryLogin();
		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_Port_forwarding_RevertBack();
		Assert.assertEquals(response, "Pass", response);
	}

	// CAUT-5757
	@Test(priority = 12)
	public void FA07_Security_AdvSettings_Sec_PortForwarding_AddRule_ErrorIcon_DuplicateRule() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		log.info(
				"Jira Name: LGI-webUI – Mercury – FA07 – Security – 7.2.4 Advanced Settings – Security – Port forwarding – Functionality – Add rule button – Error Icon and Text – Duplicate rule – ");
		
		response = fun.MercuryLogin();
		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_Port_forwarding_RevertBack();
		Assert.assertEquals(response, "Pass", response);
	}
	// CAUT-5758
	// @Test(priority = 13)
	// public void FA07_Security_AdvSettings_Sec_PortForwarding_Apply_changes() {
	//
	//
	// String test_case = new Object() {
	// }.getClass().getEnclosingMethod().getName();
	// log.info("Test Case: " + test_case);
	// log.info("Jira Name: LGI-webUI – Mercury – FA07 – Security – 7.2.4 Advanced
	// Settings – Security – Port forwarding – Functionality – Apply changes – ");
	//response = fun.MercuryLogin();
	// if (response.equals("Pass")) {
	//
	// response = TestAction.getLoginAction().getTestResult(test_case);
	// }
	// fun.webUI_Mercury_Advanced_settings_Security_Port_forwarding_RevertBack();
	// Assert.assertEquals(response, "Pass", response);
	// }

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
