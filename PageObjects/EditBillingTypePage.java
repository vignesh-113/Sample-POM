package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditBillingTypePage extends BasePage
{
	private WebDriver driver;
	
	@FindBy(xpath="//input[@value='Delete This Billing Type']")
	private WebElement deleteThisBillingTypeButton;
	
	public EditBillingTypePage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void deleteBilling()
	{
		deleteThisBillingTypeButton.click();
		driver.switchTo().alert().accept();
	}
}
