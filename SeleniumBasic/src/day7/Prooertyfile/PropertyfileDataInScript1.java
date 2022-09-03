package day7.Prooertyfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertyfileDataInScript1 {

	public static void main(String[] args) throws IOException {
		String currentWorkingDir=System.getProperty("user.dir");
		String chromeExepath=currentWorkingDir+"\\Executables\\chromedriver.exe";
		
		FileInputStream fis =new FileInputStream(".\\TestData\\AppTestData1.properties");
	    Properties prop =new Properties(); 
	    prop.load(fis);
	    
	    String driverKey=prop.getProperty("driverKey");
		String executablePath=prop.getProperty("driverExecutablePath");
		String applicationUrl=prop.getProperty("appUrl");
		String username=prop.getProperty("username");
		String password=prop.getProperty("password");
		String expectedLoginPageTitle=prop.getProperty("loginPageTitle");
		String loginButtonName=prop.getProperty("buttonName");
 
		System.setProperty(driverKey, chromeExepath);
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(applicationUrl);
		
		String pageTitle=driver.getTitle();
				
		System.out.println("Page title is: "+pageTitle);
		System.out.println("Page title length: "+pageTitle.length());
		
		System.out.println("Title validation status: "+pageTitle.equals(expectedLoginPageTitle));
		String pageUrl=driver.getCurrentUrl();
		System.out.println("Page Url is: "+pageUrl);
		
		System.out.println("Url validation status: "+pageUrl.contains(applicationUrl));
		
		String pageSource=driver.getPageSource();
		//System.out.println("Page Source: "+pageSource);
		System.out.println("Page Source length: "+pageSource.length());
	
		WebElement userNameInputField=driver.findElement(By.id("username"));
		userNameInputField.clear();
		userNameInputField.sendKeys(username);
		
		WebElement passwordInputField=driver.findElement(By.name("pwd"));
		passwordInputField.sendKeys(password);
		
		WebElement loginButton=driver.findElement(By.id("loginButton"));
		loginButton.click();
		
		driver.close();


	}

}
