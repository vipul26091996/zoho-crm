package testfile;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import testcase.CreateLead;
import testcase.LoginTest;

@Listeners(utilities.ScreenshotUtilities.class)
public class CreateLeadTestFile extends CreateLead {
	
	CreateLead cl = new CreateLead();
	SoftAssert softassert = new SoftAssert();
	LoginTest logintest = new LoginTest();
	
	
	@Test
	public void verifyCreateLeadFunctionality() throws Exception
	{
		logintest.login();
		String verify = cl.navigatetoCreateLeadsPage();
		softassert.assertEquals(verify, "Create Lead", "Navigation Unsuccessful");
		boolean cancebtn_isEnable = cl.cancelButtonisEnabled();
		softassert.assertEquals(cancebtn_isEnable, true, "Cancel Button is Disabled");
		boolean saveandnewbtn_isEnable = cl.saveandnewButtonisEnabled();
		softassert.assertEquals(saveandnewbtn_isEnable, true ,"Save and New button is Disabled");
		boolean savebtn_isEnable = cl.saveButtonisEnabled();
		softassert.assertEquals(savebtn_isEnable, true, "Save button is Disabled");
		cl.fillFields();
		cl.clickSaveButton();
		boolean newlead = cl.verifyNewLead();
		softassert.assertEquals(newlead, true, "New Lead is not generated");
		softassert.assertAll();
		logintest.logOut();
	}
	
	
	/*
	@Test
	public void checkcancelButtonEnable() throws Exception
	{
		login.loginTest();
		cl.navigatetoCreateLeadsPage();
		boolean isEnable = cl.cancelButtonisEnabled();
		softassert.assertEquals(isEnable, false, "Cancel Button is Enabled");
		softassert.assertAll();
		
	}
	
	@Test
	public void checkSaveandNewButtonEnable() throws Exception
	{
	
		boolean isEnable = cl.saveandnewButtonisEnabled();
		softassert.assertEquals(isEnable, false ,"Save and New button is Disabled");
	}
	
	@Test
	public void checkSaveButtonEnable() throws Exception
	{

		boolean isEnable = cl.saveButtonisEnabled();
		softassert.assertEquals(isEnable, true, "Save button is Disabled");
	}
	
	@Test
	public void fillingFields() throws Exception
	{
		login.loginTest();
		cl.navigatetoCreateLeadsPage();
		cl.fillFields();
	}
	*/
}
