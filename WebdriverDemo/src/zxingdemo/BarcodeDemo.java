package zxingdemo;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

public class BarcodeDemo {

	public static void main(String[] args) throws IOException, NotFoundException, InterruptedException {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "\\src\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://testautomationpractice.blogspot.com/");
		
		Thread.sleep(5000);
		
		String barcodeURL = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[2]/div[2]/footer[1]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[2]/div[1]/img[1]")).getAttribute("src");
		
		
		
		URL url = new URL(barcodeURL);
		
		BufferedImage image = ImageIO.read(url);
		
		LuminanceSource source = new BufferedImageLuminanceSource(image);
		
		BinaryBitmap bit = new BinaryBitmap(new HybridBinarizer(source));
		
		Result result = new MultiFormatReader().decode(bit);
		 
		System.out.println(result.getText());
		
	}

}