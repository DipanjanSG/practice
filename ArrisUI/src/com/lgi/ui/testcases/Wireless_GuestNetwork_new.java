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

public class Wireless_GuestNetwork_new {

	Logger log = null;
	CommonFunctionality fun = new CommonFunctionality();
	String response = null;

	@BeforeClass
	public void testInitBrowser() {

		log = Driver.getLogger();
		log.info("+++++++++++++++++ Gateway Model: " + runAut.modem + " - Guest Network Page +++++++++++++++++");

		Driver.openModel();
		//fun.MercuryInitialSetup();
		Driver.closeDriver();
	}

	@BeforeMethod
	public void testFactoryReset() {

		log.info("+++++++++++++++++ START TEST +++++++++++++++++");
		Driver.openModel();
		response = fun.MercuryLogin();
	}

	@Test(priority = 1)
	public void LGI_webUI_Mercury_FA07_Wireless_Signal_7_1_3_Advanced_Settings_Wireless_Guest_network_Content_5871() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		//fun.RebootGateWay();
		

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 2)
	public void LGI_webUI_Mercury_FA07_Wireless_Signal_7_1_3_Advanced_Settings_Wireless_Guest_network_Functionality_Enable_Guest_network_Radio_button_5872 () {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		//fun.RebootGateWay();
		

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 3)
	public void LGI_webUI_Mercury_FA07_Wireless_Signal_7_1_3_Advanced_Settings_Wireless_Guest_network_Functionality_Disable_Guest_network_Radio_button_5873 () {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		//fun.RebootGateWay();
		

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 4)
	public void LGI_webUI_Mercury_FA07_Wireless_Signal_7_1_3_Advanced_Settings_Wireless_Guest_network_Functionality_WiFi_Network_Name_SSID_Input_box_5874 () {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		//fun.RebootGateWay();
		

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 5)
	public void LGI_webUI_Mercury_FA07_Wireless_Signal_7_1_3_Advanced_Settings_Wireless_Guest_network_Functionality_WiFi_Network_Name_SSID_Information_Icon_5875 () {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		//fun.RebootGateWay();
		

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 6)
	public void LGI_webUI_Mercury_FA07_Wireless_Signal_7_1_3_Advanced_Settings_Wireless_Guest_network_Functionality_WiFi_Network_Name_SSID_Error_Icon_and_text_5876 () {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		//fun.RebootGateWay();
		

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 7)
	public void LGI_webUI_Mercury_FA07_Wireless_Signal_7_1_3_Advanced_Settings_Wireless_Guest_network_Functionality_WiFi_Network_Name_SSID_broadcast_Yes_radio_button_5878 () {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		//fun.RebootGateWay();
		

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 8)
	public void LGI_webUI_Mercury_FA07_Wireless_Signal_7_1_3_Advanced_Settings_Wireless_Guest_network_Functionality_WiFi_Network_Name_SSID_broadcast_No_radio_button_5879 () {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		//fun.RebootGateWay();
		

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 9)
	public void LGI_webUI_Mercury_FA07_Wireless_Signal_7_1_3_Advanced_Settings_Wireless_Guest_network_Functionality_Security_Drop_Down_menu_5880 () {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		//fun.RebootGateWay();
		

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 10)
	public void LGI_webUI_Mercury_FA07_Wireless_Signal_7_1_3_Advanced_Settings_Wireless_Guest_network_Functionality_WiFi_password_security_key_Input_box_5881 () {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		//fun.RebootGateWay();
		

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 11)
	public void LGI_webUI_Mercury_FA07_Wireless_Signal_7_1_3_Advanced_Settings_Wireless_Guest_network_Functionality_WiFi_password_security_key_Information_icon_5882 () {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		//fun.RebootGateWay();
		

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 12)
	public void LGI_webUI_Mercury_FA07_Wireless_Signal_7_1_3_Advanced_Settings_Wireless_Guest_network_Functionality_WiFi_password_security_key_Error_Icon_and_text_5883 () {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		//fun.RebootGateWay();
		

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
