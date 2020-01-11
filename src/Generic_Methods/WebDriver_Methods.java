package Generic_Methods;

import org.openqa.selenium.WebDriver;

import Generic_Class.Gmail;

public class WebDriver_Methods extends Gmail 
{
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
	
}
