package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.NoAlertPresentException;
import PageFactory.AddPage;
import PageFactory.BookedCarPage;
import PageFactory.FeedbackPage;
import PageFactory.LoginpageFactory;
import PageFactory.UserPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.time.Duration;

public class AdminPageFactory {
    static WebDriver driver;
    LoginpageFactory login;
    AddPage add;
    UserPage user;
    BookedCarPage book;
    FeedbackPage feedback;
    
    @Given("User is on Dashboards page")
    public void user_is_on_dashboards_page() {
        driver = new FirefoxDriver();
        driver.get("http://172.17.7.111:3000/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement rentCarButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Rent a Car']")));
        rentCarButton.click();
    }

    @When("User enter valid {string} and {string}")
    public void user_enter_valid_and(String username, String password) {
        login = new LoginpageFactory(driver);
        login.enterUsername(username);
        login.enterPassword(password);
    }

    @When("clicks on Adminlogin button")
    public void clicks_on_adminlogin_button() {
        login.clickLoginButton();
    }

    @Then("user is navigated to the add page")
    public void user_is_navigated_to_the_add_page() {
        add = new AddPage(driver);
        add.clickAddPageButton();
        
        // Example interaction with the add page elements
        add.enterCarName("Toyota Camry");
        add.enterCarPrice(25000);
        add.enterCarRank("5");
        add.enterCarModel("2024");
        add.selectDrivingType("Automatic");
        add.selectCarType("Sports");
        add.enterCarImageLink("http://example.com/path/to/car_image.jpg");
        add.selectCarStatus("Booked");
        add.clickSubmitButton();

        // Handle alerts
        handleAlert();
        handleAlert();
    }

    @Then("user is navigated to the userdetail page")
    public void user_is_navigated_to_the_userdetail_page() {
        user = new UserPage(driver);
        user.UserPage();
    }

    @Then("user is navigated to the bookedcar page")
    public void user_is_navigated_to_the_bookedcar_page() {
        book = new BookedCarPage(driver);
        book.BookPage();
    }

    @Then("user is navigated to the feedback page")
    public void user_is_navigated_to_the_feedback_page() {
        feedback = new FeedbackPage(driver);
        feedback.FeedbackPage();
    }

    @Then("Close the firefox")
    public void close_the_firefox() {
        if (driver != null) {
            driver.quit();
        }
    }

    private void handleAlert() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            wait.until(ExpectedConditions.alertIsPresent());
            driver.switchTo().alert().accept();
        } catch (NoAlertPresentException e) {
            System.out.println("No alert present: " + e.getMessage());
        }
    }
}
