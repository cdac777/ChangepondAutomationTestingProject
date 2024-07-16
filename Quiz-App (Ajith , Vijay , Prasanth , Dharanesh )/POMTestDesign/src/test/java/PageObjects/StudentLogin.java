package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StudentLogin {

	
WebDriver driver ;
	
	
	By student_tab = By.xpath("//a[normalize-space()='Student Login']");
	
	By txt_username = By.xpath("//input[@id='email']");
	By txt_password = By.xpath("//input[@id='password']");
	By btn_login = By.xpath("//button[@type='submit']");
	
	By vochur_code = By.xpath("//input[@id='voucher']");
	
	By select_exm = By.xpath("//div[@id='exam']");
	By select_java = By.xpath("//li[normalize-space()='Java']");
	By start_quiz = By.xpath("//button[@type='submit']");


	public StudentLogin(WebDriver driver) {
		this.driver = driver;
	}

	public void hitTeacherTab() {
		driver.findElement(student_tab).click();
		
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
	
	public void select_Exam() throws InterruptedException {
		driver.findElement(vochur_code).sendKeys("12345");
		driver.findElement(select_exm).click();
		driver.findElement(select_java).click();
		Thread.sleep(1000);
		driver.findElement(start_quiz).click();
	}


}
