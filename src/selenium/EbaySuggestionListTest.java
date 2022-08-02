package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EbaySuggestionListTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//type iphone in search and get size(12) and text
		System.setProperty("webdriver.gecko.driver", "/Users/rjghori/SeleniumJars/geckodriver");
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://www.ebay.ca/");
		
		WebElement search=driver.findElement(By.id("gh-ac"));
		search.sendKeys("iphone");
		
		Thread.sleep(2000);

		List<WebElement> suggestionList=driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println(suggestionList.size());
		
		for(WebElement a:suggestionList) {
			System.out.println(a.getText());
		}
	}

}
