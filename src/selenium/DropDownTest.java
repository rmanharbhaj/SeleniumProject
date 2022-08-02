package selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDownTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/Users/rjghori/SeleniumJars/geckodriver");
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://www.ebay.ca/");
		driver.findElement(By.id("gh-cat")).click();
		

		List<WebElement> selList=driver.findElements(By.xpath("//select[@id='gh-cat']/option"));
		System.out.println(selList.size());
		
		for(WebElement a:selList) {
			if(a.isSelected()) {
			System.out.println(a.getText()+"..."+a.isSelected());
			}
		}
		WebElement dropdown=driver.findElement(By.id("gh-cat"));
		Select select = new Select(dropdown);
		
		select.selectByIndex(3);
		Thread.sleep(2000);
		
		select.selectByValue("11116");
		Thread.sleep(2000);
		
		select.selectByVisibleText("Travel");
		System.out.println("111111");
		for(WebElement a:selList) {
			if(a.isSelected()) {
			System.out.println(a.getText()+"..."+a.isSelected());
			}
		}
		
		
		
	}

}
