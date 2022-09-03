



package day3.Loaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenActitime {

	public static void main(String[] args) {
		
		String currentWorkingDir=System.getProperty("user.dir");
		String chromeExepath=currentWorkingDir+"\\Executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", chromeExepath);
		 
		WebDriver driver=new ChromeDriver();
        driver.get("https://demo.actitime.com/login.do");
        
        WebElement username=driver.findElement(By.id("username"));
        
        username.clear();
        username.sendKeys("admin");
        
        WebElement pwd=driver.findElement(By.name("pwd"));
        
        pwd.clear();
        pwd.sendKeys("manager");
        
        WebElement loginButton=driver.findElement(By.id("loginButton"));
        loginButton.click();
        
       // String actualTitle=driver.getTitle();
		//String expectedTitle="demo.actitime.com/login.do";
		
		//System.out.println("demo.actitime.com/login.do Page title is :"+actualTitle);
		//System.out.println("Expected demo.actitime.com/login.do Page title is:"+expectedTitle);
		//System.out.println("demo.actitime.com/login.do title validation "+actualTitle.equals(expectedTitle));

		//driver.close();

		
	}

}
