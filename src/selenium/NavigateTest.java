package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/Users/rjghori/SeleniumJars/geckodriver");
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.navigate().to("https://www.google.com/");//open browser
		driver.navigate().forward();//go forward page
		driver.navigate().back();//go back page
		driver.navigate().refresh();//do refresh page
	}

}
