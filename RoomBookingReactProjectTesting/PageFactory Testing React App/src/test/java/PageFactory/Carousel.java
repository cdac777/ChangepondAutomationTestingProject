package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.cucumber.java.en.Then;

public class Carousel {

	WebDriver driver;
	public Carousel(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}	  
	public void checks_on_carousel() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Carousel_Slider_visible_and_passed");
		Assert.assertTrue(driver.findElements(By.xpath("//li[4]//div[1]")).size()>0,"user is navigated to the home page");
		
	}
	
	
}
