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

public class WirelessSecurity {

	Logger log = null;
	CommonFunctionality fun = new CommonFunctionality();

	@BeforeClass
	public void testInitBrowser() {

		log = Driver.getLogger();
		log.info("+++++++++++++++++ Gateway Model: " + runAut.modem + " - Wireless Security Page +++++++++++++++++");
		
		Driver.openModel();
		fun.MercuryInitialSetup();
		Driver.closeDriver();
	}

	@BeforeMethod
	public void testFactoryReset() {

		log.info("+++++++++++++++++ START TEST +++++++++++++++++");
	}
//CAUT-2471
	@Test(priority = 1)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Primary_24GHz_Check_default_24GHz_WiFi_Network_Name_1727() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();
		// String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
//CAUT-2472
	@Test(priority = 2)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Primary_24GHz_Primary_24_Change_24GHz_WiFi_Network_Name_1728() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();
		// String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
//CAUT-2473
	@Test(priority = 3)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Primary_24GHz_change_Primary_24_SSID_with_invalid_SSID_1729() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		fun.RebootGateWay();
		Driver.openModel();

		String response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
//CAUT-2474
	@Test(priority = 4)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Primary_24GHz_change_Primary_24_SSID_with_SSID_too_long_1730() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		fun.RebootGateWay();
		Driver.openModel();

		String response = TestAction.getLoginAction().getTestResult(test_case);

		if (response.equals("ssid error message not found"))
			response = TestAction.getLoginAction().getTestResult("WirelessSecurity24GHzChangeSSIDToTooLong_1730_1");

		Assert.assertEquals(response, "Pass", response);
	}
//CAUT-2883
	@Test(priority = 5)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Primary_24GHz_change_Primary_24_SSID_with_SSID_changed_to_Guest_SSID_1731() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();
		// String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
//CAUT-2475
	@Test(priority = 6)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Primary_24GHz_change_Primary_24_SSID_with_SSID_changed_to_Hotspot_1732() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();
		// String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
//CAUT-2476
	@Test(priority = 7)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Primary_24GHz_Broadcast_of_primary_24_SSID_default_status_1733() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();
		//String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
//CAUT-2477
	@Test(priority = 8)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Primary_24GHz_Broadcast_of_primary_24_SSID_disable_1734() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();
		// String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		// if (response.equals("SSID not found in network list")) {
		// response =
		// TestAction.getLoginAction().getTestResult("WirelessSecurity24GHzEnableBackBroadcast");
		// response = "Pass";
		// } else
		// response = "Failed - SSID is not disabled";

		Assert.assertEquals(response, "Pass", response);
	}
//CAUT-2478
	@Test(priority = 9)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Primary_24GHz_Broadcast_of_primary_24_SSID_enable_1735() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();
		// String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult("webUI_Mercury_Advanced_settings_Wireless_Security_Primary_24GHz_Broadcast_of_primary_24_SSID_disable_1734");

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		} else
			response = "Failed - SSID is not disabled";

		Assert.assertEquals(response, "Pass", response);
	}
//CAUT-2479
	@Test(priority = 10)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Primary_24GHz_Default_Security_1736() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();
		//String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
//CAUT-2480
	@Test(priority = 11)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Primary_24GHz_No_Security_1738() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		Driver.openModel();

		String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		if (response.equals("Pass"))
			TestAction.getLoginAction().getTestResult("WirelessSecurity24GHzSecurityDefault");

		Assert.assertEquals(response, "Pass", response);
	}
//CAUT-2481
	@Test(priority = 12)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Primary_24GHz_WPA_PSKWPA2_PSK_1739() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		Driver.openModel();

		String response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
//CAUT-2482
	@Test(priority = 13)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Primary_24GHz_WPA2_PSK_1740() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();

		response = TestAction.getLoginAction().getTestResult(test_case);

		if (response.equals("Pass"))
			TestAction.getLoginAction().getTestResult("WirelessSecurity24GHzSecurityDefault");

		Assert.assertEquals(response, "Pass", response);
	}
//CAUT-2483
	@Test(priority = 14)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Primary_24GHz_Default_security_key_1741() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();
		//String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
//CAUT-2484
	@Test(priority = 15)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Primary_24GHz_Change_security_key_Valid_value_1742() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		Driver.openModel();

		String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
//CAUT-2485
	@Test(priority = 16)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Primary_24GHz_Change_security_key_Invalid_value_1743() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		Driver.openModel();

		String response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
