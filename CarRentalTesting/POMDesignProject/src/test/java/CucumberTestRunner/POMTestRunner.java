package CucumberTestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class POMTestRunner {

	@CucumberOptions(tags = " ", features = {"src/test/resources/feature"}, 
			glue = {"StepDefinition"}, 
			plugin = {"pretty", "html:target/htmlreport.html"} 
	) 

	public class CucmberTestRunner extends AbstractTestNGCucumberTests { 

	}

}
