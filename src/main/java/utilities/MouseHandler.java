package utilities;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MouseHandler {
	
	
	public static void doubleClickonElement(WebElement element,WebDriver driver)
	{
		Actions action = new Actions(driver);
		action.moveToElement(element).doubleClick().build().perform();
	}
	
	public static void clickOnElement(WebElement element,WebDriver driver)
	{
		Actions action = new Actions(driver);
		action.moveToElement(element).click().build().perform();
	}
	
	public static void mouseHoverOnElement(WebElement element,WebDriver driver)
	{
		//Actions action = new Actions(driver);
		
		//action.moveToElement(element).perform();
		WebDriverWait wait = new WebDriverWait(driver, null);
		//WebElement element=wait.until(ExpectedConditions.elementToBeClickable(element));
		//action.moveToElement(new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(element))).perform();
	}
	
	public static void javaScriptClickOnElement(WebElement element,WebDriver driver)
	{
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
	}
	
	public static void scrollDown(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

}
