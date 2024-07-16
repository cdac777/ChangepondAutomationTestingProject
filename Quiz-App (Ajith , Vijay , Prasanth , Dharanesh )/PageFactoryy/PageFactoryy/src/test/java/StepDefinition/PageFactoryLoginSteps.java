package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageFactory.AdminLogin;
import PageFactory.HomePageFactory;
import PageFactory.JavaQuiz;
import PageFactory.LoginpageFactory;
import PageFactory.TeacherLogin;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PageFactoryLoginSteps {
	
		static WebDriver driver;

		LoginpageFactory login;

		HomePageFactory home;
		JavaQuiz quizPage;
		TeacherLogin teacherLogin;
		 AdminLogin alogin;

		@Given("User is on Dashboard page")
		public void user_is_on_login_page() {
		    driver=new ChromeDriver();
		    driver.get("http://localhost:3000/");
		    driver.findElement(By.xpath("//a[normalize-space()='Student Login']")).click();
		    }
		@When("User enters valid {string} and {string}")

		public void user_enters_valid_and(String username, String password) {
		    // Write code here that turns the phrase above into concrete actions
		  login = new LoginpageFactory(driver);
		  login.enterUsername(username);
    	  login.enterPassword(password);
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
		}
		@When("clicks on login button")
		public void clicks_on_login_button() {

//		    login.clickLoginButton();
		}
		@Then("user is navigated to the vochur code")
	public void user_is_navigated_to_the_vochur_code() {
		    // Write code here that turns the phrase above into concrete actions
//			home = new HomePageFactory(driver);
			  home = new HomePageFactory(driver);
		        driver.get("http://localhost:3000/studentvoucher");
				 home.enterVoucherCode();
				 home.selectExam();
				
		}
		
		 
		 @When("clicks on start quiz button")
		 public void clickLoginButton() {
		    	home.clickLoginButton();
			}
		 @When("User answers Java quiz questions")
		    public void user_answers_java_quiz_questions() throws InterruptedException {
		        // Assuming user is on the quiz page
		        quizPage = new JavaQuiz(driver);
		        Thread.sleep(1000);
		        quizPage.answerJavaQuestion();
		    }
			
		 @Given("I am on the Teacher Login page")
		    public void i_am_on_the_teacher_login_page() {
		        driver = new ChromeDriver();
		        driver.get("http://localhost:3000/teacherlogin");
		        teacherLogin = new TeacherLogin(driver);
		    }

		    @When("I enter the username {string}")
		    public void i_enter_the_username(String tusername) {
		        teacherLogin.enterUserName(tusername);
		    }

		    @When("I enter the password {string}")
		    public void i_enter_the_password(String tpassword) {
		        teacherLogin.enterPassword(tpassword);
		    }

		    @When("I click on the Login button")
		    public void i_click_on_the_login_button() {             
		        teacherLogin.hitLoginButton();
		    }

		    @Then("I should be redirected to the Exam Table page")
		    public void i_should_be_redirected_to_the_exam_table_page() {
		        driver.getCurrentUrl().contains("exam-table");
		    }

		    @When("I select the {string} exam")
		    public void i_select_the_exam(String exam) {
		        if (exam.equals("Python")) {
		            teacherLogin.selectPython.click();
		        } else if (exam.equals("React")) {
		            teacherLogin.selectReact.click();
		        }
		    }

		    @When("I click on the Logout button")
		    public void i_click_on_the_logout_button() throws InterruptedException {
		        teacherLogin.logout();
		    }

		    @And("I accept the alert")
		    public void i_accept_the_alert() {
		        driver.switchTo().alert().accept();
		    }

		    @Then("I should be logged out and redirected to the Teacher Login page")
		    public void i_should_be_logged_out_and_redirected_to_the_teacher_login_page() {
		        driver.getCurrentUrl().contains("teacher-login");
		        driver.quit();
		    }

		    @Then("I should see an error message indicating invalid credentials")
		    public void i_should_see_an_error_message_indicating_invalid_credentials() {
		        // Add assertions for the error message
		       driver.getPageSource().contains("Invalid username or password");
		        driver.quit();
		    }
		    
		    @Given("the user is on the login page")      
		    public void the_user_is_on_the_login_page() {
		        // Setup ChromeDriver
		    	 driver = new ChromeDriver();
			        driver.get("http://localhost:3000/adminlogin");
       	        alogin = new  AdminLogin(driver);
		    }

		    @When("the user enters the username {string}")
		    public void the_user_enters_the_username(String ausername) {
		        alogin.enterUserName(ausername);
		    }

		    @When("the user enters the password {string}")
		    public void the_user_enters_the_password(String apassword) {
		        alogin.enterPassword(apassword);
		    }

		    @When("the user clicks the login button")
		    public void the_user_clicks_the_login_button() throws InterruptedException {
		        alogin.hitLoginButton();
		    }

		    @Then("the application admin page should be displayed")
		    public void the_application_login_page_should_be_displayed() {
//		        boolean isDisplayed = alogin.isAppLoginDisplayed();
//		        assert(isDisplayed);
		        
		       
//		        driver.quit();
		    }
            @Then("the admin click the logout button")
            public void is_AppLogout() throws InterruptedException {
		        alogin.isAppLogout(); 
		        Thread.sleep(1000);
		    	
		        
		    }
		@And("Close the browser")
            public void close_the_browser() {
			driver.close();

		}
	}


