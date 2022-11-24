package test;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.Base1;

public class One1 extends Base1 {

	public WebDriver driver;
	
	@Test
	public void one() throws InterruptedException
	{
		driver.get("https://www.amazon.in/");
				
		SoftAssert SoftAssert = new SoftAssert();
		
		SoftAssert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	}
	
	@BeforeMethod
	public void start() throws MalformedURLException
	{
		driver = initializeBrowser("chrome");
	}
	
	@AfterMethod
	public void stop()
	{
		driver.quit();
	}
}
