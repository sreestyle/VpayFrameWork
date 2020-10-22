package com.Vpay.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IncomeTaxLocators {
	
	//expand IncomTax
	public static WebElement expandIncomeTax(WebDriver driver)
	{
		WebElement ClickIncomeTax= driver.findElement(By.xpath("//span[contains(text(),'Income Tax')]"));
		return ClickIncomeTax;
	}
	//Select IT Configurations
	public static WebElement selectITConfigurations(WebDriver driver)
	{
		WebElement ITConfigurations=driver.findElement(By.xpath("//span[contains(text(),'IT Configuration')]"));
		return ITConfigurations;
	}
	//

}
