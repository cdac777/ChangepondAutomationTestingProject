package PageFactory;

import org.openqa.selenium.WebDriver;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class JavaQuiz {

	    WebDriver driver;

	    @FindBy(xpath = "//input[@value='Framework']")
	    WebElement q1;

	    @FindBy(xpath = "//span[normalize-space()='Microsoft']")
	    WebElement q2;

	    @FindBy(xpath = "//span[normalize-space()='.java']")
	    WebElement q3;

	    @FindBy(xpath = "//span[normalize-space()='Object-oriented']")
	    WebElement q4;

	    @FindBy(xpath = "//span[normalize-space()='8-bit']")
	    WebElement q5;

	    @FindBy(xpath = "//span[normalize-space()='main']")
	    WebElement q6;

	    @FindBy(xpath = "//span[normalize-space()='ArrayList']")
	    WebElement q7;

	    @FindBy(xpath = "//span[normalize-space()='extends']")
	    WebElement q8;

	    @FindBy(xpath = "//span[normalize-space()='0']")
	    WebElement q9;

	    @FindBy(xpath = "//span[normalize-space()='internal']")
	    WebElement q10;

	    @FindBy(xpath = "//button[normalize-space()='Next']")
	    WebElement nextButton;

	    @FindBy(xpath = "//button[normalize-space()='Submit']")
	    WebElement submitButton;

	    // Constructor to initialize WebDriver and elements
	    public JavaQuiz(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    // Method to answer Java quiz questions
	    public void answerJavaQuestion() throws InterruptedException {
	        q1.click();
	        nextButton.click();
	        q2.click();
	        nextButton.click();
	        q3.click();
	        nextButton.click();
	        q4.click();
	        nextButton.click();
	        q5.click();
	        nextButton.click();
	        q6.click();
	        nextButton.click();
	        q7.click();
	        nextButton.click();
	        q8.click();
	        nextButton.click();
	        q9.click();
	        nextButton.click();
	        q10.click();
	        submitButton.click();

	        Thread.sleep(1000);
	        driver.switchTo().alert().accept();
	    }
	}

