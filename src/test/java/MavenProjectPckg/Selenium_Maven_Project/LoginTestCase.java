package MavenProjectPckg.Selenium_Maven_Project;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LoginPageObject;
import Resourses.BrowserAccess;
import Resourses.CommonUtilities;
import Resourses.Constant;

public class LoginTestCase extends BrowserAccess {

	@Test
	public void verifyLogin() throws IOException
	{
		
	///kiyaannnnn branchhhhh
		LoginPageObject LPO= new LoginPageObject(driver);
		
		LPO.userNameEnter().sendKeys(Constant.username);
		
		//CommonUtilities.handleExplicitWaitWebElement(10,LPO.passwordEnter()); //Explicit wait using Webelement
		LPO.passwordEnter().sendKeys(Constant.password);
		
		//CommonUtilities.handleExplicitWaitBy(10,LPO.login); //Explicit wait using By,make by element as public
		LPO.loginClick().click();

		//Assertion method
		CommonUtilities.handleAssertion(Constant.expected,LPO.actualText().getText());
		
	}
}
