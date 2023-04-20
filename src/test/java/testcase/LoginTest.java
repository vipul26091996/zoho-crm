package testcase;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseSetup;
import utilities.LoginUtilities;

public class LoginTest extends BaseSetup {

	FileReader fr_loc;
	FileReader fr_data;
	Properties prop_loc = new Properties();
	Properties prop_data = new Properties();

	@Test
	public void login() throws IOException, InterruptedException {
		System.out.println("login 1 start");
		fr_loc = new FileReader(System.getProperty("user.dir") + "/src/test/resources/locators/login_loc.properties");
		fr_data = new FileReader(System.getProperty("user.dir") + "/src/test/resources/testdata/login_data.properties");
		prop_loc.load(fr_loc);
		prop_data.load(fr_data);
		driver.get(prop.getProperty("zoho_url"));
		driver.findElement(By.xpath(prop_loc.getProperty("signin_link"))).click();
		driver.findElement(By.xpath(prop_loc.getProperty("loginid_txtbox")))
				.sendKeys(prop_data.getProperty("login_id"));
		driver.findElement(By.xpath(prop_loc.getProperty("next_btn"))).click();
		driver.findElement(By.xpath(prop_loc.getProperty("pwd_txtbox"))).sendKeys(prop_data.getProperty("password"));
		driver.findElement(By.xpath(prop_loc.getProperty("signin_btn"))).click();
		Thread.sleep(5000);
		String exp_title = "Zoho Home";
		String act_title = driver.getTitle();
		System.out.println(act_title);
		if(act_title.equals(exp_title))
		{
			System.out.println("Login Successful");
		}
		System.out.println("login 1 end");

	}
	

	@Test(dataProvider="testdata")
	public void loginwithDataProvider(String username,String password) throws IOException, InterruptedException
	{
		System.out.println("login with data provider start");
		fr_loc = new FileReader(System.getProperty("user.dir") + "/src/test/resources/locators/login_loc.properties");
		prop_loc.load(fr_loc);

		driver.get(prop.getProperty("zoho_url"));
		driver.findElement(By.xpath(prop_loc.getProperty("signin_link"))).click();
		driver.findElement(By.xpath(prop_loc.getProperty("loginid_txtbox")))
				.sendKeys(username);
		driver.findElement(By.xpath(prop_loc.getProperty("next_btn"))).click();
		driver.findElement(By.xpath(prop_loc.getProperty("pwd_txtbox"))).sendKeys(password);
		driver.findElement(By.xpath(prop_loc.getProperty("signin_btn"))).click();
		Thread.sleep(5000);
		String exp_title = "Zoho Home";
		String act_title = driver.getTitle();
		if(act_title.equals(exp_title))
		{
			System.out.println("Login Successful under data provider");
		}
		System.out.println("login with data provider end");
	}
	
	@DataProvider(name="testdata")
	public Object[][] tdata()
	{
		return new Object[][] {
			{"vipulgola66@gmail.com","vipul123"},
			{"vipul@gmail.com","Vipul@123"},
			{"vipul@gmail.com","vipul123"},
			{"vipulgola66@gmail.com","Vipul@123"}
			};
	}
	
	@Test(dataProviderClass = LoginUtilities.class,dataProvider = "excel login data")
	public void loginwithExcel(String username,String password) throws IOException, InterruptedException
	{
		System.out.println("login with excel sheet start");
		fr_loc = new FileReader(System.getProperty("user.dir") + "/src/test/resources/locators/login_loc.properties");
		prop_loc.load(fr_loc);

		driver.get(prop.getProperty("zoho_url"));
		driver.findElement(By.xpath(prop_loc.getProperty("signin_link"))).click();
		driver.findElement(By.xpath(prop_loc.getProperty("loginid_txtbox")))
				.sendKeys(username);
		driver.findElement(By.xpath(prop_loc.getProperty("next_btn"))).click();
		driver.findElement(By.xpath(prop_loc.getProperty("pwd_txtbox"))).sendKeys(password);
		driver.findElement(By.xpath(prop_loc.getProperty("signin_btn"))).click();
		Thread.sleep(5000);
		String exp_title = "Zoho Home";
		String act_title = driver.getTitle();
		if(act_title.equals(exp_title))
		{
			System.out.println("Login Successful through excel sheet");
		}
		System.out.println("login with excel sheet end");
	}

}
