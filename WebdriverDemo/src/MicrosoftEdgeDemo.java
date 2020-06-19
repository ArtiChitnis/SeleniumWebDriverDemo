import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MicrosoftEdgeDemo {

	public static void main(String[] args) {


		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.edge.driver", projectPath + "\\src\\driver\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		System.out.println(driver.getTitle());
		
		

	}

}
