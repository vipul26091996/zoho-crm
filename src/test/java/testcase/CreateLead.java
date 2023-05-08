package testcase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseSetup;

public class CreateLead extends LoginTest {
	
	FileReader createleadfr_loc;
	FileReader createleadfr_data;
	Properties createleadprop_loc = new Properties();
	Properties createleadprop_data = new Properties();
	
	public void fileSetup() throws Exception 
	{
		  createleadfr_loc = new FileReader(System.getProperty("user.dir")+"/src/test/resources/locators/createlead_loc.properties");
		  createleadfr_data = new FileReader(System.getProperty("user.dir")+"/src/test/resources/testdata/createlead_data.properties");
		  createleadprop_loc.load(createleadfr_loc);
		  createleadprop_data.load(createleadfr_data);
	}
	
	
	public String navigatetoCreateLeadsPage() throws Exception
	{
		fileSetup();
		driver.findElement(By.xpath(createleadprop_loc.getProperty("lead_link"))).click();
		driver.findElement(By.xpath(createleadprop_loc.getProperty("createlead_button"))).click();
		String verify = driver.findElement(By.xpath(createleadprop_loc.getProperty("label"))).getText();
		return verify;
	}

	
	public boolean cancelButtonisEnabled() throws Exception
	{
		boolean verify = driver.findElement(By.xpath(createleadprop_loc.getProperty("cancel_btn"))).isEnabled();
		return verify;
	}
	
	
	public boolean saveandnewButtonisEnabled() throws Exception
	{
		boolean verify = driver.findElement(By.xpath(createleadprop_loc.getProperty("saveandnew_btn"))).isEnabled();
		return verify;
	}
	

	public boolean saveButtonisEnabled() throws Exception
	{
		boolean verify = driver.findElement(By.xpath(createleadprop_loc.getProperty("save_btn"))).isEnabled();
		return verify;
	}
	

	public void fillFields() throws InterruptedException
	{
		
		driver.findElement(By.xpath(createleadprop_loc.getProperty("compname_txtbox"))).sendKeys(createleadprop_data.getProperty("company_name"));
		driver.findElement(By.xpath(createleadprop_loc.getProperty("firstname_txtbox"))).sendKeys(createleadprop_data.getProperty("firstname"));
		driver.findElement(By.xpath(createleadprop_loc.getProperty("salutation_dropdown"))).click();
		driver.findElement(By.xpath(createleadprop_loc.getProperty("mr_salutation"))).click();
		driver.findElement(By.xpath(createleadprop_loc.getProperty("lastname_txtbox"))).sendKeys(createleadprop_data.getProperty("lastname"));
		driver.findElement(By.xpath(createleadprop_loc.getProperty("title_txtbox"))).sendKeys(createleadprop_data.getProperty("title"));
		driver.findElement(By.xpath(createleadprop_loc.getProperty("email_txtbox"))).sendKeys(createleadprop_data.getProperty("email"));
		driver.findElement(By.xpath(createleadprop_loc.getProperty("mobile_txtbox"))).sendKeys(createleadprop_data.getProperty("mobile"));
		driver.findElement(By.xpath(createleadprop_loc.getProperty("website_txtbox"))).sendKeys(createleadprop_data.getProperty("website"));
		driver.findElement(By.xpath(createleadprop_loc.getProperty("leadsource_dropdown"))).click();
		driver.findElement(By.xpath(createleadprop_loc.getProperty("lead_source"))).click();
		driver.findElement(By.xpath(createleadprop_loc.getProperty("leadstatus_dropdown"))).click();
		driver.findElement(By.xpath(createleadprop_loc.getProperty("lead_status"))).click();
		driver.findElement(By.xpath(createleadprop_loc.getProperty("industry_dropdown"))).click();
		driver.findElement(By.xpath(createleadprop_loc.getProperty("industry"))).click();
		driver.findElement(By.xpath(createleadprop_loc.getProperty("noofEmp_txtbox"))).sendKeys(createleadprop_data.getProperty("noofEmp"));
		driver.findElement(By.xpath(createleadprop_loc.getProperty("annualrevenue_txtbox"))).sendKeys(createleadprop_data.getProperty("annualrevenue"));
		driver.findElement(By.xpath(createleadprop_loc.getProperty("rating_dropdown"))).click();
		driver.findElement(By.xpath(createleadprop_loc.getProperty("rating"))).click();
		WebElement description_txtbox = driver.findElement(By.xpath(createleadprop_loc.getProperty("description_txtbox")));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()",description_txtbox );
		driver.findElement(By.xpath(createleadprop_loc.getProperty("skypeid_txtbox"))).sendKeys(createleadprop_data.getProperty("skypeid"));
		driver.findElement(By.xpath(createleadprop_loc.getProperty("street_txtbox"))).sendKeys(createleadprop_data.getProperty("street"));
		driver.findElement(By.xpath(createleadprop_loc.getProperty("city_txtbox"))).sendKeys(createleadprop_data.getProperty("city"));
		driver.findElement(By.xpath(createleadprop_loc.getProperty("state_txtbox"))).sendKeys(createleadprop_data.getProperty("state"));
		driver.findElement(By.xpath(createleadprop_loc.getProperty("zipcode_txtbox"))).sendKeys(createleadprop_data.getProperty("zipcode"));
		driver.findElement(By.xpath(createleadprop_loc.getProperty("country_txtbox"))).sendKeys(createleadprop_data.getProperty("country"));
		description_txtbox.sendKeys(createleadprop_data.getProperty("description"));
		Thread.sleep(10000);
	}

	public void clickSaveButton()
	{
		driver.findElement(By.xpath(createleadprop_loc.getProperty("save_btn"))).click();
	}
	
	public boolean verifyNewLead()
	{
		String company_name = driver.findElement(By.id(createleadprop_loc.getProperty("companyname_id"))).getText();
		boolean verify = createleadprop_data.getProperty("company_name").equals(company_name);
		return verify;			

	}
	
}
