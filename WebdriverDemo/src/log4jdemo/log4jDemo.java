package log4jdemo;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class log4jDemo {

	public static void main(String[] args) {
		
		Logger logger = Logger.getLogger("log4jDemo");
		DOMConfigurator.configure("log4j.xml");
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "\\src\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		logger.info("browser Opened");
		
		driver.get("https://orangehrm-demo-6x.orangehrmlive.com/auth/login");
		
		logger.info("Login Page");
		
		driver.findElement(By.name("txtUsername")).clear();
		driver.findElement(By.name("txtUsername")).sendKeys("admin");
		
		driver.findElement(By.name("txtPassword")).clear();
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		
		logger.info("Login has been done");
		
		

	}

}
