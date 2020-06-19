package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumGridDemo {
	
	WebDriver driver;

	@Test(priority=1)
	void setup() throws MalformedURLException {
		
		String nodeurl = "http://192.168.0.100:35791/wd/hub";
		DesiredCapabilities cap= DesiredCapabilities.chrome();		
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WIN10);
		
	
		driver = new RemoteWebDriver(new URL (nodeurl), cap);
		
	}
	@Test(priority=2)
	void login() {
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		driver.findElement(By.name("txtUsername")).clear();
		driver.findElement(By.name("txtUsername")).sendKeys("admin");
		
		driver.findElement(By.name("txtPassword")).clear();
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.name("Submit")).click();
		
		String actual = driver.findElement(By.xpath("//div[contains(text(),'Employee Distribution by Subunit')]")).getText();
		String expected = "Employee Distribution by Subunit";
		
		if(actual.equalsIgnoreCase(expected))
		{
			System.out.println("Test Pass");
		}
		else {
			System.out.println("Test fail");
		}
	
	}

}
