package testfile;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import testcase.ChangeTheme;
import testcase.LoginTest;

@Listeners(utilities.ScreenshotUtilities.class)
public class ChangeThemeTestFile extends ChangeTheme {
	
	LoginTest log = new LoginTest();
	ChangeTheme chgthm = new ChangeTheme();
	SoftAssert sfassert = new SoftAssert();
	
	@Test
	public void verifyChangeThemeFunctioanlity() throws Exception
	{
		log.login();
		chgthm.navigateToSetup();
		chgthm.gotoPersonalSettings();
		chgthm.gotoThemeSection();
		chgthm.changeTheme();
		boolean verify = chgthm.verifyTheme();
		sfassert.assertEquals(verify, true, "Theme is not changed");
		System.out.println("Verify value : "+verify);
		sfassert.assertAll();
		log.logOut();
	}
	

}
