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

public class WirelessSignal {
	// static WebDriver driver = null;
	Logger log = null;
	CommonFunctionality fun = new CommonFunctionality();

	@BeforeClass
	public void testInitBrowser() {

		log = Driver.getLogger();
		log.info("+++++++++++++++++ Gateway Model: " + runAut.modem + " - Wireless Signal Page +++++++++++++++++");

		Driver.openModel();
		fun.MercuryInitialSetup();
		Driver.closeDriver();
	}

	@BeforeMethod
	public void testFactoryReset() {

		log.info("+++++++++++++++++ START TEST +++++++++++++++++");
	}
	//CAUT-2206
	@Test(priority = 1)
	public void webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_Check_24GHz_Status_1673() {
		
		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();
		// String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-2207
	@Test(priority = 2)
	public void webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_Disable_24GHz_230() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();
		//String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);
		
		log.info("Reverting the Settings changed");
		TestAction.getLoginAction().getTestResult("WirelessSignalEnableBack24GHzSSID");
		
		if (response.equals("Profile not connected"))			
			response = "Pass";
		else 
			response = "Fail";
		
		Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-2208
	@Test(priority = 3)
	public void webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_Disable_24GHz_with_Hotspot_config_file_401() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		System.out.println("Request to set Hotspot Configuration");

		webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_Disable_24GHz_230();
	}
	//CAUT-2209
	@Test(priority = 4)
	public void webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_Enable_24GHz_1674() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();
		// String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult("webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_Disable_24GHz_230");

		if (response.equals("Profile not connected")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		} else
			response = "Fail";

		Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-2210
	@Test(priority = 5)
	public void webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_Primary_24GHz_Check_default_wireless_mode_1675() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-2211
	@Test(priority = 6)
	public void webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_Primary_24GHz_Change_Wireless_mode_bgn_mode_1717() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		Driver.openModel();

		String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		if (response.equals("Pass")) {

			log.info("Searching for Radio type 802.11b");
			response = TestAction.getLoginAction().getTestResult("WirelessSignal24GHzCheckForWirelessMode_b");
			if (response.equals("Radio type not found")) {

				log.info("Searching for Radio type 802.11g");
				response = TestAction.getLoginAction().getTestResult("WirelessSignal24GHzCheckForWirelessMode_g");
				if (response.equals("Radio type not found")) {
					
					log.info("Searching for Radio type 802.11n");
					response = TestAction.getLoginAction().getTestResult("WirelessSignal24GHzCheckForWirelessMode_n");
				}
			}
		}

		Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-2212
	@Test(priority = 7)
	public void webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_Primary_24GHz_Change_Wireless_mode_gn_mode_1718() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		Driver.openModel();

		String response = fun.MercuryLogin();
		
		response = TestAction.getLoginAction().getTestResult(test_case);

		if (response.equals("Pass")) {

			log.info("Searching for Radio type 802.11g");
			response = TestAction.getLoginAction().getTestResult("WirelessSignal24GHzCheckForWirelessMode_g");
			if (response.equals("Radio type not found")) {

				log.info("Searching for Radio type 802.11n");
				response = TestAction.getLoginAction().getTestResult("WirelessSignal24GHzCheckForWirelessMode_n");
			}
		}

		Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-2213
	@Test(priority = 8)
	public void webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_Primary_24GHz_Change_Wireless_mode_n_mode_1676() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		Driver.openModel();
		
		String response = fun.MercuryLogin();
		
		response = TestAction.getLoginAction().getTestResult(test_case);

		if (response.equals("Pass")) {

			log.info("Searching for Radio type 802.11n");
			response = TestAction.getLoginAction().getTestResult("WirelessSignal24GHzCheckForWirelessMode_n");
		}

		Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-2214
	@Test(priority = 9)
	public void webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_Primary_24GHz_Channel_Default_setting_1677() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		fun.RebootGateWay();
		Driver.openModel();

		fun.MercuryInitialSetup();
		
		String response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-2215
	@Test(priority = 10)
	public void webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_Primary_24GHz_Channel_Channel_in_use_395() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		Driver.openModel();
		fun.MercuryLogin();
		
		String response = TestAction.getLoginAction().getTestResult(test_case);

		if(response.equals("Pass")){
			
			Driver.closeDriver();
			fun.RebootGateWay();
			Driver.openModel();
			fun.MercuryInitialSetup();
			//fun.MercuryLogin();
			response = TestAction.getLoginAction().getTestResult("webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_Primary_24GHz_Channel_in_use");
		}
		Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-2216
	@Test(priority = 11)
	public void webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_Primary_24GHz_Channel_Change_Channel_to_1_1719() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		fun.RebootGateWay();
		Driver.openModel();
		fun.MercuryInitialSetup();
		Driver.closeDriver();
		
		Driver.openModel();

		String response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-2217
	@Test(priority = 12)
	public void webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_Primary_24GHz_Channel_Change_Channel_to_2_1678() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		Driver.openModel();

