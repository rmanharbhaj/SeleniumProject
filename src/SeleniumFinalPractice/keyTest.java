package SeleniumFinalPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class keyTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/rjghori/SeleniumJars/geckodriver");
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.ca/");
		
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("laptop");
		search.sendKeys(Keys.ENTER);
		
		WebElement text=driver.findElement(By.xpath("//span[@id='glow-ingress-line2']"));
		System.out.println(text.getText());

	}

}
