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

public class DiagnosticWizard {

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
	public void testFactoryReset() throws InterruptedException {


		log.info("+++++++++++++++++ START TEST +++++++++++++++++");
		// SOME XML FGILES NEED TO BE PRESENT FOR RUNNING TESTCASES

		Driver.openModel();
	}

 
	
		  @Test(priority = 1)
		  public void FA04_Diagnostic_Wizard_Procedure_41_Diagnostic_Wizard_Step_1_Content_6072() {


			  
              String test_case = new Object() {
              }.getClass().getEnclosingMethod().getName();
              log.info("Test Case: " + test_case);

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
              String response = fun.MercuryLogin();

              response = TestAction.getLoginAction().getTestResult(test_case);

              Assert.assertEquals(response, "Pass", response);

		  }

		  
	  
		  @Test(priority = 2)
		  public void FA04_Diagnostic_Wizard_Procedure_42_Diagnostic_Wizard_Step_2_Error_Handling_Functionality_Number_icon_6099() {
              String test_case = new Object() {
              }.getClass().getEnclosingMethod().getName();
              log.info("Test Case: " + test_case);

              String response = fun.MercuryLogin();

              response = TestAction.getLoginAction().getTestResult(test_case);

              Assert.assertEquals(response, "Pass", response);

		  }

		  @Test(priority = 4)
		  public void Mercury_FA04_Diagnostic_Wizard_Procedure_41_Diagnostic_Wizard_Step_1_Functionality_Cancel_button_6074() {
              String test_case = new Object() {
              }.getClass().getEnclosingMethod().getName();
              log.info("Test Case: " + test_case);

              String response = fun.MercuryLogin();

              response = TestAction.getLoginAction().getTestResult(test_case);

              Assert.assertEquals(response, "Pass", response);

		  }
		  
	  
		  @Test(priority = 6)
		  public void Mercury_FA04_Diagnostic_Wizard_Procedure_42_Diagnostic_Wizard_Step_2_Content_6075() {
              String test_case = new Object() {
              }.getClass().getEnclosingMethod().getName();
              log.info("Test Case: " + test_case);

              String response = fun.MercuryLogin();

              response = TestAction.getLoginAction().getTestResult(test_case);

              Assert.assertEquals(response, "Pass", response);

		  }
		  
		  
		  @Test(priority = 7)
		  public void Mercury_FA04_Diagnostic_Wizard_Procedure_42_Diagnostic_Wizard_Step_2_Functionality_Check_icon_6077() {
              String test_case = new Object() {
              }.getClass().getEnclosingMethod().getName();
              log.info("Test Case: " + test_case);

              String response = fun.MercuryLogin();

              response = TestAction.getLoginAction().getTestResult(test_case);

              Assert.assertEquals(response, "Pass", response);

		  }
		  
		  
		  
		  @Test(priority = 8)
		  public void Mercury_FA04_Diagnostic_Wizard_Procedure_42_Diagnostic_Wizard_Step_2_Functionality_Allgood_icon_6078() {
              String test_case = new Object() {
              }.getClass().getEnclosingMethod().getName();
              log.info("Test Case: " + test_case);

              String response = fun.MercuryLogin();

              response = TestAction.getLoginAction().getTestResult(test_case);

              Assert.assertEquals(response, "Pass", response);

		  }
		  
		  @Test(priority = 9)
		  public void Mercury_FA04_Diagnostic_Wizard_Procedure_42_Diagnostic_Wizard_Step_2_Error_Handling_Functionality_Error_icon_6098() {
              String test_case = new Object() {
              }.getClass().getEnclosingMethod().getName();
              log.info("Test Case: " + test_case);

              String response = fun.MercuryLogin();

              response = TestAction.getLoginAction().getTestResult(test_case);

              Assert.assertEquals(response, "Pass", response);

		  }

		  @Test(priority = 10)
		  public void Mercury_FA04_Diagnostic_Wizard_Procedure_42_Diagnostic_Wizard_Step_2_Error_Handling_Content_24GHz_disabled_6094() {


              String test_case = new Object() {
              }.getClass().getEnclosingMethod().getName();
              log.info("Test Case: " + test_case);

              String response = fun.MercuryLogin();

              response = TestAction.getLoginAction().getTestResult(test_case);

              Assert.assertEquals(response, "Pass", response);

		  }
		  
		  @Test(priority = 11)
		  public void Mercury_FA04_Diagnostic_Wizard_Procedure_42_Diagnostic_Wizard_Step_2_Error_Handling_Content_5GHz_disabled_6095() {

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
			Driver.closeDriver();
			Thread.sleep(1000 * 5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			log.info("Messsage: Thread interrupted exception");
		}
		log.info("+++++++++++++++++ END TEST +++++++++++++++++\n");
	}

}
