package seleniumbddcucum.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import seleniumbddcucum.seleniumbddcucum.BaseClass;

public class Loginpage {
	
	 WebDriver driver ;
	  
	  
	  public Loginpage(WebDriver driver) 
	  { this.driver=driver; 
	  PageFactory.initElements(driver, this);
	  }
	
	  private String usernamee ="//input[@type='email']";
	  
	
	 private  String  passwordd="//input[@type='password']"  ;
	
	@FindBy(xpath ="//input[@type='submit']")
	  WebElement  Continue  ;
	
	public void userentersusernameandpassword(String username, String password) throws InterruptedException  {
		Thread.sleep(2000);
	   driver.findElement(By.xpath(usernamee)).sendKeys(username);
	   Continue.click();
		//usernamee.sendKeys(username);
		driver.findElement(By.xpath(passwordd)).sendKeys(password);
		Continue.click();
		
		
	}}
