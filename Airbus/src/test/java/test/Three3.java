package test;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.Base1;

public class Three3 extends Base1{
	
	public WebDriver driver;
	
	@Test
	public void three() throws InterruptedException
	{
		driver.get("https://www.makemytrip.com/");
		
		SoftAssert SoftAssert = new SoftAssert();

		SoftAssert.assertEquals(driver.getTitle(), "MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday");
	}
	
	@BeforeMethod
	public void start() throws MalformedURLException
	{
		driver = initializeBrowser("edge");
	}
	
	@AfterMethod
	public void stop()
	{
		driver.quit();
	}
}
