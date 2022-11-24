package pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Upstxo_WelcomePage {

	@FindBy (xpath = "(//*[@class=\"_2k4Zlk-e-Xvq7tMQ6fDfoP\"])[1]") private WebElement welcome;
	
	public Upstxo_WelcomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void Upstxo_WelcomePageClickonWelcome()
	{
		welcome.click();
	}
}
