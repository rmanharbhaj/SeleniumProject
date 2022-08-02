package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeysTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/Users/rjghori/SeleniumJars/geckodriver");
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=VeavQVgFl2g&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5zY290aWFiYW5rLmNvbVwvIiwib2F1dGhfa2V5IjoiVmVhdlFWZ0ZsMmciLCJjb25zZW50X3JlcXVpcmVkIjpmYWxzZSwicmVkaXJlY3RfdXJpIjoiaHR0cHM6XC9cL3d3dy5zY290aWFvbmxpbmUuc2NvdGlhYmFuay5jb21cL29ubGluZVwvbGFuZGluZ1wvb2F1dGhsYW5kaW5nLmJucyIsImV4cCI6MTY0NTk3NzYyMiwiaWF0IjoxNjQ1OTc2NDIyLCJqdGkiOiIxZjllYjQzMS01NjRhLTRkNDUtOTIyNS1lNzI2NTE1ODVhOGUiLCJjbGllbnRfaWQiOiI4ZWU5MGMzOS0xYzUyLTRmZjQtOGFlNi1hN2I1NGM1Mzk5MzMiLCJjbGllbnRfbWV0YWRhdGEiOnsiQ2hhbm5lbElEIjoiU09MIiwiQXBwbGljYXRpb25Db2RlIjoiSDcifSwiaXNzdWVyIjoiaHR0cHM6XC9cL3Bhc3Nwb3J0LnNjb3RpYWJhbmsuY29tIn0.H6pr0Tp8YOUVF3Vk7peMWg0pQ9Yvf_ZawpmOgQMt3c3GEpX2O9aeielDtWEFrp-w0NZ2NBpxtl-lVehGuKs-Q_64o6xiTezjvGu4RSV9FFqmyuouuzq5grFz2-_9SOsH1V_YscWjOLh6ukb1O6c4JFgXHYrzW6Yyvms0j9JMrSF3Nv2PRw-aMsjc0Rd4JaHW0wlrathwpXwIm5vs_BtQ23ng1aFsqxTZf1flkTL81cWhuvMBw-iomLXfwSN1m0Sqrish1Hc_VpGMtjxNp-jQ7xqS7MpSJv7Njzn3sneMRon1TicBdV_jO4--97KKT7Psuy8kwtYKjWUDdf6HPtqiHw&preferred_environment=");

		driver.findElement(By.name("usernameInput")).sendKeys("riddhighoriaaa");
		driver.findElement(By.name("password")).sendKeys("123wersd23");
		driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		
		String expected ="Please check your card number / username or password and try again.";
		String actual = driver.findElement(By.id("globalError")).getText();//get error from signin page and save it 
		System.out.println(actual);
		
		if(expected.equals(actual)) {
			System.out.println("Test Pass");
		}
		else{
			System.out.println("Test Fail");
			}

	}

}
