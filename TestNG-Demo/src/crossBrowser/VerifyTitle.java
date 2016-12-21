package crossBrowser;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;

public class VerifyTitle {
	
	WebDriver driver;
	
	@Test
	@Parameters("browser")
	public void verifypageTitle(String broserName){
		
		if(broserName.equalsIgnoreCase("Firefox")){
			
			driver=new FirefoxDriver();
			
		}
		else if(broserName.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
			
				}
	
		else if(broserName.equalsIgnoreCase("IE")){
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\EDriverServer.exe");
			driver=new InternetExplorerDriver();

}
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		System.out.println(driver.getTitle());
		driver.quit();
	}
	
}
