package PageFactory;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class TeacherLogin {

	    WebDriver driver;

	    @FindBy(xpath = "//a[normalize-space()='Teacher Login']")
	     WebElement teacherTab;

	    @FindBy(xpath = "//input[@id='email']")
	     WebElement txtUsername;

	    @FindBy(xpath = "//input[@id='password']")
	     WebElement txtPassword;

	    @FindBy(xpath = "//button[@type='submit']")
	     WebElement btnLogin;

	    @FindBy(xpath = "//span[normalize-space()='Exam Table']")
	     WebElement examTable;

	    @FindBy(xpath = "//tbody/tr[2]/td[3]/input[1]")
		public WebElement selectPython;

	    @FindBy(xpath = "//tbody/tr[3]/td[3]/input[1]")
		public WebElement selectReact;

	    @FindBy(xpath = " //button[normalize-space()='Logout']")
	     WebElement logout;
	 
	    @FindBy(xpath = "//button[normalize-space()='Logout']")
	    WebElement btn_logout;
	    
	    // Constructor
	    public TeacherLogin(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    // Method to enter username
	    public void enterUserName(String tusername) {
	        txtUsername.sendKeys(tusername);
	    }

	    // Method to enter password
	    public void enterPassword(String tpassword) {
	        txtPassword.sendKeys(tpassword);
	    }

	    // Method to click login button
	    public void hitLoginButton() {
	        btnLogin.click();
	    }

	    // Method to select exams
	    public void selectExams() throws InterruptedException {
	        Thread.sleep(2000);
	        teacherTab.click();
	       
	        Thread.sleep(2000);
	        examTable.click();

	        Thread.sleep(2000);
	        selectPython.click();
	        selectReact.click();
	        Thread.sleep(2000);
	    }

	    // Method to logout
	    public void logout() throws InterruptedException {
//	        Thread.sleep(2000);
//	        examTable.click();
//
//	        Thread.sleep(2000);
//	        selectPython.click();
//	        selectReact.click();
	    	Thread.sleep(3000);
	        logout.click();
	        Thread.sleep(1000);
	        driver.switchTo().alert().accept();
	       
	        
	    }
	}


