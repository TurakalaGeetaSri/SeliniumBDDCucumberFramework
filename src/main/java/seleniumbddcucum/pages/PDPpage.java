package seleniumbddcucum.pages;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Then;

public class PDPpage {

	
	WebDriver driver ;
	  
	  
	  public PDPpage(WebDriver driver) 
	  { this.driver=driver; 
	  PageFactory.initElements(driver, this);
	  }
	  
	  private @FindBy(xpath ="(//input[@id='add-to-cart-button'])[2]/parent::span")
	  WebElement addtocart;
	  
	  private @FindBy(xpath ="(//span[contains(@id,'checkout')])[1]")
	  //private @FindBy(xpath ="//input[@name='proceedToRetailCheckout']")
	  WebElement proceedcart;
	  
	  private @FindBy(xpath ="(//input[contains(@aria-labelledby,'cart')])[3]")
	  WebElement Cart;
	  
	  private @FindBy(xpath ="//input[@value='Delete']")
	  WebElement removeitem;
	  
	  private @FindBy(xpath ="(//span[contains(@class,'quantity')])[2]")
	  WebElement Quantity;
	  
	  private String qno ="//li[contains(@aria-labelledby,'%s')]";
	 
	  public void item_pdp_is_opened_and_add_product_to_cart() throws InterruptedException {

		  Set<String> winhan=driver.getWindowHandles();
		  ArrayList ar=new ArrayList(winhan);
		  //System.out.println(ar.get(0));
		  //System.out.println(ar.get(1)) ;
		  driver.switchTo().window((String) ar.get(1));
		  Thread.sleep(2000); 
		  addtocart.click();
		   }

	  public void users_proceed_to_checkout() {
		  proceedcart.click();
			 
	  }
	  public void go_to_cart() {
		  Cart.click();
	  }
	 
	  public void edit_item_quantity(String quantity) {
		  Quantity.click();
		  driver.findElement(By.xpath(String.format(qno, quantity))).click();
	  }
	  
	  public void remove_item_from_cart() {
		 
		  removeitem.click();
			 
		 }
}
