package seleniumbddcucum.stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import DriverFactory.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.build.Plugin.Factory;
import seleniumbddcucum.pages.Homepage;


public class HomepageStepdefs   {
	TestContext testContext;
	Homepage home;
	 public HomepageStepdefs(TestContext context) {
			testContext = context;
			home=testContext.getPageObjectManager().getHomePage();
	 }

		@When("User landed on application and navigates to Login button")
		public void user_navigates_to_login_button() throws Throwable {
		     home.clickloginhome();

		}
		
		@Then("I search for the item")
		public void i_search_for_the_item() {
			
			home.searchitem();
		}
		@Then("user logout and leave site")
		public void user_logout_and_leave_site() {
			home.user_logout_and_leave_site();
		}}
