package SeleniumFinalPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/rjghori/SeleniumJars/geckodriver");
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://www.amazon.ca/?tag=admpdesktopca-20&ref=pd_sl_a9B444CCD9E56E79DE2F79B396");
		driver.manage().window().maximize();
		
		Actions a=new Actions(driver);
		WebElement hover=driver.findElement(By.xpath("//span[contains(text(),'Account & Lists')]"));
		a.moveToElement(hover).build().perform();
		
		List<WebElement> list=driver.findElements(By.xpath("//div[@id='nav-al-wishlist']//span"));
		System.out.println(list.size());
		
		for(WebElement p:list) {
			System.out.println(p.getText());
		}
		
	}

}

