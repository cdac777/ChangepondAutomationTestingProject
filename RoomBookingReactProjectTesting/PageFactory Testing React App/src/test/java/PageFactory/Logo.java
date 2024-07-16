package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.cucumber.java.en.Then;

public class Logo {
	
	
	  	WebDriver driver;
		public Logo(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}


	
	
	public void logoCheck() {
		
		System.out.println("Logo_visiblility_passed");
			
		Assert.assertTrue(driver.findElements(By.xpath("//a[normalize-space()='SNKM ROOMS']")).size()>0,"Checking Title");
		
	}
	
}
