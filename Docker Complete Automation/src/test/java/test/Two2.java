package test;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.Base1;

public class Two2 extends Base1 {

	public WebDriver driver;

	@Test
	public void two() throws InterruptedException
	{
		driver.get("https://www.facebook.com/");
		
		SoftAssert SoftAssert = new SoftAssert();

		SoftAssert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
	}

	@BeforeMethod
	public void start() throws MalformedURLException {
		driver = initializeBrowser("firefox");
	}

	@AfterMethod
	public void stop() {
		driver.quit();
	}
}
