package testcase;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

public class ChangeTheme extends LoginTest{
	
	FileReader changethemefr_loc;
	FileReader changethemefr_data;
	Properties changethemeprop_loc = new Properties();
	Properties changethemeprop_data = new Properties();
	
	public void fileSetup() throws IOException
	{
		changethemefr_loc = new FileReader(System.getProperty("user.dir")+"/src/test/resources/locators/changetheme_loc.properties");
		changethemefr_data = new FileReader(System.getProperty("user.dir")+"/src/test/resources/testdata/changetheme_data.properties");
		changethemeprop_loc.load(changethemefr_loc);
		changethemeprop_data.load(changethemefr_data);
		
	}
	public void navigateToSetup() throws IOException
	{
		fileSetup();
		driver.findElement(By.xpath(changethemeprop_loc.getProperty("setup_link"))).click();
	}
	
	public void gotoPersonalSettings()
	{
		driver.findElement(By.xpath(changethemeprop_loc.getProperty("personalsettings_link"))).click();
	}
	
	public void gotoThemeSection()
	{
		WebElement themesection = driver.findElement(By.xpath(changethemeprop_loc.getProperty("theme_section")));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", themesection);
	}
	
	public void changeTheme()
	{
		driver.findElement(By.xpath(changethemeprop_loc.getProperty("color_choose"))).click();
	}
	
	public boolean verifyTheme()
	{
		String selectedcolor = driver.findElement(By.xpath(changethemeprop_loc.getProperty("color_choose"))).getAttribute("color-choosen");
		String style = driver.findElement(By.xpath(changethemeprop_loc.getProperty("topbar_section"))).getAttribute("style");
		String css_value = driver.findElement(By.xpath(changethemeprop_loc.getProperty("topbar_section"))).getCssValue("background-color");
		System.out.println("style : "+style);
		System.out.println("CSS value : "+css_value);
		String hexcodeofselectedcolor = Color.fromString(css_value).asHex();
		System.out.println("hexcode of selected color : "+hexcodeofselectedcolor);
		System.out.println("Selected color : "+selectedcolor);
		boolean verify = selectedcolor.equals(hexcodeofselectedcolor);
		System.out.println("verify theme : "+verify);
		return verify;
		
	}
	
	public void close()
	{
		//Testing purpose
	}
	
}
