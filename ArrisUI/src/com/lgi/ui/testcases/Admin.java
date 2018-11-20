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

public class Admin 
{

	Logger log = null;
	CommonFunctionality fun = new CommonFunctionality();
	String response = null;
	

	@BeforeClass
	public void testInitBrowser() {



		
		log = Driver.getLogger();
		log.info("+++++++++++++++++ Gateway Model: " + runAut.modem + " - Admin old Page +++++++++++++++++");
	}

	@BeforeMethod
	public void testFactoryReset()




	{

		log.info("+++++++++++++++++ START TEST +++++++++++++++++");

		// fun.RebootGateWay();
		Driver.openModel();
		// response = fun.MercuryInitialSetup();
		// response = fun.MercuryLogin();

	}
	 // reload required if password changed
	 //PASSED
	 @Test(priority = 1)
	 public void webUI_Mercury_Admin_Change_password_2264()







	 {   try {
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
		
		 fun.MercuryLogin();
		 response = TestAction.getLoginAction().getTestResult(test_case);
		
		 Assert.assertEquals(response, "Pass", response);
	 }

	 // reload reboot required
     //	PASSED
	 @Test(priority = 2)
	 public void
	 webUI_Mercury_Admin_Change_password_Invalid_current_password_2265()


 
	 {
		 
		 String test_case = new Object() {
		 }.getClass().getEnclosingMethod().getName();
		 log.info("Test Case: " + test_case);
		 fun.MercuryLoginNewPassword();
		 
		 response = TestAction.getLoginAction().getTestResult(test_case);
		 Assert.assertEquals(response, "Pass", response);
	 }

	// no reload reboot
	 //PASSED
	 @Test(priority = 3)
	 public void webUI_Mercury_Admin_Change_password_Invalid_new_password_2266() 





	 {
	
		 String test_case = new Object() {
		 }.getClass().getEnclosingMethod().getName();
		 log.info("Test Case: " + test_case);
		
		 fun.MercuryLoginNewPassword();
		 response = TestAction.getLoginAction().getTestResult(test_case);
		 
		 Assert.assertEquals(response, "Pass", response);
		 	Driver.closeDriver();
		 	Driver.openModel();
			try {
				fun.ReloadAndRebootLogInWithChangedPassword();
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
	 }
    //reload reboot required
	 @Test(priority = 4)
	 public void webUI_Mercury_Admin_Backup_configuration_settings_2267() {







	
	 String test_case = new Object() {
	 }.getClass().getEnclosingMethod().getName();
	 log.info("Test Case: " + test_case);
	
	 fun.MercuryLogin();
	
	 response = TestAction.getLoginAction().getTestResult(test_case);
	 Assert.assertEquals(response, "Pass", response);
	 }

	@Test(priority = 5)
	public void webUI_Mercury_Admin_Reload_configuration_settings_2268() {








		String test_case = new Object() {

		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		
	
		fun.MercuryLogin();
		response = TestAction.getLoginAction().getTestResult(test_case);
		if(response=="Pass")
			response = fun.MercuryLogin();
		Assert.assertEquals(response, "Pass", response);
	}
	
	 @Test(priority = 6)
	 public void webUI_Mercury_Admin_Reload_configuration_settings_invalid_file_2269() 




	 {
		
		 String test_case = new Object() {
		 }.getClass().getEnclosingMethod().getName();
		 log.info("Test Case: " + test_case);
//		 fun.RebootGateWay();
//		 Driver.openModel();
//		 response = fun.MercuryInitialSetup();
		  response = fun.MercuryLogin();
		
		 if (response.equals("Pass")) {
		
		 response = TestAction.getLoginAction().getTestResult(test_case);
		 }
		
		 Assert.assertEquals(response, "Pass", response);
	 }
	
	// no reload reboot
	 //Passed
	 @Test(priority = 7)
	 public void webUI_Mercury_Admin_Restore_to_factory_defaults_2270() 

	 {
		 	
		 String test_case = new Object() {
		 }.getClass().getEnclosingMethod().getName();
		 log.info("Test Case: " + test_case);
		 fun.MercuryLogin();
		 response = TestAction.getLoginAction().getTestResult(test_case);
	
	 Assert.assertEquals(response, "Pass", response);
	 }

     //	 PASSED
	 @Test(priority = 8)
	 public void webUI_Mercury_Admin_Restore_to_factory_defaults_Cancel_2271() {



	
	 String test_case = new Object() {
	 }.getClass().getEnclosingMethod().getName();
	 log.info("Test Case: " + test_case);
	 fun.MercuryInitialSetup();
	 Driver.closeDriver();
	 Driver.openModel();
	 fun.MercuryLogin();
	
	 response = TestAction.getLoginAction().getTestResult(test_case);
	
	 Assert.assertEquals(response, "Pass", response);
	 }
	
	 //No Reload and reboot required
	 //FAILED
	 @Test(priority = 9)
	 public void webUI_Mercury_Admin_Restart_Wireless_Gateway_2272() {



	
	 String test_case = new Object() {
	 }.getClass().getEnclosingMethod().getName();
	 log.info("Test Case: " + test_case);
	 fun.MercuryLogin();
	
	 response = TestAction.getLoginAction().getTestResult(test_case);
	
	 Assert.assertEquals(response, "Pass", response);
	 


	 
	 }
	
	 //PASSED 
	 @Test(priority = 10)
	 public void webUI_Mercury_Admin_Remote_access_Default_2273() {






	
	 String test_case = new Object() {

	 }.getClass().getEnclosingMethod().getName();
	 log.info("Test Case: " + test_case);
	 fun.MercuryLogin();
	
	 response = TestAction.getLoginAction().getTestResult(test_case);
	
	 Assert.assertEquals(response, "Pass", response);
	 }
	 //error      
	 @Test(priority = 11)
	 public void webUI_Mercury_Admin_Remote_access_Enabled_2274() throws InterruptedException 




	 {
	
		 String test_case = new Object() {
		 }.getClass().getEnclosingMethod().getName();
		 log.info("Test Case: " + test_case);
		 //fun.ReloadAndReboot();
		 //Driver.openModel();
		 //esponse = fun.MercuryInitialSetup();
		 response=fun.MercuryLogin();
		 if (response.equals("Pass"))
		 {
			 response = TestAction.getLoginAction().getTestResult(test_case);
		 }
		
		 fun.webUI_Mercury_Admin_Remote_access_Revertback();
		 Assert.assertEquals(response, "Pass", response);
	 }
	//error
     @Test(priority = 12)
	 public void webUI_Mercury_Admin_Remote_access_Enabled_Change_port_2275() 


	 {
	
		 String test_case = new Object() {
		 }.getClass().getEnclosingMethod().getName();
		 log.info("Test Case: " + test_case);
		 fun.MercuryLogin();
		 response = TestAction.getLoginAction().getTestResult(test_case);
		 
	
		 fun.webUI_Mercury_Admin_Remote_access_Revertback();
		 Assert.assertEquals(response, "Pass", response);
	 }
	 
	
	 @Test(priority = 13)
	 public void webUI_Mercury_Admin_Remote_access_Enabled_Invalid_port_2276() {


	
	 String test_case = new Object() {
	 }.getClass().getEnclosingMethod().getName();
	 log.info("Test Case: " + test_case);

	 fun.MercuryLogin();
	
	 
     response = TestAction.getLoginAction().getTestResult(test_case);
	
	 fun.webUI_Mercury_Admin_Remote_access_Revertback();
	 Assert.assertEquals(response, "Pass", response);
	 }
	
	
	 // no reload reboot
	 //FAILED
	 @Test(priority = 14)
	 public void webUI_Mercury_Admin_Wireless_Gateway_device_information_2277() {




	
	 String test_case = new Object() {
	 }.getClass().getEnclosingMethod().getName();
	
	 fun.MercuryLogin();
	
	 response = TestAction.getLoginAction().getTestResult(test_case);
	
	
	 Assert.assertEquals(response, "Pass", response);
	 }

	 @Test(priority = 15)
	 public void webUI_Mercury_Admin_WAN_IP_settings_IPv4RG_mode_2279()


 
	 {
	
	 String test_case = new Object() {
	 }.getClass().getEnclosingMethod().getName();
	 log.info("Test Case: " + test_case);
	 
	 
	 fun.MercuryLogin();
	
	 response = TestAction.getLoginAction().getTestResult(test_case);
	 
	
	 Assert.assertEquals(response, "Pass", response);
	 }

	@AfterMethod
	public void testCloseBrowser() {


		try 
		{
			response = "";
			Driver.closeDriver();
			Thread.sleep(1000 * 5);
			System.out.println("INSIDE CLOSE BROWSER");
		} 
		
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			log.info("Messsage: Thread interrupted exception");
		}
		log.info("+++++++++++++++++ END TEST +++++++++++++++++\n");
		// driver.close();
	}
}
