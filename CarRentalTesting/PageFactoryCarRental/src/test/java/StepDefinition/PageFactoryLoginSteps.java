package StepDefinition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import PageFactory.HomePageFactory;
import PageFactory.LoginpageFactory;
import PageFactory.Sports_Car;
import PageFactory.Superlux_Car;
import PageFactory.User_Info;
import PageFactory.Vintage_Car;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class PageFactoryLoginSteps {
	static WebDriver driver;

	LoginpageFactory login;

	HomePageFactory home;
	Sports_Car sports;
	Superlux_Car superlux;
	User_Info user; 
	Vintage_Car vintage;
		
	@Given("User is on Dashboard pages")
	public void user_is_on_dashboard_pages() {
	    // Write code here that turns the phrase above into concrete actions
		 driver=new FirefoxDriver();
		    driver.get("http://172.17.7.111:3000/");
		    driver.findElement(By.xpath("//button[normalize-space()='Rent a Car']")).click();
	}

	@When("User enters valid {string} and {string}")
	public void user_enters_valid_and(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
		login = new LoginpageFactory(driver);
		  
		login.enterUsername(username);
		 
		login.enterPassword(password);
	}
	
	@When("clicks on login button")
	public void clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		 login.clickLoginButton();
	}

	@Then("user is navigated to the Luxurious car page")
	public void user_is_navigated_to_the_luxurious_car_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		home = new HomePageFactory(driver);

		home.luxuriousCar();
		Thread.sleep(1000);
	}

	@Then("user is navigated to the sports car page")
	public void user_is_navigated_to_the_sports_car_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		sports = new Sports_Car(driver);

		sports.SportsCar();
		Thread.sleep(1000);
	}
	
	@Then("user is navigated to the vintage car page")
	public void user_is_navigated_to_the_vintage_car_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		vintage = new Vintage_Car(driver);
	    vintage.vintagecar();
	    Thread.sleep(1000);
	}

	@Then("user is navigated to the superlux car page")
	public void user_is_navigated_to_the_superlux_car_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		superlux = new Superlux_Car(driver);
	    superlux.SuperCar();
	    Thread.sleep(1000);
	}

	@Then("user is navigated to the userinfo car page")
	public void user_is_navigated_to_the_userinfo_car_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		user = new User_Info(driver);
	    user.User();
	    login.hitlogoutButton();
	    Thread.sleep(1000);
	    driver.switchTo().alert().accept(); 
	}

	@Then("Close the browser")
	public void close_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
		driver.close();

	}
}

