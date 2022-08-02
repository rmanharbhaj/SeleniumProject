package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/rjghori/SeleniumJars/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.name("email")).sendKeys("sdfdfdfaaa");
		driver.findElement(By.name("pass")).sendKeys("dfdfdgfgsss");
		driver.findElement(By.name("login")).click();
	}

}