//CAUT-2486
	@Test(priority = 17)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Primary_5GHz_Check_default_5GHz_WiFi_Network_Name_1744() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();
		//String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
//CAUT-2487
	@Test(priority = 18)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Primary_5GHz_Primary_5_Change_5GHz_WiFi_Network_Name_1745() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();
		// String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
//CAUT-2488
	@Test(priority = 19)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Primary_5GHz_change_Primary_5_SSID_with_invalid_SSID_1746() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();
		// String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
//CAUT-2489
	@Test(priority = 20)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Primary_5GHz_change_Primary_5_SSID_with_SSID_too_long_1747() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();
		// String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		if (response.equals("ssid error message not found"))
			response = TestAction.getLoginAction().getTestResult("WirelessSecurity5GHzChangeSSIDTooLong_1747_1");

		Assert.assertEquals(response, "Pass", response);
	}
//CAUT-2490
	@Test(priority = 21)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Primary_5GHz_change_Primary_5_SSID_with_SSID_changed_to_Guest_SSID_1748() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();
		// String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
//CAUT-2491
	@Test(priority = 22)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Primary_5GHz_change_Primary_5_SSID_with_SSID_changed_to_Hotspot_1749() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();
		// String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
//CAUT-2492
	@Test(priority = 23)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Primary_5GHz_Broadcast_of_primary_5_SSID_default_status_1750() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();
		// String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
//CAUT-2493
	@Test(priority = 24)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Primary_5GHz_Broadcast_of_primary_5_SSID_disable_1751() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();
		//String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		// if (response.equals("SSID not found in network list")) {
		// response =
		// TestAction.getLoginAction().getTestResult("WirelessSecurity5GHzEnableBackBroadcast");
		// response = "Pass";
		// } else
		// response = "Failed - SSID is not disabled";

		Assert.assertEquals(response, "Pass", response);
	}
//CAUT-2494
	@Test(priority = 25)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Primary_5GHz_Broadcast_of_primary_5_SSID_enable_1752() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();
		//String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult("webUI_Mercury_Advanced_settings_Wireless_Security_Primary_5GHz_Broadcast_of_primary_5_SSID_disable_1751");

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		} else
			response = "Failed - SSID is not disabled";

		Assert.assertEquals(response, "Pass", response);
	}
//CAUT-2495
	@Test(priority = 26)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Primary_5GHz_Default_Security_1753() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();
		// String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
//CAUT-2496
	@Test(priority = 27)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Primary_5GHz_No_Security_1754() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		Driver.openModel();

		String response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
//CAUT-2497
	@Test(priority = 28)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Primary_5GHz_WPA_PSKWPA2_PSK_1755() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		Driver.openModel();

		String response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
//CAUT-2498
	@Test(priority = 29)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Primary_5GHz_WPA2_PSK_1756() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
//CAUT-2499
	@Test(priority = 30)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Primary_5GHz_Default_security_key_1757() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();
		// String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
//CAUT-2500
	@Test(priority = 31)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Primary_5GHz_Change_security_key_Valid_value_1758() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		Driver.openModel();

		String response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
//CAUT-2501
	@Test(priority = 32)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Primary_5GHz_Change_security_key_Invalid_value_1759() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		Driver.openModel();

		String response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
//CAUT-2502
	@Test(priority = 33)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Wireless_MAC_Filtering_default_status_1760() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
//CAUT-2503
	@Test(priority = 34)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Wireless_MAC_Filtering_Add_device_24GHz_1761() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}

		Assert.assertEquals(response, "Pass", response);
	}
//CAUT-2504
	@Test(priority = 35)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Wireless_MAC_Filtering_Test_blocking_24GHz_1762() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();
		//String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);

			if (response.equals("Pass")) {

				response = fun.ConnectTo24GHzWiFiNetwork();
				if (response.equals("Profile not connected")) {
					response = "Pass";
				} else
					response = "Fail - 24GHz Profile connected eventhough it is blocked";
			}
		}

		Assert.assertEquals(response, "Pass", response);

		fun.WirelessSecurity5GHzDefaultWiFiConfiguration();
		fun.WirelessSecurityDefaultMACFilteringConfiguration();
	}
//CAUT-2505
	@Test(priority = 36)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Wireless_MAC_Filtering_Test_authorized_24GHz_1763() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult("webUI_Mercury_Advanced_settings_Wireless_Security_Wireless_MAC_Filtering_Add_device_24GHz_1761");

			if (response.equals("Pass")) {

				response = TestAction.getLoginAction().getTestResult(test_case);
			}
		}

		fun.WirelessSecurity5GHzDefaultWiFiConfiguration();
		fun.WirelessSecurityDefaultMACFilteringConfiguration();

		Assert.assertEquals(response, "Pass", response);
	}
