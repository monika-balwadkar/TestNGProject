package MavenProjectPckg.Selenium_Maven_Project;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.TryForFreePageObject;
import Resourses.BrowserAccess;
import Resourses.CommonUtilities;
import Resourses.Constant;

public class TryForFreeTestCase extends BrowserAccess {

	@Test
	public void verifyTryForFree() throws IOException, InterruptedException
	{

		
		TryForFreePageObject TPO= new TryForFreePageObject(driver);
		TPO.tryForFreeClick().click();
		Thread.sleep(2000);
		TPO.firstNameEnter().sendKeys(Constant.firstname);
		TPO.lasteNameEnter().sendKeys(Constant.lastname);
		TPO.jobTitleEnter().sendKeys(Constant.jobtitle);
		TPO.emailEnter().sendKeys(Constant.email);
		TPO.phoneEnter().sendKeys(Constant.phoneNo);
		
		//Dropdown Employee
		CommonUtilities.handleDropDown(TPO.employeeSelected(),3);
		
		TPO.companyNameEnter().sendKeys(Constant.compantName);
		
		//DropDown Country
		CommonUtilities.handleDropDown(TPO.companyCountrySelected(),4);
		
		TPO.iAgreeChecked().click();
		//Thread.sleep(2000);
		//TPO.yesIWouldChecked().click();
		
	}
}
