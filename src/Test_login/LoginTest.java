package Test_login;



import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTest extends Generic_TestLogin {
	
	@Test
	public void testLogin(){
		driver.findElement(By.id("email")).sendKeys("");
		driver.findElement(By.id("pass")).sendKeys("");
		driver.findElement(By.id("loginbutton")).click();
		String title = driver.getTitle();
		Assert.assertEquals(title, "Facebook1"
				+ "");
		System.out.println("Continues execution");
	}
	

}
