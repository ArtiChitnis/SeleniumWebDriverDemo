package HandlingWebElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterDemo {

	public static void main(String[] args) throws InterruptedException {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "\\src\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Arti");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Chitnis");
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/textarea[1]")).sendKeys("Q-504,Abjibapa Lakeview , Vastral, Ahmedabad");
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/input[1]")).sendKeys("artichitnis4@gmail.com");
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/input[1]")).sendKeys("9925791999");
		driver.findElement(By.xpath("//label[2]//input[1]")).click();
		driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
		driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
		
		WebElement lang = driver.findElement(By.id("msdd"));
		lang.click();
		WebElement element1 = driver.findElement(By.linkText("English"));
		element1.click();
		driver.findElement(By.id("section")).click();
		
		WebElement Skills = driver.findElement(By.id("Skills"));
		Select skill = new Select(Skills);
		skill.selectByVisibleText("C");
		

		WebElement c = driver.findElement(By.id("countries"));
		Select country = new Select(c);
		country.selectByVisibleText("India");
		
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[10]/div[1]/span[1]/span[1]/span[1]")).click();
		
		
		//WebElement dropdown = driver.findElement(By.id("select2-siTime-results"));
		//dropdown.click();
		driver.findElement(By.xpath("//li[contains(text(),'India')]")).click();
		
		
		
		
		
		
		
	
		
		
		//WebElement s = driver.findElement(By.id("select2-country-results"));
		//Select selectc = new Select(s);
		//selectc.selectByVisibleText("India");
		
		WebElement y = driver.findElement(By.xpath("//select[@id='yearbox']"));
		Select year = new Select(y);
		year.selectByVisibleText("1991");
		
		WebElement m = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select month = new Select(m);
		month.selectByVisibleText("October");
		
		WebElement d = driver.findElement(By.xpath("//select[@id='daybox']"));
		Select day = new Select(d);
		day.selectByVisibleText("4");
		
		
		driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("Arti123");
		driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("Arti123");
		
		driver.findElement(By.id("submitbtn")).click();
		Thread.sleep(5000);
		System.out.println(driver.getCurrentUrl());
		
		if((driver.getCurrentUrl()).equalsIgnoreCase("http://demo.automationtesting.in/WebTable.html"))
		{
			System.out.println("Registration Success");
		}
		else
		{
			System.out.println("Not Registered");
		}
		
		
		
		
	}

}
