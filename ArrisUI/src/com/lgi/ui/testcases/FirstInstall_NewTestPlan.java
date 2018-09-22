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

public class FirstInstall_NewTestPlan {
	public String masterIP = null;
	Logger log = null;
	CommonFunctionality fun = new CommonFunctionality();
	String response = null;
     
	@BeforeClass
	public void testInitBrowser() {

		
		log = Driver.getLogger();
		log.info("+++++++++++++++++ Gateway Model: " + runAut.modem + " - FirstInstall (New Test Plan) +++++++++++++++++");

	}

	@BeforeMethod
	public void testFactoryReset() {



		log.info("+++++++++++++++++ START TEST +++++++++++++++++");

	
		Driver.openModel();

	}

	//CAUT-6016
	@Test(priority = 1)
	public void Settings_Are_Applied_Continue_button() throws InterruptedException



   {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		log.info("Method Name: " + test_case); 

		response = TestAction.getLoginAction().getTestResult(test_case);	
		Assert.assertEquals(response, "Pass", response);
	}
	
	
//	//CAUT-6024
//	@Test(priority = 2)
//	public void Settings_Are_Applied_Close_button() throws InterruptedException
//
//   {
//
//		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
//		log.info("Test Case: "+ test_case);
//		log.info("Jira name : " + "LGI-webUI – Mercury – FA00 – First Install – 0.10 Final Step – Settings Are Applied – Close button –");
// 
////		fun.ReloadAndReboot();
////		Driver.closeDriver();
////		Thread.sleep(360*1000);
//		
//		response = TestAction.getLoginAction().getTestResult(test_case);	
//		Assert.assertEquals(response, "Pass", response);
//	}

	//CAUT-6030
	@Test(priority = 3)
	public void Next_Button_Correct_Password() throws InterruptedException

   {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		log.info("Jira name : " + "LGI-webUI – Mercury – FA00 – First Install – 0.11 Updated Login – Next Button – Correct Password –\r\n" + 
				"");
 
//		fun.ReloadAndReboot();
//		Driver.closeDriver();
//		Thread.sleep(360*1000);
		
		response = TestAction.getLoginAction().getTestResult(test_case);	
		Assert.assertEquals(response, "Pass", response);
	}

	//CAUT-6017
	@Test(priority = 4)
	public void Settings_Are_Applied_Content()
	   {

			String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
			log.info("Test Case: "+ test_case);
        	log.info("Jira name : " + "LGI-webUI – Mercury – FA00 – First Install – 0.10 Final Step – Settings Are Applied – Content –");
        	response = TestAction.getLoginAction().getTestResult(test_case);	
    		Assert.assertEquals(response, "Pass", response);
    	}
	
	//CAUT-6020 NDone
	@Test(priority = 5)
	public void Modem_and_WiFi_Credentials_Are_Changed()

	   {

			String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
			log.info("Test Case: "+ test_case);
        	log.info("Jira name : " + "LGI-webUI – Mercury – FA00 – First Install – 0.9 Final Step – Modem and WiFi Credentials Are Changed – Content –\r\n");
        	response = TestAction.getLoginAction().getTestResult(test_case);	
    		Assert.assertEquals(response, "Pass", response);
    	}

	
		//CAUT-6021
		@Test(priority = 7)
		
		public void Modem_and_WiFi_Credentials_Are_Changed_Back_Button()

		   {

				String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
				log.info("Test Case: "+ test_case);
	        	log.info("Jira name : " + "LGI-webUI – Mercury – FA00 – First Install – 0.9 Final Step – Modem and WiFi Credentials Are Changed – Back Button –\r\n");
	        	response = TestAction.getLoginAction().getTestResult(test_case);	
	    		Assert.assertEquals(response, "Pass", response);
	    	}
//
//		//CAUT-6022 NDone
//				@Test(priority = 6)
//				
//				public void Modem_and_WiFi_Credentials_Are_Changed_Finish_Button()
//
//				   {
//
//						String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
//						log.info("Test Case: "+ test_case);
//			        	log.info("Jira name : " + "LGI-webUI – Mercury – FA00 – First Install – 0.9 Final Step – Modem and WiFi Credentials Are Changed – Finish Button –\r\n");
//			        	response = TestAction.getLoginAction().getTestResult(test_case);	
//			    		Assert.assertEquals(response, "Pass", response);
//			    	}
//		
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
