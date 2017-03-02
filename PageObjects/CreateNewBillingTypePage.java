package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewBillingTypePage extends BasePage
{
	private WebDriver driver;
	
	@FindBy(id="name")
	private WebElement nameTextBox;
	
	@FindBy(xpath="//input[contains(@value,'Create Billing Type')]")
	private WebElement createBillingTypeButton;
	
	public CreateNewBillingTypePage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void createBilling(String name)
	{
		nameTextBox.sendKeys(name);
		createBillingTypeButton.click();
	}
	
}
