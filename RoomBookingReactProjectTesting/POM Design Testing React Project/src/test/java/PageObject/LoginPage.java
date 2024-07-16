package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	
	By txt_name = By.xpath("//div[@class='signup-form-container']//div[1]//input[1]");
	By txt_contact = By.xpath("//div[2]//input[1]");
	By txt_email= By.xpath("//input[@id='email']");
	By txt_username = By.xpath("//input[@id='username']");
	By txt_password = By.xpath("//input[@id='password']");
	By btn_Signup= By.xpath("//button[normalize-space()='Sign Up']");
	
	


	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterName(String name) {
		driver.findElement(txt_name).sendKeys(name);
	}
	
	public void enterContact(String contact) {
		driver.findElement(txt_contact).sendKeys(contact);
	}
	
	public void enterEmail(String email) {
		driver.findElement(txt_email).sendKeys(email);
	}
	
	
	public void enterUsername(String username) {
		driver.findElement(txt_username).sendKeys(username);
	}

	public void enterPassword(String password) {
		driver.findElement(txt_password).sendKeys(password);
	}

	public void hitLoginButton() {
		driver.findElement(btn_Signup).click();
	}

	public void UserLogin(String username, String password) {
		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(btn_Signup).click();
	}

	
}



