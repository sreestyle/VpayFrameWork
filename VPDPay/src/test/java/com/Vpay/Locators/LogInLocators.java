package com.Vpay.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInLocators {
	
	
	
	public static WebElement SignIn(WebDriver driver)
	{
		WebElement SignInBtn= driver.findElement(By.xpath("//button[@class='btn btn-primary btn-width-120 btn-lg']"));
		return SignInBtn;
	}
	public static WebElement UserName(WebDriver driver, String FieldName)
	{
		WebElement UserName= driver.findElement(By.xpath("//div[@class='modal-content background-customizable modal-content-mobile visible-md visible-lg']//div[@class='modal-body']//div//div//div//div//form[@name='cognitoSignInForm']//div//input[@id='signInFormUsername']"));
		return UserName;
	}
	public static WebElement PassWord(WebDriver driver, String FieldName)
	{
		WebElement PassWord= driver.findElement(By.xpath("//div[@class='modal-content background-customizable modal-content-mobile visible-md visible-lg']//div[@class='modal-body']//div//div//div//div//form[@name='cognitoSignInForm']//div//input[@id='signInFormPassword']"));
		return PassWord;
	}
	public static WebElement LogInBtn(WebDriver driver)
	{
		WebElement LogInBtn= driver.findElement(By.xpath("//div[@class='modal-content background-customizable modal-content-mobile visible-md visible-lg']//div[@class='modal-body']//div//div//div//div//input[@name='signInSubmitButton']"));
		return LogInBtn;
	}
	
		
	

}