		String response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-2218
	@Test(priority = 13)
	public void webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_Primary_24GHz_Channel_Change_Channel_to_3_1679() {

		fun.RebootGateWay();
		Driver.openModel();
		fun.MercuryInitialSetup();
		Driver.closeDriver();
		
		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		Driver.openModel();

		String response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-2219
	@Test(priority = 14)
	public void webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_Primary_24GHz_Channel_Change_Channel_to_4_1680() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		Driver.openModel();

		String response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-2220
	@Test(priority = 15)
	public void webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_Primary_24GHz_Channel_Change_Channel_to_5_1681() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		Driver.openModel();

		String response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-2221
	@Test(priority = 16)
	public void webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_Primary_24GHz_Channel_Change_Channel_to_6_1682() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		Driver.openModel();

		String response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-2222
	@Test(priority = 17)
	public void webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_Primary_24GHz_Channel_Change_Channel_to_7_1683() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		Driver.openModel();

		String response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-2223
	@Test(priority = 18)
	public void webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_Primary_24GHz_Channel_Change_Channel_to_8_1684() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		Driver.openModel();

		String response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-2224
	@Test(priority = 19)
	public void webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_Primary_24GHz_Channel_Change_Channel_to_9_1685() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		Driver.openModel();

		String response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-2225
	@Test(priority = 20)
	public void webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_Primary_24GHz_Channel_Change_Channel_to_10_1686() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		Driver.openModel();

		String response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-2226
	@Test(priority = 21)
	public void webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_Primary_24GHz_Channel_Change_Channel_to_11_1687() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		Driver.openModel();

		String response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-2227
	@Test(priority = 22)
	public void webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_Primary_24GHz_Channel_Change_Channel_to_12_1688() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		Driver.openModel();

		String response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
    //CAUT-2228
	@Test(priority = 23)
	public void webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_Primary_24GHz_Channel_Change_Channel_to_13_1689() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		Driver.openModel();

		String response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-2229
	@Test(priority = 24)
	public void webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_24GHz_Channel_width_Default_Channel_width_1690() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		Driver.openModel();

		String response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-2230
	@Test(priority = 25)
	public void webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_24GHz_Channel_width_Change_bandwidth_2040MHz_1721() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		Driver.openModel();

		String response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-2231
	@Test(priority = 26)
	public void webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_24GHz_Channel_width_Change_bandwidth_20MHz_1720() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		Driver.openModel();

		String response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-2232
	@Test(priority = 27)
	public void webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_Check_5GHz_Status_1691() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-2233
	@Test(priority = 28)
	public void webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_Disable_5GHz_1722() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();
		//String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);
		
		log.info("Reverting the Settings changed");
		TestAction.getLoginAction().getTestResult("WirelessSignalEnableBack5GHzSSID");
		
		if (response.equals("Profile not connected"))			
			response = "Pass";
		else 
			response = "Fail";
		
		Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-2234
	@Test(priority = 28)
	public void webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_Disable_5GHz_with_Hotspot_config_file_1692() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		log.info("Request to set Hotspot Configuration");
		System.out.println("Request to set Hotspot Configuration");
		
		webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_Disable_5GHz_1722();
	}
	//CAUT-2235
	@Test(priority = 30)
	public void webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_Enable_5GHz_1693() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();
		//String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult("webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_Disable_5GHz_1722");

		if (response.equals("Profile not connected")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		} else
			response = "Fail";

		Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-2236
	@Test(priority = 31)
	public void webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_Primary_5GHz_Check_default_wireless_mode_1694() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();

		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-2237
	@Test(priority = 32)
	public void webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_Primary_5GHz_Change_Wireless_mode_nac_mode_1695() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		Driver.openModel();
		
		String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		if (response.equals("Pass")) {
			
			log.info("Searching for Radio type 802.11n");
			response = TestAction.getLoginAction().getTestResult("WirelessSignal5GHzCheckForWirelessMode_n");
			if (response.equals("Radio type not found")) {

				log.info("Searching for Radio type 802.11ac");
				response = TestAction.getLoginAction().getTestResult("WirelessSignal5GHzCheckForWirelessMode_ac");
			}
		}

		Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-2416
	@Test(priority = 33)
	public void webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_Primary_5GHz_Change_Wireless_mode_anac_mode_1723() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		Driver.openModel();

		String response = fun.MercuryLogin();
		
		response = TestAction.getLoginAction().getTestResult(test_case);

		if (response.equals("Pass")) {
			
			log.info("Searching for Radio type 802.11n");
			response = TestAction.getLoginAction().getTestResult("WirelessSignal5GHzCheckForWirelessMode_n");
			if (response.equals("Radio type not found")) {

				log.info("Searching for Radio type 802.11a");
				response = TestAction.getLoginAction().getTestResult("WirelessSignal5GHzCheckForWirelessMode_a");
				if (response.equals("Radio type not found")) {

					log.info("Searching for Radio type 802.11ac");
					response = TestAction.getLoginAction().getTestResult("WirelessSignal5GHzCheckForWirelessMode_ac");
				}
			}
		}
		Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-2417
	@Test(priority = 34)
	public void webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_Primary_5GHz_Change_Wireless_mode_ac_mode_1696() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		fun.RebootGateWay();
		Driver.openModel();
		fun.MercuryInitialSetup();
		Driver.closeDriver();
		
