package day13.driverwait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardOps {

	public static void main(String[] args) {
		    WebDriverManager.chromedriver().setup();	
			
		    WebDriver driver = new ChromeDriver();
		    
		    driver.manage().window().maximize();
		    
		    driver.manage().timeouts().implicitlyWait(30,  TimeUnit.SECONDS);	
		    

			driver.get("https://www.flipkart.com/");
			
			//using Escape of keyboard to avoid login popup
			driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
	}

}
