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

public class WirelessSecurity_new {

	Logger log = null;
	CommonFunctionality fun = new CommonFunctionality();

	@BeforeClass
	public void testInitBrowser() {

		log = Driver.getLogger();
		log.info("+++++++++++++++++ Gateway Model: " + runAut.modem + " - Wireless Security Page +++++++++++++++++");
		
		Driver.openModel();
		//fun.MercuryInitialSetup();
		Driver.closeDriver();
	}

	@BeforeMethod
	public void testFactoryReset() {

		log.info("+++++++++++++++++ START TEST +++++++++++++++++");
	}

	
	@Test(priority = 1)
	public void LGI_webUI_Mercury_FA07_Wireles_Signal_7_1_2_Advanced_Settings_Wireless_Security_Content_5843() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		//fun.RebootGateWay();
		Driver.openModel();

		//String response = fun.MercuryInitialSetup();
		String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 2)
	public void LGI_webUI_Mercury_FA07_Wireless_Signal_7_1_2_Advanced_Settings_Wireless_Security_Functionality_Wireless_frequency_2_4GHz_informationicon_5844() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		//fun.RebootGateWay();
		Driver.openModel();

		//String response = fun.MercuryInitialSetup();
		String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 3)
	public void LGI_webUI_Mercury_FA07_Wireless_Signal_7_1_2_Advanced_Settings_Wireless_Security_Functionality_2_4GHz_band_WiFi_Network_name_SSID_Input_box_5845 () {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		//fun.RebootGateWay();
		Driver.openModel();

		//String response = fun.MercuryInitialSetup();
		String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 4)
	public void LGI_webUI_Mercury_FA07_Wireless_Signal_7_1_2_Advanced_Settings_Wireless_Security_Functionality_2_4GHz_band_WiFi_Network_name_SSID_Error_Icon_and_Text_5846 () {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		//fun.RebootGateWay();
		Driver.openModel();

		//String response = fun.MercuryInitialSetup();
		String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 5)
	public void LGI_webUI_Mercury_FA07_Wireless_Signal_7_1_2_Advanced_Settings_Wireless_Security_Functionality_2_4GHz_band_Wireless_Network_Name_information_icon_5847  () {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		//fun.RebootGateWay();
		Driver.openModel();

		//String response = fun.MercuryInitialSetup();
		String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 6)
	public void LGI_webUI_Mercury_FA07_Wireless_Signal_7_1_2_Advanced_Settings_Wireless_Security_Functionality_2_4GHz_band_SSID_Broadcast_Yes_Radio_Button_5848() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		//fun.RebootGateWay();
		Driver.openModel();

		//String response = fun.MercuryInitialSetup();
		String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 7)
	public void LGI_webUI_Mercury_FA07_Wireless_Signal_7_1_2_Advanced_Settings_Wireless_Security_Functionality_2_4GHz_band_SSID_Broadcast_No_Radio_Button_5849 () {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		//fun.RebootGateWay();
		Driver.openModel();

		//String response = fun.MercuryInitialSetup();
		String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 8)
	public void LGI_webUI_Mercury_FA07_Wireless_Signal_7_1_2_Advanced_Settings_Wireless_Security_Functionality_2_4GHz_band_Security_Drop_Down_menu_5850() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		//fun.RebootGateWay();
		Driver.openModel();

		//String response = fun.MercuryInitialSetup();
		String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 9)
	public void LGI_webUI_Mercury_FA07_Wireless_Signal_7_1_2_Advanced_Settings_Wireless_Security_Functionality_2_4GHz_band_Security_Information_icon_5851() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		//fun.RebootGateWay();
		Driver.openModel();

		//String response = fun.MercuryInitialSetup();
		String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 10)
	public void LGI_webUI_Mercury_FA07_Wireless_Signal_7_1_2_Advanced_Settings_Wireless_Security_Functionality_2_4GHz_band_WiFi_password_information_icon_5852() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		//fun.RebootGateWay();
		Driver.openModel();

		//String response = fun.MercuryInitialSetup();
		String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 11)
	public void LGI_webUI_Mercury_FA07_Wireless_Signal_7_1_2_Advanced_Settings_Wireless_Security_Functionality_2_4GHz_band_WiFi_password_input_box_5853  () {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		//fun.RebootGateWay();
		Driver.openModel();

		//String response = fun.MercuryInitialSetup();
		String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 12)
	public void LGI_webUI_Mercury_FA07_Wireless_Signal_7_1_2_Advanced_Settings_Wireless_Security_Functionality_2_4GHz_band_Wireless_MAC_Filtering_Disabled_5854 () {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		//fun.RebootGateWay();
		Driver.openModel();

		//String response = fun.MercuryInitialSetup();
		String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 13)
	public void LGI_webUI_Mercury_FA07_Wireless_Signal_7_1_2_Advanced_Settings_Wireless_Security_Functionality_2_4GHz_band_WiFi_password_Error_icon_and_Text_5857() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		//fun.RebootGateWay();
		Driver.openModel();

		//String response = fun.MercuryInitialSetup();
		String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 14)
	public void LGI_webUI_Mercury_FA07_Wireless_Signal_7_1_2_Advanced_Settings_Wireless_Security_Functionality_Attached_device_Refresh_button_5859 () {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		//fun.RebootGateWay();
		Driver.openModel();

		//String response = fun.MercuryInitialSetup();
		String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 15)
	public void LGI_webUI_Mercury_FA07_Wireless_Signal_7_1_2_Advanced_Settings_Wireless_Security_Functionality_Attached_device_Selection_of_the_Device_button_5860  () {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		//fun.RebootGateWay();
		Driver.openModel();

		//String response = fun.MercuryInitialSetup();
		String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 16)
	public void LGI_webUI_Mercury_FA07_Wireless_Signal_7_1_2_Advanced_Settings_Wireless_Security_Functionality_Add_device_Device_Name_input_box_5861 () {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		//fun.RebootGateWay();
		Driver.openModel();

		//String response = fun.MercuryInitialSetup();
		String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	
	
	
	@Test(priority = 17)
	public void LGI_webUI_Mercury_FA07_Wireless_Signal_7_1_2_Advanced_Settings_Wireless_Security_Functionality_Add_device_Device_Name_input_box_Invalid_5862 () {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		//fun.RebootGateWay();
		Driver.openModel();

		//String response = fun.MercuryInitialSetup();
		String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 18)
	public void LGI_webUI_Mercury_FA07_Wireless_Signal_7_1_2_Advanced_Settings_Wireless_Security_Functionality_Add_device_Device_Name_input_box_Duplicate_5863 () {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		//fun.RebootGateWay();
		Driver.openModel();

		//String response = fun.MercuryInitialSetup();
		String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 19)
	public void LGI_webUI_Mercury_FA07_Wireless_Signal_7_1_2_Advanced_Settings_Wireless_Security_Functionality_Add_device_MAC_address_input_box_5864 () {
		
		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		//fun.RebootGateWay();
		Driver.openModel();

		//String response = fun.MercuryInitialSetup();
		String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 20)
	public void LGI_webUI_Mercury_FA07_Wireless_Signal_7_1_2_Advanced_Settings_Wireless_Security_Functionality_Add_device_MAC_address_input_box_Invalid_5865  () {
		
		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		//fun.RebootGateWay();
		Driver.openModel();

		//String response = fun.MercuryInitialSetup();
		String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 21)
	public void LGI_webUI_Mercury_FA07_Wireless_Signal_7_1_2_Advanced_Settings_Wireless_Security_Functionality_Add_device_MAC_address_input_box_Duplicate_5866    () {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		//fun.RebootGateWay();
		Driver.openModel();

		//String response = fun.MercuryInitialSetup();
		String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 22)
	public void LGI_webUI_Mercury_FA07_Wireless_Signal_7_1_2_Advanced_Settings_Wireless_Security_Functionality_Add_device_Wireless_Radio_button_5867   () {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		//fun.RebootGateWay();
		Driver.openModel();

		//String response = fun.MercuryInitialSetup();
		String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 23)
	public void LGI_webUI_Mercury_FA07_Wireless_Signal_7_1_2_Advanced_Settings_Wireless_Security_Functionality_Add_device_button_5868  () {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		//fun.RebootGateWay();
		Driver.openModel();

		//String response = fun.MercuryInitialSetup();
		String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 24)
	public void LGI_webUI_Mercury_FA07_Wireless_Signal_7_1_2_Advanced_Settings_Wireless_Security_Table_Attached_Devices_and_Wireless_filter_list_content_5870  () {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		//fun.RebootGateWay();
		Driver.openModel();

		//String response = fun.MercuryInitialSetup();
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
