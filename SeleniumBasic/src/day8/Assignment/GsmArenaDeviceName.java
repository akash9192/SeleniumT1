package day8.Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GsmArenaDeviceName {

	
		public static void main(String[] args) {
			String chromeExePath =System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		    System.setProperty("webdriver.chrome.driver",chromeExePath);
		    WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		    driver.get("https://www.gsmarena.com/");
		    String pageUrl = driver.getCurrentUrl();
		    System.out.println("Page Url is: " +pageUrl);
	  String expectedURL=("https://www.gsmarena.com/");
	  System.out.println("Url Validation Status: "+pageUrl.contains(expectedURL));
		

	  List<WebElement> phoneNameDevice=driver.findElements(By.cssSelector("div.brandmenu-v2 >ul>li>a"));
	  for(int i=0; i<phoneNameDevice.size(); i++) {
		  System.out.println(phoneNameDevice.get(i).getText());
		}
		}
	}