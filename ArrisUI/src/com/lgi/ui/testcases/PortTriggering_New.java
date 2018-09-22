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

public class PortTriggering_New {

                Logger log = null;
                CommonFunctionality fun = new CommonFunctionality();
                String response = null;
                int test_number=1;
                @BeforeClass
                public void testInitBrowser() {

                                log = Driver.getLogger();
                                log.info("+++++++++++++++++ Gateway Model: " + runAut.modem + " - Port Triggering Page +++++++++++++++++");
                }

                @BeforeMethod
                public void testFactoryReset() throws InterruptedException {

                                log.info("+++++++++++++++++ START TEST +++++++++++++++++");
                                Driver.openModel();
                                  

                                                }

                //CAUT-5759
                @Test(priority = 1)
                public void FA07_Security_AdvSettings_Sec_PortTriggering_Content() throws InterruptedException {

                                
                                String test_case = new Object() {
                                }.getClass().getEnclosingMethod().getName();
                                log.info("Test Case: " + test_case); 
                                log.info("Jira Name: LGI-webUI – Mercury – FA07 – Security – 7.2.5 Advanced Settings – Security – Port Triggering – Content – ");
                                response=fun.factoryReset();
                                if (response.equals("Pass")) {

                                                response = TestAction.getLoginAction().getTestResult(test_case);
                                }

                                Assert.assertEquals(response, "Pass", response);
                }
                //CAUT-5760
                @Test(priority = 2)
                public void FA07_Security_AdvSettings_Sec_PortTriggering_CreateNewRule_Button() {

                                
                                String test_case = new Object() {
                                }.getClass().getEnclosingMethod().getName();
                                log.info("Test Case: " + test_case); 
                                log.info("Jira Name: LGI-webUI – Mercury – FA07 – Security – 7.2.5 Advanced Settings – Security – Port Triggering – Functionality – Create a new rule – Button – ");
                                response = fun.MercuryLogin();
                                if (response.equals("Pass")) {

                                                response = TestAction.getLoginAction().getTestResult(test_case);
                                }

                                Assert.assertEquals(response, "Pass", response);
                }
                //CAUT-5761
                @Test(priority = 3)
                public void FA07_Security_AdvSettings_Sec_PortTriggering_Protocol_DropDownMenu() {

                                
                                String test_case = new Object() {
                                }.getClass().getEnclosingMethod().getName();
                                log.info("Test Case: " + test_case); 
                                log.info("Jira Name: LGI-webUI – Mercury – FA07 – Security – 7.2.5 Advanced Settings – Security – Port Triggering – Functionality – Protocol – Drop-Down menu – ");
                                response = fun.MercuryLogin();
                                if (response.equals("Pass")) {

                                                response = TestAction.getLoginAction().getTestResult(test_case);
                                }

                                Assert.assertEquals(response, "Pass", response);
                }
                //CAUT-5762
                @Test(priority = 4)
                public void FA07_Security_AdvSettings_Sec_PortTriggering_Enabled_DropDownMenu() {

                                
                                String test_case = new Object() {
                                }.getClass().getEnclosingMethod().getName();
                                log.info("Test Case: " + test_case); 
                                log.info("Jira Name: LGI-webUI – Mercury – FA07 – Security – 7.2.5 Advanced Settings – Security – Port Triggering – Functionality – Enabled – Drop-Down menu – ");
                                response = fun.MercuryLogin();
                                if (response.equals("Pass")) {

                                                response = TestAction.getLoginAction().getTestResult(test_case);
                                }

                                Assert.assertEquals(response, "Pass", response);
                }
                //CAUT-5763
                @Test(priority = 5)
                public void FA07_Security_AdvSettings_Sec_PortTriggering_InfoIcon_TriggerStartPort() {

                                
                                String test_case = new Object() {
                                }.getClass().getEnclosingMethod().getName();
                                log.info("Test Case: " + test_case); 
                                log.info("Jira Name: LGI-webUI – Mercury – FA07 – Security – 7.2.5 Advanced Settings – Security – Port Triggering – Functionality – Information Trigger start port – Info icon – ");
                                response = fun.MercuryLogin();
                                if (response.equals("Pass")) {

                                                response = TestAction.getLoginAction().getTestResult(test_case);
                                }

                                Assert.assertEquals(response, "Pass", response);
                }              
                //CAUT-5764
                @Test(priority = 6)
                public void FA07_Security_AdvSettings_Sec_PortTriggering_InfoIcon_TriggerEndPort() {

                                
                                String test_case = new Object() {
                                }.getClass().getEnclosingMethod().getName();
                                log.info("Test Case: " + test_case); 
                                log.info("Jira Name: LGI-webUI – Mercury – FA07 – Security – 7.2.5 Advanced Settings – Security – Port Triggering – Functionality – Information Trigger end port – Info icon – ");
                                response = fun.MercuryLogin();
                                if (response.equals("Pass")) {

                                                response = TestAction.getLoginAction().getTestResult(test_case);
                                }

                                Assert.assertEquals(response, "Pass", response);
                }              
                //CAUT-5765
                @Test(priority = 7)
                public void FA07_Security_AdvSettings_Sec_PortTriggering_InfoIcon_TargetStartPort() {

                                
                                String test_case = new Object() {
                                }.getClass().getEnclosingMethod().getName();
                                log.info("Test Case: " + test_case); 
                                log.info("Jira Name: LGI-webUI – Mercury – FA07 – Security – 7.2.5 Advanced Settings – Security – Port Triggering – Functionality – Information Target start port – Info icon – ");
                                response = fun.MercuryLogin();
                                if (response.equals("Pass")) {

                                                response = TestAction.getLoginAction().getTestResult(test_case);
                                }

                                Assert.assertEquals(response, "Pass", response);
                }              
                //CAUT-5766
                @Test(priority = 8)
                public void FA07_Security_AdvSettings_Sec_PortTriggering_InfoIcon_TargetEndPort() {

                                
                                String test_case = new Object() {
                                }.getClass().getEnclosingMethod().getName();
                                log.info("Test Case: " + test_case); 
                                log.info("Jira Name: LGI-webUI – Mercury – FA07 – Security – 7.2.5 Advanced Settings – Security – Port Triggering – Functionality – Information Target end port – Info icon – ");
                                response = fun.MercuryLogin();
                                if (response.equals("Pass")) {

                                                response = TestAction.getLoginAction().getTestResult(test_case);
                                }

                                Assert.assertEquals(response, "Pass", response);
                }              
                //CAUT-5767
                @Test(priority = 9)
                public void FA07_Security_AdvSettings_Sec_PortTriggering_InfoIcon_Protocol() {

                                
                                String test_case = new Object() {
                                }.getClass().getEnclosingMethod().getName();
                                log.info("Test Case: " + test_case); 
                                log.info("Jira Name: LGI-webUI – Mercury – FA07 – Security – 7.2.5 Advanced Settings – Security – Port Triggering – Functionality – Information Protocol – Info icon – ");
                                response = fun.MercuryLogin();
                                if (response.equals("Pass")) {

                                                response = TestAction.getLoginAction().getTestResult(test_case);
                                }

                                Assert.assertEquals(response, "Pass", response);
                }              
                //CAUT-5768
                @Test(priority = 10)
                public void FA07_Security_AdvSettings_Sec_PortTriggering_InfoIcon_Enabled() {

                                
                                String test_case = new Object() {
                                }.getClass().getEnclosingMethod().getName();
                                log.info("Test Case: " + test_case); 
                                log.info("Jira Name: LGI-webUI – Mercury – FA07 – Security – 7.2.5 Advanced Settings – Security – Port Triggering – Functionality – Information Enabled – Info icon – ");
                                response = fun.MercuryLogin();
                                if (response.equals("Pass")) {

                                                response = TestAction.getLoginAction().getTestResult(test_case);
                                }

                                Assert.assertEquals(response, "Pass", response);
                }              
                //CAUT-5769
                @Test(priority = 11)
                public void FA07_Security_AdvSettings_Sec_PortTriggering_ErrorIcon_InvalidPort() {

                                
                                String test_case = new Object() {
                                }.getClass().getEnclosingMethod().getName();
                                log.info("Test Case: " + test_case); 
                                log.info("Jira Name: LGI-webUI – Mercury – FA07 – Security – 7.2.5 Advanced Settings – Security – Port Triggering – Functionality – Error Icon and Text – Invalid Port – ");
                                response = fun.MercuryLogin();
                                if (response.equals("Pass")) {

                                                response = TestAction.getLoginAction().getTestResult(test_case);
                                }

                                Assert.assertEquals(response, "Pass", response);
                }              
                //CAUT-5770
                @Test(priority = 12)
                public void FA07_Security_AdvSettings_Sec_PortTriggering_ErrorIcon_NotAuthorizedPort() {

                                
                                String test_case = new Object() {
                                }.getClass().getEnclosingMethod().getName();
                                log.info("Test Case: " + test_case); 
                                log.info("Jira Name: LGI-webUI – Mercury – FA07 – Security – 7.2.5 Advanced Settings – Security – Port Triggering – Functionality – Error icon and Text – Not authorized port – ");
                                response = fun.MercuryLogin();
                                if (response.equals("Pass")) {

                                                response = TestAction.getLoginAction().getTestResult(test_case);
                                }

                                Assert.assertEquals(response, "Pass", response);
                }              
                //CAUT-5771
                @Test(priority = 13)
                public void FA07_Security_AdvSettings_Sec_PortTriggering_ErrorIcon_EndportMustGreaterThanStartport() {

                                
                                String test_case = new Object() {
                                }.getClass().getEnclosingMethod().getName();
                                log.info("Test Case: " + test_case); 
                                log.info("Jira Name: LGI-webUI – Mercury – FA07 – Security – 7.2.4 Advanced Settings – Security – Port Triggering – Functionality – Error icon and Text – End port must be greater than Start port– ");
                                response = fun.MercuryLogin();
                                if (response.equals("Pass")) {

                                                response = TestAction.getLoginAction().getTestResult(test_case);
                                }

                                Assert.assertEquals(response, "Pass", response);
                }              
                //CAUT-5772
                @Test(priority = 14)
                public void FA07_Security_AdvSettings_Sec_PortTriggering_Cancel_button() {

                                
                                String test_case = new Object() {
                                }.getClass().getEnclosingMethod().getName();
                                log.info("Test Case: " + test_case); 
                                log.info("Jira Name: LGI-webUI – Mercury – FA07 – Security – 7.2.5 Advanced Settings – Security – Port Triggering – Functionality – Cancel button – ");
                                response = fun.MercuryLogin();
                                if (response.equals("Pass")) {

                                                response = TestAction.getLoginAction().getTestResult(test_case);
                                }
                                Assert.assertEquals(response, "Pass", response);
                }              
                //CAUT-5773
                @Test(priority = 15)
                public void FA07_Security_AdvSettings_Sec_PortTriggering_AddRule_button() {

                                
                                String test_case = new Object() {
                                }.getClass().getEnclosingMethod().getName();
                                log.info("Test Case: " + test_case); 
                                log.info("Jira Name: LGI-webUI – Mercury – FA07 – Security – 7.2.5 Advanced Settings – Security – Port Triggering – Functionality – Add rule button – ");
                                response = fun.MercuryLogin();
                                if (response.equals("Pass")) {

                                                response = TestAction.getLoginAction().getTestResult(test_case);
                                }
                                fun.webUI_Mercury_Advanced_settings_Security_Port_Triggering_RevertBack();
                                Assert.assertEquals(response, "Pass", response);
                }
                //CAUT-5774
                @Test(priority = 16)
                public void FA07_Security_AdvSettings_Sec_PortTriggering_AddRule_ErrorIcon_DuplicateRule() {


                                
                                String test_case = new Object() {
                                }.getClass().getEnclosingMethod().getName();
                                log.info("Test Case: " + test_case); 
                                log.info("Jira Name: LGI-webUI – Mercury – FA07 – Security – 7.2.5 Advanced Settings – Security – Port Triggering – Functionality – Add rule button – Error Icon and Text – Duplicate rule – ");
                                response = fun.MercuryLogin();
                                if (response.equals("Pass")) {

                                                response = TestAction.getLoginAction().getTestResult(test_case);
                                }
                                fun.webUI_Mercury_Advanced_settings_Security_Port_Triggering_RevertBack();
                                Assert.assertEquals(response, "Pass", response);
                }
//            //CAUT-5775
//            @Test(priority = 17)
//            public void FA07_Security_AdvSettings_Sec_PortTriggering_ApplyChanges() {
//
// 
//            String test_case = new Object() {
//            }.getClass().getEnclosingMethod().getName();
//            log.info("Test Case: " + test_case); 
//            log.info("Jira Name: LGI-webUI – Mercury – FA07 – Security – 7.2.5 Advanced Settings – Security – Port Triggering – Functionality – Apply changes – ");
//                response = fun.MercuryLogin();            
//                if (response.equals("Pass")) {
//
//                                            response = TestAction.getLoginAction().getTestResult(test_case);
//                            }
//                            fun.webUI_Mercury_Advanced_settings_Security_Port_Triggering_RevertBack();
//                            Assert.assertEquals(response, "Pass", response);
//            }
                

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
