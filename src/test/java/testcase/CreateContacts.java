package testcase;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CreateContacts extends LoginTest {

	FileReader createcontactfr_loc;
	FileReader createcontactfr_data;
	Properties createcontactprop_loc = new Properties();
	Properties createcontactprop_data = new Properties();
	Select select;
	
	public void fileSetup() throws IOException
	{
		createcontactfr_loc = new FileReader(System.getProperty("user.dir")+"/src/test/resources/locators/createcontacts_loc.properties");
		createcontactfr_data = new FileReader(System.getProperty("user.dir")+"/src/test/resources/testdata/createcontacts_data.properties");
		createcontactprop_loc.load(createcontactfr_loc);
		createcontactprop_data.load(createcontactfr_data);
	}
	
	public String navigateToCreateContactPage() throws IOException
	{
		fileSetup();
		driver.findElement(By.xpath(createcontactprop_loc.getProperty("contacts_link"))).click();
		driver.findElement(By.xpath(createcontactprop_loc.getProperty("createcontact_button"))).click();
		String verify = driver.findElement(By.xpath(createcontactprop_loc.getProperty("label"))).getText();
		return verify;
	}
	
	public boolean saveButtonisEnabled()
	{
		boolean verify = driver.findElement(By.xpath(createcontactprop_loc.getProperty("save_btn"))).isEnabled();
		return verify;
	}
	
	public boolean saveorcancelButtonisEnabled()
	{
		boolean verify = driver.findElement(By.xpath(createcontactprop_loc.getProperty("saveandnew_btn"))).isEnabled();
		return verify;
	}
	
	public boolean cancelButtonisEnabled()
	{
		boolean verify = driver.findElement(By.xpath(createcontactprop_loc.getProperty("cancel_btn"))).isEnabled();
		return verify;
	}
	
	public void fillDetails()
	{
		
		//WebElement leadsourceDropdown = driver.findElement(By.xpath(createcontactprop_loc.getProperty("leadsource_dropdown")));
		//leadsourceDropdown.click();
		//select = new Select(leadsourceDropdown);
		driver.findElement(By.xpath(createcontactprop_loc.getProperty("leadsource_dropdown"))).click();
		driver.findElement(By.xpath(createcontactprop_data.getProperty("leadsource"))).click();
		driver.findElement(By.xpath(createcontactprop_loc.getProperty("salutation_dropdown"))).click();
		driver.findElement(By.xpath(createcontactprop_data.getProperty("salutation"))).click();
		driver.findElement(By.xpath(createcontactprop_loc.getProperty("firtname_txtbox"))).sendKeys(createcontactprop_data.getProperty("firstname"));
		driver.findElement(By.xpath(createcontactprop_loc.getProperty("lastname_txtbox"))).sendKeys(createcontactprop_data.getProperty("lastname"));
		driver.findElement(By.xpath(createcontactprop_loc.getProperty("accountname_dropdown"))).click();
		driver.findElement(By.xpath(createcontactprop_data.getProperty("accountname"))).click();
		driver.findElement(By.xpath(createcontactprop_loc.getProperty("title_txtbox"))).sendKeys(createcontactprop_data.getProperty("title"));
		driver.findElement(By.xpath(createcontactprop_loc.getProperty("email_txtbox"))).sendKeys(createcontactprop_data.getProperty("email"));
		driver.findElement(By.xpath(createcontactprop_loc.getProperty("department_txtbox"))).sendKeys(createcontactprop_data.getProperty("department"));
		driver.findElement(By.xpath(createcontactprop_loc.getProperty("phone_txtbox"))).sendKeys(createcontactprop_data.getProperty("phone"));
		driver.findElement(By.xpath(createcontactprop_loc.getProperty("homephone_txtbox"))).sendKeys(createcontactprop_data.getProperty("homephone"));
		driver.findElement(By.xpath(createcontactprop_loc.getProperty("otherphone_txtbox"))).sendKeys(createcontactprop_data.getProperty("otherphone"));
		driver.findElement(By.xpath(createcontactprop_loc.getProperty("fax_txtbox"))).sendKeys(createcontactprop_data.getProperty("fax"));
		driver.findElement(By.xpath(createcontactprop_loc.getProperty("mobile_txtbox"))).sendKeys(createcontactprop_data.getProperty("mobile"));
		driver.findElement(By.xpath(createcontactprop_loc.getProperty("dob_txtbox"))).sendKeys(createcontactprop_data.getProperty("dob"));
		driver.findElement(By.xpath(createcontactprop_loc.getProperty("dobyear_ddown"))).click();
		driver.findElement(By.xpath(createcontactprop_data.getProperty("dobyear"))).click();
		driver.findElement(By.xpath(createcontactprop_loc.getProperty("dobmonth_ddown"))).click();
		driver.findElement(By.xpath(createcontactprop_data.getProperty("dobmonth"))).click();
		driver.findElement(By.xpath(createcontactprop_data.getProperty("dobdate"))).click();
		
		driver.findElement(By.xpath(createcontactprop_loc.getProperty("assistant_txtbox"))).sendKeys(createcontactprop_data.getProperty("assistant"));
		driver.findElement(By.xpath(createcontactprop_loc.getProperty("asstphone_txtbox"))).sendKeys(createcontactprop_data.getProperty("asstphone"));
		WebElement description_txtbox = driver.findElement(By.xpath(createcontactprop_loc.getProperty("description_txtbox")));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()",description_txtbox );
		driver.findElement(By.xpath(createcontactprop_loc.getProperty("skypeid_txtbox"))).sendKeys(createcontactprop_data.getProperty("skypeid"));
		driver.findElement(By.xpath(createcontactprop_loc.getProperty("secondaryemail_txtbox"))).sendKeys(createcontactprop_data.getProperty("sec_email"));
		driver.findElement(By.xpath(createcontactprop_loc.getProperty("twitter_txtbox"))).sendKeys(createcontactprop_data.getProperty("twitter"));
		driver.findElement(By.xpath(createcontactprop_loc.getProperty("reportingto_txtbox"))).click();
		driver.findElement(By.xpath(createcontactprop_data.getProperty("reportingto"))).click();
		driver.findElement(By.xpath(createcontactprop_loc.getProperty("copyaddress_button"))).click();
		driver.findElement(By.xpath(createcontactprop_data.getProperty("mailingtoother"))).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		By desc_box = By.xpath(createcontactprop_loc.getProperty("description_txtbox"));
		PageFactory.initElements(driver, CreateContacts.class);
		wait.until(ExpectedConditions.presenceOfElementLocated(desc_box));
		driver.findElement(desc_box).sendKeys(createcontactprop_data.getProperty("description"));
		
	}
	
	public void clickSaveButton()
	{
		driver.findElement(By.xpath(createcontactprop_loc.getProperty("save_btn"))).click();
		//driver.findElement(By.xpath("//*[@id='Lyte_Calendar_Day_763']")).click();
		System.out.println("Clicked on Save Button");
	}
	
	public boolean verifyNewContact()
	{
		System.out.println("verify New COntact method starts");
		String contactName = driver.findElement(By.xpath(createcontactprop_loc.getProperty("contact_name"))).getText();
		String name = createcontactprop_data.getProperty("mrsalutation")+" "+createcontactprop_data.getProperty("firstname")+" "+createcontactprop_data.getProperty("lastname");
		boolean verify = contactName.equals(name);
		System.out.println("contact name = "+contactName+" name = "+name);
		return verify;
	}
}

