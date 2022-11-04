package MavenProjectPckg.Selenium_Maven_Project;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.TryForFreePageObject;

public class TryForFreeTestCase extends BrowserAccess {

	@Test
	public void verifyTryForFree() throws IOException, InterruptedException
	{

		
		TryForFreePageObject TPO= new TryForFreePageObject(driver);
		TPO.tryForFreeClick().click();
		Thread.sleep(2000);
		TPO.firstNameEnter().sendKeys("Kiyaan");
		TPO.lasteNameEnter().sendKeys("Khalde");
		TPO.jobTitleEnter().sendKeys("Developer");
		TPO.emailEnter().sendKeys("Kiyaan12@gmai.com");
		TPO.phoneEnter().sendKeys("9028819090");
		
		WebElement emp=TPO.employeeSelected();  //Dropdown Employee
		Select s=new Select(emp);
		s.selectByIndex(3);
		
		TPO.companyNameEnter().sendKeys("Infosys");
		
		WebElement countryNm=TPO.companyCountrySelected(); //DropDown for Company Country
		Select s1= new Select(countryNm);
		s1.selectByVisibleText("Greece");
		
		TPO.iAgreeChecked().click();
		Thread.sleep(2000);
		TPO.yesIWouldChecked().click();
		
	}
}
