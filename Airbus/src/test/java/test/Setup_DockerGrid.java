package test;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Setup_DockerGrid {

	@BeforeTest
	public void start() throws IOException, InterruptedException
	{
		Runtime.getRuntime().exec(new String[]{"cmd", "/k", "start", "Start_DockerGrid.bat"});
		Thread.sleep(60000);
	}
	
	@AfterTest
	public void stop() throws IOException, InterruptedException
	{
		Runtime.getRuntime().exec(new String[]{"cmd", "/k", "start", "Stop_DockerGrid.bat"});
		Thread.sleep(30000);
		
		Runtime.getRuntime().exec(new String[]{"taskkill", "/f", "/im", "cmd.exe"});
	}
}
