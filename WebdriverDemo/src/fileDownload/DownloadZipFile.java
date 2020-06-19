package fileDownload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DownloadZipFile {

	public static void main(String[] args) throws InterruptedException {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", projectPath + "\\src\\driver\\geckodriver.exe");
		
		//Create firefox profile object & then set preferences so that the window will automatically handle
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip");
		profile.setPreference("browser.download.manager.showWhenStarting", false);
		
		FirefoxOptions option = new FirefoxOptions();
		option.setProfile(profile);
		
		WebDriver driver = new FirefoxDriver(option);
		
		driver.manage().window().maximize();
		
		driver.get("https://testingmasters.com/student-corner/downloads/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//table[@id='tablepress-11']//tr[@class='row-2 even']//a[contains(text(),'Download')]")).click();
		

	}

}
