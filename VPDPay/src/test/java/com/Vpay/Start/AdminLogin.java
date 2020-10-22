package com.Vpay.Start;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.Vpay.locators.Login;
import com.Vpay.utilities.BaseClass;
import com.Vpay.utilities.BrowserFactory;

public class AdminLogin extends BaseClass {
	
	@Test(priority=10)
	public void loginApp() throws InterruptedException
	{
		//Login into the application
		Login logInpage = PageFactory.initElements(driver, Login.class);
		logInpage.loginToFB("VPDADMIN", "Venkat@123");
	} 
	@Test(priority=20)
	public void incomeTaxItConfiguration() throws InterruptedException {
		Thread.sleep(5000);
		//Navigate to 'Income Tax--It Configuration
		//driver.findElement(By.xpath("//span[contains(text(),'Income Tax')]")).click();
		//driver.findElement(By.xpath("//span[contains(text(),'IT Configuration')]")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='refEditPopUp']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-text']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='refEditPopUp']")).click();
		Thread.sleep(2000);
		Select dropdown= new Select(driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-vpd[1]/div[1]/div[1]/app-it-config[1]/section[1]/div[1]/div[4]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/select[1]")));
		int size =dropdown.getOptions().size();
		System.out.println("size" + dropdown.getOptions().size());
		Random rand = new Random();
		int randomNum = rand.nextInt((10 - 1) + 1) + 1;
		//dropdown.selectByIndex(randomNum);
		//dropdown.selectByVisibleText(" Maximum percentage of HRA for Metro City ");
		Thread.sleep(5000);
		for(int i=1;i<=size;i++) {
		dropdown.selectByIndex(i);
		driver.findElement(By.xpath("//input[@placeholder='Value']")).sendKeys("10"); 
		driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M19 3h-1V1')]")).click();
		driver.findElement(By.xpath("//div[@class='mat-calendar-arrow']")).click();
		//datePicker(2021,"NOV",5);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='mat-calendar-body-cell-content'][contains(text(),'2021')]")).click();                              
		//driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/mat-datepicker-content[1]/mat-calendar[1]/div[1]/mat-multi-year-view[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'OCT')]")).click();
		Thread.sleep(3000);
		Random rand_date = new Random();
		int randomDate = rand_date.nextInt((30 - 1) + 1) + 1;
		//driver.findElement(By.xpath("//div[@class='mat-calendar-body-cell-content'][contains(text(),'12')]")).click();
		driver.findElement(By.xpath("//div[@class='mat-calendar-body-cell-content'][contains(text(),'"+randomDate+"')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		Thread.sleep(1000);
		driver.switchTo().activeElement();
		String toast_msg=driver.findElement(By.xpath("//*[@id=\"toast-container\"]/div/div")).getText();
		if(toast_msg.equals("Record already exists. could not be saved")) {
			driver.findElement(By.xpath("//div[@class='toast-error ngx-toastr ng-trigger ng-trigger-flyInOut']")).click();
			driver.findElement(By.xpath("//button[@class='btn btn-text']")).click();
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='refEditPopUp']")).click();
		}
		Actions actions = new Actions(driver);
        WebElement elementLocator= driver.findElement(By.xpath("/html/body/app-root/app-vpd/div/div/app-it-config/section/div/div[3]/ag-grid-angular/div/div[2]/div[1]/div[3]/div[2]/div/div/div[1]/div[1]"));
        actions.contextClick(elementLocator).perform();
        
        driver.findElement(By.xpath("//span[contains(text(),'Edit')]")).click();
        driver.findElement(By.xpath("//input[@placeholder='Value']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='Value']")).sendKeys("30");
        driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
        
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[contains(text(),'Columns')]")).click();
        driver.findElement(By.xpath("//div[@class='ag-primary-cols-header-panel']//div//span[@class='ag-icon ag-icon-checkbox-checked']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='ag-primary-cols-header-panel']//div//span[@class='ag-icon ag-icon-checkbox-unchecked']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='ag-column-select-panel']//div[1]//div[1]//div[1]//div[1]//span[1]")).click();
        driver.findElement(By.xpath("//div[@class='ag-primary-cols-list-panel']//div[2]//div[1]//div[1]//div[1]//span[1]")).click();
        driver.findElement(By.xpath("//div[@class='ag-tool-panel-wrapper']//div[3]//div[1]//div[1]//div[1]//span[1]")).click();
        driver.findElement(By.xpath("//div[@class='ag-grid-full-height']//div[4]//div[1]//div[1]//div[1]//span[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='ag-column-select-panel']//div[1]//div[1]//div[1]//div[1]//span[1]")).click();
        driver.findElement(By.xpath("//div[@class='ag-primary-cols-list-panel']//div[2]//div[1]//div[1]//div[1]//span[1]")).click();
        driver.findElement(By.xpath("//div[@class='ag-tool-panel-wrapper']//div[3]//div[1]//div[1]//div[1]//span[1]")).click();
        driver.findElement(By.xpath("//div[@class='ag-grid-full-height']//div[4]//div[1]//div[1]//div[1]//span[1]")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Columns')]")).click();
        Thread.sleep(2000);
	}
		
	@Test(priority=30)
	public void itSlabNewTaxRegime() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'IT Slabs')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'New tax Regime')]")).click();
		driver.findElement(By.xpath("//button[@id='TaxslabMobalBtn']//i[@class='lni-plus']")).click();
		Thread.sleep(5000);
		addTaxSlab();
	}
	
