package Selenium_Test;

import org.testng.annotations.DataProvider;

public class Test1 {
	
	@Test(dataProvider="dp")
	public void Usertest()
	{
		
	}
	 @DataProvider
	  public Object[][] dp() {
		    return new Object[][] {
		      new Object[] { },
		      new Object[] { 22698, "Kalyan"},
		    };

}
