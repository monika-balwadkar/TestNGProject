package MavenProjectPckg.Selenium_Maven_Project;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LoginPageObject;

public class LoginTestCase extends BrowserAccess {

	@Test
	public void verifyLogin() throws IOException
	{
		
		
		LoginPageObject LPO= new LoginPageObject(driver);
		LPO.userNameEnter().sendKeys("Monika");
		LPO.passwordEnter().sendKeys("1234");
		LPO.loginClick().click();
		
		SoftAssert s=new SoftAssert();
		String expected="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		String actual1=LPO.actualText().getText();
		s.assertEquals(actual1,expected);
		s.assertAll();
		
	}
}
