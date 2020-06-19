package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {

	public static void main(String[] args) throws InterruptedException {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "\\src\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/resizable/");
		
		driver.switchTo().frame(0);
		WebElement resize = driver.findElement(By.xpath("/html[1]/body[1]/div[1]"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(resize).dragAndDropBy(resize, 50, 50).build().perform();
		Thread.sleep(3000);

	}

}
