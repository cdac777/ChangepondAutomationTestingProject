package StepDefinition;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class POMHomePage {
	
	
	static WebDriver driver;
	
	@Given("User is on Landing Page")
	public void user_is_on_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User is checking all the elements");
		driver = new FirefoxDriver();
		driver.get("http://localhost:3000");
	}
	@Then("SKNM title is visible")
	public void sknm_title_is_visible() {
	    // Write code here that turns the phrase above into concrete 
	 // Write code here that turns the phrase above into concrete actions 
		  System.out.println("Title_visiblility_passed");
		  Assert.assertTrue(driver.findElements(By.xpath("//a[normalize-space()='SNKM ROOMS']")).size()>0,"Checking Title");
	}
	

	  @Then("clicks on home button")
	  public void clicks_on_home_button() {
	      // Write code here that turns the phrase above into concrete actions
		  System.out.println("Home_Nav_bar_visible_and_passed");
		  driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
	  }
	  
	  @Then("checks on Home title")
	  public void checks_on_home_title() {
	      // Write code here that turns the phrase above into concrete actions
		  System.out.println("Home Content is visible");
		  driver.findElement(By.xpath("//h2[normalize-space()='Home']"));
	     
	  }
	  

	  @Then("checks on deluxe_room title")
	  public void checks_on_deluxe_room_title() {
	      // Write code here that turns the phrase above into concrete actions
		  System.out.println("Deluxe Suite details is visible");
		  driver.findElement(By.xpath("//h3[normalize-space()='Deluxe Suite']"));
	  }

	  @Then("checks on executive_room title")
	  public void checks_on_executive_room_title() {
	      // Write code here that turns the phrase above into concrete actions
		  System.out.println("Executive Room details is visible");
		  driver.findElement(By.xpath("//h3[normalize-space()='Executive Room']"));
	 
	  }

	
	  @Then("checks on family_room title")
	  public void checks_on_family_room_title() {
	      // Write code here that turns the phrase above into concrete actions
		  System.out.println("Family Room details is visible");
		  driver.findElement(By.xpath("//h3[normalize-space()='Family Room']"));
	  

	  }

	  
	  @Then("checks on special_rooms title")
	  public void checks_on_special_rooms_title() {
	      // Write code here that turns the phrase above into concrete actionsSystem.out.println("Special Offers details is visible");
		  driver.findElement(By.xpath("//h3[normalize-space()='Special Offers']"));
	    
	  }	  

	  
	  @Then("clicks on services button")
		public void clicks_on_services_button() {
		    // Write code here that turns the phrase above into concrete actions
			System.out.println("Services_Nav_bar_visible_and_passed");
			  driver.findElement(By.xpath("//a[normalize-space()='Services']")).click();
		}

		  
		  
		@Then("checks on Our_Services Title")
		public void checks_on_our_services_title() {
		    // Write code here that turns the phrase above into concrete actions
			System.out.println("Our_Services_Title_visible_and_passed");
			  driver.findElement(By.xpath("//h2[normalize-space()='Our Services']"));
		}

		   
		@Then("checks on Word_Press logo")
		public void checks_on_word_press_logo() {
		    // Write code here that turns the phrase above into concrete actions
			System.out.println("wordpress_Logo_visible_and_passed");
			  driver.findElement(By.xpath("//i[@class='fa fa-wordpress']"));
		}
		  

		  
		  
		@Then("checks on Cart logo")
		public void checks_on_cart_logo() {
		    // Write code here that turns the phrase above into concrete actions
			System.out.println("cart_logo_visible_and_passed");
			  driver.findElement(By.xpath("//i[@class='fa fa-cart-arrow-down']"));
		}

		  
		@Then("checks on Cloud_Download logo")
		public void checks_on_cloud_download_logo() {
		    // Write code here that turns the phrase above into concrete actions
			System.out.println("cloud-download_Logo_visible_and_passed");
			  driver.findElement(By.xpath("//i[@class='fa fa-cloud-download']"));
		}
		  

		  
		  
		@Then("checks on Language logo")
		public void checks_on_language_logo() {
		    // Write code here that turns the phrase above into concrete actions
			System.out.println("language_Logo_visible_and_passed");
			  driver.findElement(By.xpath("//i[@class='fa fa-language']"));
		}
		  

		  
		  
		@Then("checks on Group logo")
		public void checks_on_group_logo() {
		    // Write code here that turns the phrase above into concrete actions
			 System.out.println("fa-group_Logo_visible_and_passed");
			  driver.findElement(By.xpath("//div[@class='col-md-4']//i[@class='fa fa-group']"));
		}

		  
		@Then("checks on Piechart logo")
		public void checks_on_piechart_logo() {
		    // Write code here that turns the phrase above into concrete actions
			System.out.println("piechart_Logo_visible_and_passed");
			  driver.findElement(By.xpath("//i[@class='fa fa-pie-chart']"));
		}

		@Then("clicks on room button")
		public void clicks_on_room_button() {
		    // Write code here that turns the phrase above into concrete actions
			System.out.println("Rooms_Nav_bar_visible_and_passed");
			  driver.findElement(By.xpath("//a[normalize-space()='Rooms']")).click();
		}
		  

		@Then("checks for Rooms title")
		public void checks_for_rooms_title() {
		    // Write code here that turns the phrase above into concrete actions
			System.out.println("Rooms_Nav_bar_visible_and_passed");
			  driver.findElement(By.xpath("//h2[normalize-space()='ROOMS']"));
		}

		  
		@Then("checks for Standard Room hover image")
		public void checks_for_standard_room_hover_image() {
		    // Write code here that turns the phrase above into concrete actions
			System.out.println("image_hovering is working");
			  driver.findElement(By.xpath("//a[@title='Standard Room']//div[@class='hover-text']"));
		}

		  
		@Then("checks for Duplex Rooms hover image")
		public void checks_for_duplex_rooms_hover_image() {
		    // Write code here that turns the phrase above into concrete actions
			System.out.println("image_hovering is working");
			  driver.findElement(By.xpath("//a[@title='Duplex']//div[@class='hover-text']"));
		}

		  
		  
		@Then("checks for Connecting Rooms hover image")
		public void checks_for_connecting_rooms_hover_image() {
		    // Write code here that turns the phrase above into concrete actions 
			System.out.println("image_hovering is working");
			  driver.findElement(By.xpath("//a[@title='Connecting Rooms']//div[@class='hover-text']"));
		}

		  
		  
		@Then("checks for Presidental Suite hover image")
		public void checks_for_presidental_suite_hover_image() {
		    // Write code here that turns the phrase above into concrete actions
			 System.out.println("image_hovering is working");
			  driver.findElement(By.xpath("//a[@title='Presidential Suite']//div[@class='hover-text']"));
		}
		

		  
		  
		@Then("checks for Bungalow hover image")
		public void checks_for_bungalow_hover_image() {
		    // Write code here that turns the phrase above into concrete actions
			System.out.println("image_hovering is working");
			  driver.findElement(By.xpath("//a[@title='Bungalow']//div[@class='hover-text']"));
		}
		

		  
		@Then("checks for Junior Suite hover image")
		public void checks_for_junior_suite_hover_image() {
		    // Write code here that turns the phrase above into concrete actions
			System.out.println("image_hovering is working");
			  driver.findElement(By.xpath("//a[@title='Junior Suite']//div[@class='hover-text']"));
		}


		@Then("clicks on Team button")
		public void clicks_on_team_button() {
		    // Write code here that turns the phrase above into concrete actions
			System.out.println("Team_Button_is_visible_and_working");
			  driver.findElement(By.xpath("//a[normalize-space()='Team']")).click();
		}

  
		@Then("checks on Team Members photo1")
		public void checks_on_team_members_photo() {
		    // Write code here that turns the phrase above into concrete actions
			System.out.println("Team_Members_Photo_visible");
			  driver.findElement(By.xpath("//img[@src='img/rocks.jpg']"));
		}

		  @Then("checks on Team Members photo2") 
		  public void Team_member_2() throws InterruptedException 
		  {
			  // Write code here that turns the phrase above into concrete actions 
			  System.out.println("Team_Members_Photo_visible");
			  driver.findElement(By.xpath("//img[@src='img/jiii.jpg']"));
		  }
		  
		  @Then("checks on Team Members photo3") 
		  public void Team_member_3() throws InterruptedException 
		  {
			  // Write code here that turns the phrase above into concrete actions 
			  System.out.println("Team_Members_Photo_visible");
			  driver.findElement(By.xpath("//div[@id='team']//div[3]//div[1]//img[1]"));
		  }
		  
		  @Then("checks on Team Members photo4") 
		  public void Team_member_4() throws InterruptedException 
		  {
			  // Write code here that turns the phrase above into concrete actions 
			  System.out.println("Team_Members_Photo_visible");
			  driver.findElement(By.xpath("//img[@src='img/js.jpg']"));
		  }
		  
		  @Then("clicks on contact button")
			public void clicks_on_contact_button() {
			    // Write code here that turns the phrase above into concrete actions
				 System.out.println("Contact_Nav_bar_visible");
				  driver.findElement(By.xpath("//a[normalize-space()='Contact']")).click();
			}

		    
			@Then("checks on contact title")
			public void checks_on_contact_title() {
			    // Write code here that turns the phrase above into concrete actions
				System.out.println("Contact_title_visible");
				  driver.findElement(By.xpath("//h2[normalize-space()='Contact Form']"));
			}

			
			@Then("checks on contact info")
			public void checks_on_contact_info() {
			    // Write code here that turns the phrase above into concrete actions
				System.out.println("Contact_info_visible");
				  driver.findElement(By.xpath("//h3[normalize-space()='Contact Info']"));
			}
			  
			@When("User enters valid {string} and {string} and {string} and {string}")
			public void user_enters_valid_and_and_and(String name, String phone, String email, String query) {
			    // Write code here that turns the phrase above into concrete actions
				driver.findElement(By.xpath("//input[@id='name']")).sendKeys(name);
				driver.findElement(By.xpath("//input[@id='phone']")).sendKeys(phone);
				driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
				driver.findElement(By.xpath("//textarea[@id='query']")).sendKeys(query);
			}

			  
			@Then("clicks on submit button")
			public void clicks_on_submit_button() {
			    // Write code here that turns the phrase above into concrete actions
				// Write code here that turns the phrase above into concrete actions 
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
			
			@And("Close the Browser_")
			public void close_the_browser() {
			    // Write code here that turns the phrase above into concrete actions
				System.out.println("And2");
				driver.close();
			}
			

}


