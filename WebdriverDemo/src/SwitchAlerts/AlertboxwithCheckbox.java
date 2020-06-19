package SwitchAlerts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertboxwithCheckbox {

	public static void main(String[] args) throws InterruptedException {
		
				
				String projectPath = System.getProperty("user.dir");
				System.setProperty("webdriver.gecko.driver", projectPath + "\\src\\driver\\geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
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
				driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
				
				driver.findElement(By.cssSelector(".btn-info")).click();
				Thread.sleep(5000);
				
				
				driver.switchTo().alert().dismiss();
				

			

		

	}

}
