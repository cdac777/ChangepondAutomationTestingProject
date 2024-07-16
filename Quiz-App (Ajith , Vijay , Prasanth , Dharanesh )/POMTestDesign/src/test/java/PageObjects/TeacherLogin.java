package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TeacherLogin {

	WebDriver driver ;
	
	
	By teacher_tab = By.xpath("//a[normalize-space()='Teacher Login']");
	
	By txt_username = By.xpath("//input[@id='email']");
	By txt_password = By.xpath("//input[@id='password']");
	By btn_login = By.xpath("//button[@type='submit']");

	
	By exm_table = By.xpath("//span[normalize-space()='Exam Table']");
	
	By select_python = By.xpath("//tbody/tr[2]/td[3]/input[1]");
	By select_React = By.xpath("//tbody/tr[3]/td[3]/input[1]");
	
	By logout = By.xpath("//button[normalize-space()='Logout']");

	
	
	
	public TeacherLogin(WebDriver driver) {
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



	public void selectExams() throws InterruptedException {
	
		Thread.sleep(2000);

		driver.findElement(teacher_tab).click();
		

		
		
		
	}





	public void logout() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(exm_table).click();

		Thread.sleep(2000);
		driver.findElement(select_python).click();
		driver.findElement(select_React).click();
		
		driver.findElement(logout).click();
		driver.switchTo().alert().accept();
	}
	
}
