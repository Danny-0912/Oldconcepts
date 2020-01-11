package Basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Propertyfile 
{
	@Test
	public void test_property() throws FileNotFoundException, IOException
	{
		Properties p = new Properties();
		p.load(new FileInputStream("./e.properties"));
		String value = p.getProperty("iw");
		System.out.println(value);
		
	}
}
