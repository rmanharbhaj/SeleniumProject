package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdidasLoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/Users/rjghori/SeleniumJars/geckodriver");
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://www.adidas.ca/en/account-login");
		Thread.sleep(3000);

		
		WebElement email=driver.findElement(By.id("login-email"));
		email.sendKeys("asdfvcn@dgdg.com");
		
		WebElement passWord=driver.findElement(By.id("login-password"));
		passWord.sendKeys("dsdsdff");
		
		WebElement logIn=driver.findElement(By.xpath("//button[@type='submit']"));
		logIn.click();
		
		Thread.sleep(4000);
		String expected ="Incorrect email/password – please check and retry";
		String actual = driver.findElement(By.xpath("//div[@data-auto-id='login-error-message']")).getText();
		System.out.println(actual);
		
		if(expected.equals(actual)) {
			System.out.println("Test Pass");
		}
		else{
			System.out.println("Test Fail");
			}
		}

	

}
