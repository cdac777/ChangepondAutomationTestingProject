package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ContactUsPage {
	
	WebDriver driver;
	By btn_Contactus = By.xpath("//a[normalize-space()='Contact']");
	By txt_subject = By.xpath("select[name='subject']");
	By txt_name = By.xpath("//input[@name='name']");
	By txt_email = By.xpath("//input[@name='email']");
	By txt_phone = By.xpath("//input[@name='phone']");
	By txt_message = By.xpath("(//textarea[@name='message'])");
	By btn_submit = By.xpath("//button[@type='submit']");

	public ContactUsPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterContactus() {
		driver.findElement(btn_Contactus).click();
	}
	
	public void entersubject() throws InterruptedException {
	    
		Thread.sleep(2000);
		WebElement dropdownToggle = driver.findElement(By.xpath("//select[@name='subject']"));
		dropdownToggle.click(); 

		WebElement option = driver.findElement(By.xpath("//select[@name='subject']")); 
		option.click(); 
	}
	
	public void enterName() {
		driver.findElement(txt_name).sendKeys("Vijay");
	}
	
	public void enterEmail() {
		driver.findElement(txt_email).sendKeys("Vijay@gmail.com");
	}
	
	public void enterphone() {
		driver.findElement(txt_phone).sendKeys("9529235476");
	}
	
	public void entermessage() {
		driver.findElement(txt_message).sendKeys("Fast food is very bad");
	
	}
	
	
	
	public void hitSubmitbutton() throws InterruptedException {
		Thread.sleep(1000);
		WebElement element = driver.findElement(By.xpath("//button[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(2000);
		driver.findElement(btn_submit).click();
	
	}
	
	
}
