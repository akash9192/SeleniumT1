package day13.driverwait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitExample2 {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("akash.kukade010");
		driver.findElement(By.xpath("//span[text()='Next']")).click();

		WebDriverWait wait=new WebDriverWait(driver,20);
		
		//add condition to wait using WebDriverWait instance
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
		
		driver.findElement(By.name("Passwd")).sendKeys("abc@123");
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys();
		//driver.findElement(By.xpath("//span[text()='Next']")).click();
		//close the browser
		//driver.close();

	}

}
