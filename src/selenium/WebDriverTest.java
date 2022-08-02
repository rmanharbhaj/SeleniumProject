package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/Users/rjghori/SeleniumJars/geckodriver");
		//childclass name obj=new childclassname();
		//FirefoxDriver driver=new FirefoxDriver();
		
		//parentclassname obj = new childclassname();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("sdfdfdgdg");
		driver.findElement(By.id("pass")).sendKeys("dgdgdf");
		driver.findElement(By.name("login")).click();


	}

}
