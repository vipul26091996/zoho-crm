package testfile;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import testcase.LoginTest;

public class LoginTestFile extends LoginTest {
	
	LoginTest login = new LoginTest();
	
	@Test
	public void loginTest() throws Exception
	{
		SoftAssert softassert = new SoftAssert();
		String title = login.login();
		softassert.assertEquals(title, "Home Page - Zoho CRM", "Login Unsuccessful");
	}

}
