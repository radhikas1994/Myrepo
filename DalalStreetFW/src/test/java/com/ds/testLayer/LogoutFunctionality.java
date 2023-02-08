package com.ds.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ds.pageLayer1.DashboardPage1;
import com.ds.pageLayer1.LoginPage;
import com.ds.testBase.TestBase1;
import com.ds.utilities.UtilClass;

public class LogoutFunctionality extends TestBase1{

	@Test
	public void verifyLogoutFunctionality() throws InterruptedException
	{
		String expected_result = "https://www.apps.dalalstreet.ai/logout";
		LoginPage login_obj = new LoginPage(driver);
		DashboardPage1 dash_obj = new DashboardPage1(driver);
		UtilClass util_obj = new UtilClass();
		login_obj.enterEmailAddress("amarwaghmare573@gmail.com");
		login_obj.enterPassword("Test@1234");
		login_obj.clickOnLoginButton();
		Thread.sleep(5000);
		dash_obj.clickOnProfileDropdown();
		dash_obj.clickOnPowerOff();
		
		String actual_result = util_obj.getWebPageUrl();
		Assert.assertEquals(actual_result, expected_result);
	}
}
