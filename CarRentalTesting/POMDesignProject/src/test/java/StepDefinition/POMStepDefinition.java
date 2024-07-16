package StepDefinition;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.LoginPage;

public class POMStepDefinition {

    static WebDriver driver;
    LoginPage sportscar;
    LoginPage supercar;
    LoginPage vincar;
    LoginPage login;
    LoginPage rentacar;
    LoginPage cartIcon;

    @Given("User is on Home Page")
    public void user_is_on_home_page() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://172.17.7.111:3000");
    }

    @When("clicks on rent a car button")
    public void clicks_on_rent_a_car_button() {
        rentacar = new LoginPage(driver);
        handleAlertIfPresent(); // Handle any alert before clicking
        rentacar.hitRentACar();
        handleAlertIfPresent(); // Handle any alert after clicking
    }

    @When("User enters valid {string} and {string}")
    public void user_enters_valid_and(String email, String password) {
        login = new LoginPage(driver);
        handleAlertIfPresent(); // Handle any alert before entering credentials
        login.enterUsername(email);
        login.enterPassword(password);
        handleAlertIfPresent(); // Handle any alert after entering credentials
    }

    @When("clicks on login button")
    public void clicks_on_login_button() {
        handleAlertIfPresent(); // Handle any alert before clicking login
        login.hitLoginButton();
        handleAlertIfPresent(); // Handle any alert after clicking login
    }

    @When("User is navigated to the SportsCar")
    public void user_is_navigated_to_the_sportscar() throws InterruptedException {
        Thread.sleep(2000);
        sportscar = new LoginPage(driver);
        sportscar.hitsportscar();
        sportscar.addsportscar();
        handleAlertIfPresent(); // Handle any alert after adding sports car
       
    }


    @When("User is navigated to Vintage Car")
    public void user_is_navigated_to_vintage_car() throws InterruptedException {
        Thread.sleep(2000);
        vincar = new LoginPage(driver);
        vincar.hitsvincar();
        handleAlertIfPresent(); // Handle any alert after navigating to vintage car
    }

    @When("User is navigated to SuperDelux Car")
    public void user_is_navigated_to_superdelux_car() throws InterruptedException {
        Thread.sleep(2000);
        supercar = new LoginPage(driver);
        supercar.hitssupercar();
        Thread.sleep(2000);
        supercar.hitLogoutButton();
        handleAlertIfPresent(); // Handle any alert after navigating to superdelux car
    }

    @Then("Close the Browser")
    public void close_the_browser() {
        driver.close();
    }

    private void handleAlertIfPresent() {
        try {
            Alert alert = driver.switchTo().alert();
            alert.accept(); // Change to alert.dismiss() if you want to dismiss the alert
        } catch (NoAlertPresentException e) {
            // No alert to handle
        }
    }
}
