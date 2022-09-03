package day2.browsersetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericWayToOpenChrome1 {

	public static void main(String[] args) {
		String currentWorkingDir=System.getProperty("user.dir");
		String chromeExepath=currentWorkingDir+"\\Executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", chromeExepath);
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");

		String actualTitle=driver.getTitle();
		String expectedTitle="Google";
		System.out.println("Actual Google Page title is :"+actualTitle);
		System.out.println("Expected Google Page title is:"+expectedTitle);
		System.out.println("Google title validation "+expectedTitle.equals(expectedTitle));
		
		  String actualUrl = driver.getCurrentUrl();
		  String expectedUrl="https://www.google.com";
		  System.out.println("Actual Google Page Url is :"+actualTitle);
			System.out.println("Expected Google Page Url is:"+expectedTitle);
			System.out.println("Google Url validation "+expectedTitle.equals(expectedTitle));
			
			String pageSource = driver.getPageSource();
			System.out.println("Page Source code content lenth:"+pageSource.length());
			
			driver.close();

	}

}
