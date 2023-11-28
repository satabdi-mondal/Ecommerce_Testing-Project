package page;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Page {


	public WebDriver driver;
	
	public Page() {
		WebDriverManager.chromedriver().setup();		
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://www.automationpractice.pl/index.php");
   }


}
