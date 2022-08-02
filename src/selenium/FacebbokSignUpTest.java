package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebbokSignUpTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/Users/rjghori/SeleniumJars/geckodriver");
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement createAccount = driver.findElement(By.xpath("//a[contains(@id,'u_0_2_')]"));
								 //driver.findElement(By.linkText("Create new account"));
		createAccount.click();
		
		Thread.sleep(1000);
		
		WebElement firstname=driver.findElement(By.name("firstname"));
		firstname.sendKeys("Riddhi");
		
		WebElement lastName = driver.findElement(By.name("lastname"));
		lastName.sendKeys("Ghori");

		WebElement moNumber = driver.findElement(By.name("reg_email__"));
		moNumber.sendKeys("1234567890");
		
		WebElement password = driver.findElement(By.id("password_step_input"));
		password.sendKeys("sddsfdgf");
		
		WebElement month=driver.findElement(By.id("month"));
		Select select=new Select(month);
		select.selectByVisibleText("Jul");
		
		WebElement date=driver.findElement(By.id("day"));
		Select sdate=new Select(date);
		sdate.selectByValue("20");
		
		WebElement year=driver.findElement(By.id("year"));
		Select syear=new Select(year);
		syear.selectByVisibleText("2020");

		List<WebElement> radioList=driver.findElements(By.xpath("//span[@data-type='radio']/span"));
		System.out.println(radioList.size());
		
		for(WebElement a: radioList) {
			System.out.println(a.getText()+"......"+a.isSelected());
		}
		System.out.println("-------------------");
		
		
		radioList.get(1).click();
	    
		for(WebElement a: radioList) {
			System.out.println(a.getText()+"......"+a.isSelected());
		}
		
		WebElement signIn = driver.findElement(By.name("websubmit"));
		signIn.click();
	}

}
