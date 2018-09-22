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

public class Dashboard {

	Logger log = null;
	CommonFunctionality fun = new CommonFunctionality();
	String response = null;
	int count=1;
	@BeforeClass
	public void testInitBrowser() {

		log = Driver.getLogger();
		log.info("+++++++++++++++++ Gateway Model: " + runAut.modem + " - Dashboard Page +++++++++++++++++");
	}

	@BeforeMethod
	public void testFactoryReset() throws InterruptedException {




		log.info("+++++++++++++++++ START TEST +++++++++++++++++");

		Driver.openModel();

		//if (count>1)
			response = fun.MercuryLogin();
	}

	@Test(priority = 1) //CAUT-6044
	public void LGI_webUI_Mercury_FA02_Dashboard_2_0_UI_Standard_Layout_Top_Bar() {


		String test_case = new Object() {

		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

  		try {
  			fun.ReloadAndReboot();
  		} catch (InterruptedException e) {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  		}
  		Driver.closeDriver();
  		try {
  			Thread.sleep(360 * 1000);
  		} catch (InterruptedException e) {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  		}
  		Driver.openModel();
  		fun.MercuryInitialSetup();
  		Driver.closeDriver();
  		Driver.openModel();
  		response=fun.MercuryLogin();
		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}

		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 2) //CAUT-6045
	public void LGI_webUI_Mercury_FA02_Dashboard_2_0_UI_Standard_Layout_Left_Hand_Navigation() {



		String test_case = new Object() {

		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}

		Assert.assertEquals(response, "Pass", response);
	}
	
	
	@Test(priority = 3)  //CAUT-6046
	public void LGI_webUI_Mercury_FA02_Dashboard_2_1_Dashboard_Quick_Set_Up_Wizards_Content() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}

		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 4)  //CAUT-6047
	public void LGI_webUI_Mercury_FA02_Dashboard_2_1_Dashboard_Quick_Set_Up_Wizards_Functionality_Configure_Your_Wireless_Connection() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}

		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 5)  //CAUT-6048
	public void LGI_webUI_Mercury_FA02_Dashboard_2_1_Dashboard_Quick_Set_Up_Wizards_Functionality_Network_Diagnostic_Tool() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}

		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 6)  //CAUT-6049
	public void LGI_webUI_Mercury_FA02_Dashboard_2_1_Dashboard_Quick_Set_Up_Wizards_Functionality_Modify_Your_Guest_Network() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}

		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 7)  //CAUT-6050
	public void LGI_webUI_Mercury_FA02_Dashboard_2_1_Dashboard_Status_Overview_Content() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}

		Assert.assertEquals(response, "Pass", response);
	}
	

	@Test(priority = 8)  //CAUT-6051
	public void LGI_webUI_Mercury_FA02_Dashboard_2_1_Dashboard_Status_Overview_Service_icons_6051() { 
		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}

		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 9)  //CAUT-6052
	public void LGI_webUI_Mercury_FA02_Dashboard_2_1_Dashboard_Status_Overview_Service_icons_Status_6052 () { 
		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}

		Assert.assertEquals(response, "Pass", response);
	}
	
	
	@Test(priority = 10)  //CAUT-6053
	public void LGI_webUI_Mercury_FA02_Dashboard_2_1_Dashboard_Connected_Devices_Content() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}

		Assert.assertEquals(response, "Pass", response);
	}

	@Test(priority = 11)  //CAUT-6054
	public void LGI_webUI_Mercury_FA02_Dashboard_2_1_Dashboard_Connected_Devices_Devices_Table_6054() {


		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}

		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 12)  //CAUT-6055
	public void LGI_webUI_Mercury_FA02_Dashboard_2_1_Dashboard_Connected_Devices_Functionality_Device_Name_6055() {

		String test_case = new Object() {
		}.getClass().getEnclosingMethod().getName();
		log.info("Test Case: " + test_case);

		if (response.equals("Pass")) {

			response = TestAction.getLoginAction().getTestResult(test_case);
		}

		Assert.assertEquals(response, "Pass", response);
	}
	
	@Test(priority = 13)  //CAUT-6056
	public void LGI_webUI_Mercury_FA02_Dashboard_2_1_Dashboard_Connected_Devices_Functionality_Apply_Button_6056() {

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
			response = "";
			count ++;
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
