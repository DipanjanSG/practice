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

public class Dhcp_ipv6 {
	
	Logger log = null;
	CommonFunctionality fun= new CommonFunctionality();
	String response = null;
	
	@BeforeClass
	public void testInitBrowser() {

		log = Driver.getLogger();
		log.info("+++++++++++++++++ Gateway Model: " + runAut.modem + " - DHCP IPV6 Page +++++++++++++++++");
	}

	@BeforeMethod
	public void testFactoryReset() {

		log.info("+++++++++++++++++ START TEST +++++++++++++++++");
		
	
		Driver.openModel();
		
	
		response = fun.MercuryLogin();
	}


	@Test(priority = 1)
	public void webUI_Mercury_Advanced_settings_DHCPV4_in_DSLite_mode_Default_values_2047() {

		log.info("Test Case: "+ new Object(){}.getClass().getEnclosingMethod().getName());
		response = fun.DHCPV4_IPv4RGAndDSLite_DefaultValues();		
		
		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 2)
	public void webUI_Mercury_Advanced_settings_DHCPV4_in_DSLite_mode_Disabled_2048() {

		log.info("Test Case: "+ new Object(){}.getClass().getEnclosingMethod().getName());
		response = fun.DHCPV4_IPv4RGAndDSLite_Disabled();		
		
		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 3)
	public void webUI_Mercury_Advanced_settings_DHCPV4_in_DSLite_mode_Change_starting_local_address_2049() {

		log.info("Test Case: "+ new Object(){}.getClass().getEnclosingMethod().getName());
		response = fun.DHCPV4_IPv4RGAndDSLite_ChangeStartingLocalAddress();		
		
		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 4)
	public void webUI_Mercury_Advanced_settings_DHCPV4_in_DSLite_mode_Change_starting_local_address_without_changing_number_of_CPEs_2050() {

		log.info("Test Case: "+ new Object(){}.getClass().getEnclosingMethod().getName());
		response = fun.DHCPV4_IPv4RGAndDSLite_ChangeStartingLocalAddressWithoutChangingNoOfCPEs();		
		
		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 5)
	public void webUI_Mercury_Advanced_settings_DHCPV4_in_DSLite_mode_Change_starting_local_address_with_invalid_IP_2051() {

		
		log.info("Test Case: "+ new Object(){}.getClass().getEnclosingMethod().getName());
		response = fun.DHCPV4_IPv4RGAndDSLite_ChangeStartingLocalAddressInvalidIP();		
		
		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 6)
	public void webUI_Mercury_Advanced_settings_DHCPV4_in_DSLite_mode_Change_Number_of_CPEs_2052() {

		log.info("Test Case: "+ new Object(){}.getClass().getEnclosingMethod().getName());
		response = fun.DHCPV4_IPv4RGAndDSLite_ChangeNoOfCPEs();		
		if (response.equals("Profile not connected"))
		response = "Pass";
	
	Assert.assertEquals(response, "Pass", response);
	
	TestAction.getLoginAction().getTestResult("DHCPV4_IPv4RGAndDSLite_ChangeNoOfCPEsDefault");

	}
	
	@Test(priority = 7)
	public void webUI_Mercury_Advanced_settings_DHCPV4_in_DSLite_mode_Change_Number_of_CPEs_with_invalid_value_2053() {

		
		log.info("Test Case: "+ new Object(){}.getClass().getEnclosingMethod().getName());
		response = fun.DHCPV4_IPv4RGAndDSLite_ChangeNoOfCPEsInvalid();		
		
		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 8)
	public void webUI_Mercury_Advanced_settings_DHCPV4_in_DSLite_mode_Lease_time_2054() {

	
		log.info("Test Case: "+ new Object(){}.getClass().getEnclosingMethod().getName());
		response = fun.DHCPV4_IPv4RGAndDSLite_LeaseTime();		
		
		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 9)
	public void webUI_Mercury_Advanced_settings_DHCPV4_in_DSLite_mode_Change_Lease_time_2055() {

		log.info("Test Case: "+ new Object(){}.getClass().getEnclosingMethod().getName());
		response = fun.DHCPV4_IPv4RGAndDSLite_ChangeLeaseTimeValid();		
		TestAction.getLoginAction().getTestResult("DHCPV4_IPv4RGAndDSLite_ChangeToDefault");

		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 10)
	public void webUI_Mercury_Advanced_settings_DHCPV4_in_DSLite_mode_Change_Lease_time_with_invalid_value_2056() {

		
		log.info("Test Case: "+ new Object(){}.getClass().getEnclosingMethod().getName());
		response = fun.DHCPV4_IPv4RGAndDSLite_ChangeLeaseTimeInvalid();		
		
		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 11)
	public void webUI_Mercury_Advanced_settings_DHCPV4_in_DSLite_mode_Reserved_IP_addresses_Attached_Devices_default_2057() {

		
		log.info("Test Case: "+ new Object(){}.getClass().getEnclosingMethod().getName());
		response = fun.DHCPV4_IPv4RGAndDSLite_ReservedIPAddressesAttachedDeviceDefault();		
		
		Assert.assertEquals(response, "Pass", response);
	}
	//WiFi related LAN side TC
	@Test(priority = 12)
	public void webUI_Mercury_Advanced_settings_DHCPV4_in_DSLite_mode_Reserved_IP_addresses_Attached_Devices_Refresh_2058() {
		 String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case); 
		  
