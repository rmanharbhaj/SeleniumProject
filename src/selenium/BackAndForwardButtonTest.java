package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BackAndForwardButtonTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/Users/rjghori/SeleniumJars/geckodriver");
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));

		driver.findElement(By.linkText("About")).click();
		wait.until(ExpectedConditions.titleContains("Google - About Google, "));
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		wait.until(ExpectedConditions.titleIs("Google"));
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		wait.until(ExpectedConditions.titleContains("Google - About Google, "));
		System.out.println(driver.getTitle());
		

	}

}
