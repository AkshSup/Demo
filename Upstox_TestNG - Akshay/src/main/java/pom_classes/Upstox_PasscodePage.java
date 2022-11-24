package pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class Upstox_PasscodePage {

	@FindBy (xpath = "//*[@id=\"yob\" and @name=\"yob\"]") private WebElement passcode;
	@FindBy (xpath = "//*[text() = \"Year of Birth doesn't match, please try again\"]") private WebElement errorpin;

	
	public Upstox_PasscodePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void Upstox_PasscodePageenterpascode(String passcodetext)
	{
		passcode.sendKeys(passcodetext);
	}
	
	public boolean Upstox_PasscodePageerrorpin()
	{
		boolean wrongpin;
		
		try
		{
			wrongpin = errorpin.isDisplayed();
		}
		catch(Throwable a)
		{
			wrongpin = false;
		}
		
		return wrongpin;
	}
}
