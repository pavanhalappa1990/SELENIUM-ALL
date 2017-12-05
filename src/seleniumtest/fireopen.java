package seleniumtest;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fireopen 
{
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\pavan-stuffs\\Qspid-learn\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");//launch a URL
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//String title = driver.getTitle();
		//String url = driver.getCurrentUrl();
		//System.out.println("current URL is" +url);
		//System.out.println("title of the page is " +title);
		/*Thread.sleep(3000);
		driver.navigate().to("https://www.gmail.com");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		//driver.navigate().refresh();		//refresh a webpage
		
		//driver.navigate().to("https://www.gmail.com");*/
		//Thread.sleep(3000);
		
		
		//WebElement element1 = driver.findElement(By.tagName("input"));
		//System.out.println(element1);
		
		List element1 = driver.findElements(By.tagName("input"));
		int total = element1.size();
		System.out.println("number of input tags is"+ total );
		driver.quit();
	
	}
	
}
