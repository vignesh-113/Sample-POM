package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage 
{
	private WebDriver driver;
	
	@FindBy(xpath="(//div[@class='popup_menu_arrow'])[1]")
	private WebElement settings;
	
	@FindBy(linkText="Billing Types")
	private WebElement billingTypes;
	
	@FindBy(id="logoutLink")
	private WebElement logoutLink;
	
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void goToBillingTypesPage()
	{
		settings.click();
		billingTypes.click();
	}
	
	public void logout()
	{
		logoutLink.click();
	}
}
