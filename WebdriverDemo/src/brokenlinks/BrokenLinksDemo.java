package brokenlinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksDemo {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "\\src\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
		
		Thread.sleep(5000);
		
		//capture all the links
		List <WebElement> links= driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for(int i=0;i<=links.size();i++)
		{
			//by using href tag we can get the url of required link
			WebElement link1 = links.get(i);
			
			
			String url = link1.getAttribute("href");
			System.out.println(url);
			
			URL link = new URL(url);
			//create a connection object using url object
			HttpURLConnection httpcon = (HttpURLConnection) link.openConnection();
			//wait for 2 second
			Thread.sleep(2000);
			//establish connection
			httpcon.connect();
			
			int rescode = httpcon.getResponseCode();
			//if responsecode is greater than 400 then the link is broken
			if(rescode>=400)
			{
				System.out.println(url + "  " + "Broken Links");
			}
			else
			{
				System.out.println(url + "  " + "Not Broken Links");
			}
		}
		
	}

}
