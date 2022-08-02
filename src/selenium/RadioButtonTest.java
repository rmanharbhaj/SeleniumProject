package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "/Users/rjghori/SeleniumJars/geckodriver");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://echoecho.com/htmlforms10.htm");
		
		List<WebElement> radioList=driver.findElements(By.name("group1"));
		System.out.println(radioList.size());
		
		for(WebElement a: radioList) {
			System.out.println(a.getAttribute("value")+"...."+a.isSelected());
		}
		
		//radioList.get(2).click();got error

	}

}
