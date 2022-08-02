package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//print size and all links from Trending Now
		System.setProperty("webdriver.gecko.driver", "/Users/rjghori/SeleniumJars/geckodriver");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://ca.yahoo.com/");
		
		//WebElement trendinglist=driver.findElement(By.xpath("/div[contains(@class,'trendingNowTextList')]//a"));
	    //List<WebElement> trendingLinks=trendinglist.findElements(By.tagName("a"));
		
		List<WebElement> trendingLinks=driver.findElements(By.xpath("//div[@class='bd']//a"));
		System.out.println(trendingLinks.size());
		
		for(int i=0;i<trendingLinks.size();i++) {
			System.out.println(trendingLinks.get(i).getText());
		}
	}

}
