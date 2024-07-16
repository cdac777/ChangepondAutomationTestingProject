package StepDefinition;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import PageFactory.Carousel;
import PageFactory.Contact;
import PageFactory.Home;
import PageFactory.LoginStep;
import PageFactory.Logo;
import PageFactory.Rooms;
import PageFactory.Services;
import PageFactory.Team;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Title {
	
	static WebDriver driver;
	Logo logo;
	Carousel carousel;
	Home home;
	Services services;
	Rooms rooms;
	Team team;
	Contact contact;
	LoginStep login;
	
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
		  System.out.println("Title_visiblility_passed");
		  Assert.assertTrue(driver.findElements(By.xpath("//a[normalize-space()='SNKM ROOMS']")).size()>0,"Checking Title");
	}
	@Then("Logo is visible")
	public void logo_is_visible() {
	    logo = new Logo(driver);
	    logo.logoCheck();
	}
	
	@Then("checks on carousel")
	public void checks_on_carousel() {
	    // Write code here that turns the phrase above into concrete actions
		carousel = new Carousel(driver);
		carousel.checks_on_carousel();
	}
	
	  @Then("clicks on home button")
	  public void clicks_on_home_button() {
	      // Write code here that turns the phrase above into concrete actions
		  home = new Home(driver);
		  home.clicks_on_home_button();
	  }
	  
	  @Then("checks on Home title")
	  public void checks_on_home_title() {
	      // Write code here that turns the phrase above into concrete actions

		  home = new Home(driver);
		  home.checks_on_home_title(); 
	  }
	  
	  
	  @Then("checks on deluxe_room title")
	  public void checks_on_deluxe_room_title() {
	      // Write code here that turns the phrase above into concrete actions

		  home = new Home(driver);
		  home.checks_on_deluxe_room_title();
	  }

	  @Then("checks on executive_room title")
	  public void checks_on_executive_room_title() {
	      // Write code here that turns the phrase above into concrete actions

		  home = new Home(driver);
		  home.checks_on_executive_room_title();
	 
	  }

	  
	
	  @Then("checks on family_room title")
	  public void checks_on_family_room_title() {
	      // Write code here that turns the phrase above into concrete actions
		  home = new Home(driver);
		  home.checks_on_family_room_title();
	  

	  }

	  
	  @Then("checks on special_rooms title")
	  public void checks_on_special_rooms_title() {
	      // Write code here that turns the phrase above into concrete actions
		  home = new Home(driver);
		  home.checks_on_special_rooms_title();
	    
	  }	  

	  
	  @Then("clicks on services button")
		public void clicks_on_services_button() {
		  services = new Services(driver);
		  services.clicks_on_services_button();
		}
		  	  
		  
		@Then("checks on Our_Services Title")
		public void checks_on_our_services_title() {
		    // Write code here that turns the phrase above into concrete actions
			
			  services = new Services(driver);
			  services.clicks_on_services_button();
		}

		  
		   
		@Then("checks on Word_Press logo")
		public void checks_on_word_press_logo() {
		    // Write code here that turns the phrase above into concrete actions
			
			  services = new Services(driver);
			  services.checks_on_word_press_logo();
		}		  
		  
		  
		@Then("checks on Cart logo")
		public void checks_on_cart_logo() {
		    // Write code here that turns the phrase above into concrete actions
			
			  services = new Services(driver);
			  services.checks_on_cart_logo();
		}

		  
		@Then("checks on Cloud_Download logo")
		public void checks_on_cloud_download_logo() {
		    // Write code here that turns the phrase above into concrete actions
			
			  services = new Services(driver);
			  services.checks_on_cloud_download_logo();
		}
		  
		  
		@Then("checks on Language logo")
		public void checks_on_language_logo() {
		    // Write code here that turns the phrase above into concrete actions
			
			  services = new Services(driver);
			  services.checks_on_language_logo();
		}

		  
		  
		@Then("checks on Group logo")
		public void checks_on_group_logo() {
		    // Write code here that turns the phrase above into concrete actions
			
			  services = new Services(driver);
			  services.checks_on_group_logo();
		}
		

		  
		@Then("checks on Piechart logo")
		public void checks_on_piechart_logo() {
		  
			  services = new Services(driver);
			  services.checks_on_piechart_logo();
		}

		

		
		
		
		@Then("clicks on room button")
		public void clicks_on_room_button() {
		    // Write code here that turns the phrase above into concrete actions
			 rooms = new Rooms(driver);
			 rooms.clicks_on_room_button();
		}
		  

		@Then("checks for Rooms title")
		public void checks_for_rooms_title() {
		    // Write code here that turns the phrase above into concrete actions
			
			  rooms = new Rooms(driver);
			  rooms.checks_for_rooms_title();
		}

		  
		@Then("checks for Standard Room hover image")
		public void checks_for_standard_room_hover_image() {
		    // Write code here that turns the phrase above into concrete actions
			  rooms = new Rooms(driver);
			  rooms.checks_for_standard_room_hover_image();
		}

		  
		  
		@Then("checks for Duplex Rooms hover image")
		public void checks_for_duplex_rooms_hover_image() {
		    // Write code here that turns the phrase above into concrete actions
			
			  rooms = new Rooms(driver);
			  rooms.checks_for_duplex_rooms_hover_image();
		}

		  
		  
		@Then("checks for Connecting Rooms hover image")
		public void checks_for_connecting_rooms_hover_image() {
		    // Write code here that turns the phrase above into concrete actions 
	
			  rooms = new Rooms(driver);
			  rooms.checks_for_connecting_rooms_hover_image();
		}

		  
		  
		@Then("checks for Presidental Suite hover image")
		public void checks_for_presidental_suite_hover_image() {
		    // Write code here that turns the phrase above into concrete actions
			
			  rooms = new Rooms(driver);
			  rooms.checks_for_presidental_suite_hover_image();
		}
		

		  
		  
		@Then("checks for Bungalow hover image")
		public void checks_for_bungalow_hover_image() {
		    // Write code here that turns the phrase above into concrete actions
		
			  rooms = new Rooms(driver);
			  rooms.checks_for_bungalow_hover_image();
		}
		

		  
		  
		@Then("checks for Junior Suite hover image")
		public void checks_for_junior_suite_hover_image() {
		    // Write code here that turns the phrase above into concrete actions
			
			  rooms = new Rooms(driver);
			  rooms.checks_for_junior_suite_hover_image();
		}


		
		
		
		@Then("clicks on Team button")
		public void clicks_on_team_button() {
		    // Write code here that turns the phrase above into concrete actions
			team = new Team(driver);
			team.clicks_on_team_button();
		}

		
		
		
		@Then("checks on Team Members photo _1")
		public void checks_on_team_members_photo() {
			team = new Team(driver);
			team.checks_on_team_members_photo();
		}

		  @Then("checks on Team Members photo _2") 
		  public void Team_member_2()   
		  {
			  team = new Team(driver);
				team.Team_member_2();
		  }
		  
		  @Then("checks on Team Members photo _3") 
		  public void Team_member_3()   
		  {
			  team = new Team(driver);
			  team.Team_member_3();
		  }
		  
		  @Then("checks on Team Members photo _4") 
		  public void Team_member_4()   
		  {
			  team = new Team(driver);
			  team.Team_member_4();
		  }
		   
		  
		  
		  
		  
		  @Then("clicks on contact button")
			public void clicks_on_contact_button() {
			    contact = new Contact(driver);
			    contact.clicks_on_contact_button();
			}

			  
		    
			@Then("checks on contact title")
			public void checks_on_contact_title() {
				contact = new Contact(driver);
			    contact.checks_on_contact_title();
			}

			  
			
			@Then("checks on contact info")
			public void checks_on_contact_info() {
				contact = new Contact(driver);
			    contact.checks_on_contact_info();
			}
			  
			@When("User enters valid {string} and {string} and {string} and {string}")
			public void user_enters_valid_and_and_and(String name, String phone, String email, String query) {
				contact = new Contact(driver);
			    contact.user_enters_valid_and_and_and(name, phone, email, query);
			}
			  
			  
			@Then("clicks on submit button")
			public void clicks_on_submit_button() {
				contact = new Contact(driver);
			    contact.clicks_on_contact_button();
				  
			}
			
			
			
			
			@And("clicks on login button_")
			public void clicks_on_Login__button() throws InterruptedException {
			  
				login = new LoginStep(driver);
				login.clicks_on_Login__button();
				
			}
			@When("User enters valid {string} and {string}")
			public void user_enters_valid_and(String username, String password) {
				login = new LoginStep(driver);
				login.user_enters_valid_and(username,password);
			}


			@When("clicks on Login button_")
			public void clicks_on_login_button() {
				login = new LoginStep(driver);
				login.clicks_on_login_button();
			}

			
			  @Then("Logo is visible in Login Page") 
			  public void logo()  
			  {
				  login = new LoginStep(driver);
				  login.logo();
			  }
			  
			  @Then("title is visible")
			  public void title_is_visible() {
				  
				  login = new LoginStep(driver);
				  login.title_is_visible();		
				  
				}

	
			  @Then("clicks on navigation button")
			  public void clicks_on_navigation_button() {
				  login = new LoginStep(driver);
				  login.clicks_on_navigation_button();	
			  }

			  
			  @Then("clicks on Users_List")
			  public void clicks_on_users_list() {
				  login = new LoginStep(driver);
				  login.clicks_on_users_list();	
			  }
			
			  
			  @Then("clicks on Room_Add")
			  public void clicks_on_room_add() {
				  login = new LoginStep(driver);
				  login.clicks_on_room_add();	
			  }
			  

			  
			  @Then("clicks on Edit_and_Update")
			  public void clicks_on_edit_and_update() {
				  login = new LoginStep(driver);
				  login.clicks_on_edit_and_update();	
			  }

			  
			  @Then("clicks on Logout button")
			  public void clicks_on_logout_button() {
				  login = new LoginStep(driver);
				  login.clicks_on_logout_button();	
			  }
			  

			@And("Close the Browser_")
			public void close_the_browser() {
				 login = new LoginStep(driver);
				 login.close_the_browser();	
			}
			
			
			

}
