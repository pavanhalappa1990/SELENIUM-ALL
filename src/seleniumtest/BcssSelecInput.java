package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BcssSelecInput {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\pavan-stuffs\\Qspid-learn\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/SignUp?service=mail&continue=https://mail.google.com/mail/?pc=topnav-about-en");
		driver.manage().window().maximize();
		//WebElement element = driver.findElement(By.cssSelector("#PasswdAgain"));
		WebElement element = driver.findElement(By.cssSelector("input[name='PasswdAgain']"));
		WebElement element1 = driver.findElement(By.cssSelector("#confirm-password-label>strong"));
		System.out.println(element1);
		driver.quit();

	}

}
