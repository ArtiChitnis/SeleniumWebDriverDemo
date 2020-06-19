package SwitchAlerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertwithOKorCancel {

	public static void main(String[] args) {




		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "\\src\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://demo.automationtesting.in/Alerts.html");

		//Alert with OK & Cancel button
		driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();


		//switch to alertbox 
		//will return the text written on alertbox
		String message = driver.switchTo().alert().getText();
		System.out.println(message);
		//alert method will automatically switch to the alert window
		//accept will click on ok button it will accept that alert if the alert have ok button
		//driver.switchTo().alert().accept();
		//will click on cancel button it will dismiss that alert if the alert have cancel button
		driver.switchTo().alert().dismiss();
		String expected = "You pressed Ok";
		String Actual = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		
		if(Actual.equals(expected))
		{
			System.out.println("Ok button pressed");
		}
		else
		{
			System.out.println("cancel button pressed");
		}
		
		







	}


}


