package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EbayHeaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print header size and link text
		System.setProperty("webdriver.gecko.driver", "/Users/rjghori/SeleniumJars/geckodriver");
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://www.ebay.ca/");
		
		List<WebElement> headerLinks=driver.findElements(By.xpath("//ul[@class='hl-cat-nav__container']/li"));
		System.out.println(headerLinks.size());
		
		//stadard for loop
		//for(int i=0;i<headerLinks.size();i++) {
		//	System.out.println(headerLinks.get(i).getText());
		//}
		

		//for each loop
		for(WebElement a:headerLinks) {
			System.out.println(a.getText());
		}
	}

}
