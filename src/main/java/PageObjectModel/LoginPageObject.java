package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {

	public WebDriver driver;

		By username= By.xpath("//input[@id='username']");
		By password=By.xpath("//input[@id='password']");
		By login=By.xpath("//input[@id='Login']");
		By actual= By.xpath("(//div[@class='loginError'])[2]");
		
		public LoginPageObject(WebDriver driver2) {
			// TODO Auto-generated constructor stub
			this.driver=driver2;
		}
		public WebElement userNameEnter()
		{
			return driver.findElement(username);
		}
		public WebElement passwordEnter()
		{
			return driver.findElement(password);
		}
		public WebElement loginClick()
		{
			return driver.findElement(login);
		}
		public WebElement actualText()
		{
			return driver.findElement(actual);
		}
		
	
}
