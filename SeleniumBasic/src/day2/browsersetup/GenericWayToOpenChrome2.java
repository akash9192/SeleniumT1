package day2.browsersetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericWayToOpenChrome2 {

	public static void main(String[] args) {
		String currentWorkingDir=System.getProperty("user.dir");
		String chromeExepath=currentWorkingDir+"\\Executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", chromeExepath);
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.actitime.com");
		
		String actualTitle=driver.getTitle();
		String expectedTitle="demo.actitime";


		System.out.println("Actual demo.actitime Page title is :"+actualTitle);
		System.out.println("Expected demo.actitime Page title is:"+expectedTitle);
		System.out.println("demo.actitime title validation "+actualTitle.equals(expectedTitle));
		
		System.out.println("Length of title is " + actualTitle.length());
		
		 String actualUrl = driver.getCurrentUrl();
		  String expectedUrl="https://demo.actitime.com";
		  System.out.println("Actual demo.actitime Page Url is :"+actualTitle);
			System.out.println("Expected demo.actitime Page Url is:"+expectedTitle);
			System.out.println("demo.actitime Url validation "+actualTitle.contains(expectedTitle));
			
			String sourcelenght=driver.getPageSource();
			
			System.out.println("Lenght of source is " +sourcelenght.length() );
			driver.close();
	}

}
