import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String projectPath = System.getProperty("user.dir");
		//Run Selenium Test on Chrome Browser
		/*System.setProperty("webdriver.chrome.driver",projectPath+"/src/driver/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");*/
		
		//Run Selenium Test On Firefox Browser
		// declaration and instantiation of objects/variables  
		System.setProperty("webdriver.gecko.driver", projectPath+"\\src\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://google.com");
		
		
		

	}

}
