package day4.Synchronzation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenActitimeUsingSynchronzation {

	public static void main(String[] args) throws InterruptedException {
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
        
        Thread.sleep(2000);
       
        String homePageTitle=driver.getTitle();
        System.out.println("Home Page Title:"+homePageTitle);
        System.out.println("Home page Validation status:"+homePageTitle.equals("actiTIME - Enter Time-Track"));
        
        driver.findElement(By.id("logoutLink")).click();
        
		System.out.println("Title validation Status: "+pageTitle.equals("expectedTitle"));
        
         driver.close();

	}

}
