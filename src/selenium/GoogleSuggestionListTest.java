package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSuggestionListTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/Users/rjghori/SeleniumJars/geckodriver");
		FirefoxDriver driver=new FirefoxDriver();//open firefox
		driver.get("https://www.google.com/");//open google
		
		WebElement search=driver.findElement(By.xpath("//input[@title='Search']"));
		search.sendKeys("canada");
		
		Thread.sleep(2000);
		
		List<WebElement> allSuggestions=driver.findElements(By.xpath("//ul[@role='listbox']/li"));
	    System.out.println(allSuggestions.size());
	    
	    for(int i=0;i<allSuggestions.size();i++) {
	    	System.out.println(allSuggestions.get(i).getText());
	    }

	}

}
