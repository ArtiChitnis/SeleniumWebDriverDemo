package HeadlessDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver",projectPath +"\\src\\driver\\geckodriver.exe");
		
		//make a firefox as a headless mode
		FirefoxOptions options = new FirefoxOptions();
		options.setHeadless(true);
		
		
		WebDriver driver = new FirefoxDriver(options);
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		System.out.println("The title is"+driver.getTitle());
		

	}

}
