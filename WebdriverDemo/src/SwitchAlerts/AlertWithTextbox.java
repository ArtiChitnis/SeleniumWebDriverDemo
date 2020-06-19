package SwitchAlerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWithTextbox {

	public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "\\src\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		
		//Sending Text value to the alert textbox
		driver.switchTo().alert().sendKeys("Aarti");
		//after sending value clicking on OK button
		driver.switchTo().alert().accept();
		
		//checking the message
		String str1 = driver.findElement(By.xpath("//p[@id='demo1']")).getText();
		System.out.println(str1);
		
		//if there is any checkbox is present in alertbox then the following alert.
		
		
		

	}

}
