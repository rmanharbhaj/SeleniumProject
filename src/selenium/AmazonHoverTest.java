package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonHoverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//first hover on sign in and size(7) and text for (your list)
		System.setProperty("webdriver.gecko.driver", "/Users/rjghori/SeleniumJars/geckodriver");
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://www.amazon.ca/");
		
		WebElement signIn=driver.findElement(By.id("nav-link-accountList"));
		Actions hoverSignIn=new Actions(driver);
		hoverSignIn.moveToElement(signIn).build().perform();
		
		List<WebElement> yourList=driver.findElements(By.xpath("//div[@id='nav-al-wishlist']/a"));
		System.out.println(yourList.size());
		
		for(WebElement y: yourList) {
			System.out.println(y.getText());
		}
		
	}

}
