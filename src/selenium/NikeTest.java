package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class NikeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//hover men and size(16)and text for second column
		System.setProperty("webdriver.gecko.driver", "/Users/rjghori/SeleniumJars/geckodriver");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.nike.com/");
		
		WebElement men = driver.findElement(By.linkText("Men"));
		Actions hoverMen=new Actions(driver);
		hoverMen.moveToElement(men).build().perform();
		
		List<WebElement> mshoesList=driver.findElements(By.xpath("//a[contains(@aria-label,'main-menu, Men, Shoes')]"));
		System.out.println(mshoesList.size());
		
		for(WebElement m: mshoesList) {
			System.out.println(m.getText());
		}
	}

}
