package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/Users/rjghori/SeleniumJars/geckodriver");
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		System.out.println(drop.getText());
		
		Actions action=new Actions(driver);
		action.dragAndDrop(drag, drop).build().perform();
		
		
		String actual = drop.getText();
		System.out.println(actual);
		
		if(drop.getText().equals(actual)) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
	}

}
