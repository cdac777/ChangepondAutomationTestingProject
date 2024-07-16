package PageFactory;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class AdminLogin {

	    WebDriver driver;
	    
	    @FindBy(xpath = "//input[@id='email']")
	    WebElement txt_username;
	    
	    @FindBy(xpath = "//input[@id='password']")
	    WebElement txt_password;
	    
	    @FindBy(xpath = "//button[@type='submit']")
	    WebElement btn_login;
	    
//	    @FindBy(xpath = "//h1[normalize-space()='Welcome Admin']")
//	    WebElement lbl_logo;
	  
	    @FindBy(xpath = "//button[normalize-space()='Logout']")
	    WebElement btn_logout;
	    
	  
	    
	    public AdminLogin(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    public void enterUserName(String username) {
	        txt_username.sendKeys(username);
	    }

	    public void enterPassword(String password) {
	        txt_password.sendKeys(password);
	    }

	    public void hitLoginButton() throws InterruptedException {
	        btn_login.click();
	        Thread.sleep(1000);
	    }

//	    public boolean isAppLoginDisplayed() {
//        return lbl_logo.isDisplayed();
//        }
        
	    public void isAppLogout() throws InterruptedException {
	    	 btn_logout.click();
	    	 Thread.sleep(1000);
	    	 driver.switchTo().alert().accept();
	        }
	    
	    
	    
	    public void UserLogin(String name, String password) throws InterruptedException {
	        txt_username.sendKeys(name);
	        txt_password.sendKeys(password);
	        btn_login.click();
	        Thread.sleep(3000);
	        btn_logout.click();
	        driver.switchTo().alert().accept();
	        Thread.sleep(2000);
	    }
	}

