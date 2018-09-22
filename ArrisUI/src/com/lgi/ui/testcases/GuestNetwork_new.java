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

public class GuestNetwork_new {

	Logger log = null;

	CommonFunctionality fun = new CommonFunctionality();
	String response = null;

	@BeforeClass
	public void testInitBrowser() {

		log = Driver.getLogger();
		log.info("+++++++++++++++++ Gateway Model: " + runAut.modem + " - GuestNetwork (New Test Plan) +++++++++++++++++");
	}

	@BeforeMethod
	public void testFactoryReset() throws InterruptedException {


		log.info("+++++++++++++++++ START TEST +++++++++++++++++");

		Driver.openModel();
//		fun.Start_AFtr_Reboot();
//
//		response = fun.MercuryInitialSetup();
		
	}

@Test(priority = 1)
		  public void Mercury_FA05_Diagnostic_Wizard_51a_Enable_Guest_Network_Step_1_Content_6100() {


	
	
              String test_case = new Object() {
              }.getClass().getEnclosingMethod().getName();
              log.info("Test Case: " + test_case);
              //fun.factoryReset();
      	      
              fun.MercuryLogin();
      	    String response = TestAction.getLoginAction().getTestResult(test_case);

              Assert.assertEquals(response, "Pass", response);

		  }
		  
		  
		  
		  @Test(priority = 2)
		  public void Mercury_FA05_Diagnostic_Wizard_51a_Enable_Guest_Network_Step_1_Functionality_Enable_Guest_Network_Check_Box_6101() {

              String test_case = new Object() {
              }.getClass().getEnclosingMethod().getName();
              log.info("Test Case: " + test_case);

              String response = fun.MercuryLogin();

              response = TestAction.getLoginAction().getTestResult(test_case);

              Assert.assertEquals(response, "Pass", response);

		  }
		  
		  @Test(priority = 3)
		  public void Mercury_FA05_Diagnostic_Wizard_51a_Enable_Guest_Network_Step_1_Functionality_Enable_Guest_Network_Next_Button_6102() {
              String test_case = new Object() {
              }.getClass().getEnclosingMethod().getName();
              log.info("Test Case: " + test_case);

              String response = fun.MercuryLogin();

              response = TestAction.getLoginAction().getTestResult(test_case);

              Assert.assertEquals(response, "Pass", response);

		  }
		  
		  @Test(priority = 4)
		  public void Mercury_FA05_Diagnostic_Wizard_51b_Edit_or_Disable_Guest_Network_Step_1_Content_6103() {
              String test_case = new Object() {
              }.getClass().getEnclosingMethod().getName();
              log.info("Test Case: " + test_case);

              String response = fun.MercuryLogin();

              response = TestAction.getLoginAction().getTestResult(test_case);

              Assert.assertEquals(response, "Pass", response);

		  }
		  
		  @Test(priority = 5)
		  public void Mercury_FA05_Diagnostic_Wizard_51b_Edit_or_Disable_Guest_Network_Step_1_Disable_Guest_Network_Check_box_6104() {
              String test_case = new Object() {
              }.getClass().getEnclosingMethod().getName();
              log.info("Test Case: " + test_case);

              String response = fun.MercuryLogin();

              response = TestAction.getLoginAction().getTestResult(test_case);

              Assert.assertEquals(response, "Pass", response);

		  }
		  
		  @Test(priority = 6)
		  public void Mercury_FA05_Diagnostic_Wizard_51b_Edit_or_Disable_Guest_Network_Step_1_Edit_Current_Settings_Check_box_6105() {
              String test_case = new Object() {
              }.getClass().getEnclosingMethod().getName();
              log.info("Test Case: " + test_case);

              String response = fun.MercuryLogin();

              response = TestAction.getLoginAction().getTestResult(test_case);

              Assert.assertEquals(response, "Pass", response);

		  }
		  
		  @Test(priority = 13)
		  public void Mercury_FA05_Diagnostic_Wizard_52_Guest_Network_Name_and_Password_Step_2_Content_6106() throws InterruptedException {

			  
			  fun.disableGuestNetwork();
			  
              String test_case = new Object() {
              }.getClass().getEnclosingMethod().getName();
              log.info("Test Case: " + test_case);

              String response = fun.MercuryLogin();

              response = TestAction.getLoginAction().getTestResult(test_case);

              Assert.assertEquals(response, "Pass", response);

		  }
		  @Test(priority = 7)
		  public void Mercury_FA05_Diagnostic_Wizard_52_Guest_Network_Name_and_Password_Step_2_Functionality_Guest_WiFi_Network_Name_Input_box_6107() throws InterruptedException {

			  fun.disableGuestNetwork();
              String test_case = new Object() {
              }.getClass().getEnclosingMethod().getName();
              log.info("Test Case: " + test_case);

              String response = fun.MercuryLogin();

              response = TestAction.getLoginAction().getTestResult(test_case);

              Assert.assertEquals(response, "Pass", response);

		  }

