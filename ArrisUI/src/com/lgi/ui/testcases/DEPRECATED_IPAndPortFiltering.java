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

public class DEPRECATED_IPAndPortFiltering {

	Logger log = null;
	CommonFunctionality fun = new CommonFunctionality();
	String response = null;
	TestAction action;

	@BeforeClass
	public void testInitBrowser() {

		log = Driver.getLogger();
		log.info(
				"+++++++++++++++++ Gateway Model: " + runAut.modem + " - IP and Port Filtering Page +++++++++++++++++");
		
		Driver.openModel();
		fun.MercuryInitialSetup();
		Driver.closeDriver();
	}

	@BeforeMethod
	public void testFactoryReset() 
	{

		log.info("+++++++++++++++++ START TEST +++++++++++++++++");
		
		log.info("Enabling DHCP for AutomationLAN and AutomationWiFi");
		
		action = new TestAction();
		
		String command = "netsh interface ip set address \"AutomationLAN\" dhcp";
		action.runCommand(command);
				
		command = "netsh interface ip set address \"AutomationWiFi\" dhcp";
		action.runCommand(command);
		
		command="netsh interface ip set dnsservers name = \"AutomationWiFi\" source=dhcp";
		action.runCommand(command);
		}

	@Test(priority = 1)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_default_status_1838() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();

