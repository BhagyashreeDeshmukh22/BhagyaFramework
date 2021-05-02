package com.learnautomation.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.learnautomation.pages.Base_Class;
import com.learnautomation.pages.LoginPage;
import com.learnautomation.utility.Helper;

public class LoginTestCRM extends Base_Class {
 @Test(priority=1)
	public void loginApp()
	{
	 Reporter.log("Test case is running", true);
		//https://classic.freecrm.com/login.cfm
		logger=report.createTest("Login to CRM");
		LoginPage loginpage=PageFactory.initElements(ldriver,  LoginPage.class);
		logger.info("Starting application");
		loginpage.loginToCRM(excel.getStringData("LoginDetails",0,0), excel.getStringData("LoginDetails",0,1));
		logger.pass("Login successfull");
		Helper.CaptureScreenshot(ldriver);//now this will capture screenshot when our test get pass but we want to take screenshot on fail test case as well
		 Reporter.log("TestCase completed", true);
	}
 
 
 
}
