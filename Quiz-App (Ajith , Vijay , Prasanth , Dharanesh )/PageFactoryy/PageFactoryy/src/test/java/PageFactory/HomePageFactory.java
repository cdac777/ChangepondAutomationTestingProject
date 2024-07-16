package PageFactory;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class HomePageFactory {

	    WebDriver driver;

	    // Define web elements using @FindBy annotations
	    @FindBy(xpath = "//input[@id='voucher']")
	    WebElement voucherCodeInput;

	    @FindBy(xpath = "//div[@id='exam']")
	    WebElement examDropdown;
	    @FindBy(xpath = "//li[normalize-space()='Java']")
	    WebElement java;
	    @FindBy(xpath = "//button[@type='submit']")
	    WebElement submit;
        
	    
	    // Constructor to initialize WebDriver and elements
	    public HomePageFactory(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    // Method to enter voucher code
	    public void enterVoucherCode() {
	        voucherCodeInput.sendKeys("12345");
	    }

	    // Example method to interact with exam dropdown
	    public void selectExam() {
	        examDropdown.click(); // Click to open dropdown
	        java.click();
	        // Implement dropdown selection logic based on your application
	    }

	    // Example method to click start quiz button
	    public void clickLoginButton() {
	    	submit.click();
	        // Implement click action for start quiz button
	    }
	}


