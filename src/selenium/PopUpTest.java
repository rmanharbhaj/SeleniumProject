package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopUpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/Users/rjghori/SeleniumJars/geckodriver");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.aliexpress.com/");
		
		//if we get popup ,close it and type laptop
		//if we didn't get popup,directly type laptop
		List<WebElement> close=driver.findElements(By.className("close-btn"));
		List<WebElement> close2=driver.findElements(By.className("_24EHh"));
		System.out.println(close.size());
		System.out.println(close2.size());
		
		if(close.size()>0 && close2.size()>0) 
		{
			driver.findElement(By.className("close-btn")).click();
			driver.findElement(By.className("_24EHh")).click();
		}
		WebElement search=driver.findElement(By.id("search-key"));
		search.sendKeys("laptop");

	}

}
