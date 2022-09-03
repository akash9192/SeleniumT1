package day2.browsersetup;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericWayToOpenfirefox {

	public static void main(String[] args) {
		String currentWorkingDir=System.getProperty("user.dir");
		String geckoExepath=currentWorkingDir+"\\Executables\\geckodriver.exe";

		System.setProperty("webdriver.gecko.driver", geckoExepath);

		WebDriver driver=new FirefoxDriver();

		driver.get("https://www.google.com");

		driver.close();

	}

}
