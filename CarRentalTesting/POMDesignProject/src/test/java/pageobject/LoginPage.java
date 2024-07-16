package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	By txt_email  = By.id("email");

	By txt_password = By.id("password");

	By lbl_logo = By.id("company-name");

	By btn_login= By.xpath("//button[normalize-space()='Sign In']");

	By btn_rentacar= By.xpath("//button[normalize-space()='Rent a Car']");

	By btn_logout = By.xpath("//button[normalize-space()='Logout']");

	By btn_sportscar= By.xpath("//a[@href='/MainDashbord/Sports']//button[@id='button-73']");

	By btn_vincar= By.xpath("//a[contains(text(),'Vintage Car')]");

	By btn_supercar= By.xpath("//a[contains(text(),'superlux car')]");
	
	By btn_addsportscar=By.xpath(" //div[@class='row']//div[1]//div[1]//div[1]//button[1]");  
	
	
	
	
	By btn_remove=By.xpath("//div[@class='row']//div[1]//div[1]//div[1]//button[1]");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
	}
	

	public void hitLoginButton() {

		driver.findElement(btn_login).click();

	}

	

	public void enterUsername(String email) {

		driver.findElement( txt_email).sendKeys( email);

	}

	

	

	

	public void enterPassword(String password) {

		driver.findElement(txt_password).sendKeys(password);

	}

	

	public void UserLogin(String email,String password) {

		driver.findElement( txt_email).sendKeys( email);

		driver.findElement(txt_password).sendKeys(password);

		driver.findElement(btn_login).click();

		

		

	}

	

	public void hitRentACar() {

		driver.findElement(btn_rentacar).click();

	}

	

	public void hitsvincar() {

		driver.findElement(btn_vincar).click();

	}
	
	public void hitsportscar() {

		driver.findElement(btn_sportscar).click();

	}


	

	
	public void hitssupercar() {

		driver.findElement(btn_supercar).click();

	}

	
	
	public void addsportscar() {

		driver.findElement(btn_addsportscar).click();

	}
	
	

	



	public void isApplogoDisplayed() {

		driver.findElement(lbl_logo).isDisplayed();

	}
	public void remove() {
		driver.findElement(btn_remove).click();
	}

	
	public void hitLogoutButton() {
		
		driver.findElement(btn_logout).click();
		
	}
}
