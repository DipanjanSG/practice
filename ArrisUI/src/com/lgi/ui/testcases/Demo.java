package com.lgi.ui.testcases;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.lgi.ui.automationJar.ModemFactoryReset;
import com.lgi.ui.automationJar.runAut;
import com.lgi.ui.commonUtils.Driver;
import com.lgi.ui.testAction.TestAction;

public class Demo {

	Logger log = null;
	CommonFunctionality fun = new CommonFunctionality();
	String response;
	String status = null;
	String caut_id=null;
	String test_case=null;
	int passed=0;
	int failed=0;
	@BeforeClass
	public void testInitBrowser() {

		log = Driver.getLogger();
		log.info("+++++++++++++++++ Gateway Model: " + runAut.modem + " - Dev QA IPV6 DS-LITE +++++++++++++++++");
		
		
		
	}

	@BeforeMethod
	public void testFactoryReset() {

		log.info("+++++++++++++++++ START TEST +++++++++++++++++");
		Driver.openModel();
	}



	
		//3032
	@Test(priority = 2)
	public void webUI_Mercury_Admin_Backup_configuration_settings_2267() {
	
		String test_case = new Object() {}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);
		caut_id="CAUT-3032";
		log.info("********************** "+ caut_id+" **********************");
		 response=fun.MercuryInitialSetup();
		 
		if (response.equals("Pass"))
		{
			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		
		Assert.assertEquals(response, "Pass", response);
	}
			//CAUT - 2855
		@Test(priority = 3)
		public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_default_status_DSLite_1838() {

			String test_case = new Object() {
			}.getClass().getEnclosingMethod().getName();
			log.info("Test Case: " + test_case);
			caut_id="CAUT-2855";
			log.info("********************** "+ caut_id+" **********************");
			response = fun.MercuryLogin();

			if (response.equals("Pass")) 
			{
				response = TestAction.getLoginAction().getTestResult(test_case);
			}

			Assert.assertEquals(response, "Pass", response);
		}

		//CAUT-2471
		@Test(priority = 4)
		public void webUI_Mercury_Advanced_settings_Wireless_Security_Primary_24GHz_Check_default_24GHz_WiFi_Network_Name_1727() {

			String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
			log.info("Test Case: "+ test_case);
			caut_id="CAUT-2471";
			log.info("********************** "+ caut_id+" **********************");
			response = fun.MercuryLogin();
			if (response.equals("Pass"))
			{
				response = TestAction.getLoginAction().getTestResult(test_case);
			}
			
			Assert.assertEquals(response, "Pass", response);
		} 

		
	
			
	@AfterMethod
	public void testCloseBrowser() {
		
		//log.info("+++++++++++++++++ END TEST +++++++++++++++++\n");
		try {
			
			if(response.equals("Pass"))
			{
				passed+=1;
			}
			else
				failed+=1;
			
			
	
				
		 
	      log.info("**************** Status of TestCase is "+status+" ********************");
	      log.info("+++++++++++++++++ END TEST +++++++++++++++++\n");
	      log.info("CURRENT STATUS : PASSED = " + passed+", FAILED = "+ failed);
	      System.out.println("*** Test Case Details- Test Case: "+ test_case+" "+caut_id+ " Status: "+ status+" ***");
	      

			fun.logout();	
			Driver.closeDriver();
			Thread.sleep(1000 * 5);
		
	      }
		catch(Exception ex)
		{
			log.info("Messsage: Thread interrupted exception " + ex.getMessage());
		}
		
		
		
	}

			
}



