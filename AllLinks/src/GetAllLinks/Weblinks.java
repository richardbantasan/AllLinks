package GetAllLinks;

import java.util.List;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Weblinks {
	  public static void main(String[] args) {
	        String baseUrl = "http://www.facebook.com";
	        WebDriver driver = new FirefoxDriver();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	        driver.get(baseUrl);
	        List<WebElement> link=driver.findElements(By.tagName("a"));

	        for(WebElement ele:link)
	        {
	             System.out.println(ele.getText());
	        } 
	     
	            driver.navigate().back();
	        
	        driver.quit();
	    }

}
