package com.Vpay.utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Start {
	
	public static WebDriver driver;

    @BeforeClass
    public void setup() throws InterruptedException, IOException {
    
       driver = BrowserFactory.startApplication(driver, "Chrome", "https://vpay-admin-dev.ingwalabs.com/#/login");
       System.out.println("Login pass");
		
	}
	
	
	@AfterClass
	public void teardown()
	{
		BrowserFactory.quitBrowser(driver);
	}
}



