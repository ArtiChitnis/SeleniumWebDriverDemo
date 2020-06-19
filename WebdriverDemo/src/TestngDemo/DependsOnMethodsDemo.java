package TestngDemo;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class DependsOnMethodsDemo {


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
		
		@Test
		public void xyz() {
			
			System.out.println("This is Test 1");
			String title = driver.getTitle();
			System.out.println(title);
			
			
		}
		
		@Test(dependsOnMethods="xyz")
		public void abc() {
			
			System.out.println("This is Test 2");
			boolean b = driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
			System.out.println(b);
			int a = 10/0;
			System.out.println(a);
			
			
		}
		
		@Test(dependsOnMethods="abc")
		public void pqr() {
			
			System.out.println("This is Test 3");
			boolean b = driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).isDisplayed();
			System.out.println(b);
			
			
		}
		
		
		
		@AfterMethod
		public void tearDown() {
			
			driver.close();
			
		}
	}

	

