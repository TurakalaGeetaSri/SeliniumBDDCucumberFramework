package seleniumbddcucum.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkoutpage {

	
  WebDriver driver ;
	  
	  
	  public Checkoutpage(WebDriver driver) 
	  { this.driver=driver; 
	  PageFactory.initElements(driver, this);
	  }
	  
	  //public @FindBy(xpath ="//div[contains(@class,'dropdown')]//a[text()='%s']")
	  //WebElement countrydrpdown;
	  private String countrydrpdown="//div[contains(@class,'dropdown')]//a[text()='%s']";
	  
	  private String State="//div[contains(@class,'popover')]//a[text()='%s']";
	  
	  private String Fullname  ="//input[contains(@name,'FullName')]";
	  
	 
	  private String Addressline1="//input[contains(@name,'AddressLine1')]";
	  
	 
	  private String Addressline2 ="//input[contains(@name,'AddressLine2')]";
	  
	 
	  private String City="//input[contains(@name,'City')]";
	  
	  
	  private String state="//input[contains(@name,'State')]";
	  
	 
	  private String Pincode ="//input[contains(@name,'PostalCode')]";
	  
	  private String Mobileno  ="//input[contains(@name,'Phone')]";
	  
	  private String Landmark  ="//input[contains(@name,'landmark')]";
	  
	  public @FindBy(xpath ="//input[contains(@aria-labelledby,'orderSummary')]")
	  WebElement useaddress;

public void enterShippngAddress(String country, String fullname, String mobileno, String pincode, String flatno, String streetadd,
        String landmark, String city, String state) 
{
	driver.findElement(By.xpath("(//span[contains(@data-action,'dropdown-button')])[1]")).click();
	driver.findElement(By.xpath(String.format(countrydrpdown, country))).click();
	driver.findElement(By.xpath(Fullname)).sendKeys(fullname);
	driver.findElement(By.xpath(Mobileno)).sendKeys(mobileno);
	driver.findElement(By.xpath(Pincode)).sendKeys(pincode);
	driver.findElement(By.xpath(Addressline1)).sendKeys(flatno);
	driver.findElement(By.xpath(Addressline2)).sendKeys(streetadd);
	driver.findElement(By.xpath(Landmark)).sendKeys(landmark);
	driver.findElement(By.xpath(City)).sendKeys(city);
	
	driver.findElement(By.xpath("(//span[contains(@data-action,'dropdown-button')])[2]")).click();
	driver.findElement(By.xpath(String.format(State, state))).click();
}}