package day11.drivers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTrip {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();	
			
		    WebDriver driver = new ChromeDriver();
		    
		    driver.manage().window().maximize();
		    
		        driver.manage().timeouts().implicitlyWait(30,  TimeUnit.SECONDS);
		        driver.get("https://www.makemytrip.com/");
			// driver.findElement(By.cssSelector("body")).click();
				driver.findElement(By.cssSelector("span.langCardClose")).click();
				driver.findElement(By.cssSelector("ul>li.selected")).click();
				driver.findElement(By.cssSelector("div.fsw_inputBox.dates.inactiveWidget")).click();

	}

}
