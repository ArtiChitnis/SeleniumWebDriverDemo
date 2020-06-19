package drivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitAndClose2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "\\src\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.findElement(By.cssSelector("div.container.center:nth-child(2) div.row div.col-md-12 div.nav.nav-tabs div.tab-content div.active.tab-pane.col-md-6.col-md-offset-1.col-xs-4.col-xs-offset-1:nth-child(1) a:nth-child(2) > button.btn.btn-info")).click();
		
		
		//it will close only one window
		//driver.close();
		
		//will close the all windows
		driver.quit();

	}

}