//CAUT-2506
	@Test(priority = 37)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Wireless_MAC_Filtering_Remove_device_24GHz_1764() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();
		//String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult("webUI_Mercury_Advanced_settings_Wireless_Security_Wireless_MAC_Filtering_Add_device_24GHz_1761");

			if (response.equals("Pass")) {

				response = TestAction.getLoginAction().getTestResult(test_case);

				if (response.equals("Pass")) {

					response = fun.ConnectTo24GHzWiFiNetwork();

					if (response.equals("Profile not connected")) {

						response = fun.WirelessSecurityDefaultMACFilteringConfiguration();

						if (response.equals("Pass")) {
							response = fun.ConnectTo24GHzWiFiNetwork();
						}
					} else
						response = "Fail";
				}

			}
		}

		Assert.assertEquals(response, "Pass", response);
	}
//CAUT-2507
	@Test(priority = 38)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Wireless_MAC_Filtering_Add_device_24GHz_invalid_Mac_address_1765() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();
		// String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}

		Assert.assertEquals(response, "Pass", response);
	}
//CAUT-2508
	@Test(priority = 39)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Wireless_MAC_Filtering_Add_device_24GHz_Duplicate_device_name_1766() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}

		Assert.assertEquals(response, "Pass", response);
	}
//CAUT-2509
	@Test(priority = 39)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Wireless_MAC_Filtering_Add_device_24GHz_duplicate_MAC_address_1809() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}

		Assert.assertEquals(response, "Pass", response);
	}
//CAUT-2510
	@Test(priority = 40)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Wireless_MAC_Filtering_Add_device_24GHz_Maximum_list_1767() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();
		// String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}

		Assert.assertEquals(response, "Pass", response);
	}
//CAUT-2511
	@Test(priority = 41)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Wireless_MAC_Filtering_Add_device_5GHz_1768() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();
		// String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}

		Assert.assertEquals(response, "Pass", response);
	}
//CAUT-2512
	@Test(priority = 42)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Wireless_MAC_Filtering_Test_blocking_5GHz_1769() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();
		//String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult("webUI_Mercury_Advanced_settings_Wireless_Security_Wireless_MAC_Filtering_Add_device_5GHz_1768");

			if (response.equals("Pass")) {

				response = TestAction.getLoginAction().getTestResult(test_case);

				if (response.equals("Pass")) {

					response = fun.ConnectTo5GHzWiFiNetwork();
					if (response.equals("Profile not connected")) {
						response = "Pass";
					} else
						response = "Fail - 5GHz Profile connected eventhough it is blocked";
				}
			}
		}

		fun.WirelessSecurity5GHzDefaultWiFiConfiguration();
		fun.WirelessSecurityDefaultMACFilteringConfiguration();

		Assert.assertEquals(response, "Pass", response);
	}
//CAUT-2513
	@Test(priority = 43)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Wireless_MAC_Filtering_Test_authorized_5GHz_1770() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult("webUI_Mercury_Advanced_settings_Wireless_Security_Wireless_MAC_Filtering_Add_device_5GHz_1768");

			if (response.equals("Pass")) {

				response = TestAction.getLoginAction().getTestResult(test_case);
			}
		}

		fun.WirelessSecurity5GHzDefaultWiFiConfiguration();
		fun.WirelessSecurityDefaultMACFilteringConfiguration();

		Assert.assertEquals(response, "Pass", response);
	}
//CAUT-2520
	@Test(priority = 44)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Wireless_MAC_Filtering_Remove_device_5GHz_1771() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();
		//String response = fun.MercuryLogin();

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
//DEprecated replaced by 2521 in new rtest plan
//CAUT-2521
	@Test(priority = 45)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Wireless_MAC_Filtering_Add_device_5GHz_invalid_Mac_address_1772() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();
		// String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}

		Assert.assertEquals(response, "Pass", response);
	}
//CAUT-2522
	@Test(priority = 46)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Wireless_MAC_Filtering_Add_device_5GHz_Duplicate_device_name_1773() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();
		// String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}

		Assert.assertEquals(response, "Pass", response);
	}
//CAUT-2523
	@Test(priority = 46)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Wireless_MAC_Filtering_Add_device_5GHz_duplicate_MAC_address_1810() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();
		// String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}

		Assert.assertEquals(response, "Pass", response);
	}
