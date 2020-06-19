package SwitchAlerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchAlert {

	public static void main(String[] args) {
		
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "\\src\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		//Alert with OK button example
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]")).click();
	
	
		//switch to alertbox 
		//will return the text written on alertbox
		String message = driver.switchTo().alert().getText();
		System.out.println(message);
		//alert method will automatically switch to the alert window
		//accept will click on ok button it will accept that alert if the alert have ok button
		driver.switchTo().alert().accept();
		
		
		
		
	
	}

}
