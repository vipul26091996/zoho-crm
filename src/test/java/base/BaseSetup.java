package base;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseSetup {
	
	public static WebDriver driver;
	public static FileReader fr;
	public static Properties prop= new Properties();
	
	@BeforeMethod
	public void setup() throws IOException
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
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Base Setup Successful");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		System.out.println("Tear Down Successful");
	}

}
