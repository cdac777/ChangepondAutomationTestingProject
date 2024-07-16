package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PalaceOrder {

	WebDriver driver ;
	
	By txt_username = By.id("email");
	By txt_password = By.id("password");
	By sign_in=By.xpath("//a[@class='btn btn-warning text-white']");
	By btn_login = By.xpath("//button[@type='submit']");
	By btn_logout = By.xpath("//a[@class='btn btn-danger']");
	By buy_now=By.xpath("//a[normalize-space()='BUY NOW']");
	By back_to_menu=By.xpath("//button[@class='back-button']");
	By back_to_home=By.xpath("//button[@class='home-button']");
	
	By burger=By.xpath("//button[normalize-space()='Burgger']");
	By biriyani=By.xpath("//button[normalize-space()='Biriyani']");
	By chatitem=By.xpath("//button[normalize-space()='chat Items']");
	By juice=By.xpath("//button[normalize-space()='JUICE']");
	By desert=By.xpath("//button[normalize-space()='Desserts']");
	
	By add_item=By.xpath("//a[normalize-space()='ADD ITEMS']");
	
	By item_mushroom=By.xpath("//div[@class='row']//div[1]//div[2]//a[1]");
	By item_burger=By.xpath("//div[@class='row']//div[1]//div[2]//a[1]");
	By item_biriyani=By.xpath("//div[@class='row']//div[1]//div[2]//a[1]");
	By item_chat_item=By.xpath("//div[@class='row']//div[1]//div[2]//a[1]");
	By item_juice=By.xpath("//div[@class='row']//div[1]//div[2]//a[1]");
	By item_desert=By.xpath("//div[@class='row']//div[1]//div[2]//a[1]");
	
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
	public void userclickonbacktomenu()throws InterruptedException {
		driver.findElement(back_to_menu).click();
	}

	public void userclickonburgerbutton() throws InterruptedException {
		// TODO Auto-generated method stub
		driver.findElement(burger).click();
	}
	
	public void userclickonburgeritem() throws InterruptedException {
		driver.findElement(item_burger).click();
		Thread.sleep(3000);
		driver.findElement(add_item).click();	
		Thread.sleep(3000);

		driver.findElement(biriyani).click();
		Thread.sleep(3000);
		driver.findElement(item_biriyani).click();
		Thread.sleep(3000);
		driver.findElement(add_item).click();	
		Thread.sleep(3000);
		
		driver.findElement(chatitem).click();
		Thread.sleep(3000);
		driver.findElement(item_chat_item).click();
		Thread.sleep(3000);
		driver.findElement(add_item).click();	
		Thread.sleep(3000);

		driver.findElement(juice).click();
		Thread.sleep(3000);
		driver.findElement(item_juice).click();
		Thread.sleep(3000);
		driver.findElement(add_item).click();	
		Thread.sleep(3000);
		
		driver.findElement(desert).click();
		Thread.sleep(3000);
		driver.findElement(item_desert).click();
		Thread.sleep(3000);
		driver.findElement(buy_now).click();	
		Thread.sleep(3000);
		driver.findElement(back_to_home).click();
		
	}
	public void hitLoginButton() throws InterruptedException {
		// TODO Auto-generated method stub
		driver.findElement(btn_login).click();
		Thread.sleep(3000);
		
	}
	
	
	public void isAppLoginDisplayed() {
		// TODO Auto-generated method stub
//		driver.findElement(btn_logout).isDisplayed();
	}	
}
