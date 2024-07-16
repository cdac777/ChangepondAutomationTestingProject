package PageFactory;



import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;



public class Cars_Page {

WebDriver driver;

	

	@FindBy(xpath = "//a[contains(text(),'Luxurious Car')]")

	WebElement car_page;

	

	public void CarPage() {

		car_page.click();

	}

	

	public Cars_Page(WebDriver driver) {

		

		this.driver = driver;

		PageFactory.initElements(driver,this);

	}

}