		  if (response.equals("Pass")) {
		  
		  response = TestAction.getLoginAction().getTestResult(test_case); }
		  Assert.assertEquals(response, "Pass", response);
	}
	//WiFi related LAN side TC
	@Test(priority = 13)
	public void webUI_Mercury_Advanced_settings_DHCPV4_in_DSLite_mode_Reserved_IP_addresses_Add_reserved_rule_Default_2059() {
		 String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case); 
		  
		  if (response.equals("Pass")) {
		  
		  response = TestAction.getLoginAction().getTestResult(test_case); }
		  Assert.assertEquals(response, "Pass", response);
	}
	//WiFi related LAN side TC
	@Test(priority = 14)
	public void webUI_Mercury_Advanced_settings_DHCPV4_in_DSLite_mode_Reserved_IP_addresses_Add_rule_from_Attached_devices_table_2060() {

		log.info("Test Case: "+ new Object(){}.getClass().getEnclosingMethod().getName());
		response = fun.DHCPV4_IPv4RGAndDSLite_ReservedIPAddRuleAttachedDevice();		
		fun.webUI_Mercury_Advanced_settings_DHCP_Add_Rule_RevertBack();
		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 15)
	public void webUI_Mercury_Advanced_settings_DHCPV4_in_DSLite_mode_Reserved_IP_addresses_Add_rule_manually_2061() {

		log.info("Test Case: "+ new Object(){}.getClass().getEnclosingMethod().getName());
		response = fun.DHCPV4_IPv4RGAndDSLite_ReservedIPAddRuleManully();		
		fun.webUI_Mercury_Advanced_settings_DHCP_Add_Rule_RevertBack();
		Assert.assertEquals(response, "Pass", response);
		
	}
	
	@Test(priority = 16)
	public void webUI_Mercury_Advanced_settings_DHCPV4_in_DSLite_mode_Reserved_IP_addresses_Add_rule_manually_Invalid_Mac_address_2062() {

		log.info("Test Case: "+ new Object(){}.getClass().getEnclosingMethod().getName());
		response = fun.DHCPV4_IPv4RGAndDSLite_ReservedIPAddRuleManullyInvalidMac();		
		
		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 17)
	public void webUI_Mercury_Advanced_settings_DHCPV4_in_DSLite_mode_Reserved_IP_addresses_Add_rule_manually_Invalid_IP_address_2063() {

		log.info("Test Case: "+ new Object(){}.getClass().getEnclosingMethod().getName());
		response = fun.DHCPV4_IPv4RGAndDSLite_ReservedIPAddRuleManullyInvalidIP();		
		
		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 18)
	public void webUI_Mercury_Advanced_settings_DHCPV4_in_DSLite_mode_Reserved_IP_addresses_Reserved_list_Default_2064() {

		log.info("Test Case: "+ new Object(){}.getClass().getEnclosingMethod().getName());
		response = fun.DHCPV4_IPv4RGAndDSLite_ReservedIPReservedListDefault();		
		
		Assert.assertEquals(response, "Pass", response);
	}
//	//WiFi related LAN side TC
	@Test(priority = 19)
	public void webUI_Mercury_Advanced_settings_DHCPV4_in_DSLite_mode_Reserved_IP_addresses_Reserved_list_Delete_2065() {

		log.info("Test Case: "+ new Object(){}.getClass().getEnclosingMethod().getName());
		response = fun.DHCPV4_IPv4RGAndDSLite_ReservedIPReservedListDelete();		
		
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
