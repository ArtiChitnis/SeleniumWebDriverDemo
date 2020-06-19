package ashotAPI;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class CompareImage {

	public static void main(String[] args) throws IOException {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "\\src\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement element = driver.findElement(By.xpath("//div[@id='divLogo']"));
		BufferedImage expectedImage = ImageIO.read(new File ("C:\\Users\\NIKHIL\\Pictures\\sikuli\\orangehrm.png"));

		WebElement logoimage = driver.findElement(By.xpath("//div[@id='divLogo']"));
		Screenshot logoImageScreenshot = new AShot().takeScreenshot(driver,logoimage);
		BufferedImage actualImage = logoImageScreenshot.getImage();
		
		ImageDiffer imgdif = new ImageDiffer();
		ImageDiff diff = imgdif.makeDiff(expectedImage,actualImage );
		
		if(diff.hasDiff()==true)
		{
			System.out.println("Images are not same");
		}
		else
		{
			System.out.println("Images are same");
		}
		driver.close();
	}

}
