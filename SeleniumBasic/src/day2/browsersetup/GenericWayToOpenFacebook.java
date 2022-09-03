package day2.browsersetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericWayToOpenFacebook {

	public static void main(String[] args) {
		String currentWorkingDir=System.getProperty("user.dir");
		String chromeExepath=currentWorkingDir+"\\Executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", chromeExepath);
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.Facebook.com");
		 
		String actualTitle=driver.getTitle();
		   String expectedTitle="Facebook";
		   System.out.println("Actual Facebook Page title is :"+actualTitle);
		   System.out.println("Expected Facebook Page title is:"+expectedTitle);
		   System.out.println("Facebook title validation "+actualTitle.equals(expectedTitle));
		
		   String actualUrl = driver.getCurrentUrl();
		   String expectedUrl="https://www.Facebook.com";
		   System.out.println("Actual Facebook Page Url is :"+actualTitle);
			System.out.println("Expected Facebook Page Url is:"+expectedTitle);
			System.out.println("Facebook Url validation "+actualTitle.equals(expectedTitle));
			
			String pageSource = driver.getPageSource();
			System.out.println("Page Source code content lenth:"+pageSource.length());
			
			driver.close();

	}

}
