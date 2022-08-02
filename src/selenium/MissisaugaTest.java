package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MissisaugaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/Users/rjghori/SeleniumJars/geckodriver");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.mississauga.ca/");
		
		WebElement button=driver.findElement(By.xpath("//button[text()='Our organization']"));
		button.click();
		
		
		List<WebElement> bList=driver.findElements(By.xpath("//ul[@class='dropdown-menu nav-dropdown-menu show']//a"));
		System.out.println(bList.size());
		
		for(WebElement a:bList) {
			System.out.println(a.getText());
			if(a==bList.get(2)) {
				bList.get(2).click();
				  System.out.println(driver.getTitle()+".........."+"found");
				  break;
				  
			}
		}
		
		  
		 
		
	}

}
