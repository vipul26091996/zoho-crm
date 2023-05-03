package testcase;


import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.BaseSetup;
import utilities.LoginUtilities;

public class LoginTest extends BaseSetup {

	FileReader loginfr_loc;
	FileReader loginfr_data;
	Properties loginprop_loc = new Properties();
	Properties loginprop_data = new Properties();
	BaseSetup basesetup = new BaseSetup();
	
	public String login() throws Exception  {
		
		WebDriverWait expwait = new WebDriverWait(driver, Duration.ofSeconds(20));
		PageFactory.initElements(driver, this);
		System.out.println("login 1 start");
		loginfr_loc = new FileReader(System.getProperty("user.dir") + "/src/test/resources/locators/login_loc.properties");
		loginfr_data = new FileReader(System.getProperty("user.dir") + "/src/test/resources/testdata/login_data.properties");
		loginprop_loc.load(loginfr_loc);
		loginprop_data.load(loginfr_data);
		driver.get(prop.getProperty("zoho_url"));
		driver.findElement(By.xpath(loginprop_loc.getProperty("signin_link"))).click();
	
		driver.findElement(By.xpath(loginprop_loc.getProperty("loginid_txtbox")))
				.sendKeys(loginprop_data.getProperty("login_id"));
		driver.findElement(By.xpath(loginprop_loc.getProperty("next_btn"))).click();
		Thread.sleep(5000);
		driver.navigate().refresh();
		expwait.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(By.xpath(loginprop_loc.getProperty("pwd_txtbox")))));
		driver.findElement(By.xpath(loginprop_loc.getProperty("pwd_txtbox"))).sendKeys(loginprop_data.getProperty("password"));
		driver.findElement(By.xpath(loginprop_loc.getProperty("signin_btn"))).click();
		driver.findElement(By.xpath(loginprop_loc.getProperty("crm_link"))).click();
		String act_title = driver.getTitle();
		System.out.println(act_title);
		driver.findElement(By.xpath(loginprop_loc.getProperty("header_avatar"))).click();
		driver.findElement(By.xpath(loginprop_loc.getProperty("access_zohocrm"))).click();
		
		System.out.println("login 1 end");
		return act_title;
		
	}
	

	//@Test(dataProvider="testdata")
	public void loginwithDataProvider(String username,String password) throws IOException, InterruptedException
	{
		System.out.println("login with data provider start");
		loginfr_loc = new FileReader(System.getProperty("user.dir") + "/src/test/resources/locators/login_loc.properties");
		loginprop_loc.load(loginfr_loc);

		driver.get(prop.getProperty("zoho_url"));
		driver.findElement(By.xpath(loginprop_loc.getProperty("signin_link"))).click();
		driver.findElement(By.xpath(loginprop_loc.getProperty("loginid_txtbox")))
				.sendKeys(username);
		driver.findElement(By.xpath(loginprop_loc.getProperty("next_btn"))).click();
		driver.findElement(By.xpath(loginprop_loc.getProperty("pwd_txtbox"))).sendKeys(password);
		driver.findElement(By.xpath(loginprop_loc.getProperty("signin_btn"))).click();
		Thread.sleep(5000);
		String exp_title = "Zoho Home";
		String act_title = driver.getTitle();
		if(act_title.equals(exp_title))
		{
			System.out.println("Login Successful under data provider");
		}
		System.out.println("login with data provider end");
	}
	
	//@DataProvider(name="testdata")
	public Object[][] tdata()
	{
		return new Object[][] {
			{"vipulgola66@gmail.com","vipul123"},
			{"vipul@gmail.com","Vipul@123"},
			{"vipul@gmail.com","vipul123"},
			{"vipulgola66@gmail.com","Vipul@123"}
			};
	}
	
	//@Test(dataProviderClass = LoginUtilities.class,dataProvider = "excel login data")
	public void loginwithExcel(String username,String password) throws IOException, InterruptedException
	{
		System.out.println("login with excel sheet start");
		loginfr_loc = new FileReader(System.getProperty("user.dir") + "/src/test/resources/locators/login_loc.properties");
		loginprop_loc.load(loginfr_loc);

		driver.get(prop.getProperty("zoho_url"));
		driver.findElement(By.xpath(loginprop_loc.getProperty("signin_link"))).click();
		driver.findElement(By.xpath(loginprop_loc.getProperty("loginid_txtbox")))
				.sendKeys(username);
		driver.findElement(By.xpath(loginprop_loc.getProperty("next_btn"))).click();
		driver.findElement(By.xpath(loginprop_loc.getProperty("pwd_txtbox"))).sendKeys(password);
		driver.findElement(By.xpath(loginprop_loc.getProperty("signin_btn"))).click();
		Thread.sleep(5000);
		String exp_title = "Zoho Home";
		String act_title = driver.getTitle();
		if(act_title.equals(exp_title))
		{
			System.out.println("Login Successful through excel sheet");
		}
		System.out.println("login with excel sheet end");
	}
	
	
	public void logOut()
	{
		driver.findElement(By.id(loginprop_loc.getProperty("profile_id"))).click();
		driver.findElement(By.xpath(loginprop_loc.getProperty("signout_btn"))).click();
		System.out.println("LogOut Successful");
		
	}
	

}
