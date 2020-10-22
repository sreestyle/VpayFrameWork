package com.Vpay.utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
//import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {
	
	//Screenshots, alerts, frames, windows, Sync issue, Javascript executor
	
	public static String captureScreenshot(WebDriver driver)
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String screenshotpath = System.getProperty("user.dir")+"/Screenshots/VPD_"+getCurrentDateTime()+".png";
		
		try
		{
			FileHandler.copy(src, new File(screenshotpath));
			
			System.out.println("Screenshot captured");
			
		} catch (IOException e) {
			System.out.println("Unable to capture screenshot "+e.getMessage());
		}
		return screenshotpath;
	}
	
	public static String getCurrentDateTime()
	{
		DateFormat customeFormat = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date currentDate = new Date();
		return customeFormat.format(currentDate);
	}

}
