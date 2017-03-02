package com.actitime.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class BillingTypesPage extends BasePage
{
	private WebDriver driver;
	
	@FindBy(xpath="//span[text()='Create Billing Type']")
	private WebElement createBillingTypeButton;

	@FindBy(className="successmsg")
	private WebElement successmsg;
	
	public BillingTypesPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void clickCreateBillingTypeButton()
	{
		createBillingTypeButton.click();
	}
	
	public void clickBillingLink(String name)
	{
		driver.findElement(By.linkText(name)).click();
	}
	
	public void verifyMessage(String eMsg)
	{
		String aMsg=successmsg.getText();
		Assert.assertEquals(aMsg, eMsg);
	
	}
}
