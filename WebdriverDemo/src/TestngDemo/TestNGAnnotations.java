package TestngDemo;

import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/* 1). BeforeSuite
 * 2). Before Test
 * 3). Before Class
 * 4). Before Method
 * 5). Test
 * 6). After Method
 * 7). After Class
 * 8). After Test
 * 9). After Suite
 * 
 * You can add any no.of test cases. but the sequence is @BeforeMethod @Test & @AfterMethod
 * all other methods are executed just once
 */



public class TestNGAnnotations {

	//PreConditions annotations starts with @Before 
	@BeforeSuite
	public void setup()
	{
		//System.out.println("Set Property for the chrome");
		System.out.println("Before Suite");
	}
	@BeforeTest
	public void login()
	{
		//System.out.println("login method");
		System.out.println("Before Test");
	}
	@BeforeClass
	public void launch_browser()
	{
		//System.out.println("launch chrome browser");
		System.out.println("Before Class");
	}
	@BeforeMethod
	public void enter_URL()
	{
		//System.out.println("Enter URL for site");
		System.out.println("Before Method");
		
	}
	
	//Testcase start with @Test annotations
	@Test
	public void test1()
	{
		//System.out.println("Check The page title");
		System.out.println("Test 1");
	}
	@Test
	public void test2()
	{
		//System.out.println("Search page");
		System.out.println("Test 2");
	}
	//Post Conditions annotations starts with @After
	@AfterMethod
	public void after_method()
	{
		//System.out.println("Delete all cookies");
		System.out.println("After Method");
	}
	@AfterClass
	public void after_class()
	{
		//System.out.println("close bowser");
		System.out.println("After Class");
	}
	
	@AfterTest
	public void after_test()
	{
		//System.out.println("Log out");
		System.out.println("After Test");
	}
	
	@AfterSuite
	public void after_suite()
	{
		//System.out.println("Generate Test Report");
		System.out.println("After Suite");
	}
	
	
}
