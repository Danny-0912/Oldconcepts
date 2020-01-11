package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HiddenDivision {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.xpath("(//i[.='Cal'])[1]")).click();
		driver.findElement(By.xpath("(//a[.='12'])[1]")).click();
	

	}

}
