package cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesDemo {

	public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "\\src\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		 Set <Cookie> cookies = driver.manage().getCookies(); // returns all the cookie
		 System.out.println(cookies.size()); //no.of cookies
		 
	/*	 for(Cookie c : cookies)
		 {
			 //String cookie = c.toString();
			 //System.out.println(cookie);
			 System.out.println(c.getName()); //name of the cookie
			 System.out.println(c.getValue()); //value of the cookie
		 }*/
		 //print specific cookie according to the name
		 System.out.println(driver.manage().getCookieNamed("session-id"));
		 
		 Cookie cobj =  new Cookie("My Cookie","12345");
		 //add cookie
		 driver.manage().addCookie(cobj);
		 
		 cookies = driver.manage().getCookies(); // returns all the cookie
		 System.out.println(cookies.size()); //no.of cookies
		 System.out.println("After adding cookie size is"+cookies.size());
		 System.out.println("Added Cookie is" +driver.manage().getCookieNamed("My Cookie"));
		 
		 //delete cookie
		 driver.manage().deleteCookie(cobj);
		 cookies = driver.manage().getCookies(); // returns all the cookie
		 System.out.println(cookies.size()); 
		 System.out.println("After deleting cookie size is"+cookies.size());
		 
		 driver.manage().deleteAllCookies();
		 cookies = driver.manage().getCookies(); // returns all the cookie
		 System.out.println(cookies.size()); 
		 System.out.println("After deleting all cookie size is"+cookies.size());
		 
		 driver.close();

	}

}
