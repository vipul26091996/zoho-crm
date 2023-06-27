package base;

import java.io.FileReader;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseSetup {
	
	public static WebDriver driver;
	public static FileReader fr;
	public static Properties prop= new Properties();

	@BeforeSuite(alwaysRun = true)
	public void setup(ITestContext context) throws Exception
	{
	
		fr = new FileReader(System.getProperty("user.dir")+"/src/test/resources/configfiles/config.properties");
		prop.load(fr);
		
		if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();		
		}
		if(prop.getProperty("browser").equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.manage().window().setPosition(new Point(1000,0));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("ITestResult start"  +context);
		context.setAttribute("WebDriver", driver);
		System.out.println("Base Setup Successful");
	
	}
	
	
	@AfterSuite(alwaysRun = true)
	public void tearDown()
	{
		driver.quit();
		System.out.println("Tear Down Successful");
	}

}
