package PageObjects;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class VoucherCrudTest {

    By select_voucher = By.xpath("//span[normalize-space()='Vouchers']");
    By add_btn = By.xpath("//a[@class='btn btn-primary mb-2']");
    By ent_voucher = By.xpath("//input[@name='voucher_number']");
    By submit = By.xpath("//button[@type='submit']");
//    By delete = By.xpath("//tbody/tr[4]/td[3]/button[1]//*[name()='svg']//*[name()='path' and contains(@d,'M6 19c0 1.')]");

    private WebDriver driver;
    private WebDriverWait wait;

    public VoucherCrudTest(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));  // Initialize WebDriverWait
    }

    public void setVoucher() {
        driver.findElement(select_voucher).click();
        driver.findElement(add_btn).click();
        driver.findElement(ent_voucher).sendKeys("123456");
        driver.findElement(submit).click();

        // Wait for alert to be present and then accept it
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.accept();

//        driver.findElement(delete).click();
//
//        // Wait for alert to be present and then accept it
//        wait.until(ExpectedConditions.alertIsPresent());
//        alert = driver.switchTo().alert();
//        alert.accept();
    }
}
