package StepDefenition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import PageObjects.PalaceOrder;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.*;

public class ParameterizationStepDefinition {

    PalaceOrder login;
    static WebDriver driver;

    @Given("User is on the homepage")
    public void user_is_on_the_homepage() {
        driver = new FirefoxDriver();
        driver.get("http://localhost:3000");
    }

    @When("User clicks on the signin button")
    public void user_clicks_on_the_signin_button() {
        login = new PalaceOrder(driver);
        login.clickOnSignIn();
    }

    @When("User enters valid {string} and {string}")
    public void user_enters_valid_username_and_password(String username, String password) {
        login = new PalaceOrder(driver);
        login.enterUserName(username);
        login.enterPassword(password);
    }

    @When("User clicks on the login button")
    public void user_clicks_on_the_login_button() {
        login.hitLoginButton();
    }

    @When("User is navigated to the home page")
    public void user_is_navigated_to_the_home_page() throws InterruptedException {
        Thread.sleep(1000);
        login.isAppLoginDisplayed();
    }

    @When("User click on truffle mushroom on view cart")
    public void userclickonadditem() {
        login.isuserclickonadditem();
    }
    
    @When("User click on buy now")
    public void userclickonbuynow() throws InterruptedException {
        login.userclickonbuynow();
    }
    
    @Then("Close the browser")
    public void close_the_browser() {
        driver.close();
    }
}
