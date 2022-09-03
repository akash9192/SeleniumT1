package day5.Vitiger;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeCRM2 {

	public static void main(String[] args) {
		String chromeExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		

		String pageTitle=driver.getTitle();
		System.out.println("Page title is: "+pageTitle);
		System.out.println("Page title length: "+pageTitle.length());
		System.out.println("Page title status: "+pageTitle.equals("OrangeHRM"));
		String pageURL=driver.getCurrentUrl();
		System.out.println("Page URL is: "+pageURL);
		System.out.println("Page URL status: "+pageURL.equals("https://opensource-demo.orangehrmlive.com/"));
		String pageContent=driver.getPageSource();
		
		System.out.println("Page Source length: "+pageContent.length());
		
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).click();
		
		String homePageUrl=driver.getCurrentUrl();
		System.out.println("Home validation status: "+homePageUrl.contains("dashboard"));
	
		
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		driver.close();		
	}


	}


