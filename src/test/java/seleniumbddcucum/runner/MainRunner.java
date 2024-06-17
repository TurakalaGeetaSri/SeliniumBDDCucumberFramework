package seleniumbddcucum.runner;

import org.junit.runner.RunWith;

import io.cucumber.core.snippets.SnippetType;
//import cucumber.api.CucumberOptions;
//import cucumber.api.SnippetType;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)	
@CucumberOptions(features = {"src/test/resources/features/"},
glue = {"seleniumbddcucum.stepdefs","seleniumbddcucum.pages"},
	
        monochrome = true,
        //dryRun = true,
        //dryRun = true,
       
        		  plugin = {	
        	                 "pretty", "json:target/cucumber-reports/Cucumber.json", 
        	                 "html:target/cucumber-reports/Cucumber.html"},
     
        		tags = "@tcid:C337754"

)
public class MainRunner {

}
