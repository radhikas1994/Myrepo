package com.ds.utilities;

import org.openqa.selenium.support.PageFactory;

import com.ds.testBase.TestBase1;

public class UtilClass extends TestBase1 {
	
	public UtilClass()
	{
		PageFactory.initElements(driver, this);
	}

	//get url 
	
	public String getWebPageUrl()
	{
		String url = driver.getCurrentUrl();
		return url;
	}
}
