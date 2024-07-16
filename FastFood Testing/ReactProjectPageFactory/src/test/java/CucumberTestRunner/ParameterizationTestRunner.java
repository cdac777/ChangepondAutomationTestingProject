package CucumberTestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;


@CucumberOptions(tags = "", features = {"src\\test\\resources\\feature"},
glue = {"StepDefenition"},
plugin = {"pretty","html:target/HtmlReport.html"})


public class ParameterizationTestRunner extends AbstractTestNGCucumberTests{

}