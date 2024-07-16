package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver ;
	
	By txt_username = By.xpath("//input[@id='email']");
	By txt_password = By.xpath("//input[@id='password']");
	By btn_login = By.xpath("//button[@type='submit']");
	By lbl_logo = By.xpath("//h1[@class='MuiTypography-root MuiTypography-h6 MuiTypography-noWrap css-uh02xs-MuiTypography-root']");
	
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}



	public void enterUserName(String username) {
	
		driver.findElement(txt_username).sendKeys(username);
		
	}



	public void enterPassword(String password) {
		// TODO Auto-generated method stub
		driver.findElement(txt_password).sendKeys(password);
	}



	public void hitLoginButton() {
		// TODO Auto-generated method stub
		driver.findElement(btn_login).click();
	}



	public void isAppLoginDisplayed() {
		// TODO Auto-generated method stub
		driver.findElement(lbl_logo).isDisplayed();
	}



	public void UserLogin(String name, String pasword) {
		driver.findElement(txt_username).sendKeys(name);
		driver.findElement(txt_password).sendKeys(pasword);
		driver.findElement(btn_login).click();
		
	}
	

}
