package Basic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitExplicit_Wait {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Robot r=new Robot();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("9742497026");
		driver.findElement(By.id("pass")).sendKeys("");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		//driver.findElement(By.xpath("//div[.='Messenger']")).click();
		driver.findElement(By.xpath("//div[.='Videos on Watch']")).click();
		Thread.sleep(5000);
        
		WebDriverWait wait =new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("watch"));
		System.out.println(driver.getTitle());
		

	}

}
