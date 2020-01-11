package Test_login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic_TestLogin {
	public WebDriver driver;
	
	@BeforeMethod
	public void OpenApp(){
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		
	}
	
	@AfterMethod
	public void CloseApp() throws InterruptedException{
		Thread.sleep(3000);
		driver.quit();
	}

}
