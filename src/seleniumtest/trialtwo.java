package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class trialtwo {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\pavan-stuffs\\Qspid-learn\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.ksrtc.in/oprs-web/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//------------------------------------------------------
		
		//now identifying a web element by ID:
		//WebElement element=driver.findElement(By.id("fromPlaceName"));
		//System.out.println(element);
		WebElement element1=driver.findElement(By.name("txtJourneyDate"));
		System.out.println(element1);
		
		Thread.sleep(5000);
		driver.quit();

	}

}
