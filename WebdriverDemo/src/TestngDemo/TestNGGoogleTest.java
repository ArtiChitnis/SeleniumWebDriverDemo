package TestngDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGGoogleTest {

	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "\\src\\driver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://google.com");
		
	}
	
	@Test(priority=1, groups="Test1")
	public void xyz() {
		
		System.out.println("This is Test 1");
		String title = driver.getTitle();
		System.out.println(title);
		
		
	}
	
	@Test(priority=2, groups="Test1")
	public void abc() {
		
		System.out.println("This is Test 2");
		boolean b = driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
		System.out.println(b);
		
		
	}
	
	@Test(priority=3, groups="Test1")
	public void pqr() {
		
		System.out.println("This is Test 3");
		boolean b = driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).isDisplayed();
		System.out.println(b);
		
		
	}
	
	@Test(priority=4, groups= {"Test1", "Test3"})
	public void def() {
		
		System.out.println("This is Test 4");
		boolean b = driver.findElement(By.xpath("//a[contains(text(),'Images')]")).isDisplayed();
		System.out.println(b);
		
		
	}
	
	@Test(priority=-5, groups= {"Test1", "Test3"})
	public void tuv() {
		
		System.out.println("This is Test 5");
		boolean b = driver.findElement(By.xpath("//a[@class='gb_D gb_xc']")).isDisplayed();
		System.out.println(b);
		
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.close();
		
	}
}
