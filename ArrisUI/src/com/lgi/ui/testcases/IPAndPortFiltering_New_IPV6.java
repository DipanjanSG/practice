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

public class IPAndPortFiltering_New_IPV6 {

	Logger log = null;
	CommonFunctionality fun = new CommonFunctionality();
	String response = null;
	TestAction action;

	@BeforeClass
	public void testInitBrowser() {

		log = Driver.getLogger();
		log.info("+++++++++++++++++ Gateway Model: " + runAut.modem
				+ " - IP And PortFiltering Page ---- IPV6 +++++++++++++++++");

	}

	@BeforeMethod
	public void testFactoryReset() {

		log.info("+++++++++++++++++ START TEST +++++++++++++++++");
		Driver.openModel();
	}

	// This refers to CAUT-6379
	@Test(priority = 1)
	public void webUI_Mercury_Security_Advanced_Settings_Security_IP_and_Port_Filtering_Content_IPV6_6379() {


		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
//		try {
//			fun.ReloadAndReboot();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		Driver.closeDriver();
//		try {
//			Thread.sleep(360 * 1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		Driver.openModel();
//		fun.MercuryInitialSetup();
//		Driver.closeDriver();
//		Driver.openModel();
		

		String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}

	// This refers to CAUT-5722
	@Test(priority = 2)
	public void Sec_AdSet_Sec_IPPort_Filt_Fun_IPv6_Cre_New_Rule_5722() {


		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}

	// This refers to CAUT-5723
	@Test(priority = 3)
	public void Sec_AdSet_Sec_IPPort_Filt_Fun_IPv6_Proto_DrpDown_Men_5723() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}

	// This refers to CAUT-5724
	@Test(priority = 4)
	public void Sec_AdSet_Sec_IPPort_Filt_Fun_IPv6_ScrIPAddr_DrpDown_Men_5724() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}

	// This refers to CAUT-5725
	@Test(priority = 5)
	public void Sec_AdSet_Sec_IPPort_Filt_Fun_IPv6_DestIPAddr_DrpDown_Men_5725() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}

	// This refers to CAUT-5726
	@Test(priority = 6)
	public void Sec_AdSet_Sec_IPPort_Filt_Fun_IPv6_SrcIPV6_InputBox_5726() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}

	// This refers to CAUT-5727
	@Test(priority = 7)
	public void Sec_AdSet_Sec_IPPort_Filt_Fun_IPv6_DestPV6_InputBox_5727() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}

	// This refers to CAUT-5728
	@Test(priority = 8)
	public void Sec_AdSet_Sec_IPPort_Filt_Fun_IPv6_Addr_IpBox_ErrText_InvalidIP_5728() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}

	// This refers to CAUT-5729
	@Test(priority = 9)
	public void Sec_AdSet_Sec_IPPort_Filt_Fun_IPv6_Addr_IpBox_ErrText_InvalidPref_5729() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}

	// This refers to CAUT-5730
	@Test(priority = 10)
	public void Sec_AdSet_Sec_IPPort_Filt_Fun_IPv6_Addr_IpBox_ErrText_Invalid_Port_5730() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}

	// This refers to CAUT-5732
	@Test(priority = 11)
	public void Sec_AdSet_Sec_IPPort_Filt_Fun_IPv6_Addr_IpBox_ErrText_EndGreStart_Port_5732() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}

	// This refers to CAUT-5733
	@Test(priority = 12)
	public void Sec_AdSet_Sec_IPPort_Filt_Fun_IPv6_Cancel_Btn_5733() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}

	// This refers to CAUT-5734
	@Test(priority = 13)
	public void Sec_AdSet_Sec_IPPort_Filt_Fun_IPv6_AddRule_Btn_5734() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}

	// This refers to CAUT-5735
	@Test(priority = 14)
	public void Sec_AdSet_Sec_IPPort_Filt_Fun_IPv6_Addr_IpBox_ErrText_Duplicate_5735() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}

	// This refers to CAUT-5736
	@Test(priority = 15)
	public void Sec_AdSet_Sec_IPPort_Filt_Fun_IPv6_ApplyChange_Rule_enabl_5736() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		log.info("Reverting the Settings changed");
		TestAction.getLoginAction().getTestResult("EnableIPV4_Settings");

		Assert.assertEquals(response, "Pass", response);
	}

	// This refers to CAUT-5737
	@Test(priority = 16)
	public void Sec_AdSet_Sec_IPPort_Filt_Fun_IPv6_ApplyChange_Rule_disabl_5737() throws InterruptedException {


		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		// Need to use this code for doing doing factory rest and performing
		// initialsetup
		fun.ReloadAndReboot();
		Driver.closeDriver();
		Thread.sleep(360 * 1000);
		Driver.openModel();
		fun.MercuryInitialSetup();

		response = TestAction.getLoginAction().getTestResult(test_case);

		log.info("Reverting the Settings changed");
		TestAction.getLoginAction().getTestResult("EnableIPV4_Settings");

		Assert.assertEquals(response, "Pass", response);
	}

	// This refers to CAUT-5738
	@Test(priority = 17)
	public void Sec_AdSet_Sec_IPPort_Filt_Fun_IPv6_Enab_Radio_Btn_Traff_Pol_5738() {


		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);
	}

	// This refers to CAUT-5731 not done
	@Test(priority = 18)
	public void Sec_AdSet_Sec_IPPort_Filt_Fun_IPv6_Addr_IpBox_ErrText_UnAvail_Port_5731() {


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
