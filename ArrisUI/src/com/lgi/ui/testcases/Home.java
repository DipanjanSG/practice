package com.lgi.ui.testcases;

import org.apache.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.lgi.ui.automationJar.runAut;
import com.lgi.ui.commonUtils.Driver;
import com.lgi.ui.testAction.TestAction;
//49,50
public class Home {

	Logger log = null;
	CommonFunctionality fun = new CommonFunctionality();
	int testcase_no = 0;
	WebDriver driver;

	@BeforeClass
	public void testInitBrowser() {





		log = Driver.getLogger();
		log.info("+++++++++++++++++ Gateway Model: " + runAut.modem + " - Home Page +++++++++++++++++");
	}

	@BeforeMethod
	public void testFactoryReset() throws InterruptedException 

{


		log.info("+++++++++++++++++ START TEST +++++++++++++++++");
		// SOME XML FGILES NEED TO BE PRESENT FOR RUNNING TESTCASES

		Driver.openModel();
	}
	
	@Test(priority = 1)
	public void webUI_Mercury_Home_Language_selection_1646() throws InterruptedException {







		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");


		fun.factoryReset();
		

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	//PASSED
	@Test(priority = 2)
	public void webUI_Mercury_Home_Log_out_1647() {






		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	//
	@Test(priority = 3)
	public void webUI_Mercury_Home_Quick_Set_up_Wizards_Configure_your_WiFi_connection_Change_SSID_valid_value_1648()




			throws InterruptedException {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");

		Driver.openModel();
	    fun.MercuryLogin();

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 4)
	public void webUI_Mercury_Home_Quick_Set_up_Wizards_Configure_your_WiFi_connection_Change_SSID_invalid_value_1649()



			throws InterruptedException {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");

		// fun.Start_AFtr_Reboot();
		// fun.MercuryInitialSetup();
		String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	//PASSED
	@Test(priority = 5)
	public void webUI_Mercury_Home_Quick_Set_up_Wizards_Configure_your_WiFi_connection_Change_SSID_too_long_1650()


			throws InterruptedException {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");

		// fun.Start_AFtr_Reboot();
		// fun.MercuryInitialSetup();
		String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);

		if (response.equals("ssid error element not found"))
			response = TestAction.getLoginAction().getTestResult("QuickSetUpWizards_1650_1");

		Assert.assertEquals(response, "Pass", response);

	}

	
	// Guest Wifi Network functionality has bug so ignoring 6th Testcase
	 @Test(priority = 6)
	 public void
	 webUI_Mercury_Home_Quick_Set_up_Wizards_Configure_your_WiFi_connection_Change_SSID_to_Guest_SSID_1651()
	 {
	
	 String test_case = new Object() {
	 }.getClass().getEnclosingMethod().getName();
	 log.info("Test Case: " + test_case);
     log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");

	 //fun.Start_AFtr_Reboot();
	 //fun.MercuryInitialSetup();
	 String response = fun.MercuryLogin();
	
	 response = TestAction.getLoginAction().getTestResult(test_case);
	 Assert.assertEquals(response, "Pass", response);
	 }
	
	 // Hotspot Wifi functionality has bug so ignoring 7th Testcase
	  @Test(priority = 7)
	  public void
	 
	 webUI_Mercury_Home_Quick_Set_up_Wizards_Configure_your_WiFi_connection_Change_SSID_to_Hotspot_SSID_1652()
	  {
	 
	  String test_case = new Object() {
	  }.getClass().getEnclosingMethod().getName();
	  log.info("Test Case: " + test_case);
	  log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");

	  //fun.Start_AFtr_Reboot();
	  //fun.MercuryInitialSetup();
	  String response = fun.MercuryLogin();
	 
	  response = TestAction.getLoginAction().getTestResult(test_case);
	  Assert.assertEquals(response, "Pass", response);
	  }
	

	@Test(priority = 8)
	public void webUI_Mercury_Home_Quick_Set_up_Wizards_Configure_your_WiFi_connection_Change_security_key_valid_value_1653()


			throws InterruptedException {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");

		
		
		Driver.openModel();
		fun.MercuryLogin();
		
		

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}

	//PASSED
	@Test(priority = 9)
	public void webUI_Mercury_Home_Quick_Set_up_Wizards_Configure_your_WiFi_connection_Change_security_key_invalid_value_1654()

			throws InterruptedException {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");

		fun.MercuryLogin();
		

		

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}

	// Guest Wifi Network functionality has bug so ignoring 10th Testcase
	@Test(priority = 10)
	public void webUI_Mercury_Home_Quick_Set_up_Wizards_Configure_your_WiFi_connection_Change_security_key_duplicate_value_1655() {


		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");

		String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 11)//WiFi Profiles
	public void

		webUI_Mercury_Home_Quick_Set_up_Wizards_Configure_your_WiFi_connection_Change_SSID_and_security_key_1656()
					throws InterruptedException {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");

		String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}

	

	@Test(priority = 12)

	public void

		webUI_Mercury_Home_Quick_Set_up_Wizards_Network_diagnostic_tool_1657() throws InterruptedException {




		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");

		String response = fun.MercuryLogin();
		

		response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}

	//PASSED
	@Test(priority = 13)
	public void webUI_Mercury_Home_Quick_Set_up_Wizards_Modify_your_guest_network_check_default_status_1658()



			throws InterruptedException {


		try {
			fun.ReloadAndReboot();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Driver.closeDriver();
		try {
			Thread.sleep(360 * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Driver.openModel();
		fun.MercuryInitialSetup();
		Driver.closeDriver();
		Driver.openModel();
		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");

		// fun.Start_AFtr_Reboot();

		String response = fun.MercuryLogin();

		response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 14)
	public void webUI_Mercury_Home_Quick_Set_up_Wizards_Modify_your_guest_network_enable_1659(

)
			throws InterruptedException {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");

		fun.MercuryLogin();
		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}

	
	@Test(priority = 15)
	public void webUI_Mercury_Home_Quick_Set_up_Wizards_Modify_your_guest_network_enable_Change_SSID_valid_value_1660(
)
			throws InterruptedException {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");

		fun.ReloadAndReboot();
		Thread.sleep(360 * 1000);
		fun.MercuryInitialSetup();
		

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}

	//reboot reqd
	@Test(priority = 16)
	public void webUI_Mercury_Home_Quick_Set_up_Wizards_Modify_your_guest_network_enable_Change_SSID_invalid_value_1661()



			throws InterruptedException {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");

		

		fun.MercuryLogin();
		
		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}

	//PASSED
	@Test(priority = 17)
	public void webUI_Mercury_Home_Quick_Set_up_Wizards_Modify_your_guest_network_enable_Change_SSID_too_long_1662()throws InterruptedException {


		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");

		try {
			fun.ReloadAndReboot();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Driver.closeDriver();
		try {
			Thread.sleep(360 * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Driver.openModel();
		fun.MercuryInitialSetup();
		
		String response = TestAction.getLoginAction().getTestResult(test_case);

		if (response.equals("ssid error element not found"))
			response = TestAction.getLoginAction().getTestResult("QuickSetUpWizards_1662_1");
		Assert.assertEquals(response, "Pass", response);
	}

	
	 
	 // Its a bug so its been skipped
	  @Test(priority = 18)
	  public void
	 
	 webUI_Mercury_Home_Quick_Set_up_Wizards_Modify_your_guest_network_enable_Change_SSID_to_Primary_SSID_1663()

	  {
	 
	  String test_case = new Object() {
	  }.getClass().getEnclosingMethod().getName();
	  log.info("Test Case: " + test_case);
	  log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");

	  fun.MercuryLogin();
	  String response = TestAction.getLoginAction().getTestResult(test_case);
	  Assert.assertEquals(response, "Pass", response);
	  }
	
	 // Hotspot Wifi functionality has bug so ignoring 19th Testcase
	  @Test(priority = 19)
	  public void
	 
	 webUI_Mercury_Home_Quick_Set_up_Wizards_Configure_your_WiFi_connection_Change_SSID_to_Hotspot_SSID_1664()
	  throws InterruptedException {
	 
	  String test_case = new Object() {
	  }.getClass().getEnclosingMethod().getName();
	  log.info("Test Case: " + test_case);
	  log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");

	 String response = fun.MercuryLogin();
	 
	  response = TestAction.getLoginAction().getTestResult(test_case);
	  Assert.assertEquals(response, "Pass", response);
	  }
	
	@Test(priority = 20)
	public void

		webUI_Mercury_Home_Quick_Set_up_Wizards_Modify_your_guest_network_enable_Change_security_key_valid_value_1665()


					throws InterruptedException {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");

fun.ReloadAndReboot();
		
		Driver.closeDriver();
		Thread.sleep(360 * 1000);
		Driver.openModel();
		fun.MercuryInitialSetup();
		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}

	//PASSED
	@Test(priority = 21)
	public void webUI_Mercury_Home_Quick_Set_up_Wizards_Modify_your_guest_network_enable_Change_security_key_invalid_value_1666()


			throws InterruptedException {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");

		try {
			fun.ReloadAndReboot();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Driver.closeDriver();
		try {
			Thread.sleep(360 * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Driver.openModel();
		fun.MercuryInitialSetup();
		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}

	
	@Test(priority = 22)
	public void webUI_Mercury_Home_Quick_Set_up_Wizards_Modify_your_guest_network_enable_Change_security_key_duplicate_value_1667()


			throws InterruptedException {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");

		try {
			fun.ReloadAndReboot();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Driver.closeDriver();
		try {
			Thread.sleep(360 * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Driver.openModel();
		fun.MercuryInitialSetup();
		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}

	
	@Test(priority = 23)
	public void webUI_Mercury_Home_Quick_Set_up_Wizards_Modify_your_guest_network_enable_Change_SSID_and_Security_key_1668()


			throws InterruptedException {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");

		try {
			fun.ReloadAndReboot();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Driver.closeDriver();
		try {
			Thread.sleep(360 * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Driver.openModel();
		fun.MercuryInitialSetup();

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}

	
	@Test(priority = 24)
	public void webUI_Mercury_Home_Quick_Set_up_Wizards_Modify_your_guest_network_enable_Always_on_1669()



			throws InterruptedException {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");

		try {
			fun.ReloadAndReboot();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Driver.closeDriver();
		try {
			Thread.sleep(360 * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Driver.openModel();
		fun.MercuryInitialSetup();
		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
		try {
			fun.ReloadAndReboot();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Driver.closeDriver();
		try {
			Thread.sleep(360 * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Driver.openModel();
	}
	//
	////
	 @Test(priority = 25)
	 public void
	 webUI_Mercury_Home_Quick_Set_up_Wizards_Modify_your_guest_network_enable_Always_until_1670()

	 throws InterruptedException
	 {
	
	 String test_case = new Object()
	 {}.getClass().getEnclosingMethod().getName();
	 log.info("Test Case: "+ test_case);
	 log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");

	
	 fun.Start_AFtr_Reboot();
	
	
	 String response = TestAction.getLoginAction().getTestResult(test_case);
	
	 if (response.equals("Pass"))
	 {
	
	 response =
	 TestAction.getLoginAction().getTestResult("QuickSetUpWizards_1670_1");
	
	 if (response.equals("Profile not connected"))
	 response = "Pass";
	 else
	 response = "Fail";
	 }
	
	 Assert.assertEquals(response, "Pass", response);
	 }
	
	// // Telephone not connected so skipping these testcases
	  @Test(priority = 26)
	  public void webUI_Mercury_Home_Status_overview_1671() {



	 
	  String test_case = new Object() {
	  }.getClass().getEnclosingMethod().getName();
	  log.info("Test Case: " + test_case);
		log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");

	  //fun.Start_AFtr_Reboot();
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
	}

}
