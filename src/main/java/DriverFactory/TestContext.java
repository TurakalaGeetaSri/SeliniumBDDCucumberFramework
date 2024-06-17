package DriverFactory;

import seleniumbddcucum.seleniumbddcucum.utilities.ConfigFileReader;

public class TestContext {

	private WebDriverManager webDriverManager;  //object declaration
	private PageObjectManager pageObjectManager;
	private ConfigFileReader configFileReader;
	//public ScenarioContext scenarioContext;
	
	public TestContext(){
		webDriverManager = new WebDriverManager();  // object instantiated
		pageObjectManager = new PageObjectManager(webDriverManager.getDriver());
		
		//scenarioContext = new ScenarioContext();
	}
	
	public WebDriverManager getWebDriverManager() {
		return webDriverManager;
	}
	public PageObjectManager getPageObjectManager() {
		return pageObjectManager;
	}
	
	
}
