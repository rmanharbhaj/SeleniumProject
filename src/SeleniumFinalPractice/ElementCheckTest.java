package SeleniumFinalPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementCheckTest {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "/Users/rjghori/SeleniumJars/geckodriver");
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://www.ebay.ca/");
		driver.manage().window().maximize();
		
		List<WebElement> element=driver.findElements(By.id("rtm_list2"));
		System.out.println(element.size());
		
		if(element.size()>0) {
			System.out.println("Present");
		}else {
			System.out.println("Not Present");
		}
		
		WebElement search=driver.findElement(By.id("gh-ac"));
		search.sendKeys("Computer");
		
		String getSearchValue=search.getAttribute("value");
		System.out.println(getSearchValue);
	}

}
