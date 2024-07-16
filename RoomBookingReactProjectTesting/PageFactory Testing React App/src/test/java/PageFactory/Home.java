package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Home {
	
	
	WebDriver driver;
	public Home(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	  public void clicks_on_home_button() {
	      // Write code here that turns the phrase above into concrete actions
		  System.out.println("Home_Nav_bar_visible_and_passed");
		  driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
	  }
	  
	  public void checks_on_home_title() {
	      // Write code here that turns the phrase above into concrete actions
		  System.out.println("Home Content is visible");
		  driver.findElement(By.xpath("//h2[normalize-space()='Home']"));
	     
	  }
	  
	  
	  public void checks_on_deluxe_room_title() {
	      // Write code here that turns the phrase above into concrete actions
		  System.out.println("Deluxe Suite details is visible");
		  driver.findElement(By.xpath("//h3[normalize-space()='Deluxe Suite']"));
	  }

	  public void checks_on_executive_room_title() {
	      // Write code here that turns the phrase above into concrete actions
		  System.out.println("Executive Room details is visible");
		  driver.findElement(By.xpath("//h3[normalize-space()='Executive Room']"));
	 
	  }

	  
	
	  public void checks_on_family_room_title() {
	      // Write code here that turns the phrase above into concrete actions
		  System.out.println("Family Room details is visible");
		  driver.findElement(By.xpath("//h3[normalize-space()='Family Room']"));
	  

	  }

	  
	  public void checks_on_special_rooms_title() {
	      // Write code here that turns the phrase above into concrete actionsSystem.out.println("Special Offers details is visible");
		  driver.findElement(By.xpath("//h3[normalize-space()='Special Offers']"));
	    
	  }	  


}