//CAUT-2524
	@Test(priority = 47)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Wireless_MAC_Filtering_Add_device_5GHz_Maximum_list_1774() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();
		// String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}

		Assert.assertEquals(response, "Pass", response);
	}
//CAUT-2525
	@Test(priority = 48)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Wireless_MAC_Filtering_Add_device_Both_24GHz_and_5GHz_1775() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}

		Assert.assertEquals(response, "Pass", response);
	}
	//***************BLOCKED***********
//	//CAUT-2526
//	@Test(priority = 49)
//	public void webUI_Mercury_Advanced_settings_Wireless_Security_Wireless_MAC_Filtering_Test_blocking_Both_24GHz_and_5GHz_1776() {
//
//		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
//		log.info("Test Case: "+ test_case);
//		
//		fun.RebootGateWay();
//		Driver.openModel();
//
//		String response = fun.MercuryInitialSetup();
//
//		if (response.equals("Pass")) {
//
//			response = TestAction.getLoginAction()
//					.getTestResult("webUI_Mercury_Advanced_settings_Wireless_Security_Wireless_MAC_Filtering_Add_device_Both_24GHz_and_5GHz_1775");
//
//			if (response.equals("Pass")) {
//
//				response = TestAction.getLoginAction().getTestResult(test_case);
//
//				if (response.equals("Profile not connected")) {
//
//					response = fun.ConnectTo24GHzWiFiNetwork();
//
//					if (response.equals("Profile not connected")) {
//
//						response = "Pass";
//					} else
//						response = "Fail";
//				} else
//					response = "Fail";
//			}
//		}
//
//		fun.WirelessSecurity5GHzDefaultWiFiConfiguration();
//		fun.WirelessSecurityDefaultMACFilteringConfiguration();
//
//		Assert.assertEquals(response, "Pass", response);
//	}
//	//CAUT-2527
//	@Test(priority = 50)
//	public void webUI_Mercury_Advanced_settings_Wireless_Security_Wireless_MAC_Filtering_Test_authorized_Both_24GHz_and_5GHz_1777() {
//
//		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
//		log.info("Test Case: "+ test_case);
//		
//		fun.RebootGateWay();
//		Driver.openModel();
//
//		String response = fun.MercuryInitialSetup();
//
//		if (response.equals("Pass")) {
//
//			response = TestAction.getLoginAction()
//					.getTestResult("webUI_Mercury_Advanced_settings_Wireless_Security_Wireless_MAC_Filtering_Add_device_Both_24GHz_and_5GHz_1775");
//
//			if (response.equals("Pass")) {
//
//				response = TestAction.getLoginAction().getTestResult(test_case);
//			}
//		}
//
//		fun.WirelessSecurity5GHzDefaultWiFiConfiguration();
//		fun.WirelessSecurityDefaultMACFilteringConfiguration();
//
//		Assert.assertEquals(response, "Pass", response);
//	}
//	**********************************************************
//CAUT-2528
	@Test(priority = 51)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Wireless_MAC_Filtering_Remove_device_Both_24GHz_and_5GHz_1778() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction()
					.getTestResult("webUI_Mercury_Advanced_settings_Wireless_Security_Wireless_MAC_Filtering_Add_device_Both_24GHz_and_5GHz_1775");

			if (response.equals("Pass")) {

				response = TestAction.getLoginAction().getTestResult(test_case);

				if (response.equals("Pass")) {

					response = fun.ConnectTo24GHzWiFiNetwork();

					if (response.equals("Profile not connected")) {

						response = fun.WirelessSecurityDefaultMACFilteringConfiguration();

						if (response.equals("Pass")) {
							response = fun.ConnectTo24GHzWiFiNetwork();
						}
					} else
						response = "Fail";
				}
			}
		}

		Assert.assertEquals(response, "Pass", response);
	}
//CAUT-3072
	@Test(priority = 52)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Wireless_MAC_Filtering_Add_device_Both_24GHz_and_5GHz_invalid_Mac_address_1779() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();
		//String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}

		Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-3073
	@Test(priority = 53)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Wireless_MAC_Filtering_Add_device_Both_24GHz_and_5GHz_Duplicate_device_name_1780() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}

		Assert.assertEquals(response, "Pass", response);
	}
    //CAUT-2529
	@Test(priority = 54)
	public void webUI_Mercury_Advanced_settings_Wireless_Security_Wireless_MAC_Filtering_Add_device_Both_24GHz_and_5GHz_Maximum_list_1781() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();
		//String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}

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
