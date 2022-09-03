package day11.drivers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeCalender {

	public static void main(String[] args) throws InterruptedException {
		String currentWorkingDir=System.getProperty("user.dir");
		String chromeExepath=currentWorkingDir+"\\Executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", chromeExepath);
		 
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		String pageTitle = driver.getTitle();
		System.out.println("Page Title is :" + pageTitle);
		System.out.println("Page Title length is :" + pageTitle.length());
		String expectedTitle = "actiTIME - Login";
		System.out.println("Title validatio status is: " + pageTitle.equals(expectedTitle));
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
	
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(2000);
       
        String homePageTitle=driver.getTitle();
        System.out.println("Home Page Title:"+homePageTitle);
        System.out.println("Home page Validation status:"+homePageTitle.equals("actiTIME - Enter Time-Track"));
       
        driver.findElement(By.cssSelector("div#container_tasks")).click();
        driver.findElement(By.cssSelector("div.title.ellipsis")).click();
        driver.findElement(By.cssSelector("div.item.createNewTasks")).click();
        

		driver.findElement(By.cssSelector("div.projectSelector")).click();
		driver.findElement(By.cssSelector("div.projectSelector>div.components_combobox")).click();
		
         
		driver.findElement(By.cssSelector("input[class='inputFieldWithPlaceholder']")).click();
		driver.findElement(By.cssSelector("input[class='inputFieldWithPlaceholder']")).sendKeys("Testing17");
		driver.findElement(By.cssSelector("div.commitButtonPlaceHolder>div.components_button")).click();
		//driver.findElement(By.cssSelector("div.createdTasksTableContainer tbody .checkbox")).click();
		driver.findElement(By.cssSelector("div.delete")).click();
		driver.findElement(By.cssSelector("div.buttonsContainer>div.submitBtn span")).click();
        
        
	}

}
