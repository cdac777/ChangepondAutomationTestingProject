package StepDefenition;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageObjects.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ParameterizationStepDefenition {

	LoginPage login;
	
	static WebDriver driver;
	
	
	@Given("User is our login page")
	public void user_is_our_login_page() {
	   
		driver = new FirefoxDriver();
		driver.get("http://localhost:3000/logincomp");
	}
	
	@When("User enters valid {string} and {string}")
	public void user_enters_valid_and(String username, String password) {
	    
		login = new LoginPage(driver);
	
		login.enterUserName(username);
	
		login.enterPassword(password);
	}
	
	@When("clicks on login button")
	public void clicks_on_login_button() {
	   
		login.hitLoginButton();
	}
	
	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {
	    
		Thread.sleep(1000);
		login.isAppLoginDisplayed();
	}
	
	@Then("Close the browser")
	public void close_the_browser() {
	    driver.close();
	}
	
		
	}
