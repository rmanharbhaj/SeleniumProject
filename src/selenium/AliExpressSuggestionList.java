package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AliExpressSuggestionList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//type computer in search and get size(10) and get text
		System.setProperty("webdriver.gecko.driver", "/Users/rjghori/SeleniumJars/geckodriver");
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://www.aliexpress.com/");
		
		List<WebElement> close=driver.findElements(By.className("close-btn"));
		List<WebElement> close2=driver.findElements(By.className("_24EHh"));
		System.out.println(close.size());
		System.out.println(close2.size());
		Thread.sleep(2000);
		
		if(close.size()>0) 
		{
			driver.findElement(By.className("close-btn")).click();
			
		}
		
		Thread.sleep(2000);
		
		
		if(close2.size()>0) 
		{
			driver.findElement(By.className("_24EHh")).click();
			
		}
		
		WebElement search=driver.findElement(By.id("search-key"));
		search.sendKeys("iphone");
		
		Thread.sleep(2000);
		
		List<WebElement> suggestionList=driver.findElements(By.xpath("//ul[@data-role='items']/li"));
		System.out.println(suggestionList.size());
		
		for(WebElement s:suggestionList) {
			System.out.println(s.getText());
		}
	}

}
