package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class ParaLoginStep {
	static WebDriver driver;
	
	
	
	@Given("User is on Login Page")
	public void user_is_on_login_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User is trying to log in");
		driver = new FirefoxDriver();
		driver.get("http://localhost:3000/login");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		//Thread.sleep(1000);

	}

	@When("User enters valid {string} and {string}")
	public void user_enters_valid_and(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='userPassword']")).sendKeys(password);
		
	}

	@And("clicks on login button")
	public void clicks_on_login_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("And1");
		//driver.findElement(By.cssSelector("button[class='login btn btn-primary']")).click();
		driver.findElement(By.id("login_button")).click();
		//driver.findElement(By.id("login_button")).click();
		
		
	}
	
	  @Then("Logo is visible") 
	  public void logo() throws InterruptedException 
	  {
		  // Write code here that turns the phrase above into concrete actions 
		  System.out.println("Logo_visiblility_passed");
		  Assert.assertTrue(driver.findElements(By.xpath("//img[@alt='Logo']")).size()>0,"user is navigated to the home page");
	  }
	  
	  
	    
	  
	  @Then("title is visible") 
	  public void title() throws InterruptedException 
	  {
		  // Write code here that turns the phrase above into concrete actions 
		  System.out.println("Title_visiblility_passed");
		  Assert.assertTrue(driver.findElements(By.xpath("//div[@class='MuiTypography-root MuiTypography-h6 MuiTypography-noWrap css-8u39c-MuiTypography-root']")).size()>0,"user is navigated to the home page");
	  }
	
	  
	  @Then("clicks on navigation button") 
	  public void toggle() throws InterruptedException 
	  {
		  // Write code here that turns the phrase above into concrete actions 
		  System.out.println("Title_visiblility_passed");
		  driver.findElement(By.xpath("//button[@aria-label='open drawer']//*[name()='svg']")).click();
	  }
	  
	  
	  @Then("clicks on Home") 
	  public void Users_List() throws InterruptedException 
	  {
		  // Write code here that turns the phrase above into concrete actions 
		  System.out.println("clicks on Home to Display all avilable rooms");
		  driver.findElement(By.xpath("//button[normalize-space()='Home']")).click();
		  //Assert.assertTrue(driver.findElements(By.xpath("//button[normalize-space()='Users List']")).size()>0,"user is navigated to the home page");
	  }
	  
	  @Then("User clicks on select Room") 
	  public void Users_select_room() throws InterruptedException 
	  {
		  // Write code here that turns the phrase above into concrete actions 
		  System.out.println("clicks on Home to Display all avilable rooms");
		  driver.findElement(By.xpath("//button[normalize-space()='Select Rooms']")).click();
		  //Assert.assertTrue(driver.findElements(By.xpath("//button[normalize-space()='Users List']")).size()>0,"user is navigated to the home page");
	  }
	  
	  @Then("clicks on select room") 
	  public void Users_room() throws InterruptedException 
	  {
		  // Write code here that turns the phrase above into concrete actions 
		  System.out.println("User selects the room from dashboard");
		  driver.findElement(By.xpath("//main[@class='css-1q0wjfh']//div[1]//div[2]//button[1]")).click();
		  //Assert.assertTrue(driver.findElements(By.xpath("//button[normalize-space()='Users List']")).size()>0,"user is navigated to the home page");
		  
	  }

	  
	  @Then("User verify the booked room") 
	  public void Users_views() throws InterruptedException 
	  {
		  // Write code here that turns the phrase above into concrete actions 
		  System.out.println("clicks on Home to Display all avilable rooms");
		  driver.findElement(By.xpath("//button[normalize-space()='Selected Rooms']")).click();
		  //Assert.assertTrue(driver.findElements(By.xpath("//button[normalize-space()='Users List']")).size()>0,"user is navigated to the home page");
	  }
	  
	  
	 	  
	  @Then("clicks on Logout button") 
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
	  
	  
	  
	  
	@And("Close the Browser")
	public void close_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("And2");
		driver.close();
	}
}


