package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicTableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/Users/rjghori/SeleniumJars/geckodriver");
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		
		
		List<WebElement> allrows=driver.findElements(By.xpath("//table[@id='customers']//tr"));
		System.out.println(allrows.size());
		
		List<WebElement> allcols=driver.findElements(By.xpath("//table[@id='customers']//tr[2]/td"));
		System.out.println(allcols.size());
		
//		for(int i=1;i<allrows.size();i++) {
//			List<WebElement> allcols=allrows.get(i).findElements(By.tagName("td"));
//			System.out.println(allcols.size()+"..."+"Number Of Line"+"..."+i);
//			for(int j=0;j<allcols.size();j++) {
//				System.out.println(i+"....."+j+"...."+allcols.get(j).getText());
//			}
//		}
            for(int i=2; i<=allrows.size(); i++) {
			
			for(int j =1; j<=allcols.size(); j++) {
				
				System.out.print(driver.findElement(By.xpath("//table[@id='customers']//tr["+i+"]/td["+j+"]")).getText());
				//System.out.println(driver.findElement(By.xpath(first+i+second+j+third)).getText());
				System.out.print("  ||  ");
			}
			System.out.println();
		}
	}

}
