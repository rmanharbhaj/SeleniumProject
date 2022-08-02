package selenium;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class MultipleBrowsersTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver;
		FileInputStream fi=new FileInputStream("/Users/rjghori/Testing/proper.properties");
		Properties pr=new Properties();
		pr.load(fi);
		
		String browser=pr.getProperty("browser");

		//String browser="chrome";//read data from xml,excel,properties file
		
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/rjghori/SeleniumJars/chromedriver");
			driver=new ChromeDriver();
		}else if(browser.equals("Firefox")){
			System.setProperty("webdriver.gecko.driver", "/Users/rjghori/SeleniumJars/geckodriver");
			 driver=new FirefoxDriver();
		}else {
			System.setProperty("webdriver.safari.driver", "/Users/rjghori/SeleniumJars/safaridriver");
			 driver=new SafariDriver();
		}
	
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.name("email")).sendKeys("sdfdfdfaaa");
		driver.findElement(By.name("pass")).sendKeys("dfdfdgfgsss");
		driver.findElement(By.name("login")).click();

	}

}
