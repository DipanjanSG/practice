package com.lgi.ui.testcases;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.lgi.ui.automationJar.ModemFactoryReset;
import com.lgi.ui.automationJar.runAut;
import com.lgi.ui.commonUtils.Driver;
import com.lgi.ui.testAction.TestAction;

public class DevQA_dslite {

	Logger log = null;
	CommonFunctionality fun = new CommonFunctionality();
	String response;
//	String status = null;
	String caut_id=null;
	String test_case=null;
	int passed=0;
	int failed=0;
	@BeforeClass
	public void testInitBrowser() {

		log = Driver.getLogger();
		log.info("+++++++++++++++++ Gateway Model: " + runAut.modem + " - Dev QA IPV6 DS-LITE +++++++++++++++++");
		
		ModemFactoryReset mfr = new ModemFactoryReset();
		mfr.FactoryResetModem();
		
//		Driver.openModel();
//		fun.MercuryInitialSetup();
//		Driver.closeDriver();
		
		
	}

	@BeforeMethod
	public void testFactoryReset() {

		log.info("+++++++++++++++++ START TEST +++++++++++++++++");
		Driver.openModel();
	}


	//1806
	@Test(priority = 1)
	public void webUI_Mercury_Home_Language_selection_1646() throws InterruptedException {

//		Driver.closeDriver();
//		ModemFactoryReset mfr = new ModemFactoryReset();
//		mfr.FactoryResetModem();
//		Driver.openModel();
		
		test_case = new Object() {

		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		caut_id="CAUT-1806";
		log.info("********************** "+ caut_id+" **********************");
		log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");

	
	
	
	
		
		response = TestAction.getLoginAction().getTestResult(test_case);
		
		
		Assert.assertEquals(response, "Pass", response);
	}

	
		//3032
	@Test(priority = 2)
	public void webUI_Mercury_Admin_Backup_configuration_settings_2267() {
	
		test_case = new Object() {}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		caut_id="CAUT-3032";
		log.info("********************** "+ caut_id+" **********************");
		 response=fun.MercuryInitialSetup();
		 
		if (response.equals("Pass"))
		{
			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		
		Assert.assertEquals(response, "Pass", response);
	}
			//CAUT - 2855
		@Test(priority = 3)
		public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_default_status_DSLite_1838() {

			test_case = new Object() {
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

		//CAUT-2471
		@Test(priority = 4)
		public void webUI_Mercury_Advanced_settings_Wireless_Security_Primary_24GHz_Check_default_24GHz_WiFi_Network_Name_1727() {

			test_case = new Object(){}.getClass().getEnclosingMethod().getName();
			log.info("Test Case: "+ test_case);
			caut_id="CAUT-2471";
			log.info("********************** "+ caut_id+" **********************");
			response = fun.MercuryLogin();
			if (response.equals("Pass"))
			{
				response = TestAction.getLoginAction().getTestResult(test_case);
			}
			
			Assert.assertEquals(response, "Pass", response);
		} 

		//CAUT-2486
		@Test(priority = 5)
		public void webUI_Mercury_Advanced_settings_Wireless_Security_Primary_5GHz_Check_default_5GHz_WiFi_Network_Name_1744() {

			test_case = new Object(){}.getClass().getEnclosingMethod().getName();
			log.info("Test Case: "+ test_case);
			caut_id="CAUT-2486";
			log.info("********************** "+ caut_id+" **********************");
			response = fun.MercuryLogin();
			if (response.equals("Pass"))
			{
				response = TestAction.getLoginAction().getTestResult(test_case);
			}
			Assert.assertEquals(response, "Pass", response);
		}
		

		
		//CAUT-2483
		@Test(priority = 27)
		public void webUI_Mercury_Advanced_settings_Wireless_Security_Primary_24GHz_Default_security_key_1741() throws InterruptedException {

			

			fun.factoryReset();
			
			
		
			
			test_case = new Object(){}.getClass().getEnclosingMethod().getName();
			log.info("Test Case: "+ test_case);

			caut_id="CAUT-2483";
			log.info("********************** "+ caut_id+" **********************");

			response = TestAction.getLoginAction().getTestResult(test_case);

			Assert.assertEquals(response, "Pass", response);
		}


			//CAUT-2236
				@Test(priority = 7)
				public void webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_Primary_5GHz_Check_default_wireless_mode_1694() {

					test_case = new Object(){}.getClass().getEnclosingMethod().getName();
					
					log.info("Test Case: "+ test_case);
					caut_id="CAUT-2236";
					log.info("********************** "+ caut_id+" **********************");
					
					fun.MercuryLogin();
					response = TestAction.getLoginAction().getTestResult(test_case);

					Assert.assertEquals(response, "Pass", response);
				}


		//CAUT-2229
		@Test(priority = 8)
		public void webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_24GHz_Channel_width_Default_Channel_width_1690() {

			test_case = new Object(){}.getClass().getEnclosingMethod().getName();
			log.info("Test Case: "+ test_case);
			caut_id="CAUT-2229";
			log.info("********************** "+ caut_id+" **********************");
			fun.MercuryLogin();
			response = TestAction.getLoginAction().getTestResult(test_case);

			Assert.assertEquals(response, "Pass", response);
		}

		//1830
		@Test(priority = 9)
		public void webUI_Mercury_Home_Quick_Set_up_Wizards_Modify_your_guest_network_check_default_status_1658()

				throws InterruptedException {

			test_case = new Object() {
			}.getClass().getEnclosingMethod().getName();
			log.info("Test Case: " + test_case);
			caut_id="CAUT-1830";
			log.info("********************** "+ caut_id+" **********************");
			log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");

			response = fun.MercuryLogin();

			response = TestAction.getLoginAction().getTestResult(test_case);
			Assert.assertEquals(response, "Pass", response);
		}
		

		//2210
		@Test(priority = 10)
		public void webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_Primary_24GHz_Check_default_wireless_mode_1675() {

			test_case = new Object(){}.getClass().getEnclosingMethod().getName();
			log.info("Test Case: "+ test_case);
			caut_id="CAUT-2210";
			log.info("********************** "+ caut_id+" **********************");
			fun.MercuryLogin();
			response = TestAction.getLoginAction().getTestResult(test_case);

			Assert.assertEquals(response, "Pass", response);
		}
		//CAUT-2502
		@Test(priority = 11)
		public void webUI_Mercury_Advanced_settings_Wireless_Security_Wireless_MAC_Filtering_default_status_1760() throws InterruptedException {

			fun.factoryReset();
			test_case = new Object(){}.getClass().getEnclosingMethod().getName();
			log.info("Test Case: "+ test_case);
			
			//fun.RebootGateWay();
			//Driver.openModel();

			//response = fun.MercuryLogin();
			caut_id="CAUT-2502";
			log.info("********************** "+ caut_id+" **********************");

			response = TestAction.getLoginAction().getTestResult(test_case);

			Assert.assertEquals(response, "Pass", response);
		}
		
		//CAUT - 3043
			@Test(priority = 12)
			public void webUI_Mercury_Admin_WAN_IP_settings_DSLite_mode_2278() {
				
				test_case = new Object(){}.getClass().getEnclosingMethod().getName();
				log.info("Test Case: "+ test_case);
				caut_id="CAUT-3043";
				log.info("********************** "+ caut_id+" **********************");
				//log.info("Test Case: "+ new Object(){}.getClass().getEnclosingMethod().getName());
				fun.MercuryLogin();
				response = TestAction.getLoginAction().getTestResult(test_case);		
				Assert.assertEquals(response, "Pass", response);
				
			} 
	
	//CAUT-2472
		@Test(priority = 14)
		public void webUI_Mercury_Advanced_settings_Wireless_Security_Primary_24GHz_Primary_24_Change_24GHz_WiFi_Network_Name_1728() {

			test_case = new Object(){}.getClass().getEnclosingMethod().getName();
			log.info("Test Case: "+ test_case);
			caut_id="CAUT-2472";
			log.info("********************** "+ caut_id+" **********************");
			response = fun.MercuryLogin();
			if (response.equals("Pass"))
			{
				response = TestAction.getLoginAction().getTestResult(test_case);
			}
			
			Assert.assertEquals(response, "Pass", response);
		}
		
	//CAUT-2487
	@Test(priority = 15)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Primary_5GHz_Primary_5_Change_5GHz_WiFi_Network_Name_1745() {

		test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		caut_id="CAUT-2487";
		log.info("********************** "+ caut_id+" **********************");
		response = fun.MercuryLogin();
		if (response.equals("Pass"))
		{
			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		Assert.assertEquals(response, "Pass", response);
	}
	
	//1807
		@Test(priority = 16)
		public void webUI_Mercury_Home_Log_out_1647() throws InterruptedException {

			
			Driver.closeDriver();
			ModemFactoryReset mfr = new ModemFactoryReset();
			mfr.FactoryResetModem();
			Driver.openModel();
			
			test_case = new Object(){}.getClass().getEnclosingMethod().getName();
			caut_id="CAUT-1807";
			log.info("********************** "+ caut_id+" **********************");
			log.info("Test Case: " + test_case);
			log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");
			
			
			
			
			response = TestAction.getLoginAction().getTestResult(test_case);
			
			Assert.assertEquals(response, "Pass", response);
			
		}
		
	//1809
	@Test(priority = 17)
	public void webUI_Mercury_Home_Quick_Set_up_Wizards_Configure_your_WiFi_connection_Change_SSID_too_long_1650() throws InterruptedException {

		test_case = new Object() {
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
	
	//1828
	@Test(priority = 18)
	public void webUI_Mercury_Home_Quick_Set_up_Wizards_Network_diagnostic_tool_1657() throws InterruptedException {

		
		test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		caut_id="CAUT-1828";
		log.info("********************** "+ caut_id+" **********************");
		log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");

		response = fun.MercuryLogin();
	
		response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	
	
	//1831
	@Test(priority = 19)
	public void webUI_Mercury_Home_Quick_Set_up_Wizards_Modify_your_guest_network_enable_1659()
					throws InterruptedException {
		
		
		fun.factoryReset();

		test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		caut_id="CAUT-1831";
		log.info("********************** "+ caut_id+" **********************");
		log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");

		
		response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	
	//CAUT - 2204
	@Test(priority = 20)
	public void webUI_Mercury_Connected_devices_335() {

		test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		caut_id="CAUT-2204";
		log.info("********************** "+ caut_id+" **********************");
		fun.MercuryLogin();
		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	
	
	//CAUT-2232
	@Test(priority = 22)
	public void webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_Check_5GHz_Status_1691() {

		test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		caut_id="CAUT-2232";
		log.info("********************** "+ caut_id+" **********************");
		fun.MercuryLogin();
		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	
	//CAUT-2439
	@Test(priority = 23)
	public void webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_Primary_5GHz_Channel_width_Default_Channel_width_1716() {

		test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		caut_id="CAUT-2439";
		log.info("********************** "+ caut_id+" **********************");
		fun.MercuryLogin();
		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	
	//2443
	@Test(priority = 24)
	public void webUI_Mercury_Advanced_settings_Wireless_Guest_network_Default_status_1783() throws InterruptedException 
	{

		test_case = new Object(){}.getClass().getEnclosingMethod().getName();
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
	@Test(priority = 25)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Primary_24GHz_Broadcast_of_primary_24_SSID_enable_1735() {

		test_case = new Object(){}.getClass().getEnclosingMethod().getName();
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
	
	
	
	//CAUT-2495
	@Test(priority = 27)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Primary_5GHz_Default_Security_1753() {

		test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		caut_id="CAUT-2495";
		log.info("********************** "+ caut_id+" **********************");
		response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	

	//CAUT-2499
		@Test(priority = 30)
		public void webUI_Mercury_Advanced_settings_Wireless_Security_Primary_5GHz_Default_security_key_1757() throws InterruptedException {

			
			fun.factoryReset();
		
			test_case = new Object(){}.getClass().getEnclosingMethod().getName();
			log.info("Test Case: "+ test_case);
			caut_id="CAUT-2499";
			log.info("********************** "+ caut_id+" **********************");
			

			response = TestAction.getLoginAction().getTestResult(test_case);

			Assert.assertEquals(response, "Pass", response);
		}
	
	//CAUT-2520
	@Test(priority = 29)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Wireless_MAC_Filtering_Remove_device_5GHz_1771() throws InterruptedException {

		fun.factoryReset();
		
		test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		caut_id="CAUT-2520";
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
	
	//CAUT -  2532
	@Test(priority = 30)
	public void webUI_Mercury_Advanced_Settings_Security_IP_and_Port_filtering_Default_IPv6_port_filtering_2077() {

		Driver.closeDriver();
		
		ModemFactoryReset mfr = new ModemFactoryReset();
		mfr.FactoryResetModem();
		
		Driver.openModel();
		fun.MercuryInitialSetup();
		
		test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		caut_id="CAUT-2532";
		log.info("********************** "+ caut_id+" **********************");
		response = TestAction.getLoginAction().getTestResult(test_case);
		
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();
		Assert.assertEquals(response, "Pass", response);
		
	}
	
	//CAUT -  2533
	@Test(priority = 31)
	public void webUI_Mercury_Advanced_Settings_Security_IP_and_Port_filtering_add_inbound_IPv6_rule_2078() {

		test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		caut_id="CAUT-2533";
		log.info("********************** "+ caut_id+" **********************");
		response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();
		Assert.assertEquals(response, "Pass", response);
		
	}
	
	//CAUT - 2620
	@Test(priority = 32)
	public void webUI_Mercury_Advanced_Settings_Security_IP_and_Port_filtering_add_outbound_IPv6_rule_2170() {
		
		test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		caut_id="CAUT-2620";
		log.info("********************** "+ caut_id+" **********************");
		//log.info("Test Case: "+ new Object(){}.getClass().getEnclosingMethod().getName());
		fun.MercuryLogin();
		response = TestAction.getLoginAction().getTestResult(test_case);		
		Assert.assertEquals(response, "Pass", response);
		
		Driver.closeDriver();
		
		ModemFactoryReset mfr = new ModemFactoryReset();
		mfr.FactoryResetModem();
		
		Driver.openModel();
		fun.MercuryInitialSetup();
	}
	
	//CAUT - 2742
	@Test(priority = 33)
	public void webUI_Mercury_Advanced_settings_DHCPV4_in_DSLite_mode_Default_values_2047() {
		caut_id="CAUT-2742";
		log.info("********************** "+ caut_id+" **********************");
		log.info("Test Case: "+ new Object(){}.getClass().getEnclosingMethod().getName());

		response = fun.MercuryLogin();
		response = fun.DHCPV4_IPv4RGAndDSLite_DefaultValues();		
		
		Assert.assertEquals(response, "Pass", response);
	}
	
	//CAUT - 2772
	@Test(priority = 34)
	public void webUI_Mercury_Advanced_settings_Tools_Network_Status_Status_1995() {
		

		test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		caut_id="CAUT-2772";
		log.info("********************** "+ caut_id+" **********************");
		log.info("Test Case: "+ test_case);
		log.info("Jira Name: webUI_Mercury_Advanced_settings_Tools_Network_Status_Status_1995");
		fun.MercuryLogin();
		response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	
	//CAUT - 2778
	@Test(priority = 35)
	public void webUI_Mercury_Advanced_settings_Tools_Network_Status_Configuration_General_Configuration_2001() {

		test_case = new Object(){}.getClass().getEnclosingMethod().getName();
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
	@Test(priority = 36)
	public void webUI_Mercury_Advanced_settings_Tools_Ping_2009() {

		test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		caut_id="CAUT-2786";
		log.info("********************** "+ caut_id+" **********************");
		log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");
		fun.MercuryLogin();
		response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	
	//CAUT - 2787
	@Test(priority = 37)
	public void webUI_Mercury_Advanced_settings_Tools_Ping_Invalid_target_2010() {

		test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		caut_id="CAUT-2787";
		log.info("********************** "+ caut_id+" **********************");
		log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");
		fun.MercuryLogin();
		response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	
	
//	//CAUT - 2805 
//	@Test(priority = 38)
//	public void webUI_Mercury_Advanced_settings_UPnP_Default_values_1992() {
//
//		test_case = new Object(){}.getClass().getEnclosingMethod().getName();
//		log.info("Test Case: "+ test_case);
//	   caut_id="CAUT-2805";
// 		log.info("********************** "+ caut_id+" **********************");
//		fun.MercuryLogin();
//		response = TestAction.getLoginAction().getTestResult(test_case); 
//		Assert.assertEquals(response, "Pass", response);
//	}
	
	//CAUT-2840
	@Test(priority = 39)
	public void webUI_Mercury_Advanced_settings_Security_Firewall_Default_values_DSLite_1811() throws InterruptedException {

		
		
          test_case = new Object() {
          }.getClass().getEnclosingMethod().getName();
          log.info("Test Case: " + test_case);
          caut_id="CAUT-2840";
  		log.info("********************** "+ caut_id+" **********************");
          response = fun.MercuryLogin();

          response = TestAction.getLoginAction().getTestResult(test_case);

          Assert.assertEquals(response, "Pass", response);
	}
	
	
	
	//CAUT-2883
	//Blocked
	@Test(priority = 38)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Primary_24GHz_change_Primary_24_SSID_with_SSID_changed_to_Guest_SSID_1731() {

		test_case = new Object(){}.getClass().getEnclosingMethod().getName();
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
//	
//	//CAUT - 2914 
//	//Blocked
//	@Test(priority = 39)
//	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_UDPTCP_protocol_Any_source_port_range_Any_destination_port_range_1887() {
//
//		test_case = new Object() {
//		}.getClass().getEnclosingMethod().getName();
//		log.info("Test Case: " + test_case);
//caut_id="CAUT-2914";
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
//	
	
	//CAUT - 1845
	@Test(priority = 40)
	public void webUI_Mercury_Home_Quick_Set_up_Wizards_Modify_your_guest_network_enable_Change_security_key_duplicate_value_1667()


			throws InterruptedException {

		test_case = new Object() {
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
	@Test(priority = 41)
	public void webUI_Mercury_Home_Quick_Set_up_Wizards_Modify_your_guest_network_enable_Change_SSID_invalid_value_1661()

			throws InterruptedException {

		test_case = new Object() {
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
	@Test(priority = 42)
	public void webUI_Mercury_Advanced_settings_Wireless_Guest_network_Broadcast_of_SSID_default_status_1790() throws InterruptedException {

		
		fun.factoryReset();
		test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);

		caut_id="CAUT-2450";
		log.info("********************** "+ caut_id+" **********************");
		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	} 
	
	//2460
	@Test(priority = 43)
	public void webUI_Mercury_Advanced_settings_Wireless_WPS_Default_status_1800() {

		test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		caut_id="CAUT-2460";
		log.info("********************** "+ caut_id+" **********************");
		fun.MercuryLogin();
		
		
		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}  
		 

	//CAUT-2494
	@Test(priority = 44)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Primary_5GHz_Broadcast_of_primary_5_SSID_enable_1752() throws InterruptedException {
		fun.factoryReset();
		test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		caut_id="CAUT-2494";
		log.info("********************** "+ caut_id+" **********************");

		response = TestAction.getLoginAction().getTestResult("webUI_Mercury_Advanced_settings_Wireless_Security_Primary_5GHz_Broadcast_of_primary_5_SSID_disable_1751");

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		} else
			response = "Failed - SSID is not disabled";

		Assert.assertEquals(response, "Pass", response);
	}
	
	//CAUT-3040
	@Test(priority = 45)
	public void webUI_Mercury_Admin_Remote_access_Enabled_Change_port_2275() {
		
		test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		caut_id="CAUT-3040";
		log.info("********************** "+ caut_id+" **********************");

		response = fun.MercuryLogin();
		if (response.equals("Pass")) {
			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		
		Assert.assertEquals(response, "Pass", response);
	}
		
	//CAUT-1846
	@Test(priority = 46)
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
	
	//CAUT-2761
	@Test(priority = 47)
	public void webUI_Mercury_Advanced_settings_DHCPV6_in_DSLite_mode_Default_values_2066() {
		
		test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		caut_id="CAUT-2761";
		log.info("********************** "+ caut_id+" **********************");

		response = fun.MercuryLogin();

		if (response.equals("Pass")) {
			response = TestAction.getLoginAction().getTestResult(test_case);
		}

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
			
			
	
				
		 
	      log.info("**************** Status of TestCase is "+response+" ********************");
	      log.info("+++++++++++++++++ END TEST +++++++++++++++++\n");
	      log.info("CURRENT STATUS : PASSED = " + passed+", FAILED = "+ failed);
	      System.out.println("*** Test Case Details- Test Case: "+ test_case+" "+caut_id+ " Status: "+ response+" ***");
	      

			fun.logout();	
			Driver.closeDriver();
			Thread.sleep(1000 * 5);
		
	      }
		catch(Exception ex)
		{
			log.info("Messsage: Thread interrupted exception " + ex.getMessage());
		}
		
		
		
	}

			
}



