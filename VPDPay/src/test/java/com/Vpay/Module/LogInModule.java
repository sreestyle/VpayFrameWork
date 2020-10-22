package com.Vpay.Module;

import org.openqa.selenium.WebDriver;

import com.Vpay.Locators.LogInLocators;

public class LogInModule {
	static WebDriver driver;

	public static void adminlogin(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(5000);
		LogInLocators.SignIn(driver).click();
		Thread.sleep(3000);
		LogInLocators.UserName(driver, "username").sendKeys("VPDADMIN");
		Thread.sleep(3000);
		LogInLocators.PassWord(driver, "password").sendKeys("Venkat@123");
		Thread.sleep(3000);
		LogInLocators.LogInBtn(driver).click();
		Thread.sleep(3000);
		
	}

}
