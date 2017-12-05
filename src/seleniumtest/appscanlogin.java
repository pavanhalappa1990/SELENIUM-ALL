package seleniumtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class appscanlogin {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\pavan-stuffs\\Qspid-learn\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://appscanavt.cisco.com/ASE/FolderExplorer.aspx?fid=2032");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("pahalapp");
		//driver.findElement(By.xpath("//div[@class='pass']/input[last()]")).click();
		driver.findElement(By.id("password")).sendKeys("Pav$1990_bip");
		driver.findElement(By.id("loginBtnLabel")).click();
		//step-1:bypass warning
		driver.findElement(By.xpath("//*[@id='ctl00_ContentPanePlaceHolder_BackToAppScanEnterpriseLink']")).click();
		//step-2:press edit and go to particular scan
		driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ctl00_MCH_RCH_CPH_View_List']/tbody/tr[3]/td[5]/a[1]")).click();
		//step-3:press advanced scan configuration
		driver.findElement(By.xpath("//*[@id='ctl00_ctl00_MCH_RightContent_AdvancedOptionsButton']")).click();
		//step-4:press login management
		driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ctl00_ctl00_MCH_LCH_MenuPlaceHolder_ContentJobPropsMenu_ctl02_MenuLabel']")).click();
		//step-5:press add login sequence
		driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ctl00_ctl00_MCH_RCH_PropPageContentPlaceHolder_PageContentPlaceHolder_RecordLoginButton']")).click();
		//step-6:press ok(alert window)
		driver.switchTo().alert().accept();
		//step-7:press continue(warning)
		driver.findElement(By.xpath("//*[@id='ctl00_ContentPanePlaceHolder_ContinueButton']")).click();
		Thread.sleep(5000);
		//step-8:select use manual explorer tool or appscan standard login sequence file radio button
		//driver.findElement(By.id("//*[@id='ctl00_ctl00_ctl00_ctl00_MCH_RCH_PropPageContentPlaceHolder_PageContentPlaceHolder_RecordLoginMethodRadioList_1']")).click();
		//Thread.sleep(5000);
		WebElement uploadelement = driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ctl00_ctl00_MCH_RCH_PropPageContentPlaceHolder_PageContentPlaceHolder_RecordedLoginUpload_UploadFileControl']"));
		uploadelement.sendKeys("C:\\pavan-stuffs\\work-stuffs\\htd-files\\10.78.97.83_appscan.htd");
		//driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ctl00_ctl00_MCH_RCH_PropPageContentPlaceHolder_PageContentPlaceHolder_RecordedLoginUpload_UploadFileControl']")).click();
		//driver.switchTo()
        //.activeElement()
        //.sendKeys(
           //     "C:\\pavan-stuffs\\work-stuffs\\htd-files\\10.78.97.83_appscan.htd");
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ctl00_ctl00_MCH_RCH_SaveCancel_SaveButton']")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ctl00_ctl00_MCH_RCH_SaveCancel_SaveButton']")).click();
		driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ctl00_ctl00_MCH_RCH_SaveCancel_SaveButton']")).click();
		driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ctl00_MCH_RCH_CPH_View_List_ctl04_CheckOne']")).click();
		driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ctl00_MCH_RCH_CPH_run']")).click();
		
		//
	}

}
