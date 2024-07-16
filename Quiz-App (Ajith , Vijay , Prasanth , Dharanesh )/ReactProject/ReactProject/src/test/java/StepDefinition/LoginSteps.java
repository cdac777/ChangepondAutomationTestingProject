package StepDefinition;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	static WebDriver driver;
	 
	 @Given("admin in our login page")
	 public void admin_in_our_login_page() {
	     // Write code here that turns the phrase above into concrete actions
		 
		 System.out.println("User is trying to log in");
			driver=new ChromeDriver();
		//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		    driver.get("http://localhost:3000/adminlogin");
		 
		 
	    
	 }

	 
	 
	 
	 
	//@Given("User is on login page")
	//public void user_is_on_login_page() {
//	    // Write code here that turns the phrase above into concrete actions
	//  
	//	
	//	
	//}

	@When("admin enters valid {string} and {string}")
	public void admin_enters_valid_and(String useremail, String password) {
	    // Write code here that turns the phrase above into concrete actions
	   
	    System.out.println("when");
	    
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys(useremail);
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		
		
	}

	@And("admin clicks on login button")
	public void clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	   
		System.out.println("And1");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("admin is navigated to the home page")
	public void admin_is_navigated_to_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
		System.out.println("Then");
		
		Assert.assertFalse(driver.findElements(By.xpath("//h1[@class='MuiTypography-root MuiTypography-h6 MuiTypography-noWrap css-uh02xs-MuiTypography-root']")).size()>0,"user is navigated to ");
		
	}
	
	@And("admin is navigated to exam table page")
	public void clicks_on_ExamTable_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   Thread.sleep(3000);		
	   System.out.println("And2");
		
		driver.findElement(By.xpath("//span[normalize-space()='Exam Table']")).click();
		
	}
	

	@Then("admin is selecting all the exams")
	public void admin_is_to_select_all_exams() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    
		System.out.println("Then");
		
		
		
		driver.findElement(By.xpath("//tbody/tr[1]/td[3]/input[1]")).click();
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//tbody/tr[2]/td[3]/input[1]")).click();
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//tbody/tr[3]/td[3]/input[1]")).click();
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//tbody/tr[4]/td[3]/input[1]")).click();
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//tbody/tr[5]/td[3]/input[1]")).click();
		Thread.sleep(2000);	
		
	}

	@And("Logout the admin page")
	public void Logout_admin() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);	
		System.out.println("And2");
		driver.findElement(By.xpath("//button[normalize-space()='Logout']")).click();
		
	}

	@Then("Logout alert")
	public void Logout_alert() {
	   Alert alert = driver.switchTo().alert();
		
       // Get the text of the alert
       String alertMessage = alert.getText();

       // Optionally, you can assert the message of the alert
       Assert.assertEquals(alertMessage, "Are you sure logout");

       // Accept the alert (click OK)
       alert.accept();
	}
	
	
	   // teacher login
	
	
	
	 @And("Teacher in our login page")
	 public void Teacher_in_our_login_page() throws InterruptedException {
	     // Write code here that turns the phrase above into concrete actions
		    driver.get("http://localhost:3000/teacherlogin");
		 Thread.sleep(2000);	
		 driver.findElement(By.xpath("//a[normalize-space()='Teacher Login']")).click();
		 
	    
	 }

	 
	 
	@When("Teacher enters valid {string} and {string}")
	public void Teacher_enters_valid_and(String useremail, String password) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   
	    System.out.println("when");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys(useremail);
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		
		
	}

	@And("Teacher clicks on login button")
	public void Teacher_clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	   
		System.out.println("And3");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}


	@Then("Teacher is navigated to the home page")
	public void Teacher_is_navigated_to_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
		System.out.println("Then");
		
		Assert.assertTrue(driver.findElements(By.xpath("//h1[@class='MuiTypography-root MuiTypography-h6 MuiTypography-noWrap css-uh02xs-MuiTypography-root']")).size()>0,"Teacher is navigated to ");
		
	}
	

	@And("Teacher is navigated to Vouchers page")
	public void Teacher_clicks_on_Vouchers_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   Thread.sleep(3000);		
	   System.out.println("And4");
		
		driver.findElement(By.xpath("//span[normalize-space()='Vouchers']")).click();
		
	}
	
	@Then("Teacher is navigated to exam table page")
	public void Teacher_clicks_on_ExamTable_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   Thread.sleep(3000);		
	   System.out.println("Then");
		
		driver.findElement(By.xpath("//span[normalize-space()='Exam Table']")).click();
		
	}
	

	@And("Teacher is navigated to add exam page")
	public void Teacher_clicks_on_add_Exam_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   Thread.sleep(3000);		
	   System.out.println("And5");
		
		driver.findElement(By.xpath("//span[normalize-space()='Add Exam']")).click();
		
	}

	@Then("Teacher is navigated to view results page")
	public void Teacher_clicks_on_view_results_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   Thread.sleep(3000);		
	   System.out.println("Then");
		
		driver.findElement(By.xpath("//span[normalize-space()='View Results']")).click();
		
	}
	

	@And("Logout the Teacher page")
	public void Logout_Teacher() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);	
		System.out.println("And6");
		driver.findElement(By.xpath("//button[normalize-space()='Logout']")).click();
		
	}

	@Then("Teacher Logout alert")
	public void Teacher_Logout_alert() {
	   Alert alert = driver.switchTo().alert();
		
       // Get the text of the alert
       String alertMessage = alert.getText();

       // Optionally, you can assert the message of the alert
       Assert.assertEquals(alertMessage, "Are you sure logout");

       // Accept the alert (click OK)
       alert.accept();
	}
	
	
	//student login
	

	 @And("Student in our login page")
	 public void Student_in_our_login_page() throws InterruptedException {
	     // Write code here that turns the phrase above into concrete actions
		    driver.get("http://localhost:3000/teacherlogin");
		 Thread.sleep(2000);	
		 driver.findElement(By.xpath("//a[normalize-space()='Student Login']")).click();
		 	    
	 }
	 
	 @When("Student enters valid {string} and {string}")
		public void Student_enters_valid_and(String useremail, String password) throws InterruptedException {
		    // Write code here that turns the phrase above into concrete actions
		   
		    System.out.println("when");
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//input[@id='email']")).sendKeys(useremail);
		    driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
			
			
		}
	 
	 @And("Student clicks on login button")
		public void Student_clicks_on_login_button() {
		    // Write code here that turns the phrase above into concrete actions
		   
			System.out.println("And7");
			
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
		}
	
	 @Then("Student enters the voucher code {string}")
	 public void student_enters_the_voucher_code(String voucher) throws InterruptedException {
	     // Write code here that turns the phrase above into concrete actions
		 System.out.println("Then");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@id='voucher']")).sendKeys(voucher);
		 driver.findElement(By.xpath("//div[@id='exam']")).click();
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//li[normalize-space()='Java']")).click();
		 Thread.sleep(1000);
		
	 }
	 
	 @And("Student clicks on start quiz")
		public void Student_clicks_on_start_quiz() throws InterruptedException {
		    // Write code here that turns the phrase above into concrete actions
		   
			System.out.println("And8");
			 Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
		}
	 
	 @Then("Close the browser")
	 public void close_the_browser() {
	     // Write code here that turns the phrase above into concrete actions
	   
	 	System.out.println("Then");
	 	driver.close();
	 	
	 }


		

	
	
	
}
