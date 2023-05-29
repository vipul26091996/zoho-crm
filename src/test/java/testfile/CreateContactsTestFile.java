package testfile;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import testcase.CreateContacts;
import testcase.LoginTest;

@Listeners(utilities.ScreenshotUtilities.class)
public class CreateContactsTestFile extends CreateContacts {

	CreateContacts cc = new CreateContacts();
	SoftAssert sfassert = new SoftAssert();
	LoginTest logintest = new LoginTest();
	
	@Test
	public void verifyCreateContactFunctionality() throws Exception
	{
		logintest.login();
		String verify = cc.navigateToCreateContactPage();
		sfassert.assertEquals("Create Contact", verify, "It is not navigate to the create contact page");
		boolean cancelbtn_isEnable = cc.cancelButtonisEnabled();
		sfassert.assertEquals(true, cancelbtn_isEnable,"Cancel button is disabled");
		boolean savebtn_isEnable = cc.saveButtonisEnabled();
		sfassert.assertEquals(true, savebtn_isEnable,"Save button is disabled");
		boolean saveorcancelbtn_isEnable = cc.saveorcancelButtonisEnabled();
		sfassert.assertEquals(true, saveorcancelbtn_isEnable,"Save & Cancel button is disabled");
		cc.fillDetails();
		cc.clickSaveButton();
		boolean newcontact = cc.verifyNewContact();
		sfassert.assertEquals(true, newcontact,"New Contact is not created");
		sfassert.assertAll();
		logintest.logOut();
	}
	
}
