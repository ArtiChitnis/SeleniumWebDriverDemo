package webtable;

import java.util.concurrent.TimeUnit;

import org.apache.commons.math3.analysis.function.Exp;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalandarDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "\\src\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://demos.telerik.com/kendo-ui/datetimepicker/index/");
		driver.findElement(By.xpath("//span[@class='k-icon k-i-calendar']")).click();
		WebElement element = driver.findElement(By.xpath("//a[@class='k-link k-nav-fast']"));
		new WebDriverWait(driver, 90).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		element.click();
		
		 
		//driver.findElement(By.linkText("2020")).click();
		for (int i = 6; i >=1; i--) {
			
		
	    WebElement element1 = driver.findElement(By.cssSelector("div.k-animation-container:nth-child(25) div.k-calendar-container.k-popup.k-group.k-reset div.k-widget.k-calendar div.k-header a.k-link.k-nav-prev:nth-child(1) > span.k-icon.k-i-arrow-60-left"));
		new WebDriverWait(driver, 90).until(ExpectedConditions.visibilityOf(element1));
		element1.click();
		String str = driver.findElement(By.xpath("//a[@class='k-link k-nav-fast']")).getText();
		
			
		if(str.equalsIgnoreCase("1990-1999"))
		{	
			driver.findElement(By.xpath("//a[contains(text(),'1991')]")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Oct')]")).click();
			driver.findElement(By.linkText("4")).click();
			break;
			
		}
			
		
		}
		
		
		
	}

}
