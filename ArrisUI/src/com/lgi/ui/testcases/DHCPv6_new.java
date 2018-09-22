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

public class DHCPv6_new {
	
	Logger log = null;
	CommonFunctionality fun= new CommonFunctionality();
	String response = null;
	
	@BeforeClass
	public void testInitBrowser() {

		log = Driver.getLogger();
		log.info("+++++++++++++++++ Gateway Model: " + runAut.modem + " - DHCP Page +++++++++++++++++");
	}

	@BeforeMethod
	public void testFactoryReset() throws InterruptedException {

		log.info("+++++++++++++++++ START TEST +++++++++++++++++");

		Driver.openModel();
		//fun.Start_AFtr_Reboot();
		//response = fun.MercuryInitialSetup();
		// response = fun.MercuryLogin();
	}
 
//	//CAUT-6142
	@Test(priority = 1)
	public void FA07_DHCP_AdvSettings_DHCPv6_Server_Content() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case); 
		log.info("Jira Name: LGI-webUI – Mercury – FA07 – DHCP – 7.3 Advanced Settings – DHCP – v6 Server – Content – ");  
        response = fun.MercuryLogin();  
		  if (response.equals("Pass")) {
		  
		  response = TestAction.getLoginAction().getTestResult(test_case); }
		  
		  Assert.assertEquals(response, "Pass", response);
	}
//	//CAUT-6143 
	@Test(priority = 2)
	public void FA07_DHCP_AdvSettings_DHCPv6_Func_Stateful() {

 
		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case); 
		log.info("Jira Name: LGI-webUI – Mercury – FA07 – DHCP – 7.3 Advanced Settings – DHCP – v6 Server – Functionality – Stateful – ");  
        response = fun.MercuryLogin();   
		  if (response.equals("Pass")) {
		  
		  response = TestAction.getLoginAction().getTestResult(test_case); }
		  
		  Assert.assertEquals(response, "Pass", response);
	}
    //CAUT-6144 LAN side TC	
	@Test(priority = 3)
	public void FA07_DHCP_AdvSettings_DHCPv6_Func_Stateless() {

 
		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case); 
		log.info("Jira Name: LGI-webUI – Mercury – FA07 – DHCP – 7.3 Advanced Settings – DHCP – v6 Server – Functionality – Stateless – ");  
        response = fun.MercuryLogin();   
		  if (response.equals("Pass")) {
		  
		  response = TestAction.getLoginAction().getTestResult(test_case); }
		  
		  Assert.assertEquals(response, "Pass", response);
	}
//	//CAUT-6145,CAUT-6146,CAUT-6147,CAUT-6148,CAUT-6149 is Blocker
//	//CAUT-6150
	@Test(priority = 4)
	public void FA07_DHCP_AdvSettings_DHCPv6_ErrorIconText_NotValidMACAddress() {
 
		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case); 
		log.info("Jira Name: LGI-webUI – Mercury – FA07 – DHCP – 7.3 Advanced Settings – DHCP – v6 Server – Functionality – Error Icon and Text – Not a valid Mac address – ");  
        response = fun.MercuryLogin();   
		  if (response.equals("Pass")) {
		  
		  response = TestAction.getLoginAction().getTestResult(test_case); }
		  fun.webUI_Mercury_Advanced_settings_DHCP_Add_Rule_RevertBack();
		  Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-6151
	@Test(priority = 5)
	public void FA07_DHCP_AdvSettings_DHCPv6_ErrorIconText_MACAddressAlreadyInUse() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case); 
		log.info("Jira Name: LGI-webUI – Mercury – FA07 – DHCP – 7.3 Advanced Settings – DHCP – v6 Server – Functionality – Error Icon and Text – Mac address already in use – ");  
        response = fun.MercuryLogin();   
		  if (response.equals("Pass")) {
		  
		  response = TestAction.getLoginAction().getTestResult(test_case); }
		  fun.webUI_Mercury_Advanced_settings_DHCP_Add_Rule_RevertBack();
		  Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-6152
	@Test(priority = 6)
	public void FA07_DHCP_AdvSettings_DHCPv6_ErrorIconText_NotValidIPAddress() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case); 
		log.info("Jira Name: LGI-webUI – Mercury – FA07 – DHCP – 7.3 Advanced Settings – DHCP – v6 Server – Functionality – Error Icon and Text – Not a valid IP address – ");  
        response = fun.MercuryLogin();    
		  if (response.equals("Pass")) {
		  
		  response = TestAction.getLoginAction().getTestResult(test_case); }
		
		  Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-6153
	@Test(priority = 7)
	public void FA07_DHCP_AdvSettings_DHCPv6_ErrorIconText_InvalidIPAddress() {


		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case); 
		log.info("Jira Name: LGI-webUI – Mercury – FA07 – DHCP – 7.3 Advanced Settings – DHCP – v6 Server – Functionality – Error Icon and Text – Invalid IP address – ");  
        response = fun.MercuryLogin();    
		  if (response.equals("Pass")) {
		  
		  response = TestAction.getLoginAction().getTestResult(test_case); }
		
		  Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-6154
	@Test(priority = 8)
	public void FA07_DHCP_AdvSettings_DHCPv6_ErrorIconText_NoReservedRule() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case); 
		log.info("Jira Name: LGI-webUI – Mercury – FA07 – DHCP – 7.3 Advanced Settings – DHCP – v6 Server – Functionality – Error Icon and Text – No reserved rule – ");  
        response = fun.MercuryLogin();    
		  if (response.equals("Pass")) {
		  
		  response = TestAction.getLoginAction().getTestResult(test_case); }
		
		  Assert.assertEquals(response, "Pass", response);
	}
	//CAUT-6155
	@Test(priority = 9)
	public void FA07_DHCP_AdvSettings_DHCPv6_ErrorIconText_RuleAlreadyExists() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case); 
		log.info("Jira Name: LGI-webUI – Mercury – FA07 – DHCP – 7.3 Advanced Settings – DHCP – v6 Server – Functionality – Error Icon and Text – The rule already exists – ");  
        response = fun.MercuryLogin();   
		  if (response.equals("Pass")) {
		  
		  response = TestAction.getLoginAction().getTestResult(test_case); }
		  fun.webUI_Mercury_Advanced_settings_DHCP_Add_Rule_RevertBack();
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
