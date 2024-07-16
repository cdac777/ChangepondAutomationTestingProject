package StepDefinition;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginSteps {

	private static WebDriver driver = null;

	@Given("User is on Main dashboard")
	public void user_is_on_maindashboard() {
	
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User is trying to login in");
		driver = new ChromeDriver();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		driver.get("http://172.17.7.111:3000");
		
	}
	
	@When("Clicks on login button")
	public void clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("And1");
	    driver.findElement(By.xpath("//button[normalize-space()='Rent a Car']")).click();
	}
	
		
	@When("User enters valid {string} and {string}")	
	public void user_enters_valid_and(String useremail, String userpassword) {
	
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("When");
	    driver.findElement(By.id("email")).sendKeys(useremail);
	    driver.findElement(By.id("password")).sendKeys(userpassword);
	}
	
	
	@When("Clicks on signIn button")
	public void clicks_on_signin_button() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("And1");
	    driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
	}
	
	
	@When("Clicks on add button")
	public void clicks_on_add_button() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("And1");
	    driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(8) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > button:nth-child(3)")).click();
	    driver.switchTo().alert().accept();
	    driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(8) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > button:nth-child(3)")).click();
	    driver.switchTo().alert().accept();  
	    
	}
	
	
	@When("Clicks on cart button")
	public void clicks_on_cart_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("And1");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@aria-label='cart']")).click();
	    
	    driver.findElement(By.xpath("//button[normalize-space()='Remove the item']")).click();
	    driver.findElement(By.xpath("//button[normalize-space()='Remove the item']")).click();
	}
	
	
	
	@When("User is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Then");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[normalize-space()='Logout']")).click();
	    driver.switchTo().alert().accept();
	  
	}
	
	@Then("Close the browser")
	public void close_the_browser() throws InterruptedException {
	
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("And2");
	    Thread.sleep(2000);
	    driver.close();
	}

}