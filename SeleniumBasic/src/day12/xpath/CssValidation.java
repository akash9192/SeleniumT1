package day12.xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssValidation {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();	
			
		    WebDriver driver = new ChromeDriver();
		    
		    driver.manage().window().maximize();
		    
		    driver.get("https://courses.letskodeit.com/practice");
		   
		    
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  
		   WebElement RadioButtonExample = driver.findElement(By.cssSelector(".left-align legend"));
		   
		   System.out.println("RadiobuttonExample colour is: "+RadioButtonExample.getCssValue("color"));//font colour
		   System.out.println("RadiobuttonExample colour is: "+RadioButtonExample.getCssValue("font-size"));//font size
		   System.out.println("RadiobuttonExample colour is: "+RadioButtonExample.getCssValue("background"));//bagckround colour
		   
		   
		   WebElement OpenWindow = driver.findElement(By.cssSelector("#openwindow"));
		   
		   System.out.println("OpenWindow colour is :"+OpenWindow.getCssValue("color"));
		   System.out.println("OpenWindow colour is :"+OpenWindow.getCssValue("font-size"));
		   System.out.println("OpenWindow colour is :"+OpenWindow.getCssValue("background-color"));

		    
	}

}
