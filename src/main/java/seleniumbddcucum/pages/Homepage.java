package seleniumbddcucum.pages;

import javax.swing.plaf.basic.BasicTreeUI.MouseHandler;

//import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import seleniumbddcucum.seleniumbddcucum.BaseClass;

public class Homepage   {
	
	
	  WebDriver driver ;
	  
	  
	  public Homepage(WebDriver driver) 
	  { this.driver=driver; 
	  PageFactory.initElements(driver, this);
	  }
	 
	
	  public @FindBy(xpath ="(//a[@data-nav-role='signin'])[1]")
	  //public @FindBy(xpath ="(//span[text()='Sign in']/parent::a)[1]")
	  WebElement  signin  ;
	
	  public @FindBy(xpath ="//a[@id='nav-link-accountList']")
	  WebElement loginhome;
	  
	  public @FindBy(xpath ="//input[@placeholder='Search Amazon.in']")
	   WebElement searchbox;
	  
	  public @FindBy(xpath ="//input[@id='nav-search-submit-button']")
	  WebElement clicksearch;
	  
	  public @FindBy(xpath ="//span[text()='Sign Out']")
	  WebElement  logout  ;
	 
	
	public void clickloginhome() throws InterruptedException
	{
		Thread.sleep(3000);
		signin.click();
	}
	
	public void searchitem() 
	{

		searchbox.sendKeys("Apple iPhone 15 (128 GB)");
		clicksearch.click();
		driver.findElement(By.xpath("//div[@data-index='8']//img")).click();

	}
	
	public void user_logout_and_leave_site() {
		//loginhome.click();
		Actions action=new Actions(driver);
		action.moveToElement(loginhome).build().perform();
		
		action.click(logout).build().perform();
		driver.findElement(By.xpath("//i[@aria-label='Amazon']")).click();
		//MouseHandler.mouseHoverOnElement(loginhome, driver);

	}}

