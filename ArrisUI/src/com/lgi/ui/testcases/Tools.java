package com.lgi.ui.testcases;

import org.apache.log4j.Logger;


import org.apache.log4j.Priority;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.lgi.ui.automationJar.runAut;
import com.lgi.ui.commonUtils.Driver;
import com.lgi.ui.testAction.TestAction;

public class Tools {
	
	Logger log = null;
	CommonFunctionality fun = new CommonFunctionality();
	String response = null;
	public static int nChannel;
	int count =1;
	

	@BeforeClass
	public void testInitBrowser() 
	{

		log = Driver.getLogger();
		log.info("+++++++++++++++++ Gateway Model: " + runAut.modem + " - Tools Page +++++++++++++++++");
		

	}

	@BeforeMethod
	public void testFactoryReset() {




		log.info("+++++++++++++++++ START TEST +++++++++++++++++");

		
		
		
		Driver.openModel();
//		if (count++==1)
//			response=fun.factoryReset();
//		else 
			response=fun.MercuryLogin();
		
	}
	//PASSED
	@Test(priority = 1)
	public void webUI_Mercury_Advanced_settings_Tools_Network_Status_Status_1995() {
		

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		log.info("Jira Name: webUI_Mercury_Advanced_settings_Tools_Network_Status_Status_1995");

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	
    //PASSED
	@Test(priority = 2)
	public void webUI_Mercury_Advanced_settings_Tools_Network_Status_Status_Refresh_1996() {
		
		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		log.info("Jira Name: webUI_Mercury_Advanced_settings_Tools_Network_Status_Status_Refresh_1996");

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	
	//PASSED
	@Test(priority = 3)
	public void webUI_Mercury_Advanced_settings_Tools_Network_Status_Downstream_1997() {
		
		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		log.info("Jira Name: webUI_Mercury_Advanced_settings_Tools_Network_Status_Downstream_1997");

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	
	//PASSED
	@Test(priority = 4)
	public void webUI_Mercury_Advanced_settings_Tools_Network_Status_Downstream_Refresh_1998() 
	{
		
		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		log.info("Jira Name: webUI_Mercury_Advanced_settings_Tools_Network_Status_Downstream_Refresh_1998");

		String response = TestAction.getLoginAction()
				.getTestResult("webUI_Mercury_Advanced_settings_Tools_Network_Status_Downstream_1997");

		if (response.equals("Pass")) {
			
			response = TestAction.getLoginAction().getTestResult(test_case);
		}

		Assert.assertEquals(response, "Pass", response);
	}
	//PASSED
	@Test(priority = 5)
	public void webUI_Mercury_Advanced_settings_Tools_Network_Status_Upstream_1999() 
	{

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		log.info("Jira Name: webUI_Mercury_Advanced_settings_Tools_Network_Status_Upstream_1999");

		String response = TestAction.getLoginAction().getTestResult(test_case);
			
		Assert.assertEquals(response, "Pass", response);
	}
	//PASSED
	@Test(priority = 6)
	public void webUI_Mercury_Advanced_settings_Tools_Network_Status_Upstream_Refresh_2000() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");

		String response = TestAction.getLoginAction()
				.getTestResult("webUI_Mercury_Advanced_settings_Tools_Network_Status_Upstream_1999");

		if (response.equals("Pass")) 
		{

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		log.info("FINISHED EXECUTING TEST CASE " + response);
		Assert.assertEquals(response, "Pass", response);
	}
	//PASSED
	@Test(priority = 7)
	public void webUI_Mercury_Advanced_settings_Tools_Network_Status_Configuration_General_Configuration_2001() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");

		if (response.equals("Pass")) {
			response = TestAction.getLoginAction().getTestResult(test_case);
		}

		Assert.assertEquals(response, "Pass", response);
	}
    //PASSED
	@Test(priority = 8)
	public void webUI_Mercury_Advanced_settings_Tools_Network_Status_Configuration_General_Configuration_Refresh_2002() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");

		response = TestAction.getLoginAction().getTestResult(
				"webUI_Mercury_Advanced_settings_Tools_Network_Status_Configuration_General_Configuration_2001");

		if (response.equals("Pass")) {
			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		Assert.assertEquals(response, "Pass", response);
	}
	
	//PASSED
	@Test(priority = 9)
	public void webUI_Mercury_Advanced_settings_Tools_Network_Status_Configuration_Primary_Downstream_Service_Flow_2003() 
	{

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");

		String response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	
	//PASSED
	@Test(priority = 10)
	public void webUI_Mercury_Advanced_settings_Tools_Network_Status_Configuration_Primary_Downstream_Service_Flow_Refresh_2004() 
	{

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");

		String response = TestAction.getLoginAction().getTestResult("webUI_Mercury_Advanced_settings_Tools_Network_Status_Configuration_Primary_Downstream_Service_Flow_2003");
		
		if(response.equals("Pass")){
			
			response = TestAction.getLoginAction().getTestResult(test_case);
		}

		Assert.assertEquals(response, "Pass", response);
	}
	
	//PASSED
	@Test(priority = 11)
	public void webUI_Mercury_Advanced_settings_Tools_Network_Status_Configuration_Primary_Upstream_Service_Flow_2005() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");

		String response = TestAction.getLoginAction().getTestResult(test_case);

		Assert.assertEquals(response, "Pass", response);
	}
	
	
	
	
	//PASSED
	@Test(priority = 12)
	public void webUI_Mercury_Advanced_settings_Tools_Network_Status_Configuration_Primary_Upstream_Service_Flow_Refresh_2006() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");

		String response = TestAction.getLoginAction().getTestResult("webUI_Mercury_Advanced_settings_Tools_Network_Status_Configuration_Primary_Upstream_Service_Flow_2005");
		
		if(response.equals("Pass")){
			
			response = TestAction.getLoginAction().getTestResult(test_case);
		}

		Assert.assertEquals(response, "Pass", response);
	}
	//PASSED
	@Test(priority = 13)
	public void webUI_Mercury_Advanced_settings_Tools_Network_Status_Network_Log_2007() {


		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");

		if (response.equals("Pass")) {
			response = TestAction.getLoginAction().getTestResult(test_case);
		}

		Assert.assertEquals(response, "Pass", response);
	}
    //PASSED
	@Test(priority = 14)
	public void webUI_Mercury_Advanced_settings_Tools_Network_Status_Network_Log_Refresh_2008() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");

		response = TestAction.getLoginAction()
				.getTestResult("webUI_Mercury_Advanced_settings_Tools_Network_Status_Network_Log_2007");
		
		if (response.equals("Pass")) {
			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		Assert.assertEquals(response, "Pass", response);
	}
	//PASSED
	@Test(priority = 15)
	public void webUI_Mercury_Advanced_settings_Tools_Ping_2009() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
    //PASSED
	@Test(priority = 16)
	public void webUI_Mercury_Advanced_settings_Tools_Ping_Invalid_target_2010() 
	{

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	//FAILED
	@Test(priority = 17)
	public void webUI_Mercury_Advanced_settings_Tools_Ping_Change_Ping_size_2011() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
  //PASSED (Genuine failures)
	@Test(priority = 18)
	public void webUI_Mercury_Advanced_settings_Tools_Ping_Change_Ping_size_Invalid_value_2012() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
    //PASSED
	@Test(priority = 19)
	public void webUI_Mercury_Advanced_settings_Tools_Ping_Change_Number_of_pings_2013() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	//PASSED (Genuine failures)
	@Test(priority = 20)
	public void webUI_Mercury_Advanced_settings_Tools_Ping_Change_Number_of_pings_Invalid_value_2014() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
  //PASSED
	@Test(priority = 21)
	public void webUI_Mercury_Advanced_settings_Tools_Ping_Abort_test_2015() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	//PASSED
	@Test(priority = 22)
	public void webUI_Mercury_Advanced_settings_Tools_Ping_Clear_results_2016() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 23)
	public void webUI_Mercury_Advanced_settings_Tools_Traceroute_2017() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	//PASSED
	@Test(priority = 24)
	public void webUI_Mercury_Advanced_settings_Tools_Traceroute_Invalid_target_2018() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	//PASSED
	@Test(priority = 25)
	public void webUI_Mercury_Advanced_settings_Tools_Traceroute_Change_Max_hops_2019() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
   //PASSED
	@Test(priority = 26)
	public void webUI_Mercury_Advanced_settings_Tools_Traceroute_Change_Max_hops_Invalid_value_2020() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	//PASSED
	@Test(priority = 27)
	public void webUI_Mercury_Advanced_settings_Tools_Traceroute_Change_Base_port_2021() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	//PASSED
	@Test(priority = 28)
	public void webUI_Mercury_Advanced_settings_Tools_Traceroute_Change_Base_port_Invalid_value_2022() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test case: "+ test_case);
		log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	//PASSED
	@Test(priority = 29)
	public void webUI_Mercury_Advanced_settings_Tools_Traceroute_Abort_test_2023() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	//PASSED
	@Test(priority = 30)
	public void webUI_Mercury_Advanced_settings_Tools_Traceroute_Clear_results_2024() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	//PASSED
	@Test(priority = 31)
	public void webUI_Mercury_Advanced_settings_Tools_MTU_size_2025() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	//PASSED
	@Test(priority = 32)
	public void webUI_Mercury_Advanced_settings_Tools_MTU_size_Change_value_2026() 
	{

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}
	//PASSED
	@Test(priority = 33)
	public void webUI_Mercury_Advanced_settings_Tools_MTU_size_Invalid_value_2027() {

		String test_case = new Object(){}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: "+ test_case);
		log.info("Jira Name: LGI-webUI – Mercury – FA03 – WiFi Connection Wizard– 3.0 Wi-Fi Connection – Content – ");

		String response = TestAction.getLoginAction().getTestResult(test_case);
		Assert.assertEquals(response, "Pass", response);
	}

	@AfterMethod
	public void testCloseBrowser() {
		System.out.println("=========================TEST OVER ==============================");
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
