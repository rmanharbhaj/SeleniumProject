package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooHeaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print header size and list
		System.setProperty("webdriver.gecko.driver", "/Users/rjghori/SeleniumJars/geckodriver");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://ca.yahoo.com/");
		
		List<WebElement> headerLinks=driver.findElements(By.xpath("//ul[@role='presentation']/li/a"));
		System.out.println(headerLinks.size());
		
		for(int i=0;i<headerLinks.size();i++) {
			System.out.println(headerLinks.get(i).getText());
		}
		

	}

}
