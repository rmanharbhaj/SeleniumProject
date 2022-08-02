package selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/Users/rjghori/SeleniumJars/geckodriver");
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://echoecho.com/javascript4.htm");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));

		WebElement confirmBox=driver.findElement(By.name("B2"));
		confirmBox.click();
		
		wait.until(ExpectedConditions.alertIsPresent());
		Alert msg=driver.switchTo().alert();
		System.out.println(msg.getText());
		
		//msg.accept();//click ok
		msg.dismiss();//click cancel
	}

}
