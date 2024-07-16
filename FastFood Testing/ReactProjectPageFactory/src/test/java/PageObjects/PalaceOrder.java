package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PalaceOrder {

	WebDriver driver ;
	
	By txt_username = By.id("email");
	By txt_password = By.id("password");
	By sign_in=By.xpath("//a[@class='btn btn-warning text-white']");
	By btn_login = By.xpath("//button[@type='submit']");
	By btn_logout = By.xpath("//a[@class='btn btn-danger']");
	By item_mushroom=By.xpath("//div[@class='row']//div[1]//div[2]//a[1]");
	By buy_now=By.xpath("//a[normalize-space()='BUY NOW']");
	
	public PalaceOrder(WebDriver driver) {
		this.driver = driver;
	}



	public void enterUserName(String username) {
	
		driver.findElement(txt_username).sendKeys(username);
		
	}
	
	public void clickOnSignIn() {
		driver.findElement(sign_in).click();
	}

	public void enterPassword(String password) {
		// TODO Auto-generated method stub
		driver.findElement(txt_password).sendKeys(password);
	}
	public void isuserclickonadditem() {
		driver.findElement(item_mushroom).click();		
	}
	
	public void userclickonbuynow() throws InterruptedException {
		driver.findElement(buy_now).click();
	}


	public void hitLoginButton() {
		// TODO Auto-generated method stub
		driver.findElement(btn_login).click();
	}


	public void isAppLoginDisplayed() {
		// TODO Auto-generated method stub
//		driver.findElement(btn_logout).isDisplayed();
	}	
}
