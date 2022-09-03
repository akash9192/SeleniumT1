package day3.Loaters;

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
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		WebElement username=driver.findElement(By.id("txtUsername"));
		
		username.clear();
		username.sendKeys("Admin");
		
		WebElement pwd=driver.findElement(By.id("txtPassword"));
		
		//pwd.clear();
		pwd.sendKeys("admin123");
		
		WebElement submitBtn=driver.findElement(By.id("btnLogin"));
		submitBtn.click();
		
		//String actualTitle=driver.getTitle();
	//	String expectedTitle="opensource-demo.orangehrmlive.come";
		
		//System.out.println("Actual opensource-demo.orangehrmlive.com Page title is :"+actualTitle);
		//System.out.println("Expected opensource-demo.orangehrmlive.com Page title is:"+expectedTitle);
		//System.out.println("opensource-demo.orangehrmlive.com title validation "+actualTitle.equals(expectedTitle));

		//driver.close();
	}

}
