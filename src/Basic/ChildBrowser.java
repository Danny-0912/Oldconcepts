package Basic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ChildBrowser {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.selenium.dev/");
		WebElement ele1 = driver.findElement(By.xpath("(//a[.='Downloads'])[1]"));
		WebElement ele2 = driver.findElement(By.xpath("(//a[.='Projects'])[1]"));
		WebElement ele3 = driver.findElement(By.xpath("(//a[.='Documentation'])[1]"));
		Actions a=new Actions(driver);
		Robot r=new Robot();
		
		a.contextClick(ele1).perform();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		Thread.sleep(2000);
		
		a.contextClick(ele2).perform();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		Thread.sleep(2000);
		
		a.contextClick(ele3).perform();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		Thread.sleep(3000);
		
		Set<String> allwh = driver.getWindowHandles();
		
		ArrayList<String> l=new ArrayList<String>(allwh);
		String wh=l.get(2);
		driver.switchTo().window(wh);
		Thread.sleep(2000);
		String wh1=l.get(0);
		driver.switchTo().window(wh1);
		Thread.sleep(2000);
		String wh2=l.get(3);
		driver.switchTo().window(wh2);

	}

}
