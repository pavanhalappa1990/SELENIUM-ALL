package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BcssSelector {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\pavan-stuffs\\Qspid-learn\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		/*driver.get("https://addons.mozilla.org/en-US/firefox/addon/firepath/?src=ss");
		driver.manage().window().maximize();
		Thread.sleep(5000);// TODO Auto-generated method stub
		WebElement element = driver.findElement(By.cssSelector("#search-q"));
		System.out.println("css selector is "+element);*/
		
		//driver.get("https://www.google.com");
		driver.get("https://accounts.google.com/SignUp?service=mail&continue=https://mail.google.com/mail/?pc=topnav-about-en");
		driver.manage().window().maximize();
		Thread.sleep(5000);// TODO Auto-generated method stub
		//WebElement element = driver.findElement(By.cssSelector(".gsfi"));
		//WebElement element = driver.findElement(By.xpath("//input"));
		//System.out.println("css selector is "+element1);
		WebElement  element2 = driver.findElement(By.xpath("//input[@name='PasswdAgain']"));
		System.out.println("css selector is "+element2);
		driver.quit();
	}

}
