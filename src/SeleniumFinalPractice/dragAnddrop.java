package SeleniumFinalPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAnddrop {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "/Users/rjghori/SeleniumJars/geckodriver");
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://demoqa.com/droppable");
		Actions a=new Actions(driver);
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		a.dragAndDrop(drag, drop).build().perform();
		
		String Actual=drop.getText();
		System.out.println(Actual);
		
		if(Actual.equals("Dropped!")) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
		
	}

}
