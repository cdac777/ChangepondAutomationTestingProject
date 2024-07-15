package CucumberTestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="",features= {"src/test/resources/Feature"},
glue= {"StepDefinition"},
plugin= {"pretty","html:target/HtmlReport.html"}
)
public class POMTestrunner extends AbstractTestNGCucumberTests {


}
