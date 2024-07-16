package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pageObjects.PalaceOrder;
import pageObjects.ContactUsPage;
import pageObjects.ProductAddPage;
import pageObjects.Siginpage;
import io.cucumber.java.en.*;

public class POMStepDefinition {

    PalaceOrder login;
    Siginpage sigin;
    Siginpage logout;
    Siginpage signin;
    ProductAddPage AddPage;
    ContactUsPage contactuspage;
    static WebDriver driver;

    @Given("User is on the homepage")
    public void user_is_on_the_homepage() {
        driver = new ChromeDriver();
        driver.get("http://172.17.7.130:3000");
    }

    @Then("User clicks on the signin button")
    public void user_clicks_on_the_signin_button() {
        login = new PalaceOrder(driver);
        sigin =new Siginpage(driver);
        login.clickOnSignIn();
    }

    @When("User enters valid {string} and {string}")
    public void user_enters_valid_username_and_password(String username, String password) {
        login = new PalaceOrder(driver);
        login.enterUserName(username);
        login.enterPassword(password);
    }

    @When("User clicks on the login button")
    public void user_clicks_on_the_login_button() throws InterruptedException {
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
        Thread.sleep(3000);
        login.userclickonbuynow();
        Thread.sleep(3000);
        login.userclickonbacktomenu();
        Thread.sleep(3000);
        login.userclickonburgerbutton();
        Thread.sleep(3000);
        login.userclickonburgeritem();
    }
    
    
    @When("About as Page")
    public void About_as_Page () throws InterruptedException {
        sigin.hitAboutaspage();
        Thread.sleep(3000);
        Assert.assertFalse(driver.findElements(By.xpath("//h2[contains(text(),'About Us')]")).isEmpty(), "user is navigated to Home page");
        driver.get("http://172.17.7.130:3000/MenuContainer");
    }

    @When("clicks on add product button")
    public void clicks_on_add_product_button() throws InterruptedException {
        sigin.hitAddProductbutton();
    }

    @When("Users add values on product add page")
    public void Users_add_values_on_product_add_page() throws InterruptedException {
        AddPage = new ProductAddPage(driver);
        AddPage.enterFoodCategoryname();
        AddPage.enterFoodId();
        AddPage.enterFoodName();
        AddPage.enterFoodDescription();
        AddPage.enterFoodPrice();
        AddPage.hitAddProductButton();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
    }
    
    @When("Users clicks on contact page")
    public void users_clicks_on_contact_page() throws InterruptedException {
        contactuspage = new ContactUsPage(driver);
        contactuspage.enterContactus();
        contactuspage.entersubject();
        contactuspage.enterName();
        contactuspage.enterEmail();
        contactuspage.enterphone();
        contactuspage.entermessage();
        contactuspage.hitSubmitbutton();
        driver.get("http://172.17.7.130:3000/MenuContainer");
    }

    @When("Logout page")
    public void logout_page() throws InterruptedException {
        Thread.sleep(3000);
        logout = new Siginpage(driver);
        logout.hitLogoutbutton();
        driver.switchTo().alert().accept();
    }

    @And("Close the browser")
    public void close_the_browser() {
        driver.close();
    }
}
