package POM_Gmail_TestScript1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import POM_Gmail.Gmail_Homepage;
import POM_Gmail.Gmail_LoginPage_Pwd;
import POM_Gmail.Gmail_LoginPage_Username;

public class Test_Script2 
{
	@Test
	public void Testlogin() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.gmail.com");
		Gmail_LoginPage_Username lp_un=new Gmail_LoginPage_Username(driver);
		lp_un.setUname("dhanyakrishnan52@gmail.com");
		Thread.sleep(2000);
		lp_un.clickNext();
		Thread.sleep(3000);
		//Password login page
		Gmail_LoginPage_Pwd lp_pwd=new Gmail_LoginPage_Pwd(driver);
		lp_pwd.setPwd("dorl@973sd");
		Thread.sleep(2000);
		lp_pwd.clickNext();
		Thread.sleep(3000);
		//Compose
		Gmail_Compose cp=new Gmail_Compose(driver);
		Thread.sleep(3000);
		cp.composeclick();
		//Send to
		Gmail_Sentpage cs	=new Gmail_Sentpage(driver);
		Thread.sleep(3000);
		cs.sendtext("reshmarajendran42@gmail.com");
		Thread.sleep(3000);
		cs.sendsubject("Hello");
		Thread.sleep(3000);
		cs.sendbody("helloo11");
		Thread.sleep(3000);
		
		cs.sendclick();
		
		//Logout
		Gmail_Homepage hp=new Gmail_Homepage(driver);
		hp.iconclick();
		Thread.sleep(2000);
		hp.logoutclick();
		
		
	}
}
