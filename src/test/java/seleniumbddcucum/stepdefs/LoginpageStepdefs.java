package seleniumbddcucum.stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import DriverFactory.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import seleniumbddcucum.pages.Homepage;
import seleniumbddcucum.pages.Loginpage;

public class LoginpageStepdefs  {
	TestContext testContext;
	Loginpage login;
	 public LoginpageStepdefs(TestContext context) {
			testContext = context;
			login=testContext.getPageObjectManager().getLoginPage();
	 }
		
	
	@When("^user enters (.*) and (.*)$")
	public void userentersusernameand_password(String username, String password) throws InterruptedException  {
		
			login.userentersusernameandpassword( username,  password);
			
	}

	@Then("User clicks on login button should be taken to successful login page")
	public void user_clicks_on_login_button_should_be_taken_to_successful_login_page() throws Throwable {
		
	}	
	}

