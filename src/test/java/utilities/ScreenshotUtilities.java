package utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ScreenshotUtilities implements ITestListener{
	
	WebDriver driver;
	
	public void onTestFailure(ITestResult result) 
	{
		ITestContext context = result.getTestContext();
		String meth_name = result.getName();
		driver = (WebDriver)context.getAttribute("WebDriver");
		Date currentdate = new Date();
		String ssname = currentdate.toString().replace(" ", "-").replace(":", "-");

		File screenshotfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try 
		{
			FileUtils.copyFile(screenshotfile, new File(".//test-output/screenshot/"+meth_name+" "+ssname+".png"));
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
				
	}
	
}
