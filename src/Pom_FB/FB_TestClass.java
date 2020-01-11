package Pom_FB;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FB_TestClass 
{
	

	@Test
	public void FBLoginTest() throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		FB_LoginPage Lp=new FB_LoginPage(driver);
		Lp.setusername("");
		Thread.sleep(2000);
		Lp.setpwd("");
		Thread.sleep(2000);
		Lp.LoginClick();
		Lp.getTitle(driver);
		Lp.getCurrentUrl(driver);
		
		
		
	} 
}
