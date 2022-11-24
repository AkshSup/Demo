package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class UtilityClass {

	
	@DataProvider(name="upstoxlogindata")
	public Object[][] getdata() throws Exception
	{
		FileInputStream path = new FileInputStream("C:\\Users\\Supriya Raut\\eclipse-workspace\\Upstox_TestNG\\src\\test\\resources\\Upstox.xlsx");
		
		Sheet sheet = WorkbookFactory.create(path).getSheet("upstox");
		
		int rows = sheet.getPhysicalNumberOfRows();
		int cells = sheet.getRow(0).getLastCellNum();
		
		Object[][] data = new Object[rows-1][cells];
		
		for(int i=0; i<rows-1; i++)
		{
			for(int j=0; j<cells; j++)
			{
				DataFormatter df = new DataFormatter();
				
				data[i][j] = df.formatCellValue(sheet.getRow(i+1).getCell(j));
			}
		}
		
		return data;
	}
	
	public static void capturescreenshot(WebDriver driver, String filename) throws IOException
	{
		File random = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File target = new File("C:\\Users\\Supriya Raut\\eclipse-workspace\\Upstox_TestNG\\screenshots\\"+filename+".png");
		FileHandler.copy(random, target);
	}
}
