package com.Vpay.testcases;

import org.testng.annotations.Test;

import com.Vpay.utility.BaseClass;
import com.Vpay.utility.ExcelDataProvider;


public class AdminLogin extends BaseClass{
	

	@Test
	public static void loginadminuser() throws Exception
	{
		logger=report.createTest("LogIn to VPDADMIN");
		
		ExcelDataProvider.setExcelFile("Login");
		logger.info("Starting Application");
		setup(ExcelDataProvider.getCellData(1,0),ExcelDataProvider.getCellData(1,1));
		logger.pass("LogIn Success");
		
		
		
		
	}

}
