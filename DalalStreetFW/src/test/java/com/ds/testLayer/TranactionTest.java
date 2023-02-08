package com.ds.testLayer;

import org.testng.annotations.Test;

import com.ds.pageLayer1.DashboardPage1;
import com.ds.pageLayer1.LoginPage;
import com.ds.pageLayer1.TranactionPage;
import com.ds.testBase.TestBase1;

public class TranactionTest extends TestBase1 {

	@Test
	public void getDataFromTransactionPage() throws InterruptedException
	{
		LoginPage login_obj = new LoginPage(driver);
		DashboardPage1 dash_obj = new DashboardPage1(driver);
		TranactionPage tran_obj = new TranactionPage(driver);
		login_obj.enterEmailAddress("amarwaghmare573@gmail.com");
		login_obj.enterPassword("Test@1234");
		login_obj.clickOnLoginButton();
		Thread.sleep(5000);
		dash_obj.clickOnTranactionLink();
		tran_obj.getAllData();
	}
}
