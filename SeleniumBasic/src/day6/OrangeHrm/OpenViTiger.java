package day6.OrangeHrm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenViTiger {

	public static void main(String[] args) {
		String currentWorkingDir=System.getProperty("user.dir");
		String chromeExepath=currentWorkingDir+"\\Executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", chromeExepath);
		 
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");

        String pageTitle=driver.getTitle();
        
        System.out.println("page Title is: "+pageTitle);
        System.out.println("page Title length: "+pageTitle.length());
        String expetedTitle="https://demo.vtiger.com/vtigercrm/index.php";
       
        WebElement username=driver.findElement(By.id("username"));
        username.clear();
        username.sendKeys("admin");
        
       // driver.findElement(By.id("username")).sendKeys("admin");
        
        
        WebElement password= driver.findElement(By.id("password"));
        password.clear();
        password.sendKeys("Test@123");
       // driver.findElement(By.id("password")).sendKeys("Test@123");
        
        driver.findElement(By.className("buttonBlue")).click();
        System.out.println("Hi");
        
        String homePageTitle=driver.getTitle();
        System.out.println("Home Page Title:"+homePageTitle);
        System.out.println("Home page Validation status:"+homePageTitle.equals("https://demo.vtiger.com/vtigercrm/index.php"));
        


	}

}
