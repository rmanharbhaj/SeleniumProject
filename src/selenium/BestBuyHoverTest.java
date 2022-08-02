package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BestBuyHoverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//hover shop and get size(16) and text from first column
		System.setProperty("webdriver.gecko.driver", "/Users/rjghori/SeleniumJars/geckodriver");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.bestbuy.ca/");
		
		WebElement shop=driver.findElement(By.xpath("//span[text()='Shop']"));
		shop.click();
		
		List<WebElement> list=driver.findElements(By.xpath("//ul[@data-automation='category-list']/li"));
		System.out.println(list.size());
		
		for(WebElement l :list) {
			System.out.println(l.getText());
		}
	}

}
