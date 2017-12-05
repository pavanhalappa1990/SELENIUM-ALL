package TESTNGpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class verifyTitle
{
	@Test
	public void testTitle()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\pavan-stuffs\\Qspid-learn\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		String actTitle = driver.getTitle();
		String expTitle = "Google";
		if (actTitle.equals(expTitle))
		{
			System.out.println("pass with correct title");
		}
		else
		{
			System.out.println("fail");
		}
		driver.quit();
	}
	
}