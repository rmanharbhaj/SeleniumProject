package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/Users/rjghori/SeleniumJars/geckodriver");
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		
		//WebElement firstLink=driver.findElement(By.tagName("a"));//only first link
		
		//List<WebElement> allLinks=driver.findElements(By.tagName("a"));//for all link
	    //System.out.println(allLinks.size());//get size for how many link
	    
	    //WebElement footer=driver.findElement(By.xpath("//div[@class='KxwPGc SSwjIe']"));
	    //List<WebElement> allLinks=footer.findElements(By.tagName("a"));//find link only for footer either can use below line
		
		List<WebElement> allLinks=driver.findElements(By.xpath("//div[@class='KxwPGc AghGtd']/a"));//only get footer left side link
	    System.out.println(allLinks.size());
	    
	    for(int i=0;i<allLinks.size();i++) {
	    	System.out.println(allLinks.get(i).getText());
	    }
	}

}
