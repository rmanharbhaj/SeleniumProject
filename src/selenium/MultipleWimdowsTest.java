package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWimdowsTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/Users/rjghori/SeleniumJars/geckodriver");
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		WebElement help=driver.findElement(By.linkText("Help"));
		help.click();
		
		Set<String> allwindows = driver.getWindowHandles();//store all windows
		System.out.println(allwindows.size());
		
		Iterator<String> iterator=allwindows.iterator();//convert into text
		
		String mainW=iterator.next();
		String childW=iterator.next();
		System.out.println(mainW);
		System.out.println(childW);
		
		Thread.sleep(2000);
		
		driver.switchTo().window(childW);
		System.out.println(driver.getTitle());
		driver.close();//close only current window
		
		driver.switchTo().window(mainW);
		System.out.println(driver.getTitle());
		//driver.quit();//close all tabs and kill the driver ,can not use after quit
	}

}
