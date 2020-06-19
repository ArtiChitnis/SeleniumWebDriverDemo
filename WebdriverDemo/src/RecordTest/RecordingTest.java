package RecordTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RecordingTest {

	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "\\src\\driver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
	}
	@Test
	void verifyLinks()
	{
		driver.findElement(By.xpath("//a[@class='sf-with-ul'][contains(text(),'Women')]")).click();
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//div[@class='block_content']//ul[@class='tree dynamized']//a[contains(text(),'Tops')]")).click();
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//div[@class='block_content']//ul[@class='tree dynamized']//a[contains(text(),'T-shirts')]")).click();
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//a[@class='product_img_link']//img[@class='replace-2x img-responsive']")).click();
		System.out.println(driver.getTitle());
		
		//driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]")).click();
		//System.out.println(driver.getTitle());
		
		//driver.findElement(By.xpath("//span[contains(text(),'Proceed to checkout')]")).click();
		//System.out.println(driver.getTitle());
	}
	
	@AfterTest
	void tearDown() {
		
		driver.close();
	}
}
