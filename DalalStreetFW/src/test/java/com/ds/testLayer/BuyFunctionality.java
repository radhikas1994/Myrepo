package com.ds.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ds.pageLayer1.DashboardPage1;
import com.ds.pageLayer1.ExchangePage;
import com.ds.pageLayer1.LoginPage;
import com.ds.testBase.TestBase1;

public class BuyFunctionality extends TestBase1 {
	
	@Test
	public void verifyBuyFunctionalityWithLongTermAndMarket() throws InterruptedException
	{
		String expected_result = "Order Created successfully";
		LoginPage login_obj = new LoginPage(driver);
		DashboardPage1 dash_obj = new DashboardPage1(driver);
		ExchangePage exchange_obj = new ExchangePage(driver);
		login_obj.enterEmailAddress("amarwaghmare573@gmail.com");
		login_obj.enterPassword("Test@1234");
		login_obj.clickOnLoginButton();
		Thread.sleep(5000);
		//------------------------------------------------
		dash_obj.enterCompanyName("Wipro");
		dash_obj.clickOnOption();
		Thread.sleep(3000);
		exchange_obj.clickOnBuyButton1();
		exchange_obj.enterQuanity("2");
		exchange_obj.clickOnBuyButton2();
		Thread.sleep(3000);
		String actaul_result = exchange_obj.getOrderStatus();
		Assert.assertEquals(actaul_result, expected_result);
		
	}
	
	
	@Test
	public void verifyBuyFunctionalityWithIntradayAndMarket() throws InterruptedException
	{
		String expected_result = "Order Created Successfully";
		LoginPage login_obj = new LoginPage(driver);
		DashboardPage1 dash_obj = new DashboardPage1(driver);
		ExchangePage exchange_obj = new ExchangePage(driver);
		login_obj.enterEmailAddress("amarwaghmare573@gmail.com");
		login_obj.enterPassword("Test@1234");
		login_obj.clickOnLoginButton();
		Thread.sleep(5000);
		//------------------------------------------------
		dash_obj.enterCompanyName("Wipro");
		dash_obj.clickOnOption();
		Thread.sleep(3000);
		exchange_obj.clickOnBuyButton1();
		exchange_obj.clickOnIntraday();
		exchange_obj.enterQuanity("2");
		exchange_obj.clickOnBuyButton2();
		Thread.sleep(3000);
		String actaul_result = exchange_obj.getOrderStatus();
		Assert.assertEquals(actaul_result, expected_result);
		
	}
}
