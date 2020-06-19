package drivermethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWaitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "\\src\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Dynamic waits : If the page is loaded in 10 seconds then it does not wait for the full 20 sec
		//Thread.sleep() is static wait bcz it wait till the specific amount of time
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		
		
		//implicit wait always applied globally --- is available for all the webelements which driver interacts
		//Dynamic in nature
		//can be chnaged anywhere or anytime
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		WebElement firstname = driver.findElement(By.name("firstname"));
		WebElement lastname = driver.findElement(By.name("lastname"));
		
		sendKeys(driver,firstname,10,"Arti");
		sendKeys(driver,lastname,5,"Chitnis");
		
		
	}
	//Explicit wait
	//No explicit keyword or method
	//available with webdriverWait with some expected condition
	//Specific to element
	//dynamic in nature
	//we should not use implicit & explicit wait together because the total time will be increase 
	//implicit wait & top of that explicit wait added so the synchronization is added so the total wait time incresed
	public static void sendKeys(WebDriver driver,WebElement element, int timeout, String value)
	{
		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);	
		
	}
	public static void sendKeysClick(WebDriver driver,WebElement element, int timeout)
	{
		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
		element.click();
		
		
		
	}
}
