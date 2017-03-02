package com.actitime.scripts;

import org.testng.annotations.Test;
import com.actitime.pom.BasePage;
import com.actitime.pom.LoginPage;

/* Author				: MyName
 * Reviewed By			: Reviewer Name
 * Approved By			: Approver Name
 * Last Modified Date	: Date
 */
public class Actitime_LoginLogout extends SuperTestNG
{
	@Test
	public void testActitime_LoginLogout()
	{
		//enter valid un,pwd & click login
		LoginPage loginPage=new LoginPage(driver);
		loginPage.login("admin","manager");
		
		//click logout
		BasePage basePage=new BasePage(driver);
		basePage.logout();
		
	}
}
