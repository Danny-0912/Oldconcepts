package TestScript2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import POM_Gmail_TestScript1.Gmail_Homepage;
import POM_Gmail_TestScript1.Gmail_LoginPage_Pwd;
import POM_Gmail_TestScript1.Gmail_LoginPage_Username;

public class Test_Login {
	@Test
	public void TestLogin() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.gmail.com");
		//Username login page
		Gmail_LoginPage_Username lp_un=new Gmail_LoginPage_Username(driver);
		lp_un.setUname("reshmarajendran42@gmail.com");
		Thread.sleep(2000);
		lp_un.clickNext();
		Thread.sleep(3000);
		//Password login page
		Gmail_LoginPage_Pwd lp_pwd=new Gmail_LoginPage_Pwd(driver);
		lp_pwd.setPwd("9538902565");
		Thread.sleep(2000);
		lp_pwd.clickNext();
		Thread.sleep(3000);
		//Logout
		Gmail_Homepage hp=new Gmail_Homepage(driver);
		hp.iconclick();
		Thread.sleep(2000);
		hp.logoutclick();
	}

}
