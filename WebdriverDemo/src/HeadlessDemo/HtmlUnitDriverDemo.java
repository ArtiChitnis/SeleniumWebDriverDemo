package HeadlessDemo;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Htmlunitdriver is by default the headless driver made by java itself as a part of selenium
		//to run this program you have only htmlunitdriver dependencies jar file
		HtmlUnitDriver driver = new HtmlUnitDriver();
		driver.get("http://automationpractice.com/");
		System.out.println("Title is "+driver.getTitle());
		System.out.println("The URL is "+driver.getCurrentUrl());

	}

}