	@Test(priority=40)
	public void itSlapOldTaxRegime() throws InterruptedException {
		Thread.sleep(6000);
		driver.findElement(By.xpath("//div[contains(text(),'Old tax Regime')]")).click();
		driver.findElement(By.xpath("//button[@id='TaxslabMobalBtn']//i[@class='lni-plus']")).click();
		Thread.sleep(5000);
		addTaxSlab();
	}
		
	@Test(priority=11)
	public void systemSettingSalaryCompponent() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[contains(text(),'System Settings')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Salary Components')]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		Thread.sleep(3000);
		Actions salary_comp_actions= new Actions(driver);
		WebElement locator= driver.findElement(By.xpath("/html/body/app-root/app-vpd/div/div/app-salary-component-master/section/div/div[3]/ag-grid-angular/div/div[2]/div[1]/div[3]/div[2]/div/div/div[1]/div[1]"));
		salary_comp_actions.contextClick(locator).perform();
		driver.findElement(By.xpath("//span[contains(text(),'View')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary mr-13']")).click();
		
		Actions salary_comp_actions1= new Actions(driver);
		WebElement locator1= driver.findElement(By.xpath("/html/body/app-root/app-vpd/div/div/app-salary-component-master/section/div/div[3]/ag-grid-angular/div/div[2]/div[1]/div[3]/div[2]/div/div/div[1]/div[1]"));
		salary_comp_actions1.contextClick(locator1).perform();
		driver.findElement(By.xpath("//span[contains(text(),'Edit')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Name']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Enter Name']")).sendKeys("PT Gross Salary_test");
		driver.findElement(By.xpath("//textarea[@placeholder='Enter Item Description']")).clear();
		driver.findElement(By.xpath("//textarea[@placeholder='Enter Item Description']")).sendKeys("PT Gross Salary_desc");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Validate Formula')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		Thread.sleep(3000);
		Actions salary_comp_actions2= new Actions(driver);
		WebElement locator2= driver.findElement(By.xpath("/html/body/app-root/app-vpd/div/div/app-salary-component-master/section/div/div[3]/ag-grid-angular/div/div[2]/div[1]/div[3]/div[2]/div/div/div[1]/div[1]"));
		salary_comp_actions2.contextClick(locator2).perform();
		driver.findElement(By.xpath("//span[contains(text(),'Export')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'CSV Export')]")).click();
		
		Thread.sleep(3000);
		Actions salary_comp_actions3= new Actions(driver);
		WebElement locator3= driver.findElement(By.xpath("/html/body/app-root/app-vpd/div/div/app-salary-component-master/section/div/div[3]/ag-grid-angular/div/div[2]/div[1]/div[3]/div[2]/div/div/div[1]/div[1]"));
		salary_comp_actions3.contextClick(locator3).perform();
		driver.findElement(By.xpath("//span[contains(text(),'Export')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Excel Export (.xlsx)')]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Columns')]")).click();
		driver.findElement(By.xpath("//div[@class='ag-primary-cols-list-panel']//div[2]//div[1]//div[1]//div[1]//span[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Columns')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Columns')]")).click();
		driver.findElement(By.xpath("//div[@class='ag-primary-cols-list-panel']//div[2]//div[1]//div[1]//div[1]//span[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Columns')]")).click();
		Thread.sleep(3000);
		
	}
	
	public void  addTaxSlab() throws InterruptedException {
		Thread.sleep(6000);
		Select age_dropdown= new Select(driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-vpd[1]/div[1]/div[1]/app-tax-slab[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/select[1]")));
		age_dropdown.selectByVisibleText(" 0-60 ");
		driver.findElement(By.xpath("//input[@placeholder='Max. Slab']")).sendKeys("500000");
		driver.findElement(By.xpath("//input[@placeholder='Tax Rate']")).sendKeys("5");
		driver.findElement(By.xpath("//input[@placeholder='Cess']")).sendKeys("3");
		driver.findElement(By.xpath("//input[@placeholder='Surcharge']")).sendKeys("0");
		driver.findElement(By.xpath("//i[@class='fa fa-check']")).click();
		driver.findElement(By.xpath("//button[@id='save']")).click();
	}
	
	public void datePicker(int year,String month,int randomDate) throws InterruptedException {
		Thread.sleep(6000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/mat-datepicker-content[1]/mat-calendar[1]/div[1]/mat-multi-year-view[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]")).click();
		//driver.findElement(By.xpath("//div[contains(text(),'"+year+"')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'"+month+"')]")).click();
		driver.findElement(By.xpath("//div[@class='mat-calendar-body-cell-content'][contains(text(),'"+randomDate+"')]")).click();
	}
	
	}
	