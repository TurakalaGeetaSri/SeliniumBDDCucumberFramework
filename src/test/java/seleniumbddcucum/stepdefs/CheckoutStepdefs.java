package seleniumbddcucum.stepdefs;

import DriverFactory.TestContext;
import io.cucumber.java.en.Then;
import seleniumbddcucum.pages.Checkoutpage;
import seleniumbddcucum.pages.Homepage;

public class CheckoutStepdefs {
	
	TestContext testContext;
	Checkoutpage checkout;
	 public CheckoutStepdefs(TestContext context) {
			testContext = context;
			checkout=testContext.getPageObjectManager().getCheckoutpage();
	 }
	
	@Then("user enters '(.*)','(.*)','(.*)','(.*)','(.*)','(.*)','(.*)','(.*)','(.*)'$")
	public void enterShippngAddress(String country, String fullname, String mobileno, String pincode, String flatno, String streetadd,
            String landmark, String state, String city)  {
		checkout.enterShippngAddress(country, fullname,mobileno, pincode, flatno, streetadd,
	            landmark, state, city);
	}

}
