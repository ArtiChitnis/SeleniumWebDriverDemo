package dropDown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckDropdownSortedOrder {

	public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath +"\\src\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.id("speed"));
		Select select = new Select(element);
		//Creating Original List
		List originalList = new ArrayList();
		
		List <WebElement>list1=select.getOptions();
		System.out.println(list1);
		 for (WebElement e :list1)
		 {
			 originalList.add(e.getText());
		 }
		 System.out.println("Original list is"+originalList);
		//Creating Temporary List
		 List TempList = new ArrayList();
		  
		 List <WebElement> list2 = select.getOptions();
		 for (WebElement e :list2)
		 {
			 TempList.add(e.getText());
		 }
		 System.out.println("Temp List is"+TempList);
		 
		 Collections.sort(TempList);
		 
		 if(originalList == TempList)
		 {
			 System.out.println("Dropdown is sorted");
		 }
		 else
		 {
			 System.out.println("Dropdown is not sorted");
		 }
		 
		
		

	}

}
