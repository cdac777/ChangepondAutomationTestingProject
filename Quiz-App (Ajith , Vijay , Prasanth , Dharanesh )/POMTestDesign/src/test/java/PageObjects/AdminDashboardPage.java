package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminDashboardPage {

	WebDriver driver ;
	
	
	By exm_Tables = By.xpath("//span[normalize-space()='Exam Table']");
	By select_java = By.xpath("//tbody/tr[1]/td[3]/input[1]");
	By select_python = By.xpath("//tbody/tr[2]/td[3]/input[1]");
	By select_React = By.xpath("//tbody/tr[3]/td[3]/input[1]");
	By logout = By.xpath("//button[normalize-space()='Logout']");

	
	
	
	public AdminDashboardPage(WebDriver driver) {
		this.driver = driver;
	}





	public void selectExams() throws InterruptedException {
		driver.findElement(exm_Tables).click();
		Thread.sleep(2000);
		driver.findElement(select_java).click();
		driver.findElement(select_python).click();
		driver.findElement(select_React).click();
		
		
	}





	public void logout() {
		
		driver.findElement(logout).click();
		driver.switchTo().alert().accept();
	}
	
	
}
