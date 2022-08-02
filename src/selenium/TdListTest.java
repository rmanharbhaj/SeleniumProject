package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TdListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print footer size and text links
		System.setProperty("webdriver.gecko.driver", "/Users/rjghori/SeleniumJars/geckodriver");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.td.com/ca/en/personal-banking/");
		//a[@class='td-copy-white td-link-nounderline td-copy-standard']
		
		List<WebElement> footerLinks=driver.findElements(By.xpath("//div[@class='td-footer-links td-copy-align-centre td-copy-white']/a"));
		System.out.println(footerLinks.size());
		
		for(int i=0;i<footerLinks.size();i++) {
			System.out.println(footerLinks.get(i).getText());
		}
		

	}

}
