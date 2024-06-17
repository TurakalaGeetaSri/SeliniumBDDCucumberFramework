package seleniumbddcucum.stepdefs;

import DriverFactory.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import seleniumbddcucum.pages.Homepage;
import seleniumbddcucum.pages.PDPpage;

public class PDPpageStepdefs {

	TestContext testContext;
	 PDPpage pdp;
	 public PDPpageStepdefs(TestContext context) {
			testContext = context;
			pdp=testContext.getPageObjectManager().getPDPpage();
	 }
	 
	 @And("item PDP is opened and add product to cart") 
	 public void item_pdp_is_opened_and_add_product_to_cart() throws InterruptedException {
		 pdp.item_pdp_is_opened_and_add_product_to_cart();
		 
	 }
	 
	 @When("users proceed to checkout")
	 public void users_proceed_to_checkout() {
		 pdp.users_proceed_to_checkout();
	 }
	 
	 @Then("go to cart")
	 public void go_to_cart() {
		 pdp.go_to_cart();
	 }
	 @And("edit item (.*)$")
	 public void edit_item_quantity(String quantity) {
		 pdp.edit_item_quantity(quantity);
	 }
	 
	 @And("remove item from cart")
	 public void remove_item_from_cart() {
	     pdp.remove_item_from_cart();
	 
	 }	 }
	
