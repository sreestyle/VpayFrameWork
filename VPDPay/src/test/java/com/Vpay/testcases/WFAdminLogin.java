package com.Vpay.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WFAdminLogin {
	
	@Test
	public void LogIn() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vpay-admin-dev.ingwalabs.com/#/login");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Click on SignIn button
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-width-120 btn-lg']")).click();
		
		//Login Details
	
		driver.findElement(By.xpath("//div[@class='modal-content background-customizable modal-content-mobile visible-md visible-lg']//div[@class='modal-body']//div//div//div//div//form[@name='cognitoSignInForm']//div//input[@id='signInFormUsername']")).sendKeys("VPDADMIN");
		driver.findElement(By.xpath("//div[@class='modal-content background-customizable modal-content-mobile visible-md visible-lg']//div[@class='modal-body']//div//div//div//div//form[@name='cognitoSignInForm']//div//input[@id='signInFormPassword']")).sendKeys("Venkat@123");
		
		//Click Login button
		driver.findElement(By.xpath("//div[@class='modal-content background-customizable modal-content-mobile visible-md visible-lg']//div[@class='modal-body']//div//div//div//div//input[@name='signInSubmitButton']")).click();
		
		driver.quit();
	
	}

}
