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

public class DHCPv4_new {
	
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
		
	}
    //CAUT-6133
//	@Test(priority = 1)
//	public void FA07_DHCP_AdvSettings_DHCPv4_Server_Content() {
//		 
//		String test_case = new Object() {
//		}.getClass().getEnclosingMethod().getName();
//		log.info("Test Case: " + test_case); 
//		log.info("Jira Name: LGI-webUI – Mercury – FA07 – DHCP – 7.3 Advanced Settings – DHCP – v4 Server – Content – ");  
//      response = fun.MercuryLogin();
//		  if (response.equals("Pass")) {
//		  
//		  response = TestAction.getLoginAction().getTestResult(test_case); }
//		  
//		  Assert.assertEquals(response, "Pass", response);
//	}
//
//	//CAUT-6134
//	@Test(priority = 2)
//	public void FA07_DHCP_AdvSettings_DHCPv4_Func_Enabled() {
//		 
//		String test_case = new Object() {
//		}.getClass().getEnclosingMethod().getName();
//		log.info("Test Case: " + test_case); 
//		log.info("Jira Name: LGI-webUI – Mercury – FA07 – DHCP – 7.3 Advanced Settings – DHCP – v4 Server – Functionality – Enabled – ");  
//  response = fun.MercuryLogin();
//		  if (response.equals("Pass")) {
//		  
//		  response = TestAction.getLoginAction().getTestResult(test_case); }
//		  
//		  Assert.assertEquals(response, "Pass", response);
//	}
//	//CAUT-6135 Wifi related TC
//	@Test(priority = 3)
//	public void FA07_DHCP_AdvSettings_DHCPv4_Func_Disabled() {
//	 
//		String test_case = new Object() {
//		}.getClass().getEnclosingMethod().getName();
//		log.info("Test Case: " + test_case); 
//		log.info("Jira Name: LGI-webUI – Mercury – FA07 – DHCP – 7.3 Advanced Settings – DHCP – v4 Server – Functionality – Disabled – ");  
//  response = fun.MercuryLogin();
//		  if (response.equals("Pass")) {
//		  
//		  response = TestAction.getLoginAction().getTestResult(test_case); }
//		  
//		  Assert.assertEquals(response, "Pass", response);
//	}
//	//CAUT-6136
//	@Test(priority = 4)
//	public void FA07_DHCP_AdvSettings_DHCPv4_ErrorIconText_NotValidIPAddress() {
//		 
//		String test_case = new Object() {
//		}.getClass().getEnclosingMethod().getName();
//		log.info("Test Case: " + test_case); 
//		log.info("Jira Name: LGI-webUI – Mercury – FA07 – DHCP – 7.3 Advanced Settings – DHCP – v4 Server – Functionality – Error Icon and Text – Not a valid IP address – "); 
//  response = fun.MercuryLogin();
//		  if (response.equals("Pass")) {
//		  
//		  response = TestAction.getLoginAction().getTestResult(test_case); }
//		  
//		  Assert.assertEquals(response, "Pass", response);
//	}
//	//CAUT-6137
//	@Test(priority = 5)
//	public void FA07_DHCP_AdvSettings_DHCPv4_ErrorIconText_InvalidIPAddress() {
//	 
//		String test_case = new Object() {
//		}.getClass().getEnclosingMethod().getName();
//		log.info("Test Case: " + test_case); 
//		log.info("Jira Name: LGI-webUI – Mercury – FA07 – DHCP – 7.3 Advanced Settings – DHCP – v4 Server – Functionality – Error Icon and Text – invalid IP address – "); 
//  response = fun.MercuryLogin();
//		  if (response.equals("Pass")) {
//		  
//		  response = TestAction.getLoginAction().getTestResult(test_case); }
//		  
//		  Assert.assertEquals(response, "Pass", response);
//	}
//	//CAUT-6138
//	@Test(priority = 6)
//	public void FA07_DHCP_AdvSettings_DHCPv4_ErrorIconText_NoOFCPEsInvalid() {
//		 
//		String test_case = new Object() {
//		}.getClass().getEnclosingMethod().getName();
//		log.info("Test Case: " + test_case); 
//		log.info("Jira Name: LGI-webUI – Mercury – FA07 – DHCP – 7.3 Advanced Settings – DHCP – v4 Server – Functionality – Error Icon and Text – Number of CPEs is invalid – "); 
//  response = fun.MercuryLogin();
//		  if (response.equals("Pass")) {
//		  
//		  response = TestAction.getLoginAction().getTestResult(test_case); }
//		  
//		  Assert.assertEquals(response, "Pass", response);
//	}
//	//CAUT-6139
//	@Test(priority = 7)
//	public void FA07_DHCP_AdvSettings_DHCPv4_ErrorIconText_NoOFCPEsMustBTW_1and245() {
//		 
//		String test_case = new Object() {
//		}.getClass().getEnclosingMethod().getName();
//		log.info("Test Case: " + test_case); 
//		log.info("Jira Name: LGI-webUI – Mercury – FA07 – DHCP – 7.3 Advanced Settings – DHCP – v4 Server – Functionality – Error Icon and Text – Number of CPEs must be between 1 and – ");  
//  response = fun.MercuryLogin();
	//		  if (response.equals("Pass")) {
