package PageFactory;



import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;



public class Vintage_Car {

WebDriver driver;

	

	@FindBy(xpath = "//a[@href='/MainDashbord/delux']//button[@id='button-73']")

	WebElement Vintage_Car;

	

	public void vintagecar() {

		Vintage_Car.click();

	}

	

	public Vintage_Car(WebDriver driver) {

		

		this.driver = driver;

		PageFactory.initElements(driver,this);

	}

}

