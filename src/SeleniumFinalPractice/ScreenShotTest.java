package SeleniumFinalPractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShotTest {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver", "/Users/rjghori/SeleniumJars/geckodriver");
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		
		File f=driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("/Users/rjghori/Desktop/ScreenShot/1.png"));
	}

}
