package ApplicationHooks;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.github.dockerjava.api.model.Driver;

import DriverFactory.TestContext;
import io.cucumber.java.After;

import io.cucumber.java.Before;

//import io.cucumber.java.Scenario;

//import cucumber.api.java.After; 
//import cucumber.api.java.Before;



	
	/*
	 * private DriverFactory driverFactory; private WebDriver driver; private
	 * ReadpropertyFile readpropfile; Properties prop;
	 * 
	 * 
	 * public void getProperty() throws FileNotFoundException, IOException {
	 * readpropfile = new ReadpropertyFile(); prop = readpropfile.init_prop(); }
	 * 
	 * 
	 * public void launchBrowser() { String browserName =
	 * prop.getProperty("browser"); driverFactory = new DriverFactory(); driver =
	 * driverFactory.init_driver(browserName);
	 * 
	 * 
	 * }
	 * 
	 * 
	 * 
	 * 
	 * public void tearDown(Scenario scenario) { if (scenario.isFailed()) { // take
	 * screenshot: String screenshotName = scenario.getName().replaceAll(" ", "_");
	 * byte[] sourcePath = ((TakesScreenshot)
	 * driver).getScreenshotAs(OutputType.BYTES); scenario.attach(sourcePath,
	 * "image/png", screenshotName);
	 * 
	 * } }
	 */
	/*
	 * @Before public void setup() { driver=getDriver(); }
	 */
	
	public class Hooks {

		TestContext testContext;

		public Hooks(TestContext context) {
			testContext = context;
		}

		@Before
		public void BeforeSteps() {
			/*What all you can perform here
				Starting a webdriver
				Setting up DB connections
				Setting up test data
				Setting up browser cookies
				Navigating to certain page
				or anything before the test
			*/
			testContext.getWebDriverManager().getDriver();
			//testContext.getConfigFileReader().getBrowser();
			//System.out.println(testContext.getConfigFileReader().getApplicationUrl());
			//testContext.getConfigFileReader().getBrowserWindowSize();
		}

		@After
		public void AfterSteps() {
			testContext.getWebDriverManager().closeDriver();
		}

	}