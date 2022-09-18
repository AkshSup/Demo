package com.ibm.SC_Bank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_Test {

	@Test
	public void m1() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@name=\"username\"]")).sendKeys("Admin");

		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@type=\"password\"]")).sendKeys("admin123");

		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();

		Thread.sleep(3000);

		Assert.assertEquals("OrangeHRM", driver.getTitle());

		Thread.sleep(3000);

		driver.close();
	}
}
