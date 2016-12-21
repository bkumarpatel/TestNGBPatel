package TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class CrossBrowserTesting {
	
	WebDriver driver;
	
	@BeforeTest
	@Parameters("browser")
	
	public void openbrowser (String browser){
		
		if(browser.equals("Firefox")){
			
			driver = new FirefoxDriver();
			
		}
		else if (browser.equals("Chrome")){
			System.setProperty("Webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
		}
		else if (browser.equals("IE")){
			System.setProperty("Webdriver.ie.driver", "D:\\SeleniumDrivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			
		}
	}

	@Test
	public void openapp(){
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	
	@AfterTest
	
	public void  close(){
		driver.close();
	}
}
