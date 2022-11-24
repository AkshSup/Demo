package pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Upstox_LoginPage {

	@FindBy (xpath = "//input[@id='userCode']") private WebElement userid;
	@FindBy (xpath = "//input[@id='password']") private WebElement password;
	@FindBy (xpath = "//div[contains(text(),'Sign into Upstox')]") private WebElement signinbutton;
	@FindBy (xpath = "//div[contains(text(),'Incorrect User ID or Password')]") private WebElement errormsg;
	
	public Upstox_LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void Upstox_LoginPageenteruserid(String useridtext)
	{
		userid.sendKeys(useridtext);
	}
	
	public void Upstox_LoginPageenterpassword(String passwordtext)
	{
		password.sendKeys(passwordtext);
	}
	
	public void Upstox_LoginPageClickonSiginbutton()
	{
		signinbutton.click();
	}
	
	public boolean Upstox_LoginPageInvalidIDorPass()
	{
		boolean msg;
		
		try
		{
			msg = errormsg.isDisplayed();
		}
		catch(Throwable e)
		{
			msg = false;
		}
		
		return msg;
	}
}
