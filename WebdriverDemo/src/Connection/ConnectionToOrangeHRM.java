package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConnectionToOrangeHRM {

	public static void main(String[] args) throws SQLException {

		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath + "/src/driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		
		
		//step 1
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","arti04");
		
		//Step 2
		Statement stmt = con.createStatement();
		
		
		String query = "select username , password from admin1";
		
		ResultSet rs = stmt.executeQuery(query);
		
		while(rs.next())
		{
			String username = rs.getString("username");
			String password = rs.getString("password");
			System.out.print( username + "  ");
			System.out.println(password);
			
			driver.findElement(By.id("txtUsername")).clear();
			driver.findElement(By.id("txtUsername")).sendKeys(username);
			
			driver.findElement(By.id("txtPassword")).clear();
			driver.findElement(By.id("txtPassword")).sendKeys(password);
			
			driver.findElement(By.id("btnLogin")).click();
			
			String title = driver.getCurrentUrl();
			
			if(title.equals("https://opensource-demo.orangehrmlive.com/index.php/dashboard"))
			{
				System.out.println("Test pass");
			}
			else
			{
				System.out.println("Test fail");
			}
			
		}
		
		con.close();
		driver.close();
	}

}
