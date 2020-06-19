package drivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "\\src\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://automationstepbystep.com/");
		System.out.println("Page Title is "+driver.getTitle());
		
		driver.navigate().to("https://www.facebook.com/");
		System.out.println("After Navigate to the title is "+driver.getTitle());
		
		driver.navigate().back();
		System.out.println("After Navigate back the title is "+driver.getTitle());
		
		driver.navigate().forward();
		System.out.println("After Navigate forward the title is "+driver.getTitle());
		
		//will refresh the page
		driver.navigate().refresh();
		
		driver.close();
	}

}
