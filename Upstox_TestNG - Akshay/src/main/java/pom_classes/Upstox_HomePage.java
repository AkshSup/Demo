package pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Upstox_HomePage {
	
	@FindBy (xpath = "//span[contains(text(),'akshay d.')]") private WebElement user;
	
	public Upstox_HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public  boolean Upstox_HomePageVerifyUser()
	{
		boolean status;

		try
		{
			status = user.isDisplayed();
		}
		catch(Throwable d)
		{
			status = false;
		}
		
		return status;
	}
}
