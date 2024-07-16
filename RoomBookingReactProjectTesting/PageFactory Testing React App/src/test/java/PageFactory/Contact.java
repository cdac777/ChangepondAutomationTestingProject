package PageFactory;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Contact {
	
	WebDriver driver;
	public Contact(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}	  	
	
	public void clicks_on_contact_button() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Contact_Nav_bar_visible");
		  driver.findElement(By.xpath("//a[normalize-space()='Contact']")).click();
	}

    
	public void checks_on_contact_title() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Contact_title_visible");
		  driver.findElement(By.xpath("//h2[normalize-space()='Contact Form']"));
	}

	  
	
	public void checks_on_contact_info() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Contact_info_visible");
		  driver.findElement(By.xpath("//h3[normalize-space()='Contact Info']"));
	}

	  
	public void user_enters_valid_and_and_and(String name, String phone, String email, String query) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys(phone);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
		driver.findElement(By.xpath("//textarea[@id='query']")).sendKeys(query);
	}
	  

	  
	public void clicks_on_submit_button() {
		
		  System.out.println("Contact_Submit_button");
		  driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
		  
		  Alert alert = driver.switchTo().alert();
			
	        // Get the text of the alert
	        String alertMessage = alert.getText();
	
	        // Optionally, you can assert the message of the alert
	        Assert.assertEquals(alertMessage, "Are You Sure You want to submit Your Contact Details?");
	
	        // Accept the alert (click OK)
	        alert.accept();
		  
	}
	

	  
}
