package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {
		
		//Action calss is basically used to perform the actions which are done by mouse like mouse clicking 
		//& holding, right clicking or drag & drop like that
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "\\src\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); //used for maximize the browser window
		
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.findElement(By.name("txtUsername")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.xpath("//b[contains(text(),'Maintenance')]")).click();
		
		Actions action = new Actions(driver);
		WebElement admin = driver.findElement(By.xpath("//b[contains(text(),'Admin')]"));
		WebElement usermgmt = driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']"));
		WebElement users = driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']"));
		
		//move to element we have to complete this action by using build & perform method
		action.moveToElement(admin).build().perform(); // will move the mouse cursor to admin
		action.moveToElement(usermgmt).build().perform();//will move the mouse to user management
		action.moveToElement(users).click().build().perform(); // will go to user & click on the users
		
		//action.moveToElement(admin).moveToElement(usermgmt).moveToElement(users).click().build().perform();
	}
	

}
