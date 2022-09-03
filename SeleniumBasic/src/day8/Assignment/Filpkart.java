package day8.Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Filpkart {

	public static void main(String[] args) {
		String chromeExepath=System.getProperty("user.dir")+"//Executables//chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", chromeExepath);
		
		   WebDriver driver=new ChromeDriver(); 
		   driver.manage().window().maximize();
		     driver.get("https://www.flipkart.com/");
			    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			    List<WebElement> menucount=driver.findElements(By.cssSelector("div._37M3Pb>div>a>div>div>img"));
			    System.out.println("MenuCount is: "+menucount.size());
			    List<WebElement> menuName=driver.findElements(By.cssSelector("div._37M3Pb>div>a>div:nth-child(2)"));
			    for(int i=0;i<menuName.size();i++) {
		         WebElement Name=menuName.get(i);
		         System.out.println("Menu name Print :"+ Name.getText());
			    }
		       driver.close();
	}

}
