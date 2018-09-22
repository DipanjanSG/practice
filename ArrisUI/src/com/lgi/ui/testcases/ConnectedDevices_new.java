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

public class ConnectedDevices_new {
	
	Logger log = null;
	CommonFunctionality fun = new CommonFunctionality();
	String response = null;
	int testnumber=1;
	@BeforeClass
	public void testInitBrowser() {

		log = Driver.getLogger();
		log.info("+++++++++++++++++ Gateway Model: " + runAut.modem + " - Connected Devices Page +++++++++++++++++");
	}

	@BeforeMethod
	public void testFactoryReset() throws InterruptedException {

		log.info("+++++++++++++++++ START TEST +++++++++++++++++");

		//fun.RebootGateWay();
		
		Driver.openModel();
		//fun.MercuryInitialSetup();
		//fun.MercuryLogin();
		if (testnumber++==1)
			response=fun.factoryReset();
		else 
			response = fun.MercuryLogin();
	}

	@Test(priority = 1)
	public void LGI_webUI_Mercury_FA06_Connected_Devices_6_1_Connected_Devices_Table_content_6132 () {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		String response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);

	
	}
	
	@Test(priority = 2)
	public void LGI_webUI_Mercury_FA06_Connected_Devices_6_1_Connected_Devices_Functionality_Information_icon_6131 () {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		String response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);

	
	}
	
	@Test(priority = 3)
	public void LGI_webUI_Mercury_FA06_Connected_Devices_6_1_Connected_Devices_Functionality_Refresh_Button_6130 () {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		String response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);

	
	}
	
	
	@Test(priority = 4)
	public void LGI_webUI_Mercury_FA06_Connected_Devices_6_1_Connected_Devices_Content_6129 () {

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
