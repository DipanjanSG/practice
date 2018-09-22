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

public class WiFiForAll {
	
	Logger log = null;
	String response = null;
	CommonFunctionality fun= new CommonFunctionality();
	
	@BeforeClass
	public void testInitBrowser() {

		log = Driver.getLogger();
		log.info("+++++++++++++++++ Gateway Model: " + runAut.modem + " - UPnP Page +++++++++++++++++");
	}

	@BeforeMethod
	public void testFactoryReset() {

		log.info("+++++++++++++++++ START TEST +++++++++++++++++");
		
		
		Driver.openModel();

	}
	

	@Test(priority = 1)
	public void hotspotWifiForAll()  {


		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		String response = TestAction.getLoginAction().getTestResult(test_case); 
		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 2)
	public void connectTo24GHzWiFiProfile()  {


		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		String response = TestAction.getLoginAction().getTestResult(test_case); 
		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 3)
	public void connectTo5GHzWiFiProfile()  {


		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		String response = TestAction.getLoginAction().getTestResult(test_case); 
		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 4)
	public void WiFi4All_IPV4RG_SEC_SSIDDuplicate()  {


		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		String response = TestAction.getLoginAction().getTestResult(test_case); 
		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 5)
	public void disable24GHzWiFiNetwork()  {


		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		
		String response = TestAction.getLoginAction().getTestResult(test_case); 
		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 6)
	public void removeMACFromMACFilter()  {
		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
	log.info("Test Case: "+ test_case);
		
		String response = TestAction.getLoginAction().getTestResult(test_case); 
		Assert.assertEquals(response, "Pass", response);
		
	}
	
	@Test(priority = 7)
	public void connectTo24GHzWiFiProfile_WithoutReboot()  {

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
