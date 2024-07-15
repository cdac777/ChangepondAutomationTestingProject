package StepDefinition;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import PageObjects.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class POMStepDefinition {

	LoginPage login;
	static WebDriver driver;
	@Given("user is on Home page")
	public void user_is_on_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver=new FirefoxDriver();
		driver.get("http://localhost:3000/");
	    login=new LoginPage(driver);
	    login.isAppLogoDisplay();	}

	@Given("clicks on navigate login button")
	public void clicks_on_navigate_login_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		JavascriptExecutor js = (JavascriptExecutor) driver;
	     
	     // Scroll down to the bottom of the page
//	     js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//	     
	     // Alternatively, you can scroll to a specific element if needed
	WebElement LOGINBUTTON = driver.findElement(By.xpath("//a[normalize-space()='Login']"));
	      js.executeScript("arguments[0].scrollIntoView(true);", LOGINBUTTON);
		System.out.println("User is clicking on log in button");
		
		
		Thread.sleep(2000);
	    LOGINBUTTON.click();	
	    }
	
	@Then("Clicks the sign up button")
	public void clicks_the_sign_up_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//a[normalize-space()='Student Register Here']")).click();
		}
	@Given("User is on sign Up page")
	public void user_is_on_sign_up_page() {
	    // Write code here that turns the phrase above into concrete actions
		login=new LoginPage(driver);
	       login.isAppLogoDisplay();	
	       }

	
	

	@When("User enters valid {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string}")
		    public void user_enters_valid_and_and_and_and_and_and_and_and(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9) throws InterruptedException {
		        JavascriptExecutor js = (JavascriptExecutor) driver;

		        // Fill in the form fields
		        driver.findElement(By.id("rn")).sendKeys(string);
		        Thread.sleep(500); // Pause for 0.5 seconds

		        driver.findElement(By.id("fn")).sendKeys(string2);
		        Thread.sleep(500); // Pause for 0.5 seconds

		        driver.findElement(By.id("dep")).sendKeys(string3);
		        Thread.sleep(500); // Pause for 0.5 seconds

		        driver.findElement(By.id("cn")).sendKeys(string4);
		        Thread.sleep(500); // Pause for 0.5 seconds

		        driver.findElement(By.id("em")).sendKeys(string5);
		        Thread.sleep(500); // Pause for 0.5 seconds

		        driver.findElement(By.id("gen")).click();
			    String clicking = "//li[normalize-space()='"+string6+"']";
			    
			    Thread.sleep(1000);
			    driver.findElement(By.xpath(clicking)).click();

			    driver.findElement(By.id("em")).sendKeys(string7);
		        Thread.sleep(500);

		        driver.findElement(By.id("add")).sendKeys(string8);
		        Thread.sleep(500); // Pause for 0.5 seconds

		        driver.findElement(By.id("pass")).sendKeys(string9);
		        Thread.sleep(500); // Pause for 0.5 seconds

		        // Scroll and click submit button
		        WebElement subbutton = driver.findElement(By.xpath("//button[normalize-space()='Register']"));
		        js.executeScript("arguments[0].scrollIntoView(true);", subbutton);
		        Thread.sleep(1000); // Pause for 1 second before clicking
		        subbutton.click();

		        // Handle alert
		        Thread.sleep(2000); // Pause for 2 seconds before handling alert
		        Alert alert = driver.switchTo().alert();
		        alert.accept();
		    }
		
	
	//button[normalize-space()='Register']

//	@When("clicks on Register button")
//	public void clicks_on_register_button() {
//	    // Write code here that turns the phrase above into concrete actions
//		driver.findElement(By.xpath("//button[normalize-space()='submit']")).click();	
//		}

	@Then("user is navigated to the login page")
	public void user_is_navigated_to_the_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	       login=new LoginPage(driver);
	       login.isAppLogoDisplay();
	}

	@And("close the browser")
	public void close_the_browser()  {
	    // Write code here that turns the phrase above into concrete actions
		driver.close();
	
	}
	
	

}
