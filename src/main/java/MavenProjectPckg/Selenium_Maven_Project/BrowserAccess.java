package MavenProjectPckg.Selenium_Maven_Project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserAccess {

	public WebDriver driver;
	public Properties prop;
	public void intializeDriver() throws IOException
	{
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\data.properties");
		prop=new Properties();
		prop.load(fis);
		String BrowserName=prop.getProperty("browser");
		
		if(BrowserName.equalsIgnoreCase("chrome"))
		{
			//For Specific version
			//WebDriverManager.chromedriver().browserVersion("79.0.9").setup();
			WebDriverManager.chromedriver().setup();  //for latest version
			driver=new ChromeDriver();
			
		}
		else
		{
			System.out.println("Browser not accessible");
		}
	
	}
	@BeforeMethod
	public void launchUrl() throws IOException
	{
		intializeDriver();
		String urlName=prop.getProperty("url");
		driver.get(urlName);
	}
}
