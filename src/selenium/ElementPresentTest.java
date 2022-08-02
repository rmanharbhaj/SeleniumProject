package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementPresentTest {
//how to verify element is present or not
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/Users/rjghori/SeleniumJars/geckodriver");
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		
		//by webelemt we can not check it is present or not bcz webelement must be present if not thn we got error
		/*
		 * if(driver.findElement(By.linkText("About")).isDisplayed()) {
		 * System.out.println("Element Present");
		 * 
		 * }else { System.out.println("Element is not Present"); }
		 */
		 
		
			
		List<WebElement> element=driver.findElements(By.linkText("About"));
		System.out.println(element.size());
			  
		if(element.size()>0) {
			System.out.println("Element Present"); 
		}else {
			System.out.println("Element is not Present");
		}
			 
		

	}

}
