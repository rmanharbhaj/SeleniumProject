package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooSuggestionListTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//type canada in search and get size(10) and text
		System.setProperty("webdriver.gecko.driver", "/Users/rjghori/SeleniumJars/geckodriver");
		FirefoxDriver driver=new FirefoxDriver();//open firefox
		driver.get("https://ca.yahoo.com/");
		
		WebElement search=driver.findElement(By.name("p"));
		search.sendKeys("canada");
		
		Thread.sleep(2000);

		List<WebElement> suggestionList=driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println(suggestionList.size());
		
		for(WebElement a:suggestionList) {
			System.out.println(a.getText());
		}
	}

}
