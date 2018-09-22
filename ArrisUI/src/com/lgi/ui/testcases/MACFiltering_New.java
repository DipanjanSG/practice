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

public class MACFiltering_New {
	Logger log = null;
	CommonFunctionality fun = new CommonFunctionality();
	String response = null;
	public static int nChannel;
	TestAction action;
	int test_number=1;
	@BeforeClass
	public void testInitBrowser() {

		log = Driver.getLogger();
		log.info("+++++++++++++++++ Gateway Model: " + runAut.modem + " - MACFiltering Page +++++++++++++++++");
	}
	
	@BeforeMethod
	public void testFactoryReset() throws InterruptedException {


		log.info("+++++++++++++++++ START TEST +++++++++++++++++");

		Driver.openModel();
	//	if (test_number++>1)
           

			}
	//CAUT-5671

	@Test(priority = 1)
	public void FA07_Security_AdvSettings_Sec_56MacFiltering_Content() {
		 
		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case); 
		log.info("Jira Name: LGI-webUI – Mercury – FA07 – Security – 7.2.2 Advanced Settings – Security – MAC Filtering – Content – ");
//		response=fun.factoryReset();
		if (response.equals("Pass")) {
		  
		  response = TestAction.getLoginAction().getTestResult(test_case); }
		  
		  Assert.assertEquals(response, "Pass", response);
	}
	
	//Wifi Related so not tested
	//CAUT-5676
	@Test(priority = 2)
	public void FA07_Security_AdvSettings_Sec_MacFiltering_Functionality_Refresh_Button() {

	String test_case = new Object() {
	}.getClass().getEnclosingMethod().getName();
	log.info("Test Case: " + test_case); 
	log.info("Jira Name: LGI-webUI – Mercury – FA07 – Security – 7.2.2 Advanced Settings – Security – MAC Filtering – Functionality – Refresh button – ");		  
	 response = fun.MercuryLogin();	 
	if (response.equals("Pass")) {
		  
		  response = TestAction.getLoginAction().getTestResult(test_case); }
		  
		  Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-5678	
	@Test(priority = 3)
	public void FA07_Security_AdvSettings_Sec_MacFiltering_DeviceSelection_RadioButton() {

		 String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case); 
		log.info("Jira Name: LGI-webUI – Mercury – FA07 – Security – 7.2.2 Advanced Settings – Security – MAC Filtering – Functionality – Device Selection – Radio button – "); 
		 response = fun.MercuryLogin();
		 if (response.equals("Pass")) {
		  
		  response = TestAction.getLoginAction().getTestResult(test_case); }
		  
		  Assert.assertEquals(response, "Pass", response);
	}
   //CAUT-5679
	@Test(priority = 4)
	public void FA07_Security_AdvSettings_Sec_MacFiltering_DeviceName_InpBox() {
	 
		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case); 
		log.info("Jira Name: LGI-webUI – Mercury – FA07 – Security – 7.2.2 Advanced Settings – Security – MAC Filtering – Functionality – Device Name – Input Box – ");  
		 response = fun.MercuryLogin();
		 if (response.equals("Pass")) {
		  
		  response = TestAction.getLoginAction().getTestResult(test_case); }
		  
		  Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-5680
	@Test(priority = 5)
	public void FA07_Security_AdvSettings_Sec_MacFiltering_DeviceName_ErrText() {
		 
		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case); 
		log.info("Jira Name: LGI-webUI – Mercury – FA07 – Security – 7.2.2 Advanced Settings – Security – MAC Filtering – Functionality – Device Name – Error icon and text – Invalid – "); 
		 response = fun.MercuryLogin();
		 if (response.equals("Pass")) {
		  
		  response = TestAction.getLoginAction().getTestResult(test_case); }
		  
		  Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-5681 Fail
	@Test(priority = 6)
	public void FA07_Security_AdvSettings_Sec_MacFiltering_DeviceName_ErrText_Duplicate() {

		 
		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case); 
		log.info("Jira Name: LGI-webUI – Mercury – FA07 – Security – 7.2.2 Advanced Settings – Security – MAC Filtering – Functionality – Device Name – Error icon and text – Duplicate – ");  
		 response = fun.MercuryLogin();
		 if (response.equals("Pass")) {
		  
		  response = TestAction.getLoginAction().getTestResult(test_case); }
		 
		 TestAction.log_flag=0;
		  fun.webUI_Mercury_Advanced_settings_Security_MAC_Filtering_RevertBack();
		  TestAction.log_flag=1;
		  Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-5682
	@Test(priority = 7)
	public void FA07_Security_AdvSettings_Sec_MacFiltering_DeviceName_InfoIcon() throws InterruptedException {
		 
		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case); 
		log.info("Jira Name: LGI-webUI – Mercury – FA07 – Security – 7.2.2 Advanced Settings – Security – MAC Filtering – Functionality – Device Name – Information icon – "); 
		
		response=fun.factoryReset();  
		if (response.equals("Pass")) {
		  
		  response = TestAction.getLoginAction().getTestResult(test_case); }
		  
		  Assert.assertEquals(response, "Pass", response);
	}
	
	//CAUT-5683
	@Test(priority = 8)
	public void FA07_Security_AdvSettings_Sec_MacFiltering_MACAddress_InpBox() {
		 
		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case); 
		log.info("Jira Name: LGI-webUI – Mercury – FA07 – Security – 7.2.2 Advanced Settings – Security – MAC Filtering – Functionality – MAC address – Input Box – ");
		  
		 response = fun.MercuryLogin();
		 if (response.equals("Pass")) {
		  
		  response = TestAction.getLoginAction().getTestResult(test_case); }
		  
		  Assert.assertEquals(response, "Pass", response);
	}
  //CAUT-5684 Fail
	@Test(priority = 9)
	public void FA07_Security_AdvSettings_Sec_MacFiltering_MACAddress_ErrText_Invalid() {
		
		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case); 
		log.info("Jira Name: LGI-webUI – Mercury – FA07 – Security – 7.2.2 Advanced Settings – Security – MAC Filtering – Functionality – MAC address – Error icon and text – Invalid – "); 
		 response = fun.MercuryLogin();
		 if (response.equals("Pass")) {
		  
		  response = TestAction.getLoginAction().getTestResult(test_case); }
		  fun.webUI_Mercury_Advanced_settings_Security_MAC_Filtering_RevertBack();
		  Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-5685
	@Test(priority = 10)
	public void FA07_Security_AdvSettings_Sec_MacFiltering_MACAddress_ErrText_Duplicate() {
	 
		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case); 
		log.info("Jira Name: LGI-webUI – Mercury – FA07 – Security – 7.2.2 Advanced Settings – Security – MAC Filtering – Functionality – MAC address – Error icon and text – Duplicate – "); 
		 response = fun.MercuryLogin();
		 if (response.equals("Pass")) {
		  
		  response = TestAction.getLoginAction().getTestResult(test_case); }
		  fun.webUI_Mercury_Advanced_settings_Security_MAC_Filtering_RevertBack();
		  Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-5686
	@Test(priority = 11)
	public void FA07_Security_AdvSettings_Sec_MacFiltering_AddRule_Button() {
		 
		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case); 
		log.info("Jira Name: LGI-webUI – Mercury – FA07 – Security – 7.2.2 Advanced Settings – Security – MAC Filtering – Functionality – Add Rule – Button – "); 
		 response = fun.MercuryLogin();
		 if (response.equals("Pass")) {
		  
		  response = TestAction.getLoginAction().getTestResult(test_case); }
		  fun.webUI_Mercury_Advanced_settings_Security_MAC_Filtering_RevertBack();
		  Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-5687
	@Test(priority = 12)
	public void FA07_Security_AdvSettings_Sec_MacFiltering_AddRule_ErrorIcon_RuleAlreadyExist() {
		 
		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case); 
		log.info("Jira Name: LGI-webUI – Mercury – FA07 – Security – 7.2.2 Advanced Settings – Security – MAC Filtering – Functionality – Add Rule – Error Icon and Text – ");  
		 response = fun.MercuryLogin();
		 if (response.equals("Pass")) {
		  
		  response = TestAction.getLoginAction().getTestResult(test_case); }
		  fun.webUI_Mercury_Advanced_settings_Security_MAC_Filtering_RevertBack();
		  Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-5688
	@Test(priority = 13)
	public void FA07_Security_AdvSettings_Sec_MacFiltering_MacFilterTable() {
		 
		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case); 
		log.info("Jira Name: LGI-webUI – Mercury – FA07 – Security – 7.2.2 Advanced Settings – Security – MAC Filtering – Functionality – MAC Filter – Table – ");  
		 response = fun.MercuryLogin();
		 if (response.equals("Pass")) {
		  
		  response = TestAction.getLoginAction().getTestResult(test_case); }
		  
		  Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-5689 related with WIFI so needed WIFI enabled pc to test
	@Test(priority = 19)
	public void FA07_Security_AdvSettings_Sec_MacFiltering_Func_ApplyChanges() {
		 
		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case); 
		log.info("Jira Name: LGI-webUI – Mercury – FA07 – Security – 7.2.2 Advanced Settings – Security – MAC Filtering – Functionality – Apply changes – ");  
		 response = fun.MercuryLogin();
		 if (response.equals("Pass")) {
		  
		  response = TestAction.getLoginAction().getTestResult(test_case); }
		  
		  Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-5694
	@Test(priority = 14)
	public void FA07_Security_AdvSettings_Sec_MacFiltering_TimeLimits_SameTimeEveryDay_ErrorIcon() {
	 
		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case); 
		log.info("Jira Name: LGI-webUI – Mercury – FA07 – Security – 7.2.2 Advanced Settings – Security – MAC Filtering – Time Limits – Same Time every day – Functionality – Error Icon and text – ");  
		 response = fun.MercuryLogin();
		 if (response.equals("Pass")) {
		  
		  response = TestAction.getLoginAction().getTestResult(test_case); }
		  fun.webUI_Mercury_Advanced_settings_Security_MAC_Filtering_RevertBack();
		  Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-5695
	@Test(priority = 14)
	public void FA07_Security_AdvSettings_Sec_MacFiltering_TimeLimits_DiffTimeDiffDay_TableText() {
	 
		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case); 
		log.info("Jira Name: LGI-webUI – Mercury – FA07 – Security – 7.2.2 Advanced Settings – Security – MAC Filtering – Time Limits –Different Time Different day – Table text – ");  
		 response = fun.MercuryLogin();
		 if (response.equals("Pass")) {
		  
		  response = TestAction.getLoginAction().getTestResult(test_case); }
	
		  fun.webUI_Mercury_Advanced_settings_Security_MAC_Filtering_RevertBack();
		  Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-5696
  @Test(priority = 14)
  public void FA07_Security_AdvSettings_Sec_MacFiltering_TimeLimits_DiffTimeDiffDay_Functionality_InvertLink() {
  
        String test_case = new Object() {
        }.getClass().getEnclosingMethod().getName();
        log.info("Test Case: " + test_case); 
        log.info("Jira Name:LGI-webUI – Mercury – FA07 – Security – 7.2.2 Advanced Settings – Security – MAC Filtering – Time Limits –Different Time Different day – Functionality – Invert link – ");  
        response = fun.MercuryLogin();
        if (response.equals("Pass")) {
          
          response = TestAction.getLoginAction().getTestResult(test_case); }
  
          fun.webUI_Mercury_Advanced_settings_Security_MAC_Filtering_RevertBack();
          Assert.assertEquals(response, "Pass", response);
  }

