package day6.OrangeHrm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenActiTime {

	public static void main(String[] args) {
		String currentWorkingDir=System.getProperty("user.dir");
		String chromeExepath=currentWorkingDir+"\\Executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", chromeExepath);
		 
		WebDriver driver=new ChromeDriver();
        driver.get("https://demo.actitime.com/login.do");
        
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        String pageTitle=driver.getTitle();
       
        System.out.println("page Title is: "+pageTitle);
        System.out.println("page Title length: "+pageTitle.length());
        String expetedTitle="actiTime - Login";
        
        driver.findElement(By.id("username")).sendKeys("admin");
   
        driver.findElement(By.name("pwd")).sendKeys("manager");
        
        driver.findElement(By.id("loginButton")).click();
        
    	WebElement userNameInputField=driver.findElement(By.id("username"));
		System.out.println("username is displayed or not?"+userNameInputField.isDisplayed());
		System.out.println("username is functional or not?"+userNameInputField.isEnabled());
		
		String DefaultValveInUserNameInputField=userNameInputField.getAttribute("placeholder");
		System.out.println("Default Valve of UserName Input Field:"+DefaultValveInUserNameInputField);
		
		
		WebElement passwordField=driver.findElement(By.name("pwd"));
		System.out.println("password is displayed or not?"+passwordField.isDisplayed());
		System.out.println("username is functional or not?"+passwordField.isEnabled());
		
		String DefaultValveInpasswordField=userNameInputField.getAttribute("placeholder");
		System.out.println("Default Valve of UserName Input Field:"+DefaultValveInpasswordField);


	}

}
