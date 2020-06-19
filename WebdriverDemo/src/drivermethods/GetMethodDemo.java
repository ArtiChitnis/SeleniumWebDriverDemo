package drivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "\\src\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Opens the url of website in the browser here in chrome browser
		driver.get("http://automationpractice.com/index.php");
		//returns the title of the website
		System.out.println("Title is "+driver.getTitle());
		//returns the current URL of the website
		System.out.println("Current URL is "+driver.getCurrentUrl());
		//Returns the page source means the page code of the current web page
		//System.out.println("Page Source is " +driver.getPageSource());
		
		
		//Absolute xpath is given for to check the phone number
		String text =driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[2]/div[1]/div[1]/nav[1]/span[1]/strong[1]")).getText();
		
		System.out.println(text);
		
		//closes the current window or browser
		//driver.close();
		//quit command will close the multiple windows
		driver.quit();
	}

}
