package TestNG;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class AllAnnotations {

	@BeforeMethod
	
	public void beforemethod(){
		
		System.out.println("@beforeMethod will execute before every @Test");
	}
	
	@AfterMethod
	
	public void aftermethod(){
		
		System.out.println("@aterMethod will execute after every @Test");
	}
	
	@BeforeClass
	
	public void beforeclass(){
		
		System.out.println("@beforeClass will execute prior to @beforemethod and @Test");
	}
	
	@AfterClass
	
	public void afterclass(){
		
		System.out.println("@afterClass will execute after to @beforemethod and @Test");
	}
	
	
	@BeforeTest
	
	public void beforetest(){
		
		System.out.println("@beforetest will execute prior to @beforeclass, @beforemethod and @Test");
	}
	
	
	@AfterTest
	
	public void aftertest(){
		
		System.out.println("@aftertest will execute after to @afterclass, @beforemethod and @Test");
	}
	
	@BeforeSuite
	
	public void beforesuite(){
		
		System.out.println("@beforesuite will always execute prior to all annotations or tests in suits");
	}
	
	
	@AfterSuite
	
	public void aftersuite(){
		
		System.out.println("@aftersuite will always execute after to all annotations or tests in suits");
	}
	
	@Test(priority=0)//Prioritization of Test Cases (0 means it will execute 1st)
	
	public void testapp1(){
		
		System.out.println("Test case 01 will be executed here");
	}
	
	@Test (priority=1)
	
	public void testapp2(){
		
		System.out.println("Test case 02 will be executed here");
	}
}
