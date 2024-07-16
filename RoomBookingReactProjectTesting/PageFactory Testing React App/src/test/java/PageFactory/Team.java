package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Then;

public class Team {
	
	
	WebDriver driver;
	public Team(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}	  	
	public void clicks_on_team_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Team_Button_is_visible_and_working");
		  driver.findElement(By.xpath("//a[normalize-space()='Team']")).click();
	}


	  
	public void checks_on_team_members_photo() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Team_Members_Photo_visible");
		  driver.findElement(By.xpath("//img[@src='img/rocks.jpg']"));
	}

	  
	  public void Team_member_2()   
	  {
		  // Write code here that turns the phrase above into concrete actions 
		  System.out.println("Team_Members_Photo_visible");
		  driver.findElement(By.xpath("//img[@src='img/jiii.jpg']"));
	  }
	  
	  public void Team_member_3()   
	  {
		  // Write code here that turns the phrase above into concrete actions 
		  System.out.println("Team_Members_Photo_visible");
		  driver.findElement(By.xpath("//div[@id='team']//div[3]//div[1]//img[1]"));
	  }
	  
	  public void Team_member_4()   
	  {
		  // Write code here that turns the phrase above into concrete actions 
		  System.out.println("Team_Members_Photo_visible");
		  driver.findElement(By.xpath("//img[@src='img/js.jpg']"));
	  }
	  
	  
	  
	  
	  
	  
	  

}
