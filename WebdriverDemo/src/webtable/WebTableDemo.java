package webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "\\src\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/NIKHIL/Desktop/product.html");
		int r = driver.findElements(By.xpath("/html/body/table/tbody/tr")).size();
		System.out.println(r);
		int c = driver.findElements(By.xpath("/html/body/table/tbody/tr[2]/td")).size();
		System.out.println(c);
		
		for (int i = 2; i<=r; i++) {
			for (int j = 1; j <= c; j++) {
			
				String value = driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print(" "+value);
				
			}
			System.out.println();
		}
		driver.close();
	}
	
}
