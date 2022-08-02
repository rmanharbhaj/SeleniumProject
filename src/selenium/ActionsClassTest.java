package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/Users/rjghori/SeleniumJars/geckodriver");
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://www.ebay.ca/");
		
		WebElement electronics=driver.findElement(By.linkText("Electronics"));
		Actions hoverE=new Actions(driver);
		hoverE.moveToElement(electronics).build().perform();
		Thread.sleep(2000);
		
		List<WebElement> allLinks=driver.findElements(By.xpath("(//nav[@aria-label='Top Categories']/ul)[3]/li"));
	    System.out.println(allLinks.size());
	    
	    for(int i=0;i<allLinks.size();i++) {
	    	System.out.println(allLinks.get(i).getText());
	    }

	}

}
