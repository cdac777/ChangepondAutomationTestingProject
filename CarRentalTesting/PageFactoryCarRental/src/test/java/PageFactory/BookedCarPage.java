package PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class BookedCarPage {

WebDriver driver;

	

	@FindBy(xpath = "//button[normalize-space()='Booked Cars']")

	WebElement Book_page;

	

	public void BookPage() {

		Book_page.click();

	}

	

	public BookedCarPage(WebDriver driver) {

		

		this.driver = driver;

		PageFactory.initElements(driver,this);

	}

}

