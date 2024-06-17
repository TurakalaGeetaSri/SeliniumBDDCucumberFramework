package seleniumbddcucum.seleniumbddcucum;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseClass {

	WebDriver driver;
	
	@Before
	public void setupApplication()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.amazon.in/");
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
	}
		@After
		public void closeApplication()
		{
			driver.quit();
		}

	

}
