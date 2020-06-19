package drivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "\\src\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		//This will return the boolean values falue
		System.out.println(driver.findElement(By.xpath(".//input[@id='u_0_6']")).isSelected());
		
		if(driver.findElement(By.xpath(".//input[@id='u_0_6']")).isSelected()==false)
		{
			//if not selected will select it
			driver.findElement(By.xpath(".//input[@id='u_0_6']")).click();
		}
		
	
		
	}

}
