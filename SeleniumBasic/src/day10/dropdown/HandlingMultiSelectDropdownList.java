package day10.dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiSelectDropdownList {

	public static void main(String[] args) {
		String currentWorkingDir=System.getProperty("user.dir");
		String chromeExepath=currentWorkingDir+"\\Executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", chromeExepath);
		 
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://omayo.blogspot.com/");
		
		WebElement carDropdown=driver.findElement(By.id("multiselect1"));
		
		Select selectskill= new Select(carDropdown) ;
		
		System.out.println("Is dropdown is allowing you to select multiple option: "+selectskill.isMultiple());
		
		//**** get default or already select option
		
		//System.out.println("Already selectec option name:"+selectskill.getFirstSelectedOption().getText());
		
		List<WebElement> options= selectskill.getOptions();
		
		System.out.println("Option count is:"+options.size());
		//Get dropdown option names
		for(int i=0;i<options.size();i++) {
			System.out.println("Option "+i+": "+options.get(i).getText());
		}		
			
			selectskill.selectByIndex(0);
			selectskill.selectByIndex(1);
			selectskill.deselectByIndex(3);
			
			selectskill.selectByValue("Hyundaix");
//			selectSkill.selectByVisibleText("Hundyai");
			//selectskill.deselectByValue("Audi");
			

			List<WebElement> selectCars=selectskill.getAllSelectedOptions();
			System.out.println("Selected car count: "+selectCars.size());
			
			selectskill.deselectAll();
		}
	}


