package SeleniumFinalPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class DoubleClickTest {
	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "/Users/rjghori/SeleniumJars/geckodriver");
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement dblclk=driver.findElement(By.xpath("//button[@ondblclick='myFunction1()']"));
		Actions a=new Actions(driver);
		a.doubleClick(dblclk).build().perform();
		
		
		WebElement slider=driver.findElement(By.id("slider"));
		js.executeScript("arguments[0].scrollIntoView()", slider);
		a.dragAndDropBy(slider, 20, 30).build().perform();
		
		WebElement resize=driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
		js.executeScript("arguments[0].scrollIntoView()", resize);
		a.clickAndHold(resize).moveByOffset(150, 100).build().perform();
		resize.click();
		
		List<WebElement> list=driver.findElements(By.xpath("//select[@id='speed']/option"));
		System.out.println(list.size());
		
		for(WebElement d:list) {
			System.out.println(d.getText());
		}
		
		WebElement dropDwn=driver.findElement(By.id("speed"));
		Select s=new Select(dropDwn);
		s.selectByIndex(2);
		String dropDwnValue=dropDwn.getAttribute("value");
		System.out.println(dropDwnValue);
		
		
	}



	

}
