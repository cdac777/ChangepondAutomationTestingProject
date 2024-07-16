package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageObjects.AdminDashboardPage;
import PageObjects.JavaQuiz;
import PageObjects.LoginPage;
import PageObjects.StudentLogin;
import PageObjects.TeacherLogin;
import PageObjects.VoucherCrudTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PomStepDefinition {

	LoginPage login;
	AdminDashboardPage admindashboard;
	TeacherLogin teacherLogin;
	StudentLogin studentLogin;
	JavaQuiz javaQuiz;
	VoucherCrudTest voucherCrudTest;
	
	static WebDriver driver;
	
	
	@Given("User is our login page")
	public void user_is_our_login_page() {
	   
		driver = new ChromeDriver();
		driver.get("http://localhost:3001/adminlogin");
	}
	
	@When("User enters valid {string} and {string}")
	public void user_enters_valid_and(String username, String password) {
	    
		login = new LoginPage(driver);
	
		admindashboard = new AdminDashboardPage(driver);

		teacherLogin = new TeacherLogin(driver);
		studentLogin = new StudentLogin(driver);
		javaQuiz = new JavaQuiz(driver);
		voucherCrudTest = new VoucherCrudTest(driver);
		
		login.enterUserName(username);
	
		login.enterPassword(password);
	}
	
	@When("clicks on login button")
	public void clicks_on_login_button() {
	   
		login.hitLoginButton();
	}
	
	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {
	    
		Thread.sleep(1000);
		login.isAppLoginDisplayed();
		Thread.sleep(2000);
		
		voucherCrudTest.setVoucher();
		Thread.sleep(2000);

		admindashboard.selectExams();
		admindashboard.logout();
		
	}
	
	@Then("user is navigated to the Teacher page")
	public void user_is_navigated_to_the_Teacher_page() throws InterruptedException {
	   	
		Thread.sleep(2000);	
		teacherLogin.selectExams();

	}
	

	@When("teacher enters valid {string} and {string}")
	public void teacher_enters_valid_and(String tusername, String tpassword) throws InterruptedException  {

		teacherLogin.enterUserName(tusername);

		teacherLogin.enterPassword(tpassword);
		teacherLogin.hitLoginButton();
		
		Thread.sleep(2000);
		teacherLogin.logout();
	}
	
	
	@Then("student is navigated to the student page")
	public void student_is_navigated_to_the_student_page() throws InterruptedException {
	    
		Thread.sleep(1000);
		studentLogin.hitTeacherTab();
		
	}
	
	@When("student enters valid {string} and {string}")
	public void student_enters_valid_and(String susername, String spassword) throws InterruptedException  {

		Thread.sleep(1000);
		
		studentLogin.enterUserName(susername);
		studentLogin.enterPassword(spassword);
		studentLogin.hitLoginButton();
	}
	
	
	@Then("student enter Voucher code and select exam")
	public void student_enter_Voucher_code_and_select_exam() throws InterruptedException {
	    
		Thread.sleep(1000);
		studentLogin.select_Exam();
		javaQuiz.answerJavaQuestion();
		Thread.sleep(1000);
		javaQuiz.hitLogout();
	}
	
	
	@Then("Close the browser")
	public void close_the_browser() {
	    driver.close();
	}
	
		
	}
