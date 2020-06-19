package SwitchingBetweenWindows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingBetweenWindows {

	public static void main(String[] args) {
	
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "\\src\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/Windows.html");

		driver.findElement(By.xpath("//div[@id='Tabbed']//button[@class='btn btn-info'][contains(text(),'click')]")).click();
		System.out.println(driver.getTitle());
		
		//set will store the multiple values
		Set <String>str = driver.getWindowHandles(); //will return how many windows are open
		//will return key values of the browser open windows
		
		for(String s : str)
		{
			String str1 = driver.switchTo().window(s).getTitle();
			if (str1.contains("Frames & windows"))
			{
				driver.close();
			}
		}
	}

}
