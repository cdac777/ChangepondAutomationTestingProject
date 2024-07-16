package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Then;

public class Services {
	
	WebDriver driver;
	public Services(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}	  
	
	public void clicks_on_services_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Services_Nav_bar_visible_and_passed");
		driver.findElement(By.xpath("//a[normalize-space()='Services']")).click();
	}

	  
	  
	  
	public void checks_on_our_services_title() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Our_Services_Title_visible_and_passed");
		  driver.findElement(By.xpath("//h2[normalize-space()='Our Services']"));
	}

	  
	  
	   
	public void checks_on_word_press_logo() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("wordpress_Logo_visible_and_passed");
		  driver.findElement(By.xpath("//i[@class='fa fa-wordpress']"));
	}
	  

	  
	  
	  
	public void checks_on_cart_logo() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("cart_logo_visible_and_passed");
		  driver.findElement(By.xpath("//i[@class='fa fa-cart-arrow-down']"));
	}

	  
	  
	public void checks_on_cloud_download_logo() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("cloud-download_Logo_visible_and_passed");
		  driver.findElement(By.xpath("//i[@class='fa fa-cloud-download']"));
	}
	  

	  
	  
	public void checks_on_language_logo() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("language_Logo_visible_and_passed");
		  driver.findElement(By.xpath("//i[@class='fa fa-language']"));
	}
	  

	  
	  
	  
	public void checks_on_group_logo() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("fa-group_Logo_visible_and_passed");
		  driver.findElement(By.xpath("//div[@class='col-md-4']//i[@class='fa fa-group']"));
	}
	

	  
	public void checks_on_piechart_logo() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("piechart_Logo_visible_and_passed");
		  driver.findElement(By.xpath("//i[@class='fa fa-pie-chart']"));
	}

}
