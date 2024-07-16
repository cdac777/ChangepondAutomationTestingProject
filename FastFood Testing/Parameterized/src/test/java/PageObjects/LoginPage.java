package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;
    
    By txt_username = By.id("email");
    By txt_password = By.id("password");
    By btn_login = By.xpath("//button[@type='submit']");
    By btn_logout = By.xpath("//a[@class='btn btn-danger']");
    
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUserName(String username) {
        driver.findElement(txt_username).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(txt_password).sendKeys(password);
    }

    public void hitLoginButton() {
        driver.findElement(btn_login).click();
    }

    public boolean isAppLoginDisplayed() {
        return driver.findElement(btn_logout).isDisplayed();
    }

    public void UserLogin(String username, String password) {
        enterUserName(username);
        enterPassword(password);
        hitLoginButton();
    }
}
