package JSExecutor;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class JSMainClass {

	public static void main(String[] args) throws IOException {

		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "\\src\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.twoplugs.com/");

		WebElement joinfree = driver.findElement(By.xpath("//ul[@class='control-bar']//li[2]//a[1]"));

		//flashing on this element
		//JavaScriptUtility.flash(joinfree, driver);

		//drawing the border
		JavaScriptUtility.drawBorder(joinfree, driver);

		//after drawing a border take a screen shot
		//File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//File target = new File("C://Users/NIKHIL/Pictures/sikuli/src.png");
		//FileUtils.copyFile(src,target);

		//capture the title of the page
		System.out.println(driver.getTitle());

		String title = JavaScriptUtility.getTitle(driver);
		System.out.println("Title by JS is "+title);

		//clicking on element jsExecutor
		WebElement login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/ul[1]/li[1]/a[1]"));
		JavaScriptUtility.clickElement(login, driver);

		//creating alerts 
		JavaScriptUtility.generateAlert(driver, "Clicked on Login Button");
		
		//Refreshing a page
		//driver.navigate().refresh();
		JavaScriptUtility.refreshPage(driver);
		


	}

}
