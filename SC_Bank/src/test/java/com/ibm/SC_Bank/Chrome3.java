package com.ibm.SC_Bank;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Chrome3 {
	
	@Test
	public void m3() throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities dc=DesiredCapabilities.chrome();
		
		URL url=new URL("http://localhost:4444/wd/hub");
		
		RemoteWebDriver driver=new RemoteWebDriver(url, dc);
		
		driver.manage().window().maximize();
		
		Thread.sleep(6000);
		
		driver.get("https://www.facebook.com/");

		Thread.sleep(6000);

		System.out.println(driver.getTitle());

		Thread.sleep(6000);

		driver.quit();
	}

}
