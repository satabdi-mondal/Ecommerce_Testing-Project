package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Properties config = new Properties();
	public static Properties OR = new Properties();
	public static FileInputStream fis;
	
	
	public static WebDriverWait wait;

	public static String browser;

	@BeforeSuite
	public void setUp() {

		if (driver == null) {
			
	
			try {
				fis = new FileInputStream(
						System.getProperty("user.dir") + "\\Configuration\\Config.properties");
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}
			try {
				config.load(fis);
	
			} catch (IOException e) {
				
				e.printStackTrace();
			}

			try {
				fis = new FileInputStream(
						System.getProperty("user.dir") + "\\Configuration\\OR.properties");
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}
			try {
				OR.load(fis);
	
			} catch (IOException e) {
			
				e.printStackTrace();
			}
			
			
	
			

			if (config.getProperty("browser").equals("firefox")) {

			
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();

			} else if (config.getProperty("browser").equals("chrome")) {

					
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
	
			} else if (config.getProperty("browser").equals("ie")) {

				System.setProperty("webdriver.ie.driver",
						System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();

			}

			driver.get(config.getProperty("testsiteurl"));
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
			
		}

	}

	

}