//		  
//		  response = TestAction.getLoginAction().getTestResult(test_case); }
//		  
//		  Assert.assertEquals(response, "Pass", response);
//	}
//	//CAUT-6140
//	@Test(priority = 8)
//	public void FA07_DHCP_AdvSettings_DHCPv4_ErrorIconText_DHCPLeaseTimeInvalid() {
//		 
//		String test_case = new Object() {
//		}.getClass().getEnclosingMethod().getName();
//		log.info("Test Case: " + test_case); 
//		log.info("Jira Name: LGI-webUI – Mercury – FA07 – DHCP – 7.3 Advanced Settings – DHCP – v4 Server – Functionality – Error Icon and Text – DHCP Lease times is invalid – ");  
//  response = fun.MercuryLogin();
//		  if (response.equals("Pass")) {
//		  
//		  response = TestAction.getLoginAction().getTestResult(test_case); }
//		  
//		  Assert.assertEquals(response, "Pass", response);
//	}
//	//CAUT-6141
//	@Test(priority = 9)
//	public void FA07_DHCP_AdvSettings_DHCPv4_ErrorIconText_DHCPLeaseTimeMustBtw_120and31536000() {
//		 
//		String test_case = new Object() {
//		}.getClass().getEnclosingMethod().getName();
//		log.info("Test Case: " + test_case); 
//		log.info("Jira Name: LGI-webUI – Mercury – FA07 – DHCP – 7.3 Advanced Settings – DHCP – v4 Server – Functionality – Error Icon and Text – DHCP Lease times must be between 120 and 31536000 – "); 
//  response = fun.MercuryLogin();
//		  if (response.equals("Pass")) {
//		  
//		  response = TestAction.getLoginAction().getTestResult(test_case); }
//		  
//		  Assert.assertEquals(response, "Pass", response);
//	}
//
//	//CAUT-6156 Wifi related TC
//	@Test(priority = 10)
//	public void FA07_DHCP_AdvSettings_DHCP_Reserved_IPAddress_Func_Refresh() {
//
//		 String test_case = new Object() {
//		}.getClass().getEnclosingMethod().getName();
//		log.info("Test Case: " + test_case); 
//		log.info("Jira Name: LGI-webUI – Mercury – FA07 – DHCP – 7.3 Advanced Settings – DHCP – Reserved IP addresses – Functionality – Refresh – ");  
//  response = fun.MercuryLogin();
//		  if (response.equals("Pass")) {
//		  
//		  response = TestAction.getLoginAction().getTestResult(test_case); }
//		  Assert.assertEquals(response, "Pass", response);
//	}
//	//CAUT-6157
//	@Test(priority = 11)
//	public void FA07_DHCP_AdvSettings_DHCP_Reserved_IPAddress_Func_Device_Selection() {
//
//		 String test_case = new Object() {
//		}.getClass().getEnclosingMethod().getName();
//		log.info("Test Case: " + test_case); 
//		log.info("Jira Name: LGI-webUI – Mercury – FA07 – DHCP – 7.3 Advanced Settings – DHCP – Reserved IP addresses – Functionality – Device selection – ");  
//  response = fun.MercuryLogin();
//		  if (response.equals("Pass")) {
//		  
//		  response = TestAction.getLoginAction().getTestResult(test_case); }
//		  Assert.assertEquals(response, "Pass", response);
//	}
//	//CAUT-6158 
//	@Test(priority = 12)
//	public void FA07_DHCP_AdvSettings_DHCP_Reserved_IPAddress_Func_MACAddress() {
//		 
//		String test_case = new Object() {
//		}.getClass().getEnclosingMethod().getName();
//		log.info("Test Case: " + test_case); 
//		log.info("Jira Name: LGI-webUI – Mercury – FA07 – DHCP – 7.3 Advanced Settings – DHCP – Reserved IP addresses – Functionality – MAC address – ");  
//  response = fun.MercuryLogin();
//		  if (response.equals("Pass")) {
//		  
//		  response = TestAction.getLoginAction().getTestResult(test_case); }
//		  Assert.assertEquals(response, "Pass", response);
//	}
//	//CAUT-6159 
//		@Test(priority = 13)
//		public void FA07_DHCP_AdvSettings_DHCP_Reserved_IPAddress_Func_IPAddress() {
//			 
//			String test_case = new Object() {
//			}.getClass().getEnclosingMethod().getName();
//			log.info("Test Case: " + test_case); 
//			log.info("Jira Name: LGI-webUI – Mercury – FA07 – DHCP – 7.3 Advanced Settings – DHCP – Reserved IP addresses – Functionality – IP address – ");  
//  response = fun.MercuryLogin();
	//			  if (response.equals("Pass")) {
//			  
//			  response = TestAction.getLoginAction().getTestResult(test_case); }
//			  Assert.assertEquals(response, "Pass", response);
//		}
//	//CAUT-6160 Wifi related TC
	@Test(priority = 14)
	public void FA07_DHCP_AdvSettings_DHCP_Reserved_IPAddress_Func_AddRule() {

		 String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case); 
		log.info("Jira Name: LGI-webUI – Mercury – FA07 – DHCP – 7.3 Advanced Settings – DHCP – Reserved IP addresses – Functionality – Add rule – ");  
      response = fun.MercuryLogin();
		if (response.equals("Pass")) {
		  
		  response = TestAction.getLoginAction().getTestResult(test_case); }
		  fun.webUI_Mercury_Advanced_settings_DHCP_Add_Rule_RevertBack();
		  Assert.assertEquals(response, "Pass", response);
	}
//	//CAUT-6161 
//	@Test(priority = 15)
//	public void FA07_DHCP_AdvSettings_DHCP_Reserved_IPAddress_Func_Delete() {
//
//		 String test_case = new Object() {
//		}.getClass().getEnclosingMethod().getName();
//		log.info("Test Case: " + test_case); 
//		log.info("Jira Name: LGI-webUI – Mercury – FA07 – DHCP – 7.3 Advanced Settings – DHCP – Reserved IP addresses – Functionality – Delete – ");  
//  response = fun.MercuryLogin();
//		  if (response.equals("Pass")) {
//		  
//		  response = TestAction.getLoginAction().getTestResult(test_case); }
//		  Assert.assertEquals(response, "Pass", response);
//	}
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
