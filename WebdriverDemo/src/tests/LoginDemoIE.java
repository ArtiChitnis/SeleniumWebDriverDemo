package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
//To run this script on IE you have to disable protected mode in internet options
public class LoginDemoIE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.ie.driver",projectPath+"\\src\\driver\\IEDriverServer.exe");
		
		WebDriver driver = new InternetExplorerDriver();
		driver.manage().window().maximize(); //used for maximize the browser window
		
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.findElement(By.name("txtUsername")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		
		String expTitle = "OrangeHRM";
		String actualTitle = driver.getTitle();
		
		if(expTitle.equals(actualTitle))
		{
			System.out.println("Test Pass");
		}
		else
		{
			System.out.println("Test Fail");
		}
		driver.close();
	}
	
		

	

}
