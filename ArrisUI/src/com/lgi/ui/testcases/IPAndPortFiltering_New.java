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

public class IPAndPortFiltering_New {

	Logger log = null;
	CommonFunctionality fun = new CommonFunctionality();
	String response = null;
	TestAction action;

	@BeforeClass
	public void testInitBrowser() {

		log = Driver.getLogger();
		log.info("+++++++++++++++++ Gateway Model: " + runAut.modem + " - IP & Port Filtering Page +++++++++++++++++");

	}

	@BeforeMethod
	public void testFactoryReset() {

		log.info("+++++++++++++++++ START TEST +++++++++++++++++");
		Driver.openModel();
	}

	// This refers to CAut-5704
	@Test(priority = 1)
	public void webUI_Mercury_Security_Advanced_Settings_Security_IP_and_Port_Filtering_Content_5704() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		
		String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}

	// This refers to CAut-5705
	@Test(priority = 2)
	public void webUI_Mercury_Security_Advanced_Settings_Security_IP_and_Port_FilteringFunctionalityfor_IPv4_Create_New_Rule_5705() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}

	// This refers to CAut-5706
	@Test(priority = 3)
	public void webUI_Mercury_Security_Advanced_Settings_Security_IP_and_Port_Filtering_Functionality_IPv4_Protocol_Drop_Down_Menu_5706() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}

	// This refers to CAut-5707
	@Test(priority = 4)
	public void webUI_Mercury_Security_Advanced_Settings_Security_IP_and_Port_Filtering_Functionality_IPv4_Source_IP_address_Drop_Down_Menu_5707() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}

	// This refers to CAut-5708
	@Test(priority = 5)
	public void webUI_Mercury_Security_Advanced_Settings_ecurity_IP_and_Port_Filtering_Functionality_IPv4_Destination_IP_address_Drop_Down_Menu_5708() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}

	// This refers to CAut-5709
	@Test(priority = 6)
	public void Security_AdvSettings_Sec_IPandPort_Filtering_Func_IPv4_SrcAddr_Inputbox_5709() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}

	// This refers to CAut-5710
	@Test(priority = 7)
	public void Security_AdvSet_Sec_IPandPort_Filt_Func_IPv4_SrcAdr_ErrIcon_Txt_NOIP_5710() {
		// should as this a bug
		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}

	// This refers to CAut-5711
	@Test(priority = 8)
	public void Security_AdvSet_Sec_IPnPort_Filt_Func_IPv4_SrcAdr_ErrIcon_Txt_InvalidIP_5711() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}

	// This refers to CAUT-5712
	@Test(priority = 9)
	public void Security_AdvSet_Sec_IPnPort_Filt_Func_IPv4_DestAdr_InputBox_5712() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}

	// This refers to CAUT-5713
	@Test(priority = 10)
	public void Security_AdvSet_Sec_IPnPort_Filt_Func_IPv4_DestAdr_ErrIcon_Txt_NOIP_5713() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}

	// This refers to CAUT-5714
	@Test(priority = 11)
	public void Security_AdvSet_Sec_IPnPort_Filt_Func_IPv4_Port_ErrIcon_Txt_Invalid_5714() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}

	// This refers to CAUT-5716
	@Test(priority = 12)
	public void Security_AdvSet_Sec_IPnPort_Filt_Func_IPv4ErrIcon_Txt_End_Greater_Startport_5716() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}

	// This refers to CAUT-5717
	@Test(priority = 13)
	public void Security_AdvSet_Sec_IPnPort_Filt_Func_IPv4_Cancel_Btn_5717() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}

	// This refers to CAUT-5718
	@Test(priority = 14)
	public void Security_AdvSet_Sec_IPnPort_Filt_Func_IPv4_AddRuleBtn_5718() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}

	// This refers to CAUT-5719
	@Test(priority = 15)
	public void Sec_AdSet_Sec_IPPort_Filt_Fun_IPv4_Err_Dup_5719() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}

	// This refers to CAUT-5720
	@Test(priority = 16)
	public void Sec_AdSet_Sec_IPPort_Filt_Fun_IPv4_ApplyChange_Rule_enabl_5720() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}

	// This refers to CAUT-5721
	@Test(priority = 17)
	public void Sec_AdSet_Sec_IPPort_Filt_Fun_IPv4_ApplyChange_Rule_disabl_5721() throws InterruptedException {



		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		// Need to use this code for doing doing factory rest and performing
		// initialsetup
		fun.ReloadAndReboot();
		//Driver.resetmodem();
		Driver.openModel();
		String response = fun.MercuryInitialSetup();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}

	// This refers to CAUT-5715
	@Test(priority = 18)
	public void Security_AdvSet_Sec_IPnPort_Filt_Func_IPv4_Port_ErrIcon_Txt_Unavailable_Ports_5715() {

		// Needs to add code for remaining 14 steps as its bug testcase will
		// fail and other steps will be skipped
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

	}

}
