package day11.drivers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenFirefox {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		//step2: create an instance of Chrome Browser
		WebDriver driver = new FirefoxDriver();
		//maximize browser
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.close();

	}

}
