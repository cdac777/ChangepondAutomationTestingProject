package CucumberTestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;


@CucumberOptions(tags = "", features = {"C:\\Users\\gokulakannan.m\\eclipse-workspace\\ReactProject\\src\\test\\resources\\feature"},
glue = {"StepDefenition"},
plugin = {"pretty","html:target/HtmlReport.html"})


public class ParameterizationTestRunner extends AbstractTestNGCucumberTests{

}