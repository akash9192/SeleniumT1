package day6.OrangeHrm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenOrangeHrm {

	public static void main(String[] args) {
		String currentWorkingDir=System.getProperty("user.dir");
		String chromeExepath=currentWorkingDir+"\\Executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", chromeExepath);
		 
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");

      //  String pageTitle=driver.getTitle();
        
      //  System.out.println("page Title is: "+pageTitle);
       // System.out.println("page Title length: "+pageTitle.length());
        
        
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        
       // WebElement username=driver.findElement(By.id("txtUsername"));
		
		//username.clear();
		//username.sendKeys("Admin");
		
		WebElement pwd=driver.findElement(By.id("txtPassword"));
		
		//pwd.clear();
		pwd.sendKeys("admin123");
		
		WebElement submitBtn=driver.findElement(By.id("btnLogin"));
		submitBtn.click();
		
		WebElement userNameInputField=driver.findElement(By.className("username"));
		System.out.println("username is displayed or not?"+userNameInputField.isDisplayed());
		System.out.println("username is functional or not?"+userNameInputField.isEnabled());
		
		String DefaultValveInUserNameInputField=PasswordField.getAttribute("");
		System.out.println("Default Valve of UserName Input Field:"+DefaultValveInUserNameInputField);
		
		WebElement passwordField=driver.findElement(By.className("username"));
		System.out.println("password is displayed or not?"+passwordField.isDisplayed());
		System.out.println("password is functional or not?"+passwordField.isEnabled());


	}

}
