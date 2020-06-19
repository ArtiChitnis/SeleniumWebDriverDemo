import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String projectPath = System.getProperty("user.dir");
		//Set the key for driver & path for the driver);
		
		System.setProperty("webdriver.gecko.driver",projectPath+"\\src\\driver\\geckodriver.exe");
		//System.setProperty("webdriver.firefox.marionette",projectPath+"\\src\\driver\\geckodriver.exe");
		//WebDriver is an interface & firefox is a class which implements webdriver interface
		//Here firefox constructor will invoke the browser
		//FirefoxDriver driver = new FirefoxDriver();
		//We can go of the other way
		
		//bcz webdriver is an interface so we can create its object but it can't be instantiated thats why
		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		
		//find element method will find the element on webpage
		//By is a class provide the address of that web element & .name .id are the methods which are static
		//so that can be access with the class name itself
		//send keys method is used for entering vales to the textbox
		//This method will return the webelement object
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		
		String expTitle = "Welcome: Mercury Tours";
		String actualTitle = driver.getTitle(); //returns the title of the page
		if(expTitle.equals(actualTitle))
		{
			System.out.println("Test Pass");
			
			
		}
		else
		{
			System.out.println("Test Fail");
		}
			
		driver.close(); //will close the browser
		
		
		
	}

}
