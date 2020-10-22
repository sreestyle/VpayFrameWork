package com.Vpay.Module;

import org.openqa.selenium.WebDriver;

import com.Vpay.Locators.IncomeTaxLocators;

public class IncomeTaxModule {
	static WebDriver driver;
	public static void expandIncomeTax() {
		IncomeTaxLocators.expandIncomeTax(driver).click();	
	}
	public static void SelectITConfigurations()
	{
		IncomeTaxLocators.selectITConfigurations(driver).click();
	}

}
