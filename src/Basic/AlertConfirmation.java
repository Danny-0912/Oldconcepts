package Basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.Select;

public class AlertConfirmation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.javascriptkit.com/javatutors/alert2.shtml");
		driver.findElement(By.xpath("//input[@value='Click here for output>>']")).click();
		Alert a= driver.switchTo().alert();
		System.out.println(a.getText());
		Thread.sleep(3000);
		a.accept();
		driver.findElement(By.xpath("(//input[@value='Click here>>'])[1]")).click();
		Alert a1= driver.switchTo().alert();
		System.out.println(a1.getText());
		Thread.sleep(3000);
		a1.accept();
		
		
		
		
		

	}

}
