package PageFactory;



import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;



public class HomePageFactory {

WebDriver driver;

	

	@FindBy(xpath = "//a[contains(text(),'Luxurious Car')]")

	WebElement car_luxurious;

	

	public void luxuriousCar() {

		car_luxurious.click();

	}

	

	public HomePageFactory(WebDriver driver) {

		

		this.driver = driver;

		PageFactory.initElements(driver,this);

	}

}

