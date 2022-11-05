package Resourses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class CommonUtilities {
	
	public static WebDriver driver;
	 //Dropdown Employee & Country
	public static void handleDropDown(WebElement ele,int index)
	{
		WebElement emp=ele; 
		Select s=new Select(emp);
		s.selectByIndex(index);
	}
	
	//Assertion Method
	public static void handleAssertion(String expct,String actl)
	{
		SoftAssert s=new SoftAssert();
		String expected=expct;
		String actual=actl;
		s.assertEquals(actual,expected);
		s.assertAll();
	}
	
	//To handle Explicit wait :By 
	public static void handleExplicitWaitBy(int duration, By element)
	{
		WebDriverWait wb=new WebDriverWait(driver,Duration.ofSeconds(duration));
		wb.until(ExpectedConditions.visibilityOfElementLocated(element));
		
	}
	
	//To handle Explicit wait :WebElement
	public static void handleExplicitWaitWebElement(int duration1, WebElement element1)
	{
		WebDriverWait wb1=new WebDriverWait(driver,Duration.ofSeconds(duration1));
		wb1.until(ExpectedConditions.visibilityOf(element1));
		
	}
}
