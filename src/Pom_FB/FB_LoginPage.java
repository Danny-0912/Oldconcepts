package Pom_FB;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FB_LoginPage extends FB_TestClass 
{
	//declaration
	@FindBy(xpath="//input[@id='email']")
	private WebElement utbox;
	@FindBy(xpath="//input[@id='pass']")
	private WebElement ptbox;
	@FindBy(xpath="//Label[@id='loginbutton']")
	private WebElement Login;
	//Initialization
	public FB_LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void setusername(String un)
	{
		utbox.sendKeys(un);
	}
	public void setpwd(String pwd)
	{
		ptbox.sendKeys(pwd);
	}
	public void LoginClick()
	{
		Login.click();
	}
	public String getTitle(WebDriver driver)
	{
		String title=driver.getTitle();
		System.out.println(title);
		return title;
	}
	public String getCurrentUrl(WebDriver driver)
	{
		String url=driver.getCurrentUrl();
		System.out.println(url);
		return url;
	}
	public String getAttribute(WebElement ele, String Login)
	{
		String rr=ele.getAttribute(Login);
		System.out.println(rr);
		return rr;
	}
}
