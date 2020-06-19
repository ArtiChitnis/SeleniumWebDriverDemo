package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickDemo {

	public static void main(String[] args) {
		
		//context-click() method is used to do the right click of mouse 
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "\\src\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		Actions action = new Actions(driver);
		
		WebElement rightclick = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[1]/p[1]/span[1]"));
		
		action.contextClick(rightclick).build().perform();
		
		driver.findElement(By.xpath("/html[1]/body[1]/ul[1]/li[1]/span[1]")).click();
		
		String Message = driver.switchTo().alert().getText();
		System.out.println(Message);
		
		driver.switchTo().alert().accept();
		
		
		
		

	}

}
