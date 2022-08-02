package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AttributeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/Users/rjghori/SeleniumJars/geckodriver");
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://www.ebay.ca/");

		String search= driver.findElement(By.id("gh-ac")).getAttribute("placeholder");
		System.out.println(search);
		
		WebElement type=driver.findElement(By.id("gh-ac"));
		type.sendKeys("samsung");
		
		String find=driver.findElement(By.id("gh-ac")).getAttribute("value");//if i want to read,what i did type
		System.out.println(find);
		
				
	}

}
