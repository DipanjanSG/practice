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

public class Firewall_Old {
                // static WebDriver driver = null;
                Logger log = null;
                CommonFunctionality fun = new CommonFunctionality();
                String response = null;

                @BeforeClass
                public void testInitBrowser() {

                                // driver = Driver.openModel();
                                log = Driver.getLogger();
                                log.info("+++++++++++++++++ Gateway Model: " + runAut.modem
                                                                + " - Firewall Page: Old Test Plan+++++++++++++++++");

                }

                @BeforeMethod
                public void testFactoryReset() {

                                log.info("+++++++++++++++++ START TEST +++++++++++++++++");

                                Driver.openModel();

                }

                // This refers to CAUT-2840
                @Test(priority = 1)
                public void webUI_Mercury_Advanced_settings_Security_Firewall_Default_values_1811() {

                                String test_case = new Object() {
                                }.getClass().getEnclosingMethod().getName();
                                log.info("Test Case: " + test_case);
                                String response = fun.MercuryLogin();

                                response = TestAction.getLoginAction().getTestResult(test_case);

                                
                                Assert.assertEquals(response, "Pass", response);
                }

                @Test(priority = 2)
                public void webUI_Mercury_Advanced_settings_Security_Firewall_Firewall_protection_Disable_1812() {

                                String test_case = new Object() {
                                }.getClass().getEnclosingMethod().getName();
                                log.info("Test Case: " + test_case);
                                String response = fun.MercuryLogin();

                                response = TestAction.getLoginAction().getTestResult(test_case);

                                Assert.assertEquals(response, "Pass", response);
                }

                @Test(priority = 3)
                public void webUI_Mercury_Advanced_settings_Security_Firewall_Firewall_protection_Enable_1813() {

                                String test_case = new Object() {
                                }.getClass().getEnclosingMethod().getName();
                                log.info("Test Case: " + test_case);
                                String response = fun.MercuryLogin();

                                response = TestAction.getLoginAction().getTestResult(test_case);

                                Assert.assertEquals(response, "Pass", response);
                }

                @Test(priority = 4)
                public void webUI_Mercury_Advanced_settings_Security_Firewall_Block_Fragmented_IP_Packets_Enable_1814() {

                                String test_case = new Object() {
                                }.getClass().getEnclosingMethod().getName();
                                log.info("Test Case: " + test_case);
                                String response = fun.MercuryLogin();

                                response = TestAction.getLoginAction().getTestResult(test_case);

                                Assert.assertEquals(response, "Pass", response);
                }

                @Test(priority = 5)
                public void webUI_Mercury_Advanced_settings_Security_Firewall_Block_Fragmented_IP_Packets_Disable_1815() {

                                String test_case = new Object() {
                                }.getClass().getEnclosingMethod().getName();
                                log.info("Test Case: " + test_case);
                                String response = fun.MercuryLogin();
                                response = TestAction.getLoginAction().getTestResult(test_case);

                                Assert.assertEquals(response, "Pass", response);
                }

                @Test(priority = 6)
                public void webUI_Mercury_Advanced_settings_Security_Firewall_Port_scan_detection_Disable_1816() {

                                String test_case = new Object() {
                                }.getClass().getEnclosingMethod().getName();
                                log.info("Test Case: " + test_case);
                                String response = fun.MercuryLogin();

                                response = TestAction.getLoginAction().getTestResult(test_case);

                                Assert.assertEquals(response, "Pass", response);
                }

                @Test(priority = 7)
                public void webUI_Mercury_Advanced_settings_Security_Firewall_Port_scan_detection_Enable_1817() {

                                String test_case = new Object() {
                                }.getClass().getEnclosingMethod().getName();
                                log.info("Test Case: " + test_case);
                                String response = fun.MercuryLogin();
                                response = TestAction.getLoginAction().getTestResult(test_case);

                                Assert.assertEquals(response, "Pass", response);
                }

                @Test(priority = 8)
                public void webUI_Mercury_Advanced_settings_Security_Firewall_IP_Flood_Detection_Disable_1818() {

                                String test_case = new Object() {
                                }.getClass().getEnclosingMethod().getName();
                                log.info("Test Case: " + test_case);
                                String response = fun.MercuryLogin();

                                response = TestAction.getLoginAction().getTestResult(test_case);

                                Assert.assertEquals(response, "Pass", response);
                }

                @Test(priority = 9)
                public void webUI_Mercury_Advanced_settings_Security_Firewall_IP_Flood_Detection_Enable_1819() {

                                String test_case = new Object() {
                                }.getClass().getEnclosingMethod().getName();
                                log.info("Test Case: " + test_case);
                                String response = fun.MercuryLogin();

                                response = TestAction.getLoginAction().getTestResult(test_case);

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
