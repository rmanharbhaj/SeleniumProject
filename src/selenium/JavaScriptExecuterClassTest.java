package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecuterClassTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/Users/rjghori/SeleniumJars/geckodriver");
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://www.adidas.ca/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		JavascriptExecutor scroll=(JavascriptExecutor)driver;
		WebElement careers=driver.findElement(By.linkText("Careers"));
		//Scrolling for we can view the element
		
		//opt 1=x and y cordinate
		//JavascriptExecutor scroll=(JavascriptExecutor)driver;
		//scroll.executeScript("window.scrollBy(0,4000)");
		
		//opt 2=Scroll until the element is in the view
		scroll.executeScript("arguments[0].scrollIntoView();",careers);
		careers.click();
		
       //opt 3=direct click
		//scroll.executeScript("arguments[0].click();", careers);
		
		//for text
		//scroll.executeScript("arguments[0].value='dfdfdf'", careers);
	}

}
