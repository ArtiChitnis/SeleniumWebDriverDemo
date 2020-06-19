package drivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "\\src\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://automationpractice.com/index.php");
		WebElement search = driver.findElement(By.xpath(".//input[@id='search_query_top']"));
		System.out.println("is displayed "+ search.isDisplayed());
		System.out.println("is displayed "+ search.isEnabled());
		
		if(search.isDisplayed() && search.isEnabled())
		{
			search.sendKeys("Dresses");
		}
		else
		{
			System.out.println("Test Fail");
		}
		driver.close();
		
		
		

	}

}
