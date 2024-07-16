package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddPage {

    WebDriver driver;

    By addPageButton = By.xpath("//a[@class='btn btn mb-2 button-33']");
    By carName = By.name("carname");
    By carPrice = By.name("price");
    By carRank = By.name("carrank");
    By carModel = By.name("carmodel");
    By drivingType = By.name("drivingtype");
    By carType = By.name("type");
    By carImage = By.name("carimage");
    By carStatus = By.name("status");
    By submitButton = By.xpath("//button[@type='submit']");

    public AddPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAddPageButton() {
        driver.findElement(addPageButton).click();
    }

    public void enterCarName(String name) {
        driver.findElement(carName).sendKeys(name);
    }

    public void enterCarPrice(int price) {
        driver.findElement(carPrice).sendKeys(String.valueOf(price));
    }

    public void enterCarRank(String rank) {
        driver.findElement(carRank).sendKeys(rank);
    }

    public void enterCarModel(String model) {
        driver.findElement(carModel).sendKeys(model);
    }

    public void selectDrivingType(String type) {
        driver.findElement(drivingType).sendKeys(type);
    }

    public void selectCarType(String type) {
        driver.findElement(carType).sendKeys(type);
    }

    public void enterCarImageLink(String url) {
        driver.findElement(carImage).sendKeys(url);
    }

    public void selectCarStatus(String status) {
        driver.findElement(carStatus).sendKeys(status);
    }

    public void clickSubmitButton() {
        WebElement element = driver.findElement(submitButton);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();
    }
}
