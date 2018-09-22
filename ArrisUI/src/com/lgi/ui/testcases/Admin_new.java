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
import com.lgi.ui.automationJar.ResetPassword;
public class Admin_new 
{

	Logger log = null;
	CommonFunctionality fun = new CommonFunctionality();
	ResetPassword reset=new ResetPassword();
	String response = null;
	

	@BeforeClass
	public void testInitBrowser() {



		
		log = Driver.getLogger();
		log.info("+++++++++++++++++ Gateway Model: " + runAut.modem + " - Admin Page(New Test Plan) +++++++++++++++++");
	}

	@BeforeMethod
	public void testFactoryReset()





	{

		log.info("+++++++++++++++++ START TEST +++++++++++++++++");

		// fun.RebootGateWay();
//		Driver.openModel();
		// response = fun.MercuryInitialSetup();
		// response = fun.MercuryLogin();

	}

	
	 
//	 @Test(priority = 1)
//	 public void LGI_webUI_Mercury_FA08_Admin_8_1_Admin_Change_password_Functionality_Re_Enter_a_new_password_Error_icon_and_Text_Virgin_Media_Only_5902()
//	 {
//	
//	 String test_case = new Object() {
//	 }.getClass().getEnclosingMethod().getName();
//	 log.info("Test Case: " + test_case);
//	 
//	 
//	 fun.MercuryLogin();
//	
//	 response = TestAction.getLoginAction().getTestResult(test_case);
//	 
//	
//	 Assert.assertEquals(response, "Pass", response);
//	 }
//	 
//	 @Test(priority = 2)
//	 public void LGI_webUI_Mercury_FA08_Admin_8_1_Admin_Reload_and_Reboot_Functionality_Select_File_5905()
//
//
//
// 
//	 {
//	
//	 String test_case = new Object() {
//	 }.getClass().getEnclosingMethod().getName();
//	 log.info("Test Case: " + test_case);
//	 
//	 
//	 fun.MercuryLogin();
//	
//	 response = TestAction.getLoginAction().getTestResult(test_case);
//	 
//	
//	 Assert.assertEquals(response, "Pass", response);
//	 }
//	 
//	 
//	 @Test(priority = 3)
//	 public void LGI_webUI_Mercury_FA08_Admin_8_1_Admin_Reload_and_Reboot_Functionality_Reload_Error_icon_and_text_Please_select_a_file_5908()
//
//
// 
//	 {
//	
//	 String test_case = new Object() {
//	 }.getClass().getEnclosingMethod().getName();
//	 log.info("Test Case: " + test_case);
//	 
//	 
//	 fun.MercuryLogin();
//	
//	 response = TestAction.getLoginAction().getTestResult(test_case);
//	 
//	
//	 Assert.assertEquals(response, "Pass", response);
//	 }
//
//	 @Test(priority = 4)
//	 public void LGI_webUI_Mercury_FA08_Admin_8_2_Admin_Reload_and_Reboot_Restore_factory_defaults_popup_window_Functionality_Cancel_Process_button_5914()
//
//
// 
//	 {
//	
//	 String test_case = new Object() {
//	 }.getClass().getEnclosingMethod().getName();
//	 log.info("Test Case: " + test_case);
//	 
//	 
//	 fun.MercuryLogin();
//	
//	 response = TestAction.getLoginAction().getTestResult(test_case);
//	 
//	
//	 Assert.assertEquals(response, "Pass", response);
//	 }
//	 
//	 
//		 
//	 
//	 @Test(priority = 5)
//	 public void LGI_webUI_Mercury_FA08_Admin_8_1_Admin_Remote_access_Functionality_Disabled_5922()
//
//
// 
//	 {
//	
//	 String test_case = new Object() {
//	 }.getClass().getEnclosingMethod().getName();
//	 log.info("Test Case: " + test_case);
//	 
//	 
//	 fun.MercuryLogin();
//	
//	 response = TestAction.getLoginAction().getTestResult(test_case);
//	 
//	
//	 Assert.assertEquals(response, "Pass", response);
//	 }
//	 
//	 
//	 @Test(priority = 6)
//	 public void LGI_webUI_Mercury_FA08_Admin_8_1_Admin_Remote_access_Functionality_Port_Input_Box_5923()
//
//
// 
//	 {
//	
//	 String test_case = new Object() {
//	 }.getClass().getEnclosingMethod().getName();
//	 log.info("Test Case: " + test_case);
//	 
//	 
//	 fun.MercuryLogin();
//	
//	 response = TestAction.getLoginAction().getTestResult(test_case);
//	 
//	
//	 Assert.assertEquals(response, "Pass", response);
//	 }
//	 
//	 
//	 @Test(priority = 7)
//	 public void LGI_webUI_Mercury_FA08_Admin_8_1_Admin_Remote_access_Functionality_Port_Error_Icon_and_Text_invalid_port_5924()
//
//
// 
//	 {
//	
//	 String test_case = new Object() {
//	 }.getClass().getEnclosingMethod().getName();
//	 log.info("Test Case: " + test_case);
//	 
//	 
//	 fun.MercuryLogin();
//	
//	 response = TestAction.getLoginAction().getTestResult(test_case);
//	 
//	
//	 Assert.assertEquals(response, "Pass", response);
//	 }
//	 
//	 
//	 @Test(priority = 8)
//	 public void LGI_webUI_Mercury_FA08_Admin_8_1_Admin_Remote_access_Functionality_Apply_changes_5926()
//
//
// 
//	 {
//	
//	 String test_case = new Object() {
//	 }.getClass().getEnclosingMethod().getName();
//	 log.info("Test Case: " + test_case);
//	 
//	 
//	 fun.MercuryLogin();
//	
//	 response = TestAction.getLoginAction().getTestResult(test_case);
//	 
//	
//	 Assert.assertEquals(response, "Pass", response);
//	 }
//	 
//	 
//	 @Test(priority = 9)
//	 public void LGI_webUI_Mercury_FA08_Admin_8_1_Admin_Remote_access_Functionality_Port_Error_Icon_and_Text_cannot_select_port_5925()
//
//
// 
//	 {
//	
//	 String test_case = new Object() {
//	 }.getClass().getEnclosingMethod().getName();
//	 log.info("Test Case: " + test_case);
//	 
//	 
//	 fun.MercuryLogin();
//	
//	 response = TestAction.getLoginAction().getTestResult(test_case);
//	 
//	
//	 Assert.assertEquals(response, "Pass", response);
//	 }
//	 
//	 
//	 @Test(priority = 10)
//	 public void LGI_webUI_Mercury_FA08_Admin_8_1_Admin_Reload_and_Reboot_Functionality_Reload_Button_5906()
//
//
// 
//	 {
//	
//	 String test_case = new Object() {
//	 }.getClass().getEnclosingMethod().getName();
//	 log.info("Test Case: " + test_case);
//	 
//	 
//	 fun.MercuryLogin();
//	
//	 response = TestAction.getLoginAction().getTestResult(test_case);
//	 
//	
//	 Assert.assertEquals(response, "Pass", response);
//	 }
//	 
//	 
//	 @Test(priority = 11)
//	 public void LGI_webUI_Mercury_FA08_Admin_8_1_Admin_Change_password_Content_5895()
//
//
// 
//	 {
//	
//	 String test_case = new Object() {
//	 }.getClass().getEnclosingMethod().getName();
//	 log.info("Test Case: " + test_case);
//	 
//	 
//	 fun.MercuryLogin();
//	
//	 response = TestAction.getLoginAction().getTestResult(test_case);
//	 
//	
//	 Assert.assertEquals(response, "Pass", response);
//	 }
//	 
//	 @Test(priority = 12)
//	 public void LGI_webUI_Mercury_FA08_Admin_8_1_Admin_Change_password_Functionality_Current_Password_Input_box_5896()
//
//
// 
//	 {
//	
//	 String test_case = new Object() {
//	 }.getClass().getEnclosingMethod().getName();
//	 log.info("Test Case: " + test_case);
//	 
//	 
//	 fun.MercuryLogin();
//	
//	 response = TestAction.getLoginAction().getTestResult(test_case);
//	 
//	
//	 Assert.assertEquals(response, "Pass", response);
//	 }
//	 
//	 
//	 @Test(priority = 13)
//	 public void LGI_webUI_Mercury_FA08_Admin_8_1_Admin_Change_password_Functionality_Current_Password_Error_icon_and_Text_5897()
//
//
// 
//	 {
//	
//	 String test_case = new Object() {
//	 }.getClass().getEnclosingMethod().getName();
//	 log.info("Test Case: " + test_case);
//	 
//	 
//	 fun.MercuryLogin();
//	
//	 response = TestAction.getLoginAction().getTestResult(test_case);
//	 
//	
//	 Assert.assertEquals(response, "Pass", response);
//	 }
//	 
//	 
//	 @Test(priority = 14)
//	 public void LGI_webUI_Mercury_FA08_Admin_8_1_Admin_Change_password_Functionality_Enter_a_new_password_Input_box_5898()
//
//
// 
//	 {
//	
//	 String test_case = new Object() {
//	 }.getClass().getEnclosingMethod().getName();
//	 log.info("Test Case: " + test_case);
//	 
//	 
//	 fun.MercuryLogin();
//	
//	 response = TestAction.getLoginAction().getTestResult(test_case);
//	 
//	
//	 Assert.assertEquals(response, "Pass", response);
//	 }
//	 
//	 
//	 @Test(priority = 15)
//	 public void LGI_webUI_Mercury_FA08_Admin_8_1_Admin_Change_password_Functionality_Enter_a_new_password_Error_icon_and_Text_Please_change_to_a_new_password_5899()
//
//
// 
//	 {
//	 reset.ResetPasswordLanOrWan("lan");
//	 String test_case = new Object() {
//	 }.getClass().getEnclosingMethod().getName();
//	 log.info("Test Case: " + test_case);
//	 
//	 
//	 fun.MercuryLoginNewPassword();
//	
//	 response = TestAction.getLoginAction().getTestResult(test_case);
//	 
//	 reset.ResetPasswordLanOrWan("FirstTimePassword");
//	 Assert.assertEquals(response, "Pass", response);
//	 }
//	 
//	 @Test(priority = 16)
//	 public void LGI_webUI_Mercury_FA08_Admin_8_1_Admin_Change_password_Functionality_Enter_a_new_password_Error_icon_and_Text_The_password_you_typed_does_not_meet_the_requirements_5900()
//
//
// 
//	 {
//	
//	 String test_case = new Object() {
//	 }.getClass().getEnclosingMethod().getName();
//	 log.info("Test Case: " + test_case);
//	 
//	 
//	 fun.MercuryLogin();
//	
//	 response = TestAction.getLoginAction().getTestResult(test_case);
//	 
//	
//	 Assert.assertEquals(response, "Pass", response);
//	 }
//	 
//	 @Test(priority = 17)
//	 public void LGI_webUI_Mercury_FA08_Admin_8_1_Admin_Change_password_Functionality_Enter_a_new_password_Error_icon_and_Text_Password_can_not_be_blank_5901()
//
//
// 
//	 {
//	
//	 String test_case = new Object() {
//	 }.getClass().getEnclosingMethod().getName();
//	 log.info("Test Case: " + test_case);
//	 
//	 
//	 fun.MercuryLogin();
//	
//	 response = TestAction.getLoginAction().getTestResult(test_case);
//	 
//	
//	 Assert.assertEquals(response, "Pass", response);
//	 }
//	 
//	 @Test(priority = 18)
//	 public void LGI_webUI_Mercury_FA08_Admin_8_2_Admin_Reload_and_Reboot_Content_5903()
//
//
// 
//	 {
//	
//	 String test_case = new Object() {
//	 }.getClass().getEnclosingMethod().getName();
//	 log.info("Test Case: " + test_case);
//	 
//	 
//	 fun.MercuryLogin();
//	
//	 response = TestAction.getLoginAction().getTestResult(test_case);
//	 
//	
//	 Assert.assertEquals(response, "Pass", response);
//	 }
//	 
//	 @Test(priority = 19)
//	 public void LGI_webUI_Mercury_FA08_Admin_8_1_Admin_Reload_and_Reboot_Functionality_Backup_5904()
//
//
// 
//	 {
//	
//	 String test_case = new Object() {
//	 }.getClass().getEnclosingMethod().getName();
//	 log.info("Test Case: " + test_case);
//	 
//	 
//	 fun.MercuryLogin();
//	
//	 response = TestAction.getLoginAction().getTestResult(test_case);
//	 
//	
//	 Assert.assertEquals(response, "Pass", response);
//	 }
//	 
//	 @Test(priority =20)
//	 public void LGI_webUI_Mercury_FA08_Admin_8_1_Admin_Reload_and_Reboot_Functionality_Restore_Default_Button_5910()
//
//
// 
//	 {
//	
//	 String test_case = new Object() {
//	 }.getClass().getEnclosingMethod().getName();
//	 log.info("Test Case: " + test_case);
//	 
//	 
//	 fun.MercuryLogin();
//	
//	 response = TestAction.getLoginAction().getTestResult(test_case);
//	 
//	
//	 Assert.assertEquals(response, "Pass", response);
//	 }
//	 
//	 @Test(priority = 21)
//	 public void LGI_webUI_Mercury_FA08_Admin_8_2_Admin_Reload_and_Reboot_Restart_modem_popup_window_Content_5916()
//
//
// 
//	 {
//	
//	 String test_case = new Object() {
//	 }.getClass().getEnclosingMethod().getName();
//	 log.info("Test Case: " + test_case);
//	 
//	 
//	 fun.MercuryLogin();
//	
//	 response = TestAction.getLoginAction().getTestResult(test_case);
//	 
//	
//	 Assert.assertEquals(response, "Pass", response);
//	 }
//	 
//	 @Test(priority = 22)
//	 public void LGI_webUI_Mercury_FA08_Admin_8_2_Admin_Reload_and_Reboot_Restart_modem_popup_window_Functionality_Close_button_5917()
//
//
// 
//	 {
//	
//	 String test_case = new Object() {
//	 }.getClass().getEnclosingMethod().getName();
//	 log.info("Test Case: " + test_case);
//	 
//	 
//	 fun.MercuryLogin();
//	
//	 response = TestAction.getLoginAction().getTestResult(test_case);
//	 
//	
//	 Assert.assertEquals(response, "Pass", response);
//	 }
//	 
//	 @Test(priority = 23)
//	 public void LGI_webUI_Mercury_FA08_Admin_8_2_Admin_Reload_and_Reboot_Restore_factory_defaults_popup_window_Functionality_Cancel_Process_button_5918()
//
//
//
// 
//	 {
//	
//	 String test_case = new Object() {
//	 }.getClass().getEnclosingMethod().getName();
//	 log.info("Test Case: " + test_case);
//	 
//	 
//	 fun.MercuryLogin();
//	
//	 response = TestAction.getLoginAction().getTestResult(test_case);
//	 
//	
//	 Assert.assertEquals(response, "Pass", response);
//	 }
//	 
//	 
//	 
//	 
//	 
//	 @Test(priority = 24)
//	 public void LGI_webUI_Mercury_FA08_Admin_8_1_Admin_Reload_and_Reboot_Functionality_Reboot_Button_5911()
//	 {
//	
//		 String test_case = new Object() {
//		 }.getClass().getEnclosingMethod().getName();
//		 log.info("Test Case: " + test_case);
//		 
//		 
//		 fun.MercuryLogin();
//		
//		 response = TestAction.getLoginAction().getTestResult(test_case);
//		 
//		
//		 Assert.assertEquals(response, "Pass", response);
//	 }
//	 
//	 
//	 @Test(priority = 25)
//	 public void LGI_webUI_Mercury_FA08_Admin_8_2_Admin_Reload_and_Reboot_Restore_factory_defaults_popup_window_Content_5912()
//
//
//
//
//
// 
//	 {
//	
//		 String test_case = new Object() {
//		 }.getClass().getEnclosingMethod().getName();
//		 log.info("Test Case: " + test_case);
//		 
//		 
//		 fun.MercuryLogin();
//		
//		 response = TestAction.getLoginAction().getTestResult(test_case);
//		 
//		
//		 Assert.assertEquals(response, "Pass", response);
//	 }
//	 
//	 
//	 @Test(priority = 26)
//	 public void LGI_webUI_Mercury_FA08_Admin_8_2_Admin_Reload_and_Reboot_Restore_factory_defaults_popup_window_Functionality_Close_button_5913() throws InterruptedException
//
//	 {
//		 
//		 Thread.sleep(360*1000);
//		 fun.MercuryInitialSetup();
//		 String test_case = new Object() {
//		 }.getClass().getEnclosingMethod().getName();
//		 log.info("Test Case: " + test_case);
//		 
//		 
//		 fun.MercuryLogin();
//		
//		 response = TestAction.getLoginAction().getTestResult(test_case);
//		 
//		
//		 Assert.assertEquals(response, "Pass", response);
//	 }
//	 
	 
	 @Test(priority = 27)
	 public void LGI_webUI_Mercury_FA08_Admin_8_2_Admin_Reload_and_Reboot_Restore_factory_defaults_popup_window_Functionality_Restore_Defaults_button_5915()


 
	 {
	
	 String test_case = new Object() {
	 }.getClass().getEnclosingMethod().getName();
	 log.info("Test Case: " + test_case);
	 
	 fun.ConnectTo24GHzWiFiNetwork();
	 fun.MercuryLogin();
	
	 response = TestAction.getLoginAction().getTestResult(test_case);
	 log.info("Resetting the cable modem after first install");
	 fun.MercuryInitialSetup();
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
