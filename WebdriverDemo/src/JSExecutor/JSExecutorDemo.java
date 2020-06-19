package JSExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutorDemo {

	public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "\\src\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//scrolling by using pixel
		js.executeScript("window.scrollBy(0,1000)", "");
		
		//Scrolling page till we find the element
		WebElement element = driver.findElement(By.xpath("//td[contains(text(),'India')]"));
		js.executeScript("arguments[0].scrollIntoView();", element);

		//sroll page till bottom
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}

}
