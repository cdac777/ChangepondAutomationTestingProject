package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class JavaQuiz {

	WebDriver driver ;

	
	By q1 = By.xpath("//input[@value='Framework']");
	
	By q2 = By.xpath("//span[normalize-space()='Microsoft']");
	By q3 = By.xpath("//span[normalize-space()='.java']");
	By q4 = By.xpath("//span[normalize-space()='Object-oriented']");
	
	By q5 = By.xpath("//span[normalize-space()='8-bit']");
	
	By q6 = By.xpath("//span[normalize-space()='main']");
	By q7 = By.xpath("//span[normalize-space()='ArrayList']");
	By q8 = By.xpath("//span[normalize-space()='extends']");
	By q9 = By.xpath("//span[normalize-space()='0']");
	By q10 = By.xpath("//span[normalize-space()='internal']");
	By q11 = By.xpath("//span[normalize-space()='NOTA']");

	By next = By.xpath("//button[normalize-space()='Next']");
	By submit = By.xpath("//button[normalize-space()='Submit']");

	By logout = By.xpath("//button[normalize-space()='Logout']");



	public JavaQuiz(WebDriver driver) {
		this.driver = driver;
	}
	
	public void answerJavaQuestion() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(q1).click();
		driver.findElement(next).click();
		driver.findElement(q2).click();
		driver.findElement(next).click();
		driver.findElement(q3).click();
		driver.findElement(next).click();
		driver.findElement(q4).click();
		driver.findElement(next).click();
		driver.findElement(q5).click();
		driver.findElement(next).click();
		driver.findElement(q6).click();
		driver.findElement(next).click();
		driver.findElement(q7).click();
		driver.findElement(next).click();
		driver.findElement(q8).click();
		driver.findElement(next).click();
		driver.findElement(q9).click();
		driver.findElement(next).click();
		driver.findElement(q10).click();
		driver.findElement(next).click();
		driver.findElement(q11).click();
		driver.findElement(submit).click();
		
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		
				
	}
	public void hitLogout() throws InterruptedException {
	    // Wait for the logout button to be visible
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    WebElement logoutButton = wait.until(ExpectedConditions.visibilityOfElementLocated(logout));

	    // Scroll to the logout button
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", logoutButton);

	    // Click the logout button using JavaScript
	    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", logoutButton);
	}


	
}
