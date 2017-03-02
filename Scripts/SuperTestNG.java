package com.actitime.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class SuperTestNG
{
	public WebDriver driver;
	
	@BeforeMethod
	public void preCondition()
	{
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://demo.actitime.com");
	}
	@AfterMethod
	public void postCondition()
	{
		driver.quit();
	}
}
