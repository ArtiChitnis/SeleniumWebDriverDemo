package JSExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtility {

	//Flashing an object means blinking an object
	public static void flash(WebElement element, WebDriver driver)
	{
		//JavascriptExecutor js = (JavascriptExecutor) driver;

		String bgcolor = element.getCssValue("backgroundColor");

		for (int i = 0; i < 500; i++) {
			changeColor("#000000",element, driver);
			changeColor(bgcolor,element, driver);
		}
	}
	public static void changeColor(String color, WebElement element, WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor = '" + color + "'" , element);
		try {
			Thread.sleep(30);
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}	
	public static void drawBorder(WebElement element, WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.border = '3px solid red'" , element);
	}
	public static String getTitle(WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String title = js.executeScript("return document.title;").toString();
		return title;
	}
	public static void clickElement(WebElement element,WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();",element);

	}
	public static void generateAlert(WebDriver driver,String message)
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("alert('"+ message +"')");
	}
	public static void refreshPage(WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("history.go(0)");

	}

}
