package SeleniumFinalPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/rjghori/SeleniumJars/geckodriver");
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
		driver.switchTo().frame(driver.findElement(By.id("frm1")));
		List<WebElement> text1=driver.findElements(By.xpath("//li[contains(text(),'Single-Selection Dropdown')]"));
		System.out.println(text1.size());
		System.out.println(text1.get(0).getText());
		
		if(text1.size()>0) {
			System.out.println("Present");
		}else {
			System.out.println("Not Present");
		}
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.id("frm2")));
		List<WebElement> text2=driver.findElements(By.xpath("//li[contains(text(),'Textbox')]"));
		System.out.println(text2.size());
		System.out.println(text2.get(0).getText());
		
		if(text2.size()>0) {
			System.out.println("Present");
		}else {
			System.out.println("Not Present");
		}
		
		

		List<WebElement> text3=driver.findElements(By.id("firstName"));
		System.out.println(text3.size());
		
		if(text3.size()>0) {
			System.out.println("Present");
		}else {
			System.out.println("Not Present");
		}
	}

}
