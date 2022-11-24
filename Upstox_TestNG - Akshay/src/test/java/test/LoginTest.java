package test;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import base.Base;
import pom_classes.Upstox_HomePage;
import pom_classes.Upstox_LoginPage;
import pom_classes.Upstox_PasscodePage;
import pom_classes.Upstxo_WelcomePage;
import util.UtilityClass;

public class LoginTest extends Base{
	
	int testcaseID;
	
	@Test(dataProvider="upstoxlogindata", dataProviderClass = UtilityClass.class)
	public void verifyuser(String BrowserName, String UserID, String Password, String passcode) throws Exception
	{	
		testcaseID=101;
		driver = openbrowser(BrowserName);
		
		Upstox_LoginPage page1 = new Upstox_LoginPage(driver);
		page1.Upstox_LoginPageenteruserid(UserID);
		page1.Upstox_LoginPageenterpassword(Password);
		page1.Upstox_LoginPageClickonSiginbutton();
		page1.Upstox_LoginPageInvalidIDorPass();
		
		Upstox_PasscodePage page2 = new Upstox_PasscodePage(driver);
		page2.Upstox_PasscodePageenterpascode(passcode);
		page2.Upstox_PasscodePageerrorpin();
		
		Upstxo_WelcomePage page3 = new Upstxo_WelcomePage(driver);
		page3.Upstxo_WelcomePageClickonWelcome();
		
		Upstox_HomePage page4 = new Upstox_HomePage(driver);
		page4.Upstox_HomePageVerifyUser();
	}
	
	@AfterMethod
	public void capturefailedscreenshots(ITestResult result) throws IOException
	{
		if(result.getStatus()==result.FAILURE)
		{
			UtilityClass.capturescreenshot(driver, result.getMethod().getMethodName()+"_"+testcaseID);
		}
	}
	
	@AfterTest
	public void tearDown() throws Exception 
	{
		if(driver!=null)
		{	
			driver.quit();
		}
	}
}
