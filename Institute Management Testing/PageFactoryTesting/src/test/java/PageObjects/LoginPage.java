package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	By txt_username=By.id("user-name");
	By txt_password=By.id("password");
	By btn_login=By.id("login-button");
	By lbl_logo=By.xpath("//img[@alt='Institute Logo']");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void isAppLogoDisplay() {
		driver.findElement(lbl_logo).isDisplayed();
	}
	
}
