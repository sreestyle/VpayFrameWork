package com.Vpay.Module;

import org.openqa.selenium.WebDriver;

import com.Vpay.Locators.ServiceProviderLocators;

public class ServiceProviderModule {
	static WebDriver driver;
	
	public static void createserviceprovider(WebDriver driver)
	{
		
		ServiceProviderLocators.expandAdministrator(driver).click();
		
	}

}
