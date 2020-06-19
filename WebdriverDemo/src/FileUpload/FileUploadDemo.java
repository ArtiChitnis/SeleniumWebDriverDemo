package FileUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class FileUploadDemo {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		
		//Window based automation tools used to upload a file by Sikuli or AutoIt
		//Autoit is too complex & also it is available for windows os only
		//Thats why sikuli is used in this we don't have to install anything we just have to download jar file
	
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "\\src\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		//new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(element))
		//WebElement element = driver.findElement(By.xpath("//input[@id='imagesrc']"));
		//new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(element));
		//element.click();
		
		Thread.sleep(3000);
		String filePath = "C:\\Users\\NIKHIL\\OneDrive\\Documents\\";
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[3]/div[2]/input[1]")).click();
		
		String imgPath = "C:\\Users\\NIKHIL\\Pictures\\sikuli\\";
		
		
		Screen s = new Screen();
		
		Pattern textbox = new Pattern(imgPath+"textbox.PNG");
		Pattern open  = new Pattern(imgPath+"open.PNG");
		
		Thread.sleep(3000);
		
		s.wait(textbox,30);
		
		s.type(textbox,filePath+"doubts.txt");
		s.click(open);
		
		
		
		
		
		
	
	
	}

}
