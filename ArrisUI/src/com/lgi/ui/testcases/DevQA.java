package com.lgi.ui.testcases;

import org.apache.log4j.Logger;



import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;
import com.lgi.ui.automationJar.ModemFactoryReset;
import com.lgi.ui.automationJar.runAut;
import com.lgi.ui.commonUtils.Driver;
import com.lgi.ui.testAction.TestAction;
import com.lgi.ui.automationJar.ResetPassword;
public class DevQA 
{

	Logger log = null;
	CommonFunctionality fun = new CommonFunctionality();
	String response;
	String status = null;
	String caut_id=null;
	String test_case=null;
	int passed=0;
	int failed=0;
	@BeforeClass
	public void testInitBrowser() 

	{

		log = Driver.getLogger();
		log.info("+++++++++++++++++ Gateway Model: " + runAut.modem + " - Dev QA IPV4 +++++++++++++++++");
		
		
		
//		ModemFactoryReset mfr = new ModemFactoryReset();
//		mfr.FactoryResetModem();
		
	
		
		
	}

	@BeforeMethod
	public void testFactoryReset() {





		log.info("+++++++++++++++++ START TEST +++++++++++++++++");
		Driver.openModel();
	}
	

	//1806
	@Test(priority = 1)
	public void webUI_Mercury_Home_Language_selection_1646() throws InterruptedException {


		String test_case = new Object() {

		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		caut_id="CAUT-1806";
		log.info("********************** "+ caut_id+" **********************");
		log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");
		

	
	
	
	
		
		response = TestAction.getLoginAction().getTestResult(test_case);
		
		
		Assert.assertEquals(response, "Pass", response);
	}
	
	//3039
	@Test(priority = 2)
	 public void webUI_Mercury_Admin_Remote_access_Enabled_2274() throws InterruptedException


	 {
		
		
	
		 String test_case = new Object() {
		 }.getClass().getEnclosingMethod().getName();
		 log.info("Test Case: " + test_case);
		 caut_id="CAUT-3039";
			log.info("********************** "+ caut_id+" **********************");
		  response=fun.MercuryInitialSetup();
		 if (response.equals("Pass"))
		 {
			 response = TestAction.getLoginAction().getTestResult(test_case);
		 }
		
		 fun.webUI_Mercury_Admin_Remote_access_Revertback();
		 Assert.assertEquals(response, "Pass", response);
	 }
		

		
	//3032
	@Test(priority = 3)
	public void webUI_Mercury_Admin_Backup_configuration_settings_2267() {
	
		String test_case = new Object() {}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		caut_id="CAUT-3032";
		log.info("********************** "+ caut_id+" **********************");
		response = fun.MercuryLogin();
		if (response.equals("Pass"))
		{
			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		
		Assert.assertEquals(response, "Pass", response);
	}

	//3042
	@Test(priority = 4)
	public void webUI_Mercury_Admin_Wireless_Gateway_device_information_2277() {
		
		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		caut_id="CAUT-3042";
		log.info("********************** "+ caut_id+" **********************");
		response = fun.MercuryLogin();
		if (response.equals("Pass"))
		{
			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		
		Assert.assertEquals(response, "Pass", response);
	}

	//3044
	@Test(priority = 5)
	public void webUI_Mercury_Admin_WAN_IP_settings_IPv4RG_mode_2279()

	{
	
		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		caut_id="CAUT-3044";
		log.info("********************** "+ caut_id+" **********************");
		response = fun.MercuryLogin();
		
		if (response.equals("Pass"))
		{
			response = TestAction.getLoginAction().getTestResult(test_case);
		}
	}
	 
	//1846
	@Test(priority = 6)
	public void webUI_Mercury_Home_Status_overview_1671() {



		
		test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		caut_id="CAUT-1846";
		log.info("********************** "+ caut_id+" **********************");

		response = fun.MercuryLogin();

		if (response.equals("Pass")) {
			response = TestAction.getLoginAction().getTestResult(test_case);
		}

		Assert.assertEquals(response, "Pass", response);
	}
		
	
	//3009
	@Test(priority = 6)
	public void webUI_Mercury_Advanced_settings_Security_Port_forwarding_add_rule_Both_Enable_1950() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
			log.info("Test Case: " + test_case);
			caut_id="CAUT-3009";
			log.info("********************** "+ caut_id+" **********************");
			response = fun.MercuryLogin();
			if (response.equals("Pass")) {

				response = TestAction.getLoginAction().getTestResult(test_case);
			}
			fun.webUI_Mercury_Advanced_settings_Security_Port_forwarding_RevertBack();
			Assert.assertEquals(response, "Pass", response);
		}
	//2969
	@Test(priority = 7)
	public void webUI_Mercury_Advanced_settings_Security_Port_Triggering_add_rule_Both_Enable_1969(){

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		response = fun.MercuryLogin();
		
		  test_case = new Object() {
		 }.getClass().getEnclosingMethod().getName();
		 log.info("Test Case: " + test_case);
		 caut_id="CAUT-2969";
			log.info("********************** "+ caut_id+" **********************");
	
	 if (response.equals("Pass")) {
			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_Port_Triggering_RevertBack();
		Assert.assertEquals(response, "Pass", response);
	}
	
	 //2972
	 @Test(priority = 8)
	 public void webUI_Mercury_Advanced_settings_Security_Port_Triggering_add_rule_range_of_Both_Enable_1972(){
	
	 	String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
	 	log.info("Test Case: " + test_case);
	 	caut_id="CAUT-2972";
		log.info("********************** "+ caut_id+" **********************");
		response = fun.MercuryLogin();
		if (response.equals("Pass"))
		{
			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_Port_Triggering_RevertBack();
		Assert.assertEquals(response, "Pass", response);
	 }
	 
	//CAUT-2471
	@Test(priority = 9)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Primary_24GHz_Check_default_24GHz_WiFi_Network_Name_1727() throws InterruptedException {

		
		fun.factoryReset();
		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
				log.info("Test Case: "+ test_case);
				
				caut_id="CAUT-2471";
				log.info("********************** "+ caut_id+" **********************");
		
		
			response = TestAction.getLoginAction().getTestResult(test_case);
		
				Assert.assertEquals(response, "Pass", response);
	} 
	
	//CAUT-2472
	@Test(priority = 10)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Primary_24GHz_Primary_24_Change_24GHz_WiFi_Network_Name_1728() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
				log.info("Test Case: "+ test_case);
				caut_id="CAUT-2472";
				log.info("********************** "+ caut_id+" **********************");
		response = fun.MercuryLogin();
		if (response.equals("Pass"))
		{
			response = TestAction.getLoginAction().getTestResult(test_case);
		}
	}
	
	//CAUT-2486
	@Test(priority = 11)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Primary_5GHz_Check_default_5GHz_WiFi_Network_Name_1744() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		
		
		log.info("Test Case: "+ test_case);
		caut_id="CAUT-2486";
		log.info("********************** "+ caut_id+" **********************");
		//fun.factoryReset();
		response = fun.MercuryLogin();
		if (response.equals("Pass"))
		{
			response = TestAction.getLoginAction().getTestResult(test_case);
		}
	}
	
	//CAUT-2487
	@Test(priority = 12)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Primary_5GHz_Primary_5_Change_5GHz_WiFi_Network_Name_1745() throws InterruptedException {

		
		fun.factoryReset();
		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
				log.info("Test Case: "+ test_case);
					
				caut_id="CAUT-2487";
				log.info("********************** "+ caut_id+" **********************");
		if (response.equals("Pass"))
		{
			response = TestAction.getLoginAction().getTestResult(test_case);
		}
				Assert.assertEquals(response, "Pass", response);
	}
	
	//1807
	@Test(priority = 13)
	public void webUI_Mercury_Home_Log_out_1647() throws InterruptedException {
		Driver.closeDriver();
		ModemFactoryReset mfr = new ModemFactoryReset();
		mfr.FactoryResetModem();
		Driver.openModel();
		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		caut_id="CAUT-1807";
		log.info("********************** "+ caut_id+" **********************");
		log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");
		
		
		
		
		response = TestAction.getLoginAction().getTestResult(test_case);
		
		Assert.assertEquals(response, "Pass", response);
		
	}
	
	//1809
	@Test(priority = 14)
	public void webUI_Mercury_Home_Quick_Set_up_Wizards_Configure_your_WiFi_connection_Change_SSID_too_long_1650() throws InterruptedException {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		caut_id="CAUT-1809";
		log.info("********************** "+ caut_id+" **********************");
		log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");

		// fun.Start_AFtr_Reboot();
		// fun.MercuryInitialSetup();
		response = fun.MercuryLogin();
		if (response.equals("Pass"))
		{
			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		if (response.equals("ssid error element not found"))
			response = TestAction.getLoginAction().getTestResult("QuickSetUpWizards_1650_1");

		Assert.assertEquals(response, "Pass", response);

	}
	
	//1827
	@Test(priority = 15)
	public void webUI_Mercury_Home_Quick_Set_up_Wizards_Configure_your_WiFi_connection_Change_SSID_and_security_key_1656()
					throws InterruptedException {

		fun.factoryReset();
		
		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		caut_id="CAUT-1827";
		log.info("********************** "+ caut_id+" **********************");
		log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");

		
		response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	
	//1828
	@Test(priority = 16)
	public void webUI_Mercury_Home_Quick_Set_up_Wizards_Network_diagnostic_tool_1657() throws InterruptedException {

		
		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		caut_id="CAUT-1828";
		log.info("********************** "+ caut_id+" **********************");
		log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");

		response = fun.MercuryLogin();
	
		response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	
	//1830
	@Test(priority = 17)
	public void webUI_Mercury_Home_Quick_Set_up_Wizards_Modify_your_guest_network_check_default_status_1658()

			throws InterruptedException {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		caut_id="CAUT-1830";
		log.info("********************** "+ caut_id+" **********************");
		log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");

		response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}

	//1831
	@Test(priority = 18)
	public void webUI_Mercury_Home_Quick_Set_up_Wizards_Modify_your_guest_network_enable_1659()
					throws InterruptedException {
		
		fun.factoryReset();
		
		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		caut_id="CAUT-1831";
		log.info("********************** "+ caut_id+" **********************");
		log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");

		
		response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	
	//CAUT - 2204
	@Test(priority = 19)
	public void webUI_Mercury_Connected_devices_335() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		caut_id="CAUT-2204";
		log.info("********************** "+ caut_id+" **********************");
		fun.MercuryLogin();
		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}

	//2210
	@Test(priority = 20)
	public void webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_Primary_24GHz_Check_default_wireless_mode_1675() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		caut_id="CAUT-2210";
		log.info("********************** "+ caut_id+" **********************");
		fun.MercuryLogin();
		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	
	//CAUT-2229
	@Test(priority = 21)
	public void webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_24GHz_Channel_width_Default_Channel_width_1690() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		caut_id="CAUT-2229";
		log.info("********************** "+ caut_id+" **********************");
		fun.MercuryLogin();
		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	
	//CAUT-2232
	@Test(priority = 22)
	public void webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_Check_5GHz_Status_1691() throws InterruptedException {
		
		fun.factoryReset();

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		caut_id="CAUT-2232";
		log.info("********************** "+ caut_id+" **********************");
		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	
	//CAUT-2236
	@Test(priority = 23)
	public void webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_Primary_5GHz_Check_default_wireless_mode_1694() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		caut_id="CAUT-2236";
		log.info("********************** "+ caut_id+" **********************");
		fun.MercuryLogin();
		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}

	//CAUT-2439
	@Test(priority = 24)
	public void webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_Primary_5GHz_Channel_width_Default_Channel_width_1716() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		caut_id="CAUT-2439";
		log.info("********************** "+ caut_id+" **********************");
		fun.MercuryLogin();
		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	
	//2443
	@Test(priority = 25)
	public void webUI_Mercury_Advanced_settings_Wireless_Guest_network_Default_status_1783() throws InterruptedException 
	{
		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		caut_id="CAUT-2443";
		log.info("********************** "+ caut_id+" **********************");
		Driver.closeDriver();
		
		ModemFactoryReset mfr = new ModemFactoryReset();
		mfr.FactoryResetModem();
		
		Driver.openModel();
		
		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	
	//CAUT-2478
	@Test(priority = 26)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Primary_24GHz_Broadcast_of_primary_24_SSID_enable_1735() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		caut_id="CAUT-2478";
		log.info("********************** "+ caut_id+" **********************");
		response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult("webUI_Mercury_Advanced_settings_Wireless_Security_Primary_24GHz_Broadcast_of_primary_24_SSID_disable_1734");

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		} else
			response = "Failed - SSID is not disabled";

		Assert.assertEquals(response, "Pass", response);
	}
	
	//CAUT-2483
	@Test(priority = 27)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Primary_24GHz_Default_security_key_1741() throws InterruptedException {

		

		fun.factoryReset();
		
	
		
		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		caut_id="CAUT-2483";
		log.info("********************** "+ caut_id+" **********************");
		

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}

	
	//CAUT-2495
	@Test(priority = 28)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Primary_5GHz_Default_Security_1753() throws InterruptedException {
		fun.factoryReset();

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		caut_id="CAUT-2495";
		log.info("********************** "+ caut_id+" **********************");

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	
	//CAUT-2499
	@Test(priority = 29)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Primary_5GHz_Default_security_key_1757() throws InterruptedException {

		
		fun.factoryReset();
	
		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		caut_id="CAUT-2499";
		log.info("********************** "+ caut_id+" **********************");
		

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	
	//CAUT-2520
	@Test(priority = 30)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Wireless_MAC_Filtering_Remove_device_5GHz_1771() throws InterruptedException {

		fun.factoryReset();
		
		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		caut_id="CAUT-1806";
		log.info("********************** "+ caut_id+" **********************");
		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult("webUI_Mercury_Advanced_settings_Wireless_Security_Wireless_MAC_Filtering_Add_device_5GHz_1768");

			if (response.equals("Pass")) {

				response = TestAction.getLoginAction().getTestResult(test_case);

				if (response.equals("Pass")) {

					response = fun.ConnectTo5GHzWiFiNetwork();

					if (response.equals("Profile not connected")) {

						response = fun.WirelessSecurityDefaultMACFilteringConfiguration();

						if (response.equals("Pass")) {
							response = fun.ConnectTo5GHzWiFiNetwork();
						}
					} else
						response = "Fail";
				}
			}
		} else
			log.info("Gateway Initial setup failed");

		Assert.assertEquals(response, "Pass", response);
	}
	
	//CAUT - 2723
	@Test(priority = 31)
	public void webUI_Mercury_Advanced_settings_DHCPV4_in_IPv4_RG_mode_Default_values_2028() {
		
		log.info("Test Case: "+ new Object(){}.getClass().getEnclosingMethod().getName());
		caut_id="CAUT-2723";
		log.info("********************** "+ caut_id+" **********************");
		fun.MercuryLogin();
		response = fun.DHCPV4_IPv4RGAndDSLite_DefaultValues();		
		Assert.assertEquals(response, "Pass", response);
	}
	

	//CAUT - 2733
	@Test(priority = 32)
	public void webUI_Mercury_Advanced_settings_DHCPV4_in_IPv4_RG_mode_Reserved_IP_addresses_Attached_Devices_default_2038() {

		log.info("Test Case: "+ new Object(){}.getClass().getEnclosingMethod().getName());
		caut_id="CAUT-2733";
		log.info("********************** "+ caut_id+" **********************");
		fun.MercuryLogin();
		response = fun.DHCPV4_IPv4RGAndDSLite_ReservedIPAddressesAttachedDeviceDefault();		
		Assert.assertEquals(response, "Pass", response);
	}
	
	//CAUT - 2772
	@Test(priority = 33)
	public void webUI_Mercury_Advanced_settings_Tools_Network_Status_Status_1995() {

		

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		caut_id="CAUT-2772";
		log.info("********************** "+ caut_id+" **********************");
		log.info("Jira Name: webUI_Mercury_Advanced_settings_Tools_Network_Status_Status_1995");
		fun.MercuryLogin();
		response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	
	//CAUT - 2778
	@Test(priority = 34)
	public void webUI_Mercury_Advanced_settings_Tools_Network_Status_Configuration_General_Configuration_2001() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		caut_id="CAUT-2778";
		log.info("********************** "+ caut_id+" **********************");
		log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");
		response = fun.MercuryLogin();
		if (response.equals("Pass")) {
			response = TestAction.getLoginAction().getTestResult(test_case);
		}

		Assert.assertEquals(response, "Pass", response);
	}
	
	//CAUT - 2786
	@Test(priority = 35)
	public void webUI_Mercury_Advanced_settings_Tools_Ping_2009() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		caut_id="CAUT-2786";
		log.info("********************** "+ caut_id+" **********************");
		log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");
		fun.MercuryLogin();
		response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	
	//CAUT - 2787
	@Test(priority = 36)
	public void webUI_Mercury_Advanced_settings_Tools_Ping_Invalid_target_2010() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		caut_id="CAUT-2787";
		log.info("********************** "+ caut_id+" **********************");
		log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");
		fun.MercuryLogin();
		response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	
	//CAUT - 2805 
	@Test(priority = 37)
	public void webUI_Mercury_Advanced_settings_UPnP_Default_values_1992() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		caut_id="CAUT-2805";
		log.info("********************** "+ caut_id+" **********************");
		fun.MercuryLogin();
		response = TestAction.getLoginAction().getTestResult(test_case); 
		Assert.assertEquals(response, "Pass", response);
	}
	
    //CAUT - 2838
	@Test(priority = 38)
	public void webUI_Mercury_Advanced_settings_Security_DMZ_Disable_1990() throws InterruptedException {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		caut_id="CAUT-2838";
		log.info("********************** "+ caut_id+" **********************");
		fun.MercuryLogin();
		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	
	//CAUT-2840
	@Test(priority = 39)
	public void webUI_Mercury_Advanced_settings_Security_Firewall_Default_values_1811() throws InterruptedException {
		   
		
          String test_case = new Object() {
          }.getClass().getEnclosingMethod().getName();
          log.info("Test Case: " + test_case);
          caut_id="CAUT-2840";
  		log.info("********************** "+ caut_id+" **********************");
          response=fun.MercuryLogin();

          response = TestAction.getLoginAction().getTestResult(test_case);

          Assert.assertEquals(response, "Pass", response);
	}
	
	//CAUT - 2855
	@Test(priority = 40)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_default_status_1838() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		caut_id="CAUT-2855";
		log.info("********************** "+ caut_id+" **********************");

		response = fun.MercuryLogin();

		if (response.equals("Pass")) 
		{
			response = TestAction.getLoginAction().getTestResult(test_case);
		}

		Assert.assertEquals(response, "Pass", response);
	}
	
	//CAUT-2883
	@Test(priority = 46)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Primary_24GHz_change_Primary_24_SSID_with_SSID_changed_to_Guest_SSID_1731() {


		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		caut_id="CAUT-2883";
	log.info("********************** "+ caut_id+" **********************");
		response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
		Driver.closeDriver();
		
		ModemFactoryReset mfr = new ModemFactoryReset();
		mfr.FactoryResetModem();
		
		Driver.openModel();
		fun.MercuryInitialSetup();
	}
//	DEPRECATED
//	//CAUT - 2914 
//	@Test(priority = 47)
//	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_UDPTCP_protocol_Any_source_port_range_Any_destination_port_range_1887() {
//
//		String test_case = new Object() {
//		}.getClass().getEnclosingMethod().getName();
//		log.info("Test Case: " + test_case);
//	caut_id="CAUT-2914";
//	log.info("********************** "+ caut_id+" **********************");
//		response = fun.MercuryLogin();
//
//		if (response.equals("Pass")) {
//
//			response = TestAction.getLoginAction().getTestResult(test_case);
//		}
//		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();
//		Assert.assertEquals(response, "Pass", response);
//		
//		Driver.closeDriver();
//		
//		ModemFactoryReset mfr = new ModemFactoryReset();
//		mfr.FactoryResetModem();
//		
//		Driver.openModel();
//		fun.MercuryInitialSetup();
//	}
	
	//CAUT-2502
	@Test(priority = 41)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Wireless_MAC_Filtering_default_status_1760() throws InterruptedException {

		fun.factoryReset();
		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		caut_id="CAUT-2502";
		log.info("********************** "+ caut_id+" **********************");
		//fun.RebootGateWay();
		//Driver.openModel();

		//response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	
	//CAUT - 3006 
	@Test(priority = 42)
	public void webUI_Mercury_Advanced_settings_Security_Port_forwarding_Default_status_1947() {
		
		Driver.closeDriver();
		
		ModemFactoryReset mfr = new ModemFactoryReset();
		mfr.FactoryResetModem();
		
		
		Driver.openModel();
		
		response = fun.MercuryLogin();
		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		caut_id="CAUT-3006";
		log.info("********************** "+ caut_id+" **********************");
		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}

		Assert.assertEquals(response, "Pass", response);
	}
	
	
	 
	//CAUT - 3035
	@Test(priority = 43)
	public void webUI_Mercury_Admin_Restore_to_factory_defaults_2270() {
		 	
		
			
		 String test_case = new Object() {
		 }.getClass().getEnclosingMethod().getName();
		 log.info("Test Case: " + test_case);
		 caut_id="CAUT-3035";
			log.info("********************** "+ caut_id+" **********************");
		 fun.MercuryLogin();
		 response = TestAction.getLoginAction().getTestResult(test_case);
	
		 Assert.assertEquals(response, "Pass", response);
	 }
	
	 //CAUT - 3037
	 @Test(priority = 44)
	 public void webUI_Mercury_Admin_Restart_Wireless_Gateway_2272() {

		 String test_case = new Object() {
		 }.getClass().getEnclosingMethod().getName();
		 log.info("Test Case: " + test_case);
		 caut_id="CAUT-3037";
			log.info("********************** "+ caut_id+" **********************");
		 fun.MercuryLogin();
		
		 response = TestAction.getLoginAction().getTestResult(test_case);
		
		 Assert.assertEquals(response, "Pass", response);
	
	 }
	 
	//CAUT - 5923 
	@Test(priority = 45)
	public void LGI_webUI_Mercury_FA08_Admin_8_1_Admin_Remote_access_Functionality_Port_Input_Box_5923(){
	
		String test_case = new Object() {}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		caut_id="CAUT-5923";
		log.info("********************** "+ caut_id+" **********************");
		fun.MercuryLogin();
	
		response = TestAction.getLoginAction().getTestResult(test_case);
	 
		Assert.assertEquals(response, "Pass", response);
	 }
	
	//CAUT - 1845
	@Test(priority = 46)
	public void webUI_Mercury_Home_Quick_Set_up_Wizards_Modify_your_guest_network_enable_Change_security_key_duplicate_value_1667()


			throws InterruptedException {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		caut_id="CAUT-1845";
		log.info("********************** "+ caut_id+" **********************");
		log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");

		fun.MercuryLogin();
		response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}

	//CAUT - 1833 PASS
	@Test(priority = 47)
	public void webUI_Mercury_Home_Quick_Set_up_Wizards_Modify_your_guest_network_enable_Change_SSID_invalid_value_1661()

			throws InterruptedException {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		caut_id="CAUT-1833";
		log.info("********************** "+ caut_id+" **********************");
		log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");

		response = fun.MercuryLogin();
		
		response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	
	//2450
	@Test(priority = 48)
	public void webUI_Mercury_Advanced_settings_Wireless_Guest_network_Broadcast_of_SSID_default_status_1790() throws InterruptedException {
		
		fun.factoryReset();
		caut_id="CAUT-2450";
		log.info("********************** "+ caut_id+" **********************");
		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		
		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	} 
	
	//2460
	@Test(priority = 49)
	public void webUI_Mercury_Advanced_settings_Wireless_WPS_Default_status_1800() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		caut_id="CAUT-2460";
		log.info("********************** "+ caut_id+" **********************");
		fun.MercuryLogin();
		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}  
	
	//3033
	@Test(priority = 50)
	public void webUI_Mercury_Admin_Reload_configuration_settings_2268() {

		String test_case = new Object() {

		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		caut_id="CAUT-3033";
		log.info("********************** "+ caut_id+" **********************");
		fun.MercuryLogin();
		response = TestAction.getLoginAction().getTestResult(test_case);
		if(response=="Pass")
			response = fun.MercuryLogin();
		Assert.assertEquals(response, "Pass", response);
	} 
	

	//CAUT-2494
	@Test(priority = 51)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Primary_5GHz_Broadcast_of_primary_5_SSID_enable_1752() throws InterruptedException {
		fun.factoryReset();
		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		caut_id="CAUT-2494";
		log.info("********************** "+ caut_id+" **********************");

		response = TestAction.getLoginAction().getTestResult("webUI_Mercury_Advanced_settings_Wireless_Security_Primary_5GHz_Broadcast_of_primary_5_SSID_disable_1751");
		Driver.closeDriver();
		Driver.openModel();
		response = fun.MercuryLogin();
		
		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		} else
			response = "Failed - SSID is not disabled";

		Assert.assertEquals(response, "Pass", response);
	}
	 //CAUT - 3029
	 @Test(priority = 52)
	 public void webUI_Mercury_Admin_Change_password_2264() {
		
		 String test_case = new Object() {
		 }.getClass().getEnclosingMethod().getName();
		 log.info("Test Case: " + test_case);
		 caut_id="CAUT-3029";
			log.info("********************** "+ caut_id+" **********************");
		 fun.MercuryLogin();
		 response = TestAction.getLoginAction().getTestResult(test_case);
		
		 Assert.assertEquals(response, "Pass", response);
	 } 
	@AfterMethod
	public void testCloseBrowser() {

		
		//log.info("+++++++++++++++++ END TEST +++++++++++++++++\n");
		try {
			
			if(response.equals("Pass"))
			{
				passed+=1;
			}
			else
				failed+=1;
			log.info("**************** Status of TestCase is "+status+" ********************");
		      log.info("+++++++++++++++++ END TEST +++++++++++++++++\n");
		      log.info("CURRENT STATUS : PASSED = " + passed+", FAILED = "+ failed);
		      System.out.println("*** Test Case Details- Test Case: "+ test_case+" "+caut_id+ " Status: "+ status+" ***");
		
		      
		    fun.logout();	
			
			Driver.closeDriver();
			Thread.sleep(1000 * 5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			log.info("Messsage: Thread interrupted exception");
		}
		
		
		// driver.close()
	}
			
}

