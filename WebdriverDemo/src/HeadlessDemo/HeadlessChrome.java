package HeadlessDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "\\src\\driver\\chromedriver.exe");
		
		//Making a chrome driver as a headless mode
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		//or
		options.setHeadless(true);
		
		
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://automationpractice.com/index.php");
		System.out.println("The title of the website is "+driver.getTitle());
		

	}

}
