package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TryForFreePageObject {

	public WebDriver driver;
	
	By tryForFreeBtn= By.xpath("//a[@id='signup_link']");
	By firstName=By.xpath("//input[@name='UserFirstName']");
	By lastName= By.xpath("//input[@name='UserLastName']");
	By jobTitle= By.xpath("//input[@name='UserTitle']");
	By email=By.xpath("//input[@name='UserEmail']");
	By phone=By.xpath("//input[@name='UserPhone']");
	By employee= By.xpath("//select[@name='CompanyEmployees']");
	By companyName= By.xpath("//input[@name='CompanyName']");
	By companyCountry=By.xpath("//select[@name='CompanyCountry']");
	By iAgreeCheck= By.xpath("(//div[@class='checkbox-ui'])[1]");
	By yesIWouldCheck= By.xpath("(//div[@class='checkbox-ui'])[3]");
	
	public TryForFreePageObject(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}
	public WebElement tryForFreeClick()
	{
		return driver.findElement(tryForFreeBtn);
	}
	public WebElement firstNameEnter()
	{
		return driver.findElement(firstName);
	}
	public WebElement lasteNameEnter()
	{
		return driver.findElement(lastName);
	}
	public WebElement jobTitleEnter()
	{
		return driver.findElement(jobTitle);
	}
	public WebElement emailEnter()
	{
		return driver.findElement(email);
	}
	public WebElement phoneEnter()
	{
		return driver.findElement(phone);
	}
	public WebElement employeeSelected()
	{
		return driver.findElement(employee);
	}
	public WebElement companyNameEnter()
	{
		return driver.findElement(companyName);
	}
	public WebElement companyCountrySelected()
	{
		return driver.findElement(companyCountry);
	}
	public WebElement iAgreeChecked()
	{
		return driver.findElement(iAgreeCheck);
	}
	public WebElement yesIWouldChecked()
	{
		return driver.findElement(yesIWouldCheck);
	}
	
}
