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

public class PortTriggering {

	Logger log = null;
	CommonFunctionality fun = new CommonFunctionality();
	String response = null;

	@BeforeClass
	public void testInitBrowser() {

		log = Driver.getLogger();
		log.info("+++++++++++++++++ Gateway Model: " + runAut.modem + " - Port Triggering Page +++++++++++++++++");
	}

	@BeforeMethod
	public void testFactoryReset() throws InterruptedException {


		log.info("+++++++++++++++++ START TEST +++++++++++++++++");

		Driver.openModel();

		
	     response = fun.MercuryLogin();
	}

	 @Test(priority = 1)
	 public void
	 webUI_Mercury_Advanced_settings_Security_Port_Triggering_Default_status_1966()
	 {
	
	 String test_case = new Object() {
	 }.getClass().getEnclosingMethod().getName();
	 log.info("Test Case: " + test_case);
	
	 
	 if (response.equals("Pass")) {
	
	 response = TestAction.getLoginAction().getTestResult(test_case);
	 }
	
	 Assert.assertEquals(response, "Pass", response);
	 }

	@Test(priority = 2)
	public void webUI_Mercury_Advanced_settings_Security_Port_Triggering_add_rule_TCP_Enable_1967() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}
		fun.webUI_Mercury_Advanced_settings_Security_Port_Triggering_RevertBack();
		Assert.assertEquals(response, "Pass", response);
	}
	
	 @Test(priority = 3)
	 public void
	 webUI_Mercury_Advanced_settings_Security_Port_Triggering_add_rule_UDP_Enable_1968()
	 {
	
	 String test_case = new Object() {
	 }.getClass().getEnclosingMethod().getName();
	 log.info("Test Case: " + test_case);

	
	 if (response.equals("Pass")) {
	
	 response = TestAction.getLoginAction().getTestResult(test_case);
	 }
	 fun.webUI_Mercury_Advanced_settings_Security_Port_Triggering_RevertBack();
	 Assert.assertEquals(response, "Pass", response);
	 }
	
	 @Test(priority = 4)
	 public void
	 webUI_Mercury_Advanced_settings_Security_Port_Triggering_add_rule_Both_Enable_1969()
	 {
	
	 String test_case = new Object() {
	 }.getClass().getEnclosingMethod().getName();
	 log.info("Test Case: " + test_case);
	

	
	 if (response.equals("Pass")) {
	
	 response = TestAction.getLoginAction().getTestResult(test_case);
	 }
	 fun.webUI_Mercury_Advanced_settings_Security_Port_Triggering_RevertBack();
	 Assert.assertEquals(response, "Pass", response);
	 }
	
	 @Test(priority = 5)
	 public void
	 webUI_Mercury_Advanced_settings_Security_Port_Triggering_add_rule_range_of_TCP_Enable_1970()
	 {
	
	 String test_case = new Object() {
	 }.getClass().getEnclosingMethod().getName();
	 log.info("Test Case: " + test_case);
	

	
	 if (response.equals("Pass")) {
	
	 response = TestAction.getLoginAction().getTestResult(test_case);
	 }
	 fun.webUI_Mercury_Advanced_settings_Security_Port_Triggering_RevertBack();
	 Assert.assertEquals(response, "Pass", response);
	 }

	 @Test(priority = 6)
	 public void
	 webUI_Mercury_Advanced_settings_Security_Port_Triggering_add_rule_range_of_UDP_Enable_1971()
	 {
	
	 String test_case = new Object() {
	 }.getClass().getEnclosingMethod().getName();
	 log.info("Test Case: " + test_case);
	
	 if (response.equals("Pass")) {
	
	 response = TestAction.getLoginAction().getTestResult(test_case);
	 }
	 fun.webUI_Mercury_Advanced_settings_Security_Port_Triggering_RevertBack();
	 Assert.assertEquals(response, "Pass", response);
	 }
	
	 @Test(priority = 7)
	 public void
	 webUI_Mercury_Advanced_settings_Security_Port_Triggering_add_rule_range_of_Both_Enable_1972()

	 {
	
	 String test_case = new Object() {
	 }.getClass().getEnclosingMethod().getName();
	 log.info("Test Case: " + test_case);
	
	 if (response.equals("Pass")) {
	
	 response = TestAction.getLoginAction().getTestResult(test_case);
	 }
	 fun.webUI_Mercury_Advanced_settings_Security_Port_Triggering_RevertBack();
	 Assert.assertEquals(response, "Pass", response);
	 }
	
	 @Test(priority = 8)
	 public void
	 webUI_Mercury_Advanced_settings_Security_Port_Triggering_add_rule_range_trigger_and_unique_target_of_TCP_Enable_1973()
	 {
	
	 String test_case = new Object() {
	 }.getClass().getEnclosingMethod().getName();
	 log.info("Test Case: " + test_case);
	
	 if (response.equals("Pass")) {
	
	 response = TestAction.getLoginAction().getTestResult(test_case);
	 }
	 fun.webUI_Mercury_Advanced_settings_Security_Port_Triggering_RevertBack();
	 Assert.assertEquals(response, "Pass", response);
	 }
	
	 @Test(priority = 9)
	 public void
	 webUI_Mercury_Advanced_settings_Security_Port_Triggering_add_rule_range_trigger_and_unique_target_of_UDP_Enable_1974()
	 {
	
	 String test_case = new Object() {
	 }.getClass().getEnclosingMethod().getName();
	 log.info("Test Case: " + test_case);
	
	 if (response.equals("Pass")) {
	
	 response = TestAction.getLoginAction().getTestResult(test_case);
	 }
	 fun.webUI_Mercury_Advanced_settings_Security_Port_Triggering_RevertBack();
	 Assert.assertEquals(response, "Pass", response);
	 }
	
	 @Test(priority = 10)
	 public void
	 webUI_Mercury_Advanced_settings_Security_Port_Triggering_add_rule_range_trigger_and_unique_target_of_Both_Enable_1975()
	 {
	
	 String test_case = new Object() {
	 }.getClass().getEnclosingMethod().getName();
	 log.info("Test Case: " + test_case);
	
	 if (response.equals("Pass")) {
	
	 response = TestAction.getLoginAction().getTestResult(test_case);
	 }
	 fun.webUI_Mercury_Advanced_settings_Security_Port_Triggering_RevertBack();
	 Assert.assertEquals(response, "Pass", response);
	 }
	
	 @Test(priority = 11)
	 public void
	 webUI_Mercury_Advanced_settings_Security_Port_Triggering_add_rule_unique_trigger_and_range_target_of_TCP_Enable_1976()
	 {
	
	 String test_case = new Object() {
	 }.getClass().getEnclosingMethod().getName();
	 log.info("Test Case: " + test_case);
	
	 if (response.equals("Pass")) {
	
	 response = TestAction.getLoginAction().getTestResult(test_case);
	 }
	 fun.webUI_Mercury_Advanced_settings_Security_Port_Triggering_RevertBack();
	 Assert.assertEquals(response, "Pass", response);
	 }
	
	 @Test(priority = 12)
	 public void
	 webUI_Mercury_Advanced_settings_Security_Port_Triggering_add_rule_unique_trigger_and_range_target_of_UDP_Enable_1977()
	 {
	
	 String test_case = new Object() {
	 }.getClass().getEnclosingMethod().getName();
	 log.info("Test Case: " + test_case);
	
	 if (response.equals("Pass")) {
	
	 response = TestAction.getLoginAction().getTestResult(test_case);
	 }
	 fun.webUI_Mercury_Advanced_settings_Security_Port_Triggering_RevertBack();
	 Assert.assertEquals(response, "Pass", response);
	 }
	
	 @Test(priority = 13)
	 public void
	 webUI_Mercury_Advanced_settings_Security_Port_Triggering_add_rule_unique_trigger_and_range_target_of_Both_Enable_1978()
	 {
	
	 String test_case = new Object() {
	 }.getClass().getEnclosingMethod().getName();
	 log.info("Test Case: " + test_case);
	
	 if (response.equals("Pass")) {
	
	 response = TestAction.getLoginAction().getTestResult(test_case);
	 }
	 fun.webUI_Mercury_Advanced_settings_Security_Port_Triggering_RevertBack();
	 Assert.assertEquals(response, "Pass", response);
	 }
	
	 @Test(priority = 14)
	 public void
	 webUI_Mercury_Advanced_settings_Security_Port_Triggering_add_rule_Invalid_Trigger_start_port_1979()
	 {
	
	 String test_case = new Object() {
	 }.getClass().getEnclosingMethod().getName();
	 log.info("Test Case: " + test_case);
	
	 if (response.equals("Pass")) {
	
	 response = TestAction.getLoginAction().getTestResult(test_case);
	 }
	
	 Assert.assertEquals(response, "Pass", response);
	 }
	
	 @Test(priority = 15)
	 public void
	 webUI_Mercury_Advanced_settings_Security_Port_Triggering_add_rule_Invalid_Trigger_end_port_1980()
	 {
	
	 String test_case = new Object() {
	 }.getClass().getEnclosingMethod().getName();
	 log.info("Test Case: " + test_case);
	
	 if (response.equals("Pass")) {
	
	 response = TestAction.getLoginAction().getTestResult(test_case);
	 }
	
	 Assert.assertEquals(response, "Pass", response);
	 }
	
	 @Test(priority = 16)
	 public void
	 webUI_Mercury_Advanced_settings_Security_Port_Triggering_add_rule_Invalid_Target_start_port_1981()
	 {
	
	 String test_case = new Object() {
	 }.getClass().getEnclosingMethod().getName();
	 log.info("Test Case: " + test_case);
	
	 if (response.equals("Pass")) {
	
	 response = TestAction.getLoginAction().getTestResult(test_case);
	 }
	
	 Assert.assertEquals(response, "Pass", response);
	 }
	
	 @Test(priority = 17)
	 public void
	 webUI_Mercury_Advanced_settings_Security_Port_Triggering_add_rule_Invalid_Target_end_port_1982()
	 {
	
	 String test_case = new Object() {
	 }.getClass().getEnclosingMethod().getName();
	 log.info("Test Case: " + test_case);
	
	 if (response.equals("Pass")) {
	
	 response = TestAction.getLoginAction().getTestResult(test_case);
	 }
	
	 Assert.assertEquals(response, "Pass", response);
	 }
	
	 @Test(priority = 18)
	 public void
	 webUI_Mercury_Advanced_settings_Security_Port_Triggering_add_rule_TCP_Enable_1983()
	 {
	
	 String test_case = new Object() {
	 }.getClass().getEnclosingMethod().getName();
	 log.info("Test Case: " + test_case);
	
	 if (response.equals("Pass")) {
	
	 response = TestAction.getLoginAction().getTestResult(test_case);
	 }
	 fun.webUI_Mercury_Advanced_settings_Security_Port_Triggering_RevertBack();
	 Assert.assertEquals(response, "Pass", response);
	 }
	
	 @Test(priority = 19)
	 public void
	 webUI_Mercury_Advanced_settings_Security_Port_Triggering_Existing_rules_Disable_1984()
	 {
	
	 String test_case = new Object() {
	 }.getClass().getEnclosingMethod().getName();
	 log.info("Test Case: " + test_case);
	
	 if (response.equals("Pass")) {
	
	 response = TestAction.getLoginAction().getTestResult(test_case);
	 }
	 fun.webUI_Mercury_Advanced_settings_Security_Port_Triggering_RevertBack();
	 Assert.assertEquals(response, "Pass", response);
	 }
	
	 @Test(priority = 20)
	 public void
	 webUI_Mercury_Advanced_settings_Security_Port_Triggering_Existing_rules_Enable_1985()
	 {
	
	 String test_case = new Object() {
	 }.getClass().getEnclosingMethod().getName();
	 log.info("Test Case: " + test_case);
	
	 if (response.equals("Pass")) {
	
	 response = TestAction.getLoginAction().getTestResult(test_case);
	 }
	 fun.webUI_Mercury_Advanced_settings_Security_Port_Triggering_RevertBack();
	 Assert.assertEquals(response, "Pass", response);
	 }
	
	 @Test(priority = 21)
	 public void
	 webUI_Mercury_Advanced_settings_Security_Port_Triggering_Existing_rules_Delete_1986()
	 {
	
	 String test_case = new Object() {
	 }.getClass().getEnclosingMethod().getName();
	 log.info("Test Case: " + test_case);
	
	 if (response.equals("Pass")) {
	
	 response = TestAction.getLoginAction().getTestResult(test_case);
	 }
	
	 Assert.assertEquals(response, "Pass", response);
	 }
	
	 @Test(priority = 22)
	 public void
	 webUI_Mercury_Advanced_settings_Security_Port_Triggering_add_rule_Maximum_Rules_1987()
 
	 {
	
	 String test_case = new Object() {
	 }.getClass().getEnclosingMethod().getName();
	 log.info("Test Case: " + test_case);
	
	 if (response.equals("Pass")) {
	
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
