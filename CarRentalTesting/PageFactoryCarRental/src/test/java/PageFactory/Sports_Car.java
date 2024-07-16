package PageFactory;



import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;



public class Sports_Car {

WebDriver driver;

	

	@FindBy(xpath = "//a[contains(text(),'Sports Car')]")

	WebElement car_sports;

	

	public void SportsCar() {

		car_sports.click();

	}

	

	public Sports_Car(WebDriver driver) {

		

		this.driver = driver;

		PageFactory.initElements(driver,this);

	}

}

