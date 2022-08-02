package SeleniumFinalPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitTest {
	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "/Users/rjghori/SeleniumJars/geckodriver");
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.ca/?tag=admpdesktopca-20&ref=pd_sl_aE67C327FAA158126C10DD8DEF");
		WebDriverWait we=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		String homeTitle=driver.getTitle();
		System.out.println(homeTitle);
		we.until(ExpectedConditions.titleContains("Amazon.ca: Low Prices"));
		
		Actions a=new Actions(driver);
		WebElement hover=driver.findElement(By.xpath("//span[contains(text(),'Account & Lists')]"));
		a.moveToElement(hover).build().perform();
		
		List<WebElement> list=driver.findElements(By.xpath("//div[@id='nav-al-wishlist']//span"));
		we.until(ExpectedConditions.visibilityOfAllElements(list));
		System.out.println(list.size());
		
		for(WebElement p:list) {
			System.out.println(p.getText());
		}
	}
	
}
