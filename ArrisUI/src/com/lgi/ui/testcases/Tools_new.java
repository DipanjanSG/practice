package com.lgi.ui.testcases;

import org.apache.log4j.Logger;

import org.apache.log4j.Priority;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.lgi.ui.automationJar.runAut;
import com.lgi.ui.commonUtils.Driver;
import com.lgi.ui.testAction.TestAction;

public class Tools_new {

	Logger log = null;
	CommonFunctionality fun = new CommonFunctionality();
	String response = null;
	public static int nChannel;

	@BeforeClass
	public void testInitBrowser() {

		log = Driver.getLogger();
		log.info("+++++++++++++++++ Gateway Model: " + runAut.modem + " - Tools Page (New Test Plan)+++++++++++++++++");

	}

	@BeforeMethod
	public void testFactoryReset() {


		log.info("+++++++++++++++++ START TEST +++++++++++++++++");

		Driver.openModel();

		response = fun.MercuryLogin();
	}
	// Pooja

	@Test(priority = 1)
	public void LGI_webUI_Mercury_FA07_Tools_7_5_1_Advanced_Settings_Tools_Network_status_Status_Tab_Content_5786() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 2)
	public void LGI_webUI_Mercury_FA07_Tools_7_5_1AdvancedSettings_Tools_Networkstatus_DownstreamTab_Content_5787() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 3)
	public void LGI_webUI_Mercury_FA07_Tools_7_5_1AdvancedSettings_Tools_Networkstatus_UpstreamTab_Content_5788() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}

	// Updation required in jira test steps
	@Test(priority = 4)
	public void LGI_webUI_Mercury_FA07_Tools_7_5_1AdvancedSettings_Tools_Networkstatus_ConfigurationTab_Content_5789() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 5)
	public void LGI_webUI_Mercury_FA07_Tools_7_5_1AdvancedSettings_Tools_Networkstatus_NetworkLogTab_Content_5790() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	// CAUT-5791 was duplicate of 5790 so i have not implemented

	@Test(priority = 6)
	public void LGI_webUI_Mercury_FA07_Tools_7_5_1AdvancedSettings_Tools_Networkstatus_Functionality_Refresh_5792() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 7)
	public void LGI_webUI_Mercury_FA07_Tools_7_5_2Advancedsettings_Tools_Ping_Content_5793() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 8)
	public void LGI_webUI_Mercury_FA07_Tools_7_5_2Advancedsettings_Tools_Ping_Functionality_Target_Inputbox_5794() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 9)
	public void LGI_webUI_Mercury_FA07_Tools_7_5_2Advancedsettings_Tools_Ping_Functionality_Target_ErrorIconandText_Invalid_5795() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 10)
	public void LGI_webUI_Mercury_FA07_Tools_7_5_2Advancedsettings_Tools_Ping_Functionality_Target_ErrorIconandText_Targetcannotbeblank_5796() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 11)
	public void LGI_webUI_Mercury_FA07_Tools_7_5_2_Advanced_settings_Tools_Ping__Functionality_Ping_size_Input_box_5797() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 12)
	public void LGI_webUI_Mercury_FA07_Tools_7_5_2_Advanced_settings_Tools_Ping__Functionality_Ping_size_Error_Icon_and_Text_Ping_size_must_between_1_and_65500_5798() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}

	
	@Test(priority = 13)
	public void LGI_webUI_Mercury_FA07_Tools_7_5_2_Advanced_settings_Tools_Ping__Functionality_No_of_pings_Input_box_5799() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 14)
	public void LGI_webUI_Mercury_FA07_Tools_7_5_2_Advanced_settings_Tools_Ping__Functionality_No_of_pings_Error_Icon_and_Text_Number_of_pings_must_be_a_positive_value_5800() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	@Test(priority = 15)
	public void LGI_webUI_Mercury_FA07_Tools_7_5_2_Advanced_settings_Tools_Ping_Functionality_Abort_test_5801() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	@Test(priority = 16)
	public void LGI_webUI_Mercury_FA07_Tools_7_5_2_Advanced_settings_Tools_Ping_Functionality_Clear_results_5802() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	@Test(priority = 17)
	public void LGI_webUI_Mercury_FA07_Tools_7_5_2_Advanced_settings_Tools_Ping_Functionality_Start_test_5803() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	@Test(priority = 18)
	public void LGI_webUI_Mercury_FA07_Tools_7_5_2_Advanced_settings_Tools_Ping_Functionality_Results_5804() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	@Test(priority = 19)
	public void LGI_webUI_Mercury_FA07_Tools_7_5_3_Advanced_settings_Tools_Traceroute_Content_5805() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	@Test(priority = 20)
	public void LGI_webUI_Mercury_FA07_Tools_7_5_3_Advanced_settings_Tools_Traceroute_Functionality_Target_Input_box_5806() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	@Test(priority = 21)
	public void LGI_webUI_Mercury_FA07_Tools_7_5_3_Advanced_settings_Tools_Traceroute_Functionality_Target_Error_Icon_and_Text_Invalid_5807() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	@Test(priority = 22)
	public void LGI_webUI_Mercury_FA07_Tools_7_5_3_Advanced_settings_Tools_Traceroute_Functionality_Target_Error_Icon_and_Text_Target_can_not_be_blank_5808() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	@Test(priority = 23)
	public void LGI_webUI_Mercury_FA07_Tools_7_5_3_Advanced_settings_Tools_Traceroute_Functionality_Max_Hops_Input_box_5809() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	@Test(priority = 24)
	public void LGI_webUI_Mercury_FA07_Tools_7_5_3_Advanced_settings_Tools_Traceroute_Functionality_Max_Hops_Error_Icon_and_Text_Max_number_of_hops_must_between_1_and_255_5810() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	@Test(priority = 25)
	public void LGI_webUI_Mercury_FA07_Tools_7_5_3_Advanced_settings_Tools_Traceroute_Functionality_Base_Port_Input_box_5811() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	@Test(priority = 26)
	public void LGI_webUI_Mercury_FA07_Tools_7_5_3_Advanced_settings_Tools_Traceroute_Functionality_Base_Port_Error_Icon_and_Text_Base_port_must_between_0_and_65535_5812() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	@Test(priority = 27)
	public void webUI_Mercury_FA07_Tools_7_5_3_Advanced_settings_Tools_Traceroute_Functionality_Abort_test_5813() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	@Test(priority = 28)
	public void webUI_Mercury_FA07_Tools_7_5_3_Advanced_settings_Tools_Traceroute_Functionality_Clear_results_5814() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	@Test(priority = 29)
	public void webUI_Mercury_FA07_Tools_7_5_3_Advanced_settings_Tools_Traceroute_Functionality_Start_test_5815() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	@Test(priority = 30)
	public void LGI_webUI_Mercury_FA07_Tools_7_5_3_Advanced_settings_Tools_Traceroute_Functionality_Results_5816() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	@Test(priority = 31)
	public void LGI_webUI_Mercury_FA07_Tools_7_5_4_Advanced_settings_Tools_MTU_size_Content_5817() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	@Test(priority = 32)
	public void LGI_webUI_Mercury_FA07_Tools_7_5_4_Advanced_settings_Tools_MTU_size_Functionality_Gateway_MTU_size_Input_box_5818() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	@Test(priority = 33)
	public void LGI_webUI_Mercury_FA07_Tools_7_5_4_Advanced_settings_Tools_MTU_size_Functionality_Gateway_MTU_size_Error_Icon_and_Text_MTU_size_range_is_invalid_5819() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	@Test(priority = 34)
	public void LGI_webUI_Mercury_FA07_Tools_7_5_4_Advanced_settings_Tools_MTU_size_Functionality_Gateway_MTU_size_Information_MTU_size_Info_icon_5820() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	@Test(priority = 35)
	public void LGI_webUI_Mercury_FA07_Tools_7_5_4_Advanced_settings_Tools_MTU_size_Functionality_Gateway_MTU_size_Apply_changes_5821() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	 // Not sure whether it is in new or old
	@Test(priority = 36)
	public void LGI_webUI_Mercury_FA07_Tools_7_5_2_Advanced_settings_Tools_Ping_Functionality_Results_DSLite_mode_6376() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	@Test(priority = 37)
	public void LGI_webUI_Mercury_FA07_Tools_7_5_3_Advanced_settings_Tools_Traceroute_Functionality_Results_DSLite_mode_6377() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	


	@AfterMethod
	public void testCloseBrowser() {
		System.out.println("=========================TEST OVER ==============================");
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
