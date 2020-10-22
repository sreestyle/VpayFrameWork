package com.Vpay.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ServiceProviderLocators {
	
		public static WebElement expandAdministrator(WebDriver driver)
		{
			WebElement expandAdministrator= driver.findElement(By.xpath("//body[@class='skin-blue-light sidebar-mini fixed']/app-root/app-vpd[@class='ng-star-inserted']/div[@class='wrapper']/app-left-side-menu/aside[@class='main-sidebar']/section[@class='sidebar']/ul[@class='sidebar-menu my-menu tree']/li[2]/a[1]"));
			return expandAdministrator;
		}
		
	

}
