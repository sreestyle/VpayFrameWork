package com.Vpay.Start;

import org.testng.annotations.Test;

import com.Vpay.Module.LogInModule;
import com.Vpay.utility.Start;


public class LogIn  extends Start{
	
	
		@Test
	public static  void adminloginapp() throws Exception  
	{
			
			LogInModule.adminlogin(driver);

			
		}

		
	}

		
	
	
	


