package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/Users/rjghori/SeleniumJars/geckodriver");
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		//div[@id='pageFooterChildren']//li
		List<WebElement> allLinks=driver.findElements(By.xpath("//div[@id='pageFooterChildren']/ul/li"));//only get footer  side link
	    System.out.println(allLinks.size());
	    
	    for(int i=0;i<allLinks.size();i++) {
	    	System.out.println(allLinks.get(i).getText());
	    }

	}

}
