package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Siginpage {

	WebDriver driver;
	By txt_username = By.id("email");
	By txt_password = By.id("password");
	By btn_sigin = By.xpath("//button[@type='submit']");
	By btn_signin = By.xpath("//a[normalize-space()='Signin']");
	By btn_about_as = By.xpath("//a[normalize-space()='About Us']");
	By btn_logout = By.xpath("//a[@class='btn btn-danger']");
	By btn_AddProductButton = By.xpath("//a[normalize-space()='Add Product']");
			
		public Siginpage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterUsername(String username) {
		driver.findElement(txt_username).sendKeys(username);
	}

	public void enterPassword(String password) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(txt_password).sendKeys(password);
	}

	public void hitLoginButton() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(btn_sigin).click();
	}

	public void hitSignbutton() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(btn_signin).click();
	}
	public void hitAboutaspage() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(btn_about_as).click();
	}

	public void hitAddProductbutton() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(btn_AddProductButton).click();
	}

	public void hitLogoutbutton() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(btn_logout).click();
	}

	public void UserLogin(String username, String password) {
		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(btn_sigin).click();

	}

}
