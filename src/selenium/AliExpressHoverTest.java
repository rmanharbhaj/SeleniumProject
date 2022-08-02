package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AliExpressHoverTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//hover women's fasion(10) and get size and text for links
		System.setProperty("webdriver.gecko.driver", "/Users/rjghori/SeleniumJars/geckodriver");
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://www.aliexpress.com/");
		
		List<WebElement> close=driver.findElements(By.className("close-btn"));
		List<WebElement> close2=driver.findElements(By.className("_24EHh"));
		System.out.println(close.size());
		System.out.println(close2.size());
		Thread.sleep(2000);
		
		if(close.size()>0) 
		{
			driver.findElement(By.className("close-btn")).click();
			
		}
		
		Thread.sleep(2000);
		
		
		if(close2.size()>0) 
		{
			driver.findElement(By.className("_24EHh")).click();
			
		}
		WebElement wFashion=driver.findElement(By.linkText("Women's Fashion"));
		Actions hoverWomen=new Actions(driver);
		hoverWomen.moveToElement(wFashion).build().perform();
		
		Thread.sleep(2000);
		List<WebElement> womenList=driver.findElements(By.xpath("(//*[@data-path='c-women-content']//dd)[1]/a"));
		System.out.println(womenList.size());
		
		for(WebElement w: womenList) {
			System.out.println(w.getText());
		}
	}

}
