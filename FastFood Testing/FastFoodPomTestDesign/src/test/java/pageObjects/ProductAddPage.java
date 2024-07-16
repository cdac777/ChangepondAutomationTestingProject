package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductAddPage {

	WebDriver driver;
	By Food_Category_Name = By.name("foodName");
	By Food_Id = By.name("foodItems.0.id");
	By Food_Name = By.name("foodItems.0.fname");
	By Food_Description = By.name("foodItems.0.fdesc");
	By Food_Price = By.name("foodItems.0.price");
	By btn_Add_Data = By.xpath("//button[@type='submit']");

	public ProductAddPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterFoodCategoryname() {
		driver.findElement(Food_Category_Name).sendKeys("Ice cream");
	}

	public void enterFoodId() {
		driver.findElement(Food_Id).sendKeys("001");
	}

	public void enterFoodName() {
		driver.findElement(Food_Name).sendKeys("Butter scorch");
	}

	public void enterFoodDescription() {

		driver.findElement(Food_Description).sendKeys("this is very cool and soft");
	}

	public void enterFoodPrice() {

		driver.findElement(Food_Price).sendKeys("30");
	}

	public void hitAddProductButton() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(btn_Add_Data).click();
	}
	

}