		Driver.openModel();

		String response = fun.MercuryLogin();
		
		response = TestAction.getLoginAction().getTestResult(test_case);

		if (response.equals("Pass")) {
			log.info("Searching for Radio type 802.11ac");
			response = TestAction.getLoginAction().getTestResult("WirelessSignal5GHzCheckForWirelessMode_ac");
		}

		Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-2418
	@Test(priority = 35)
	public void webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_Primary_5GHz_Channel_Default_setting_1697() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		fun.RebootGateWay();
		Driver.openModel();

		String response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-2419
	@Test(priority = 36)
	public void webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_Primary_5GHz_Channel_Channel_in_use_399() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		Driver.openModel();
		fun.MercuryLogin();
		
		String response = TestAction.getLoginAction().getTestResult(test_case);

		if(response.equals("Pass")){

			Driver.closeDriver();
			fun.RebootGateWay();
			Driver.openModel();
			fun.MercuryInitialSetup();
			response = TestAction.getLoginAction().getTestResult("webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_Primary_5GHz_Channel_in_use");
		}
		Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-2420
	@Test(priority = 37)
	public void webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_Primary_5GHz_Channel_Change_Channel_to_36_1726() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		//fun.RebootGateWay();
		//Driver.openModel();
		//fun.MercuryInitialSetup();
		//Driver.closeDriver();
		
		Driver.openModel();

		String response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-2421
	@Test(priority = 38)
	public void webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_Primary_5GHz_Channel_Change_Channel_to_40_1698() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		Driver.openModel();

		String response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-2422
	@Test(priority = 39)
	public void webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_Primary_5GHz_Channel_Change_Channel_to_44_1699() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		Driver.openModel();

		String response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-2423
	@Test(priority = 40)
	public void webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_Primary_5GHz_Channel_Change_Channel_to_48_1700() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		Driver.openModel();

		String response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-2424
	@Test(priority = 41)
	public void webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_Primary_5GHz_Channel_Change_Channel_to_52_1701() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		Driver.openModel();

		String response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-2425
	@Test(priority = 42)
	public void webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_Primary_5GHz_Channel_Change_Channel_to_56_1702() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		Driver.openModel();

		String response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-2426
	@Test(priority = 43)
	public void webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_Primary_5GHz_Channel_Change_Channel_to_60_1703() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		Driver.openModel();

		String response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-2427
	@Test(priority = 44)
	public void webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_Primary_5GHz_Channel_Change_Channel_to_64_1704() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		Driver.openModel();

		String response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-2428
	@Test(priority = 45)
	public void webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_Primary_5GHz_Channel_Change_Channel_to_100_1705() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		Driver.openModel();

		String response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-2429
	@Test(priority = 46)
	public void webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_Primary_5GHz_Channel_Change_Channel_to_104_1706() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		Driver.openModel();

		String response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-2430
	@Test(priority = 47)
	public void webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_Primary_5GHz_Channel_Change_Channel_to_108_1707() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		Driver.openModel();

		String response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-2431
	@Test(priority = 48)
	public void webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_Primary_5GHz_Channel_Change_Channel_to_112_1708() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();
		//String response = fun.MercuryLogin();
		
		response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-2432
	@Test(priority = 49)
	public void webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_Primary_5GHz_Channel_Change_Channel_to_116_1709() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		Driver.openModel();

		String response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-2433
	@Test(priority = 50)
	public void webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_Primary_5GHz_Channel_Change_Channel_to_120_1710() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		Driver.openModel();

		String response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-2434
	@Test(priority = 51)
	public void webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_Primary_5GHz_Channel_Change_Channel_to_124_1711() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		Driver.openModel();

		String response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-2435
	@Test(priority = 52)
	public void webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_Primary_5GHz_Channel_Change_Channel_to_128_1712() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		Driver.openModel();

		String response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-2436
	@Test(priority = 53)
	public void webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_Primary_5GHz_Channel_Change_Channel_to_132_1713() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		Driver.openModel();

		String response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-2437
	@Test(priority = 54)
	public void webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_Primary_5GHz_Channel_Change_Channel_to_136_1714() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		Driver.openModel();

		String response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-2438
	@Test(priority = 55)
	public void webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_Primary_5GHz_Channel_Change_Channel_to_140_1715() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		Driver.openModel();

		String response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-2439
	@Test(priority = 56)
	public void webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_Primary_5GHz_Channel_width_Default_Channel_width_1716() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		Driver.openModel();

		String response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-2440
	@Test(priority = 57)
	public void webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_Primary_5GHz_Channel_width_Change_bandwidth_20MHz_1724() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		Driver.openModel();

		String response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-2441
	@Test(priority = 58)
	public void webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_Primary_5GHz_Channel_width_Change_bandwidth_2040MHz_1725() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		Driver.openModel();

		String response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-2442
	@Test(priority = 59)
	public void webUI_Mercury_Advanced_settings_Wireless_Wireless_signal_Primary_5GHz_Channel_width_Change_bandwidth_204080MHz_457() {


		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		Driver.openModel();

		String response = TestAction.getLoginAction().getTestResult(test_case);

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
