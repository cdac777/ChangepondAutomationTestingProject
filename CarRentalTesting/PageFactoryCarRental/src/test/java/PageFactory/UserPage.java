package PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class UserPage {

WebDriver driver;

	

	@FindBy(xpath = "//button[normalize-space()='users Details']")
 
	WebElement User_page;

	

	public void UserPage() {

		User_page.click();

	}

	

	public UserPage(WebDriver driver) {

		

		this.driver = driver;

		PageFactory.initElements(driver,this);

	}

}

