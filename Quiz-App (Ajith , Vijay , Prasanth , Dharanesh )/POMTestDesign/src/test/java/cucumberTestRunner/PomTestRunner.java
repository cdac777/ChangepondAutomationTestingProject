package cucumberTestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", features = {"src/test/resources/Features"},
glue = {"StepDefinition"},
plugin = {"pretty","html:target/HtmlReport.html"})

public class PomTestRunner extends AbstractTestNGCucumberTests {

}