//CAUT-5697
    @Test(priority = 15)
    public void FA07_Security_AdvSettings_Sec_MACFiltering_TimeLimits_DiffTime_DiffDay_Functionality_ClearAlllink() {
    
          String test_case = new Object() {
          }.getClass().getEnclosingMethod().getName();
          log.info("Test Case: " + test_case); 
          log.info("Jira Name:LGI-webUI – Mercury – FA07 – Security – 7.2.2 Advanced Settings – Security – MAC Filtering – Time Limits –Different Time Different day – Functionality – Clear All link – ");  
           response = fun.MercuryLogin();
          if (response.equals("Pass")) {
            
            response = TestAction.getLoginAction().getTestResult(test_case); }
    
            fun.webUI_Mercury_Advanced_settings_Security_MAC_Filtering_RevertBack();
            Assert.assertEquals(response, "Pass", response);
    }

	
	//CAUT-5698
	@Test(priority = 15)
	public void FA07_Security_AdvSettings_Sec_MacFiltering_TimeLimits_DiffTimeDiffDay_BlockedDayTimeText() {
		 
		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case); 
		log.info("Jira Name: LGI-webUI – Mercury – FA07 – Security – 7.2.2 Advanced Settings – Security – MAC Filtering – Time Limits  –Different Time Different day – Functionality – Blocked day and time Text – ");
		 response = fun.MercuryLogin();
		 if (response.equals("Pass")) {
		  
		  response = TestAction.getLoginAction().getTestResult(test_case); }
		  fun.webUI_Mercury_Advanced_settings_Security_MAC_Filtering_RevertBack();
		  Assert.assertEquals(response, "Pass", response);
	}


  //CAUT-5700
    @Test(priority = 17)
    public void FA07_Security_AdvSettings_Sec_MACFiltering_TimeLimits_DiffTime_DiffDay_Functionality_EmptyColoredTile() {
    
          String test_case = new Object() {
          }.getClass().getEnclosingMethod().getName();
          log.info("Test Case: " + test_case); 
          log.info("Jira Name:LGI-webUI – Mercury – FA07 – Security – 7.2.2 Advanced Settings – Security – MAC Filtering – Time Limits –Different Time Different day – Functionality – Empty Colored tile – ");  
           response = fun.MercuryLogin();
          if (response.equals("Pass")) {
            
            response = TestAction.getLoginAction().getTestResult(test_case); }
    
            fun.webUI_Mercury_Advanced_settings_Security_MAC_Filtering_RevertBack();
            Assert.assertEquals(response, "Pass", response);
    }

	//CAUT-5701
	@Test(priority = 16)
	public void FA07_Security_AdvSettings_Sec_MacFiltering_TimeLimits_DiffTimeDiffDay_TipText() {
		 
		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case); 
		log.info("Jira Name: LGI-webUI – Mercury – FA07 – Security – 7.2.2 Advanced Settings – Security – MAC Filtering – Time Limits  –Different Time Different day – Functionality – Tip text – ");  
		 response = fun.MercuryLogin();
		 if (response.equals("Pass")) {
		  
		  response = TestAction.getLoginAction().getTestResult(test_case); }
		  fun.webUI_Mercury_Advanced_settings_Security_MAC_Filtering_RevertBack();
		  Assert.assertEquals(response, "Pass", response);
	}
	
	//CAUT-5702
	@Test(priority = 17)
	public void FA07_Security_AdvSettings_Sec_MacFiltering_TimeLimits_DiffTimeDiffDay_ClickText() {
		 
		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case); 
		log.info("Jira Name: LGI-webUI – Mercury – FA07 – Security – 7.2.2 Advanced Settings – Security – MAC Filtering – Time Limits  –Different Time Different day – Functionality – Click on the text – ");
		 response = fun.MercuryLogin();
		 if (response.equals("Pass")) {
		  
		  response = TestAction.getLoginAction().getTestResult(test_case); }
		  fun.webUI_Mercury_Advanced_settings_Security_MAC_Filtering_RevertBack();
		  Assert.assertEquals(response, "Pass", response);
	}
	
	//CAUT-5703
	@Test(priority = 18)
	public void FA07_Security_AdvSettings_Sec_MacFiltering_TimeLimits_DiffTimeDiffDay_ErrorIcon() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case); 
		log.info("Jira Name: LGI-webUI – Mercury – FA07 – Security – 7.2.2 Advanced Settings – Security – MAC Filtering – Time Limits  –Different Time Different day – Functionality – Error Icon and text – "); 
		 response = fun.MercuryLogin();
		 if (response.equals("Pass")) {
		  
		  response = TestAction.getLoginAction().getTestResult(test_case); }
		  
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
	