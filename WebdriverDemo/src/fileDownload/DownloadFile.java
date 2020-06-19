package fileDownload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DownloadFile {

	public static void main(String[] args) throws InterruptedException {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", projectPath + "\\src\\driver\\geckodriver.exe");
		
		//Create firefox profile object & then set preferences so that the window will automatically handle
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "text/plain");
		profile.setPreference("browser.download.manager.showWhenStarting", false);
		
		FirefoxOptions option = new FirefoxOptions();
		option.setProfile(profile);
		
		WebDriver driver = new FirefoxDriver(option);
		
		
		driver.manage().window().maximize();
		
		
		
		//will open the URL
		driver.get("http://demo.automationtesting.in/FileDownload.html");
		//Will Write in Textbox
		driver.findElement(By.id("textbox")).sendKeys("testing");
		//will click on generate file
		driver.findElement(By.id("createTxt")).click();
		//after file generated it will download the file
		
		driver.findElement(By.id("link-to-download")).click();
		//Thread.sleep(5000);
		
		
		

	}

}