		@Test(priority = 8)
		  public void Mercury_FA05_Diagnostic_Wizard_52_Guest_Network_Name_and_Password_Step_2_Functionality_WiFi_Network_Password_Input_box_6109() throws InterruptedException {
			 fun.disableGuestNetwork();
              String test_case = new Object() {
              }.getClass().getEnclosingMethod().getName();
              log.info("Test Case: " + test_case);

              String response = fun.MercuryLogin();

              response = TestAction.getLoginAction().getTestResult(test_case);

              Assert.assertEquals(response, "Pass", response);

		  }		
		@Test(priority = 8)
		  public void LGI_webUI_Mercury_FA05_Diagnostic_Wizard_5_2_Guest_Network_Name_and_Password_Step_2_Functionality_Enter_new_Password_Information_Icon_6111() throws InterruptedException {
			 fun.disableGuestNetwork();
            String test_case = new Object() {
            }.getClass().getEnclosingMethod().getName();
            log.info("Test Case: " + test_case);

            String response = fun.MercuryLogin();

            response = TestAction.getLoginAction().getTestResult(test_case);

            Assert.assertEquals(response, "Pass", response);

		  }
		@Test(priority = 9)
		  public void Mercury_FA05_Diagnostic_Wizard_52_Guest_Network_Name_and_Password_Step_2_Functionality_Back_Button_6112() throws InterruptedException {
			fun.disableGuestNetwork();
              String test_case = new Object() {
              }.getClass().getEnclosingMethod().getName();
              log.info("Test Case: " + test_case);

              String response = fun.MercuryLogin();

              response = TestAction.getLoginAction().getTestResult(test_case);

              Assert.assertEquals(response, "Pass", response);

		  }
		  
		  @Test(priority = 10)
		  public void Mercury_FA05_Diagnostic_Wizard_52_Guest_Network_Name_and_Password_Step_2_Functionality_Next_Network_Name_error_icon_and_text_6113() throws InterruptedException {
			  fun.disableGuestNetwork();
              String test_case = new Object() {
              }.getClass().getEnclosingMethod().getName();
              log.info("Test Case: " + test_case);

              String response = fun.MercuryLogin();

              response = TestAction.getLoginAction().getTestResult(test_case);

              Assert.assertEquals(response, "Pass", response);

		  }
		  @Test(priority = 11)
		  public void Mercury_FA05_Diagnostic_Wizard_52_Guest_Network_Name_and_Password_Step_2_Functionality_Next_Duplicate_password_as_Primary_error_icon_and_text_6114() throws InterruptedException {
			  fun.disableGuestNetwork();
              String test_case = new Object() {
              }.getClass().getEnclosingMethod().getName();
              log.info("Test Case: " + test_case);

              String response = fun.MercuryLogin();

              response = TestAction.getLoginAction().getTestResult(test_case);

              Assert.assertEquals(response, "Pass", response);

		  }
		  
		  
		  @Test(priority = 12)
		  public void Mercury_FA05_Diagnostic_Wizard_53_Guest_Network_Options_Step_3_Content_6115() {

			  //fun.disableGuestNetwork();
              String test_case = new Object() {
              }.getClass().getEnclosingMethod().getName();
              log.info("Test Case: " + test_case);

              String response = fun.MercuryLogin();

              response = TestAction.getLoginAction().getTestResult(test_case);

              Assert.assertEquals(response, "Pass", response);

		  }
		  
		
		  
