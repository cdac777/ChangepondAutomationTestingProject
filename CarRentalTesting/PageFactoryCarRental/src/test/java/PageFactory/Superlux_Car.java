package PageFactory;



import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;



public class Superlux_Car {

WebDriver driver;

	

	@FindBy(xpath = "//a[@href='/MainDashbord/superlux']//button[@id='button-73']")

	WebElement Superlux_Car;

	

	public void SuperCar() {

		Superlux_Car.click();

	}

	

	public Superlux_Car(WebDriver driver) {

		

		this.driver = driver;

		PageFactory.initElements(driver,this);

	}

}

