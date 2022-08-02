package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/Users/rjghori/SeleniumJars/geckodriver");
		FirefoxDriver driver=new FirefoxDriver();//open firefox
		driver.get("https://jqueryui.com/droppable/");
		
		List<WebElement> sortable=driver.findElements(By.linkText("Sortable"));
		System.out.println(sortable.size());
			  
		if(sortable.size()>0) {
			System.out.println("sortable Present"); 
		}else {
			System.out.println("sortable is not Present");
		}
		
		List<WebElement> bElement=driver.findElements(By.id("draggable"));
		System.out.println(bElement.size());
			  
		if(bElement .size()>0) {
			System.out.println("Element Present"); 
		}else {
			System.out.println("Element is not Present");
		}
		System.out.println(".......switch main page to iframe....");
		//driver.switchTo().frame(0);//with index
		//driver.switchTo().frame(null);//if we have name and id thn we can use otherwise not
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		sortable=driver.findElements(By.linkText("Sortable"));
		System.out.println(sortable.size());
			  
		if(sortable.size()>0) {
			System.out.println("sortable Present"); 
		}else {
			System.out.println("sortable is not Present");
		}
		
		bElement=driver.findElements(By.id("draggable"));
		System.out.println(bElement.size());
			  
		if(bElement .size()>0) {
			System.out.println("Element Present"); 
		}else {
			System.out.println("Element is not Present");
		}
		
		System.out.println(".......switch back to main page....");
		driver.switchTo().defaultContent();

		sortable=driver.findElements(By.linkText("Sortable"));
		System.out.println(sortable.size());
			  
		if(sortable.size()>0) {
			System.out.println("sortable Present"); 
		}else {
			System.out.println("sortable is not Present");
		}
		
		bElement=driver.findElements(By.id("draggable"));
		System.out.println(bElement.size());
			  
		if(bElement .size()>0) {
			System.out.println("Element Present"); 
		}else {
			System.out.println("Element is not Present");
		}
		
		//we can move directly in parentframe
		//driver.switchTo().parentFrame();
	}

}
