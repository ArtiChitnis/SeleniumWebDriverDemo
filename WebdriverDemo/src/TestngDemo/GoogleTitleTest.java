package TestngDemo;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitleTest {


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
			
			String expected = "Google123"; 
			String actual = driver.getTitle();
			
			Assert.assertEquals(expected, actual);
			Assert.assertEquals(expected, actual, "Title is not match");
			
		}
		
		@Test(priority=2, groups="Test1")
		public void abc() {
			
			System.out.println("This is Test 2");
			boolean b = driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
			Assert.assertTrue(b);
			
			
		}
		
		
	}

}
