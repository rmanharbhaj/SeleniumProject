package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/Users/rjghori/SeleniumJars/geckodriver");
		FirefoxDriver driver=new FirefoxDriver();//open firefox
		
		driver.get("https://www.facebook.com/");//open facebook
		
		//1.className - class attribute - is not working for email
		//driver.findElement(By.className("")).sendKeys("");//we can not use classname with space directly
		
		//2.cssSelector -learn syntax for css
		//driver.findElement(By.cssSelector(""));
		
		//3.id - id attribute
		//driver.findElement(By.id("email")).sendKeys("sdfdfdgdg");
		
		//4.linkText - only for link
		//driver.findElement(By.linkText(""));
		
		//5.name - name attribute
		driver.findElement(By.name("email")).sendKeys("sdfdfdf");
		
		//6.patialLinkText - only for link -only write text
		//driver.findElement(By.partialLinkText(""));
		
		//7.tagName - it it is  unique , then we can use
		//driver.findElement(By.tagName("input")).sendKeys("dfdfdgf");
		
		//8.xpath - learn syntax for css
		//driver.findElement(By.xpath(""));
		
		driver.findElement(By.name("pass")).sendKeys("dfdfdgfg");
		
		driver.findElement(By.tagName("button")).click();

	}

}
