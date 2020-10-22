package com.Vpay.testcases;

import org.testng.annotations.Test;

import com.Vpay.Module.LogInModule;
import com.Vpay.Module.ServiceProviderModule;
import com.Vpay.utility.BaseClass;

public class CreateServiceProvider extends BaseClass{
	
	@Test
	
	public static void serviceprovidercreation() throws InterruptedException
	{
		Thread.sleep(5000);
		LogInModule.adminlogin(driver);
		ServiceProviderModule.createserviceprovider(driver);
		return;
	}

}
