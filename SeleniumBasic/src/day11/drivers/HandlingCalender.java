package day11.drivers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingCalender {

	public static void main(String[] args) {
		 
		 WebDriverManager.chromedriver().setup();
		 	
			
		    WebDriver driver = new ChromeDriver();
		    
		    driver.manage().window().maximize();
		    
		    driver.manage().timeouts().implicitlyWait(30,  TimeUnit.SECONDS);
		    
		    driver.get("https://www.makemytrip.com/");
	}

}
