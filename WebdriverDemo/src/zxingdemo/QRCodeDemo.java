package zxingdemo;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

public class QRCodeDemo {

	public static void main(String[] args) throws IOException, NotFoundException, InterruptedException {

		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "\\src\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://testautomationpractice.blogspot.com/");
		Thread.sleep(3000);
		
		String src = driver.findElement(By.xpath("//div[@id='HTML4']//div[@class='widget-content']//img")).getAttribute("src");
		
		URL url = new URL(src);
		
		BufferedImage image = ImageIO.read(url);
		
		LuminanceSource source = new BufferedImageLuminanceSource(image);
		
		BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));
		
		Result result = new MultiFormatReader().decode(bitmap);
		
		System.out.println(result.getText());
		
		
		
		
	}

}
