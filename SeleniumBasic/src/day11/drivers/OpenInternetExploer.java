package day11.drivers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenInternetExploer {

	public static void main(String[] args) {
		WebDriverManager.iedriver().setup();
		//step2: create an instance of Chrome Browser
		WebDriver driver = new InternetExplorerDriver();
		//maximize browser
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://www.google.com");
		
		driver.close();
	}

}
