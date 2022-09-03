package day11.drivers;




		import io.github.bonigarcia.wdm.WebDriverManager;
		import java.util.concurrent.TimeUnit;

		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;

		import io.github.bonigarcia.wdm.WebDriverManager;

		public class OpenChromeBrowser {

			public static void main(String[] args) {

				    WebDriverManager.chromedriver().setup();	
						
				    WebDriver driver = new ChromeDriver();
				    
				    driver.manage().window().maximize();
				    
				    driver.manage().timeouts().implicitlyWait(30,  TimeUnit.SECONDS);
				    
				    driver.get("http://demo.automationtesting.in/Register.html");
	}

}
