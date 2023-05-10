package testcase;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ControlFind {
	
	@Test
	public void keyboardFunction() throws InterruptedException, AWTException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zoho.com/");
		Thread.sleep(5000);

		//WebElement source = driver.findElement(By.xpath("/html"));
		//action.keyDown(Keys.CONTROL).sendKeys("f").build().perform();
		//action.keyDown(Keys.CONTROL).sendKeys(String.valueOf('\u0066')).perform();
		//driver.findElement(By.xpath("//html[@lang='en']")).sendKeys(Keys.chord(Keys.CONTROL,"f"));
		
		//action.keyDown(Keys.CONTROL).sendKeys(String.valueOf('\u0066')).perform();
	
		//action.keyDown(Keys.SHIFT.F3).perform();
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.find()");
		//System.out.println("End");
		
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_F);
		
		
		robot.keyRelease(KeyEvent.VK_F);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(2000);
		StringSelection string_selection = new StringSelection("Featured");
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(string_selection, null);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);

		//source.sendKeys(Keys.chord(Keys.CONTROL,"f"));
		//action.keyDown(Keys.CONTROL).sendKeys("F").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(10000);
		//action.sendKeys("Featured");		Thread.sleep(20000);
		//driver.quit();
		
	}

	@Test
	public static void main() throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://extendsclass.com/text-compare.html");
		WebElement source = driver.findElement(By.xpath("//*[@id=\"dropZone\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[9]/pre/span"));
		
		Actions action = new Actions(driver);
		action.keyDown(source, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		Thread.sleep(4000);
		WebElement destination = driver.findElement(By.xpath("//*[@id=\"dropZone2\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[9]/pre/span"));
		action.keyDown(destination, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
		Thread.sleep(10000);
		
	}
	
	@Test
	public void array()
	{
		int no = 0;
		int no1 = 0;
		int[][][] arr = new int[2][3][4];
		
		arr[0][0][0] = 12;
		arr[0][0][1] = 2;
		arr[0][0][2] = 3;
		arr[0][0][3] = 4;
		arr[0][1][0] = 5;
		arr[0][1][1] = 6;
		arr[0][1][2] = 7;
		arr[0][1][3] = 8;
		arr[0][2][0] = 9;
		arr[0][2][1] = 10;
		arr[0][2][2] = 11;
		arr[0][2][3] = 12;
		arr[1][0][0] = 13;
		arr[1][0][1] = 14;
		arr[1][0][2] = 15;
		arr[1][0][3] = 16;
		arr[1][1][0] = 17;
		arr[1][1][1] = 18;
		arr[1][1][2] = 19;
		arr[1][1][3] = 20;
		arr[1][2][0] = 21;
		arr[1][2][1] = 22;
		arr[1][2][2] = 23;
		arr[1][2][3] = 24;
	
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println(arr[0][0].length);
		
		
		for (int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				for(int k=0;k<arr[i][j].length;k++)
				{
					System.out.println(arr[i][j][k]);
					if(arr[i][j][k]%2==0)
					{
						
						 no1 = no + arr[i][j][k];
						 no = no1;
					}
				}
			}
		}
		System.out.println("sum of even elements in an array is: "+no1);
		HashMap<String,String> hm1 = new HashMap<String,String>();
		hm1.put("qa", "http://www.qa.com/");
		hm1.put("uat", "http://www.uat.com/");
		hm1.put("preprod", "http://preprod.com/");
		hm1.put("prod", "http://prod/com/");
		System.out.println(hm1);
		
		Set s = hm1.keySet();
		
		for(String str:hm1.keySet())
		{
			System.err.println(str + hm1.get(str));
		}
		
		Iterator<String> itr= s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
