package day1.openbrowsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver", "D:\\Accleration\\sampleprogram\\SeleniumBasic\\Executables\\chromedriver.exe");
		
		ChromeDriver cdriver=new ChromeDriver();

	     cdriver.get("https://www.google.com");

}
}
