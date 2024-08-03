package seleniumbddcucum;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fitpeo {

	@Test
	public void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Geetu\\Desktop\\Selenium\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		//Navigate to the FitPeo Homepage
		driver.get("https://www.fitpeo.com/");
		driver.manage().window().maximize();
		//Navigate to the Revenue Calculator Page
		driver.findElement(By.xpath("//a[contains(@href,'revenue')]")).click();
		Thread.sleep(2000);
		//Scroll Down to the Slider section
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)");
		//Adjust the Slider
		WebElement slidepointer = driver.findElement(By.xpath("//span[contains(@class,'thumb')]"));
		Actions action = new Actions(driver);
		action.dragAndDropBy(slidepointer, 93, 0).perform();
		//Update the Text Field
		WebElement textbox = driver.findElement(By.xpath("//input[contains(@class,'MuiInput')]"));
		action.click(textbox).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build()
				.perform();
		textbox.sendKeys("560");
		//Validate Slider Value
		String Slidervalue = driver.findElement(By.xpath("//input[@aria-orientation='horizontal']"))
				.getAttribute("value");
		System.out.println("Slidervalue" + " " + Slidervalue);
		Assert.assertEquals(Slidervalue, "560");
		js.executeScript("window.scrollBy(0,-50)");
		action.dragAndDropBy(slidepointer, 39, 0).build().perform();
		//Select CPT Codes
		driver.findElement(By.xpath("(//div/p[text()='CPT-99091']/following::input)[1]")).click();
		driver.findElement(By.xpath("(//div/p[text()='CPT-99453']/following::input)[1]")).click();
		driver.findElement(By.xpath("(//div/p[text()='CPT-99454']/following::input)[1]")).click();
		//Validate Total Recurring Reimbursement
		String Reimbursement = driver
				.findElement(By.xpath("(//p[contains(text(),'Total Recurring Reimbursement')])[1]/p")).getText();
		System.out.println("Reimbursement" + " " + Reimbursement);
		Assert.assertEquals(Reimbursement, "$98400");
		driver.quit();

	}
}
