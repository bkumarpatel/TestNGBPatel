package TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestNgDemo1 {
	
	//TestNg annotation
	//Declare the common stuff at the class level
	WebDriver driver;
	
	@BeforeTest
	
	public void openbrowser(){
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();		
	}
	
	
	@Test
	
	public void clicklinktext(){
		driver.findElement(By.linkText("Sign Up")).click();
	}
	
	
	@AfterTest
	
	public void closeapp(){
		//System.out.println("App is Closing Now");//Extra coding for GIT Example
		driver.close();
	}
	

}
