package DriverFactory;

import org.openqa.selenium.WebDriver;

import seleniumbddcucum.pages.Checkoutpage;
import seleniumbddcucum.pages.Homepage;
import seleniumbddcucum.pages.Loginpage;
import seleniumbddcucum.pages.PDPpage;

public class PageObjectManager {

	
	private WebDriver driver;

	//private ProductListingPage productListingPage;

	//private CartPage cartPage;

	private Homepage homepage;
	private PDPpage pdppage;
	private Loginpage loginpage;
	private Checkoutpage checkoutpage;

	//private CheckoutPage checkoutPage;

	//private ConfirmationPage confirmationPage;

	

	public PageObjectManager(WebDriver driver) {

		this.driver = driver;

	}

	

	public Homepage getHomePage(){

		return (homepage == null) ? homepage = new Homepage(driver) : homepage;

	}
	public Loginpage getLoginPage(){

		return (loginpage == null) ? loginpage = new Loginpage(driver) : loginpage;

	}
	
	public PDPpage getPDPpage(){

		return (pdppage == null) ? pdppage = new PDPpage(driver) : pdppage;

	}

	public Checkoutpage getCheckoutpage(){

		return (checkoutpage == null) ? checkoutpage = new Checkoutpage(driver) : checkoutpage;

	}


	/*
	 * public ProductListingPage getProductListingPage() {
	 * 
	 * return (productListingPage == null) ? productListingPage = new
	 * ProductListingPage(driver) : productListingPage;
	 * 
	 * }
	 * 
	 * 
	 * 
	 * public CartPage getCartPage() {
	 * 
	 * return (cartPage == null) ? cartPage = new CartPage(driver) : cartPage;
	 * 
	 * }
	 * 
	 * 
	 * 
	 * public CheckoutPage getCheckoutPage() {
	 * 
	 * return (checkoutPage == null) ? checkoutPage = new CheckoutPage(driver) :
	 * checkoutPage;
	 * 
	 * }
	 */

}