		if (response.equals("Pass")) 
		{

			response = TestAction.getLoginAction().getTestResult(test_case);
		}

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 2)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_All_protocol_All_Source_IP_All_Destination_IP_1839() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}

		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 3)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_All_protocol_All_Source_IP_Single_Destination_IP_1840() 
	{

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 4)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_All_protocol_All_Source_IP_range_of_Destination_IP_1841() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 5)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_All_protocol_Single_Source_IP_All_Destination_IP_1842() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();
		// String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}

		fun.webUI_Mercury_Advanced_settings_Security_EnableAutomationLAN();
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 6)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_All_protocol_Single_Source_IP_Single_Destination_IP_1843() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_EnableAutomationLAN();
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 7)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_All_protocol_Single_Source_IP_Range_of_Destination_IP_1844() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_EnableAutomationLAN();
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 8)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_All_protocol_Range_of_Source_IP_All_Destination_IP_1845() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();
		// String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_EnableAutomationLAN();
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);

	}

	@Test(priority = 9)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_All_protocol_Range_of_Source_IP_Single_Destination_IP_1846() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();
		// String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_EnableAutomationLAN();
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 10)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_All_protocol_Range_of_Source_IP_Range_of_Destination_IP_1847() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();
		// String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_EnableAutomationLAN();
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 11)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_All_protocol_Invalid_Source_IP_Range_of_Destination_IP_1848() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();
		// String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 12)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_All_protocol_All_Source_IP_Invalid_Destination_IP_1849() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();
		// String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 13)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_UDP_protocol_Any_source_port_range_Any_destination_port_range_1850() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 14)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_UDP_protocol_Any_source_port_range_Manual_destination_port_range_1851() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 15)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_UDP_protocol_Any_source_port_range_Tacacs_destination_port_range_1852() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 16)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_UDP_protocol_Any_source_port_range_BOOTP_SERVER_destination_port_range_1853() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		Driver.openModel();

		String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 17)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_UDP_protocol_Any_source_port_range_BOOTP_CLIENT_destination_port_range_1854() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		Driver.openModel();

		String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 18)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_UDP_protocol_Any_source_port_range_TFTP_destination_port_range_1855() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		Driver.openModel();

		String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 19)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_UDP_protocol_Any_source_port_range_STRMWORKS_destination_port_range_1856() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		Driver.openModel();

		String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 20)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_UDP_protocol_Any_source_port_range_NFS_destination_port_range_1857() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		Driver.openModel();

		String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 21)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_UDP_protocol_Any_source_port_range_Manual_Invalid_destination_port_range_1858() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		Driver.openModel();

		String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 22)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_UDP_protocol_Manual_source_port_range_Any_destination_port_range_1859() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 23)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_UDP_protocol_Manual_invalid_source_port_range_Any_destination_port_range_1860() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 24)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_TCP_protocol_Any_source_port_range_Any_destination_port_range_1861() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 25)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_TCP_protocol_Any_source_port_range_Manual_destination_port_range_1862() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 26)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_TCP_protocol_Any_source_port_range_FTP_destination_port_range_1863() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 27)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_TCP_protocol_Any_source_port_range_TELNET_destination_port_range_1864() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		Driver.openModel();

		String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 28)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_TCP_protocol_Any_source_port_range_SMTP_destination_port_range_1865() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		Driver.openModel();

		String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 29)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_TCP_protocol_Any_source_port_range_FINGER_destination_port_range_1866() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		Driver.openModel();

		String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 30)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_TCP_protocol_Any_source_port_range_HTTP_destination_port_range_1867() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		Driver.openModel();

		String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 31)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_TCP_protocol_Any_source_port_range_RTELNET_destination_port_range_1868() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		Driver.openModel();

		String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 32)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_TCP_protocol_Any_source_port_range_POP3_destination_port_range_1869() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		Driver.openModel();

		String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 33)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_TCP_protocol_Any_source_port_range_SFTP_destination_port_range_1870() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		Driver.openModel();

		String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 34)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_TCP_protocol_Any_source_port_range_NNTP_destination_port_range_1871() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		Driver.openModel();

		String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 35)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_TCP_protocol_Any_source_port_range_NEWS_destination_port_range_1872() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		Driver.openModel();

		String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 36)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_TCP_protocol_Any_source_port_range_BGP_destination_port_range_1873() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		Driver.openModel();

		String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 37)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_TCP_protocol_Any_source_port_range_HTTPS_destination_port_range_1874() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		Driver.openModel();

		String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 38)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_TCP_protocol_Any_source_port_range_RCMD_destination_port_range_1875() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		Driver.openModel();

		String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 39)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_TCP_protocol_Any_source_port_range_RLOGIN_destination_port_range_1876() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		Driver.openModel();

		String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 40)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_TCP_protocol_Any_source_port_range_REXEC_destination_port_range_1877() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		Driver.openModel();

		String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 41)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_TCP_protocol_Any_source_port_range_SQL_NET_destination_port_range_1878() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		Driver.openModel();

		String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 42)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_TCP_protocol_Any_source_port_range_H323_destination_port_range_1879() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		Driver.openModel();

		String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 43)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_TCP_protocol_Any_source_port_range_PPTP_destination_port_range_1880() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		Driver.openModel();

		String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 44)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_TCP_protocol_Any_source_port_range_AIM_destination_port_range_1881() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		Driver.openModel();

		String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 45)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_TCP_protocol_Any_source_port_range_VDOLIVE_destination_port_range_1882() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		Driver.openModel();

		String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 46)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_TCP_protocol_Any_source_port_range_REAL_AUDIO_destination_port_range_1883() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		Driver.openModel();

		String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 47)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_TCP_protocol_Any_source_port_range_Manual_Invalid_destination_port_range_1884() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 48)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_TCP_protocol_Manual_source_port_range_Any_destination_port_range_1885() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();
		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 49)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_TCP_protocol_Manual_invalid_source_port_range_Any_destination_port_range_1886() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 50)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_UDPTCP_protocol_Any_source_port_range_Any_destination_port_range_1887() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();
		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 51)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_UDPTCP_protocol_Any_source_port_range_Manual_destination_port_range_1888() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();
		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 52)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_UDPTCP_protocol_Any_source_port_range_FTP_destination_port_range_1889() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();
		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 53)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_UDPTCP_protocol_Any_source_port_range_TELNET_destination_port_range_1890() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		Driver.openModel();

		String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 54)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_UDPTCP_protocol_Any_source_port_range_SMTP_destination_port_range_1891() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		Driver.openModel();

		String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 55)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_UDPTCP_protocol_Any_source_port_range_FINGER_destination_port_range_1892() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		Driver.openModel();

		String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 56)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_UDPTCP_protocol_Any_source_port_range_HTTP_destination_port_range_1893() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		Driver.openModel();

		String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 57)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_UDPTCP_protocol_Any_source_port_range_RTELNET_destination_port_range_1894() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		Driver.openModel();

		String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 58)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_UDPTCP_protocol_Any_source_port_range_POP3_destination_port_range_1895() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		Driver.openModel();

		String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 59)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_UDPTCP_protocol_Any_source_port_range_SFTP_destination_port_range_1896() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		Driver.openModel();

		String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 60)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_UDPTCP_protocol_Any_source_port_range_NNTP_destination_port_range_1897() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		Driver.openModel();

		String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 61)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_UDPTCP_protocol_Any_source_port_range_NEWS_destination_port_range_1898() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		Driver.openModel();

		String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 62)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_UDPTCP_protocol_Any_source_port_range_BGP_destination_port_range_1899() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		Driver.openModel();

		String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 63)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_UDPTCP_protocol_Any_source_port_range_HTTPS_destination_port_range_1900() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		Driver.openModel();

		String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 64)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_UDPTCP_protocol_Any_source_port_range_RCMD_destination_port_range_1901() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		Driver.openModel();

		String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 65)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_UDPTCP_protocol_Any_source_port_range_RLOGIN_destination_port_range_1902() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		Driver.openModel();

		String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 66)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_UDPTCP_protocol_Any_source_port_range_REXEC_destination_port_range_1903() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		Driver.openModel();

		String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 67)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_UDPTCP_protocol_Any_source_port_range_SQL_NET_destination_port_range_1904() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		Driver.openModel();

		String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 68)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_UDPTCP_protocol_Any_source_port_range_H323_destination_port_range_1905() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		Driver.openModel();

		String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 69)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_UDPTCP_protocol_Any_source_port_range_PPTP_destination_port_range_1906() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		Driver.openModel();

		String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 70)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_UDPTCP_protocol_Any_source_port_range_AIM_destination_port_range_1907() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		Driver.openModel();

		String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 71)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_UDPTCP_protocol_Any_source_port_range_VDOLIVE_destination_port_range_1908() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		Driver.openModel();

		String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 72)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_UDPTCP_protocol_Any_source_port_range_REAL_AUDIO_destination_port_range_1909() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		Driver.openModel();

		String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 73)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_UDPTCP_protocol_Any_source_port_range_Tacacs_destination_port_range_1910() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		Driver.openModel();

		String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 74)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_UDPTCP_protocol_Any_source_port_range_BOOTP_SERVER_destination_port_range_1911() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		Driver.openModel();

		String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 75)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_UDPTCP_protocol_Any_source_port_range_BOOTP_CLIENT_destination_port_range_1912() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		Driver.openModel();

		String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 76)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_UDPTCP_protocol_Any_source_port_range_TFTP_destination_port_range_1913() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		Driver.openModel();

		String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 77)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_UDPTCP_protocol_Any_source_port_range_STRMWORKS_destination_port_range_1914() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		Driver.openModel();

		String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 78)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_UDPTCP_protocol_Any_source_port_range_NFS_destination_port_range_1915() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		Driver.openModel();

		String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 79)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_UDPTCP_protocol_Any_source_port_range_SSH_destination_port_range_1916() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		Driver.openModel();

		String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 80)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_UDPTCP_protocol_Any_source_port_range_DNS_destination_port_range_1917() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		Driver.openModel();

		String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 81)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_UDPTCP_protocol_Any_source_port_range_SNMP_destination_port_range_1918() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		Driver.openModel();

		String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 82)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_UDPTCP_protocol_Any_source_port_range_SNMP_TRAPS_destination_port_range_1919() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		Driver.openModel();

		String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 83)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_UDPTCP_protocol_Any_source_port_range_RTSP_destination_port_range_1920() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		Driver.openModel();

		String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 84)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_UDPTCP_protocol_Any_source_port_range_IRC_destination_port_range_1921() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		Driver.openModel();

		String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 85)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_UDPTCP_protocol_Any_source_port_range_CU_SEEME_destination_port_range_1922() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		Driver.openModel();

		String response = fun.MercuryLogin();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 86)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_UDPTCP_protocol_Any_source_port_range_Manual_Invalid_destination_port_range_1923() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 87)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_UDPTCP_protocol_Manual_source_port_range_Any_destination_port_range_1924() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();
		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 88)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_UDPTCP_protocol_Manual_invalid_source_port_range_Any_destination_port_range_1925() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 89)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_All_protocol_All_Source_IP_All_Destination_IP_Disabled_1926() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();
		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 90)
	public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_add_rule_All_protocol_All_Source_IP_All_Destination_IP_Enabled_1927() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		fun.RebootGateWay();
		Driver.openModel();

		String response = fun.MercuryInitialSetup();

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();
		Assert.assertEquals(response, "Pass", response);
	}

	 @Test(priority = 91)
	 public void
	 webUI_Mercury_Advanced_settings_Security_IP_and_Port_filtering_add_rule_Same_time_every_day_end_of_blocking_period_1928()
	 {
	
	 fun.RebootGateWay();
	 Driver.openModel();
	
	 String response = fun.MercuryInitialSetup();
	
	
	 if(response.equals("Pass")){
	
	 String test_case = new Demo()
	 {}.getClass().getEnclosingMethod().getName();
	 response = TestAction.getLoginAction().getTestResult(test_case);
	 }
	 fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();
	 Assert.assertEquals(response, "Pass", response);
	 }
	
	 @Test(priority = 92)
	 public void
	 webUI_Mercury_Advanced_settings_Security_IP_and_Port_filtering_add_rule_Same_time_every_day_Start_of_blocking_period_1929()
	 {
	
	 fun.RebootGateWay();
	 Driver.openModel();
	
	 String response = fun.MercuryInitialSetup();
	
	 if(response.equals("Pass")){
	
	 String test_case = new Demo()
	 {}.getClass().getEnclosingMethod().getName();
	 response = TestAction.getLoginAction().getTestResult(test_case);
	 }
	 fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();
	 Assert.assertEquals(response, "Pass", response);
	 }
	
	 @Test(priority = 93)
	 public void
	 webUI_Mercury_Advanced_settings_Security_IP_and_Port_filtering_add_rule_Same_time_every_day_Clear_All_1930()
	 {
	
	 fun.RebootGateWay();
	 Driver.openModel();
	
	 String response = fun.MercuryInitialSetup();
	
	
	 if(response.equals("Pass")){
	
	 String test_case = new Demo()
	 {}.getClass().getEnclosingMethod().getName();
	 response = TestAction.getLoginAction().getTestResult(test_case);
	 }
	
	 Assert.assertEquals(response, "Pass", response);
	 }
	
	 @Test(priority = 94)
	 public void
	 webUI_Mercury_Advanced_settings_Security_IP_and_Port_filtering_add_rule_Different_times_on_different_days_end_of_blocking_period_1931()
	 {
	
	 fun.RebootGateWay();
	 Driver.openModel();
	
	 String response = fun.MercuryInitialSetup();
	
	 if(response.equals("Pass")){
	
	 String test_case = new Demo()
	 {}.getClass().getEnclosingMethod().getName();
	 response = TestAction.getLoginAction().getTestResult(test_case);
	 }
	 fun.webUI_Mercury_Advanced_settings_Security_IP_and_Port_Filtering_RevertBack();
	 Assert.assertEquals(response, "Pass", response);
	 }
	
	 @Test(priority = 95)
	 public void
	 webUI_Mercury_Advanced_settings_Security_IP_and_Port_filtering_add_rule_Different_times_on_different_days_start_of_blocking_period_1932()
	 {
	
	 fun.RebootGateWay();
	 Driver.openModel();
	
	 String response = fun.MercuryInitialSetup();
	
	 if(response.equals("Pass")){
	
	 String test_case = new Demo()
	 {}.getClass().getEnclosingMethod().getName();
	 response = TestAction.getLoginAction().getTestResult(test_case);
	 }
	
	 Assert.assertEquals(response, "Pass", response);
	 }
	
	 @Test(priority = 96)
	 public void
	 webUI_Mercury_Advanced_settings_Security_IP_and_Port_filtering_add_rule_Different_times_on_different_days_Clear_All_1933()
	 {
	
	 fun.RebootGateWay();
	 Driver.openModel();
	
	 String response = fun.MercuryInitialSetup();
	
	 if(response.equals("Pass")){
	
	 String test_case = new Demo()
	 {}.getClass().getEnclosingMethod().getName();
	 response = TestAction.getLoginAction().getTestResult(test_case);
	 }
	
	 Assert.assertEquals(response, "Pass", response);
	 }
	
	 @Test(priority = 97)
	 public void webUI_Mercury_Advanced_settings_Security_IP_and_Port_filtering_add_rule_Different_times_on_different_days_Inverse_1934()
	 {
	
	 fun.RebootGateWay();
	 Driver.openModel();
	
	 String response = fun.MercuryInitialSetup();
	
	 if(response.equals("Pass")){
	
	 String test_case = new Demo()
	 {}.getClass().getEnclosingMethod().getName();
	 response = TestAction.getLoginAction().getTestResult(test_case);
	 }
	
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
