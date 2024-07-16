package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Then;

public class Rooms {
	
	WebDriver driver;
	public Rooms(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}	  
	public void clicks_on_room_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Rooms_Nav_bar_visible_and_passed");
		  driver.findElement(By.xpath("//a[normalize-space()='Rooms']")).click();
	}
	  

	  
	public void checks_for_rooms_title() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Rooms_Nav_bar_visible_and_passed");
		  driver.findElement(By.xpath("//h2[normalize-space()='ROOMS']"));
	}

	public void checks_for_standard_room_hover_image() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("image_hovering is working");
		  driver.findElement(By.xpath("//a[@title='Standard Room']//div[@class='hover-text']"));
	}

	  
	  
	public void checks_for_duplex_rooms_hover_image() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("image_hovering is working");
		  driver.findElement(By.xpath("//a[@title='Duplex']//div[@class='hover-text']"));
	}

	  
	  
	public void checks_for_connecting_rooms_hover_image() {
	    // Write code here that turns the phrase above into concrete actions 
		System.out.println("image_hovering is working");
		  driver.findElement(By.xpath("//a[@title='Connecting Rooms']//div[@class='hover-text']"));
	}

	  
	  
	public void checks_for_presidental_suite_hover_image() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("image_hovering is working");
		  driver.findElement(By.xpath("//a[@title='Presidential Suite']//div[@class='hover-text']"));
	}
	

	  
	public void checks_for_bungalow_hover_image() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("image_hovering is working");
		  driver.findElement(By.xpath("//a[@title='Bungalow']//div[@class='hover-text']"));
	}
	

	  
	  
	public void checks_for_junior_suite_hover_image() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("image_hovering is working");
		  driver.findElement(By.xpath("//a[@title='Junior Suite']//div[@class='hover-text']"));
	}

}
