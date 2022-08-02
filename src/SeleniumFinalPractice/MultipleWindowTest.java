package SeleniumFinalPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class MultipleWindowTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/rjghori/SeleniumJars/geckodriver");
		FirefoxDriver driver=new FirefoxDriver();
		//WebDriverWait we=new WebDriverWait(driver,Duration.ofSeconds(20));
		
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/ServiceLogin/signinchooser?hl=en&passive=true&continue=https%3A%2F%2Fwww.google.com%2F&ec=GAZAmgQ&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		WebElement terms =driver.findElement(By.linkText("Terms"));
		terms.click();
		
		WebElement help =driver.findElement(By.linkText("Help"));
		help.click();
		
		Set<String> windows=driver.getWindowHandles();
		System.out.println(windows.size());
		
		Iterator<String> readWindows=windows.iterator();
		String mainwindow=readWindows.next();
		String childWindow=readWindows.next();
		String thirdWindow=readWindows.next();
		
		System.out.println(mainwindow);
		System.out.println(childWindow);
		System.out.println(thirdWindow);
		
		driver.switchTo().window(childWindow);
		String childTitle=driver.getTitle();
		System.out.println(childTitle);
		
		driver.switchTo().window(thirdWindow);
		String thirdTitle=driver.getTitle();
		System.out.println(thirdTitle);
		
		driver.switchTo().window(mainwindow);
		String maintitle=driver.getTitle();
		System.out.println(maintitle);
	}

}
