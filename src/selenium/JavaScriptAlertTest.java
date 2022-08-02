package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptAlertTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/Users/rjghori/SeleniumJars/geckodriver");
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://echoecho.com/javascript4.htm");
		
		WebElement confirmBox=driver.findElement(By.name("B2"));
		confirmBox.click();
		
		Thread.sleep(2000);
		
		Alert msg=driver.switchTo().alert();
		System.out.println(msg.getText());
		
		//msg.accept();//click ok
		msg.dismiss();//click cancel

				
	}

}
