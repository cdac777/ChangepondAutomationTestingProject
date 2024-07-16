package StepDefinition;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import PageObject.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
//import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class POMRegistrationPage {
	
	
	LoginPage login;
	static WebDriver driver;

	
	@Given("User is on Login page")
	public void user_is_on_Landing_Page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   
		driver = new FirefoxDriver();
		driver.get("http://localhost:3000/");
		Thread.sleep(1000);		
	}
	
	
	@And("clicks on Login button")
	public void clicks_on__login_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("And1");
		//driver.findElement(By.cssSelector("button[class='login btn btn-primary']")).click();
		driver.findElement(By.xpath("//button[@class='page-scroll btn btn-primary']")).click();
	}
	
	
	@And("clicks on signup button")
	public void clicks_on_signup_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("And1");
		//driver.findElement(By.cssSelector("button[class='login btn btn-primary']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='SignUp']")).click();
	}
	
	
	
	@When("User enters valid {string} and {string} and {string} and {string} and {string}")
	public void user_enters__valid__and(String name, String contact, String email, String username, String password) {
		login = new LoginPage(driver);
		
		login.enterName(name);
		login.enterContact(contact);
		login.enterEmail(email);
		login.enterUsername(username);
		login.enterPassword(password);
		
	}
	
	

	@When("clicks on Signup button")
	public void clicks_on_login_button() {
		login.hitLoginButton();
		
		Alert alert = driver.switchTo().alert();
		
        // Get the text of the alert
        String alertMessage = alert.getText();

        // Optionally, you can assert the message of the alert
        Assert.assertEquals(alertMessage, "User Registeration Successful!!!");

        // Accept the alert (click OK)
        alert.accept();
			
		
	}
	

			@Then("User enters_valid {string} and {string}")
			public void user_enters__valid__and(String username, String password) {
			    // Write code here that turns the phrase above into concrete actions
				driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(username);
				driver.findElement(By.xpath("//input[@name='userPassword']")).sendKeys(password);
				
				
			}
			
			
				
		@And("clicks on login Button")
		public void clicks_on__login__button() throws InterruptedException {
		    // Write code here that turns the phrase above into concrete actions
			System.out.println("And1");
			//driver.findElement(By.cssSelector("button[class='login btn btn-primary']")).click();
			driver.findElement(By.xpath("//button[@id='login_button']")).click();
			//driver.findElement(By.xpath("//button[@id='login_button']")).click();
			
			
		}
	
	
		  @Then("clicks on Logout Button") 
		  public void Logout() throws InterruptedException 
		  {
			  // Write code here that turns the phrase above into concrete actions 
			  System.out.println("Edit_and_Update_passed");
			  driver.findElement(By.xpath("//button[normalize-space()='Log Out']")).click();
			  
			  Alert alert = driver.switchTo().alert();
				
		        // Get the text of the alert
		        String alertMessage = alert.getText();
		
		        // Optionally, you can assert the message of the alert
		        Assert.assertEquals(alertMessage, "Are you sure to Logout ?");
		
		        // Accept the alert (click OK)
		        alert.accept();
			  
			  //Assert.assertTrue(driver.findElements(By.xpath("//button[normalize-space()='Edit and Update']")).size()>0,"user is navigated to the home page");
		  }
		
		
		
	

	@And("Close the browser")
	public void close_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
		driver.close();
	}


	
}




