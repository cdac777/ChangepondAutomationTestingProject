package StepDefinition;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
//import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class RegistrationPage {
	

	static WebDriver driver;
	
	
	@Given("User is on Login page")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver = new FirefoxDriver();
		driver.get("http://localhost:3000/");
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
	public void user_enters_valid_and(String name,String contact,String email,String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//div[@class='signup-form-container']//div[1]//input[1]")).sendKeys(name);
		driver.findElement(By.xpath("//div[2]//input[1]")).sendKeys(contact);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		
	}
		
	
	@When("clicks on Signup button")
	public void clicks_on_login_button() {
		
		System.out.println("clicks on signup button");
		driver.findElement(By.xpath("//button[normalize-space()='Sign Up']")).click();
		
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
		
		        alert.accept();
			  
		  }
		
		
		
		  @And("Close the browser")
		  public void close_the_browser() {
		      // Write code here that turns the phrase above into concrete actions
			  driver.close();
		      
		  }

	
}




