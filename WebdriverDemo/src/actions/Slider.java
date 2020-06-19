package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "\\src\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/slider/");
		
		driver.switchTo().frame(0);
		WebElement element = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/span[1]"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(element).dragAndDropBy(element,300,0).build().perform();
		
		

	}

}
