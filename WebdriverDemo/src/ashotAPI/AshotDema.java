package ashotAPI;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class AshotDema {

	public static void main(String[] args) throws IOException {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "\\src\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement element = driver.findElement(By.xpath("//div[@id='divLogo']"));
	
		 Screenshot logoImageScreenshot = new AShot().takeScreenshot(driver,element);
		 ImageIO.write(logoImageScreenshot.getImage(), "png", new File("C:\\Users\\NIKHIL\\Pictures\\sikuli\\orangehrm.png"));
		 
		 File f = new File ("C:\\Users\\NIKHIL\\Pictures\\sikuli\\orangehrm.png");
		 
		 if(f.exists())
		 {
			 System.out.println("File Exists");
			 
		 }else
		 {
			 System.out.println("file not exists");
		 }
	}

}
