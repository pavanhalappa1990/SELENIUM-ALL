package TESTNGpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testusingAssertions 
{
	@Test
	public void assertmethod()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\pavan-stuffs\\Qspid-learn\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		String actTitle = driver.getTitle();
		String expTitle = "Googe";
		String nullTitle = null;
		/*
 		Assert.assertEquals(actTitle,expTitle);
		Assert.assertNotEquals(actTitle,expTitle); 
		Assert.assertNull(nullTitle);*/
		Assert.assertNotNull(expTitle);
		
		
		driver.quit();
	}
	
}
