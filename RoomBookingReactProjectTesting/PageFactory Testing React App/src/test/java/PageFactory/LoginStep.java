package PageFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginStep {
	WebDriver driver;
	public LoginStep(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}	  	
	public void clicks_on_Login__button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("And1");
		driver.findElement(By.xpath("//button[@class='page-scroll btn btn-primary']")).click();
		
	}
	public void user_enters_valid_and(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='userPassword']")).sendKeys(password);
	}


	public void clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("And1");
		driver.findElement(By.id("login_button")).click();
		driver.findElement(By.id("login_button")).click();
	}

	
	  public void logo()  
	  {
		  // Write code here that turns the phrase above into concrete actions 
		  System.out.println("Logo_visiblility_passed");
		  Assert.assertTrue(driver.findElements(By.xpath("//img[@alt='Logo']")).size()>0,"user is navigated to the home page");
	  }
	  
	  public void title_is_visible() {
	      // Write code here that turns the phrase above into concrete actions
		  System.out.println("Title_visiblility_passed");
		  Assert.assertTrue(driver.findElements(By.xpath("//div[@class='MuiTypography-root MuiTypography-h6 MuiTypography-noWrap css-8u39c-MuiTypography-root']")).size()>0,"user is navigated to the home page");
	  }

	  public void clicks_on_navigation_button() {
	      // Write code here that turns the phrase above into concrete actions
		  System.out.println("Title_visiblility_passed");
		  driver.findElement(By.xpath("//button[@aria-label='open drawer']//*[name()='svg']")).click();
	  }

	  
	  public void clicks_on_users_list() {
	      // Write code here that turns the phrase above into concrete actions
		  System.out.println("Users_List_passed");
		  driver.findElement(By.xpath("//button[normalize-space()='Users List']")).click();
	  }
	
	  
	  public void clicks_on_room_add() {
	      // Write code here that turns the phrase above into concrete actions
		  System.out.println("Room_Add_passed");
		  driver.findElement(By.xpath("//button[normalize-space()='Room Add']")).click();
	  }
	  

	  
	  public void clicks_on_edit_and_update() {
	      // Write code here that turns the phrase above into concrete actions
		  System.out.println("Edit_and_Update_passed");
		  driver.findElement(By.xpath("//button[normalize-space()='Edit and Update']")).click();
	  }

	  
	  public void clicks_on_logout_button() {
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
	  }
	  

	public void close_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("And2");
		driver.close();
	}
}