		  @Test(priority = 14)
		  public void Mercury_FA05_Diagnostic_Wizard_53_Guest_Network_Options_Step_3_Functionality_Always_On_6116() {
              String test_case = new Object() {
              }.getClass().getEnclosingMethod().getName();
              log.info("Test Case: " + test_case);

              String response = fun.MercuryLogin();

              response = TestAction.getLoginAction().getTestResult(test_case);

              Assert.assertEquals(response, "Pass", response);

		  }
		  @Test(priority = 14)
		  public void LGI_webUI_Mercury_FA05_Diagnostic_Wizard_5_3_Guest_Network_Options_Step_3_Functionality_Always_On_Information_Icon_6117() {
              String test_case = new Object() {
              }.getClass().getEnclosingMethod().getName();
              log.info("Test Case: " + test_case);

              String response = fun.MercuryLogin();

              response = TestAction.getLoginAction().getTestResult(test_case);

              Assert.assertEquals(response, "Pass", response);

		  }
		  @Test(priority = 15)
		  public void Mercury_FA05_Diagnostic_Wizard_53_Guest_Network_Options_Step_3_Functionality_Available_Until_6118() {
              String test_case = new Object() {
              }.getClass().getEnclosingMethod().getName();
              log.info("Test Case: " + test_case);

              String response = fun.MercuryLogin();

              response = TestAction.getLoginAction().getTestResult(test_case);

              Assert.assertEquals(response, "Pass", response);

		  }
//		  // BLOCKED
//		  @Test(priority = 20)
//		  public void Mercury_FA05_Diagnostic_Wizard_53_Guest_Network_Options_Step_3_Functionality_Date_Input_Box_6120() {
//			  fun.disableGuestNetwork();
//              String test_case = new Object() {
//              }.getClass().getEnclosingMethod().getName();
//              log.info("Test Case: " + test_case);
//
//              String response = fun.MercuryLogin();
//
//              response = TestAction.getLoginAction().getTestResult(test_case);
//
//              Assert.assertEquals(response, "Pass", response);
//
//		  }
//	      //BLOCKED		  
//		  @Test(priority = 20)
//		  public void Mercury_FA05_Diagnostic_Wizard_53_Guest_Network_Options_Step_3_Functionality_Date_Date_Picker_6121() {
//			  fun.disableGuestNetwork();
//              String test_case = new Object() {
//              }.getClass().getEnclosingMethod().getName();
//              log.info("Test Case: " + test_case);
//
//              String response = fun.MercuryLogin();
//
//              response = TestAction.getLoginAction().getTestResult(test_case);
//
//              Assert.assertEquals(response, "Pass", response);
//
//		  }
//		  //BLOCKED	
//		  @Test(priority = 16)
//		  public void Mercury_FA05_Diagnostic_Wizard_53_Guest_Network_Options_SteLGI_webUI_Mercury_FA05_Diagnostic_Wizard_5_3_Guest_Network_Options_Step_3_Functionality_Time_Time_Picker_6123p_3_Functionality_Back_Button_6124() {
//              String test_case = new Object() {
//              }.getClass().getEnclosingMethod().getName();
//              log.info("Test Case: " + test_case);
//
//              String response = fun.MercuryLogin();
//
//              response = TestAction.getLoginAction().getTestResult(test_case);
//
//              Assert.assertEquals(response, "Pass", response);
//
//		  }
		  @Test(priority = 16)
		  public void Mercury_FA05_Diagnostic_Wizard_53_Guest_Network_Options_Step_3_Functionality_Back_Button_6124() {
              String test_case = new Object() {
              }.getClass().getEnclosingMethod().getName();
              log.info("Test Case: " + test_case);

              String response = fun.MercuryLogin();

              response = TestAction.getLoginAction().getTestResult(test_case);

              Assert.assertEquals(response, "Pass", response);

		  }
		  
		  @Test(priority = 17)
		  public void Mercury_FA05_Diagnostic_Wizard_53_Guest_Network_Options_Step_3_Functionality_Finish_Button_6125() {
              String test_case = new Object() {
              }.getClass().getEnclosingMethod().getName();
              log.info("Test Case: " + test_case);

              String response = fun.MercuryLogin();

              response = TestAction.getLoginAction().getTestResult(test_case);

              Assert.assertEquals(response, "Pass", response);

		  }
		  
		  @Test(priority = 18)
		  public void Mercury_FA05_Diagnostic_Wizard_53_Guest_Network_Options_Step_4_Content_6126() throws InterruptedException {
			  fun.disableGuestNetwork();
              String test_case = new Object() {
              }.getClass().getEnclosingMethod().getName();
              log.info("Test Case: " + test_case);

              String response = fun.MercuryLogin();

              response = TestAction.getLoginAction().getTestResult(test_case);

              Assert.assertEquals(response, "Pass", response);

		  }
		  
		  @Test(priority = 19)
		  public void Mercury_FA05_Diagnostic_Wizard_53_Guest_Network_Options_Step_4_Functionality_All_good_Icon_6127() throws InterruptedException {
			  fun.disableGuestNetwork();
			  String test_case = new Object() {
              }.getClass().getEnclosingMethod().getName();
              log.info("Test Case: " + test_case);

              String response = fun.MercuryLogin();

              response = TestAction.getLoginAction().getTestResult(test_case);

              Assert.assertEquals(response, "Pass", response);

		  }
		  
		 

		  
			@AfterMethod
			public void testCloseBrowser() {
			
				try {
					response = "";
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
