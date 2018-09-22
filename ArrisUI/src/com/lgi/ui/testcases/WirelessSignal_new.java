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

public class WirelessSignal_new {
	// static WebDriver driver = null;
	Logger log = null;
	CommonFunctionality fun = new CommonFunctionality();
	int test_number=1;
	@BeforeClass
	public void testInitBrowser() {


		log = Driver.getLogger();
		log.info("+++++++++++++++++ Gateway Model: " + runAut.modem + " - Wireless Signal Page +++++++++++++++++");

		
		//fun.MercuryInitialSetup();
		//Driver.closeDriver();
	}

	@BeforeMethod
	public void testFactoryReset() {




		
		log.info("+++++++++++++++++ START TEST +++++++++++++++++");

		Driver.openModel();
//		if (test_number++==1)
//			fun.factoryReset();
//		else 
			fun.MercuryLogin();
		
	}

	@Test(priority = 1)
	public void LGI_webUI_Mercury_FA07_Wireless_Signal_7_1_1_Advanced_Settings_Wireless_signal_Content_5824() {

		
		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 2)
	public void LGI_webUI_Mercury_FA07_Wireless_Signal_7_1_1_Advanced_Settings_Wireless_signal_Functionality_2_4Ghz_Enable_Button_5825() {
		
		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 3)
	public void LGI_webUI_Mercury_FA07_Wireless_Signal_7_1_1_Advanced_Settings_Wireless_signal_Functionality_2_4Ghz_Disable_Button_5826() {
		
		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	
	//blocked
	@Test(priority = 4)
	public void LGI_webUI_Mercury_FA07_Wireless_Signal_7_1_1_Advanced_Settings_Wireless_signal_Functionality_2_4Ghz_Disable_Button_Information_icon_5827() {
		
		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 5)
	public void LGI_webUI_Mercury_FA07_Wireless_Signal_7_1_1_Advanced_Settings_Wireless_signal_Functionality_2_4Ghz_Wireless_Mode_Dropdown_menu_5828() {
		
		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 6)
	public void LGI_webUI_Mercury_FA07_Wireless_Signal_7_1_1_Advanced_Settings_Wireless_signal_Functionality_2_4Ghz_Channel_in_manual_mode_Radio_button_5829() {
		
		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 7)
	public void LGI_webUI_Mercury_FA07_Wireless_Signal_7_1_1_Advanced_Settings_Wireless_signal_Functionality_2_4Ghz_Channel_in_auto_mode_Radio_button_5830() {
		
		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 8)
	public void LGI_webUI_Mercury_FA07_Wireless_Signal_7_1_1_Advanced_Settings_Wireless_signal_Functionality_2_4Ghz_Channel_in_manual_mode_Channel_dropdown_menu_5831() {
		
		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
	    log.info("Test Case: "+ test_case);
	
	    String response = TestAction.getLoginAction().getTestResult(test_case);
	    Assert.assertEquals(response, "Pass", response);
	}

	
	@Test(priority = 9)
	public void LGI_webUI_Mercury_FA07_Wireless_Signal_7_1_1_Advanced_Settings_Wireless_signal_Functionality_2_4Ghz_Channel_Width_dropdown_menu_5832() {
		
		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 10)
	public void LGI_webUI_Mercury_FA07_Wireless_Signal_7_1_1_Advanced_Settings_Wireless_signal_Functionality_5Ghz_Enable_Button_5833() {
		
		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 11)
	public void LGI_webUI_Mercury_FA07_Wireless_Signal_7_1_1_Advanced_Settings_Wireless_signal_Functionality_5Ghz_Disable_Button_5834() {
		
		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	
	//blocked
	@Test(priority = 12)
	public void LGI_webUI_Mercury_FA07_Wireless_Signal_7_1_1_Advanced_Settings_Wireless_signal_Functionality_5Ghz_Disable_Button_Information_icon_5835() {
		
		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 13)
	public void LGI_webUI_Mercury_FA07_Wireless_Signal_7_1_1_Advanced_Settings_Wireless_signal_Functionality_5Ghz_Wireless_Mode_Dropdown_menu_5836() {
		
		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 14)
	public void LGI_webUI_Mercury_FA07_Wireless_Signal_7_1_1_Advanced_Settings_Wireless_signal_Functionality_5Ghz_Channel_in_manual_mode_Radio_button_5837() {
		
		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 15)
    public void LGI_webUI_Mercury_FA07_Wireless_Signal_7_1_1_Advanced_Settings_Wireless_signal_Functionality_5Ghz_Channel_in_auto_mode_Radio_button_5838() {
          
		  String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
          log.info("Test Case: "+ test_case);

          String response = TestAction.getLoginAction().getTestResult(test_case);
          Assert.assertEquals(response, "Pass", response);
    }
	
	//Blocked
	@Test(priority = 16)
	public void LGI_webUI_Mercury_FA07_Wireless_Signal_7_1_1_Advanced_Settings_Wireless_signal_Functionality_5Ghz_Channel_in_manual_mode_Channel_dropdown_menu_5839() {
		
		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 17)
	public void LGI_webUI_Mercury_FA07_Wireless_Signal_7_1_1_Advanced_Settings_Wireless_signal_Functionality_5Ghz_Channel_Width_dropdown_menu_5840() {
		
		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 18)
    public void LGI_webUI_Mercury_FA07_Wireless_Signal_7_1_1_Advanced_Settings_Wireless_signal_Functionality_Apply_changes_Button_5841()
    {
          
          String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
          log.info("Test Case: "+ test_case);

          String response = TestAction.getLoginAction().getTestResult(test_case);
          Assert.assertEquals(response, "Pass", response);
    }

	@Test(priority = 19)
    public void LGI_webUI_Mercury_FA07_Wireless_Signal_7_1_1_Advanced_settings_Wireless_signal_DFS_channel_handling_Content_5842() {
          
          String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
          log.info("Test Case: "+ test_case);

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
