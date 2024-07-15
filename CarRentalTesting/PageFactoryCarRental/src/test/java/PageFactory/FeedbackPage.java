package PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class FeedbackPage {

WebDriver driver;

	

	@FindBy(xpath = "//button[normalize-space()='Feed Backs']")

	WebElement Feedback_page;

	

	public void FeedbackPage() {

		Feedback_page.click();

	}

	

	public FeedbackPage(WebDriver driver) {

		

		this.driver = driver;

		PageFactory.initElements(driver,this);

	}

}

