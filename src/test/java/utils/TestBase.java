package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	WebDriver driver;
	
	public WebDriver WebDriverManager() throws IOException
	{
		FileInputStream file=new FileInputStream("./src/main/resources/global.properties");
		Properties prop = new Properties();
		prop.load(file);
		String browserProp=prop.getProperty("browser");
		String browserMaven;
		browserMaven=System.getProperty("browser");
		String browser = browserMaven!=null ? browserMaven:browserProp;
		if(browser.toLowerCase().equalsIgnoreCase("chrome")) {
		driver = new ChromeDriver();
		}
		else if(browser.toLowerCase().equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		driver.get(prop.getProperty("url"));
		return driver;
	}

}
