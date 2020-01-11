package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 {
	@Test
	public void test2(){
		Reporter.log("Hello",true);
	}

}
