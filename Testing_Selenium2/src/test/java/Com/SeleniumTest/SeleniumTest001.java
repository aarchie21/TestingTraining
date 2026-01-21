package Com.SeleniumTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Selenium2.Library001;

import junit.framework.Assert;

public class SeleniumTest001
{
	Library001 lib1= new Library001();
	WebDriver driver= new ChromeDriver();
	String ExpStr="My Orders";
//  @Test (priority=1)
//  
//  public void Test_Login_Validate() throws InterruptedException {
//	  lib1.init(driver);
//	  String page_title=lib1.Lanuch_0cartLogin();
//	  String ActStr= lib1.Perform_Login_Valid("aarchie.dhawan@example.com", "user123");
//	  System.out.println(ActStr);
////	  Assert.assertEquals(ExpStr, ActStr);
////	  lib1.Logout();
//	  Thread.sleep(3000);
////	  driver.close();
//  }
	
//	@Test
//	public void Count_Links() {
//		lib1.init(driver);
//		int cnt= lib1.Count_links_from_homepage();
//		System.out.println("Total links: "+cnt);
//	}
////	
//	@Test(dataProvider="dp")
//	public void User_test(String uName, String uPassword,Boolean check) throws InterruptedException
//	{
//		lib1.init(driver);
//		lib1.Lanuch_0cartLogin();
//		String title= lib1.Perform_Login_Valid(uName, uPassword);
//		if(title.equals("My Account")) check=true;
//		System.out.println(check);
//	}
//	
//	@DataProvider
//	public Object[][] dp(){
//		return new Object[][] {
//				new Object[] {"aarchie.dhawan@example.com","user123",false}
//		};
//		
//	}
	
//	@Test
//	public void Count_Links() throws InterruptedException {
//		lib1.init(driver);
//		int cnt= lib1.Count_links_from_homepage();
//		System.out.println("Total links: "+cnt);
//	}
	
	
//	@Test
//	public void Contact() throws InterruptedException {
//		lib1.init(driver);
//		List<WebElement> cnt= lib1.Select_Drop_list();
//		System.out.println("Total Contacts:"+cnt);
//	}
//	@Test
//	public void Alert() throws InterruptedException {
//		lib1.init(driver);
//		String a=lib1.Alert();
//		System.out.println(a);
//	}
	
	@Test
	public void Actions() throws InterruptedException {
		lib1.init(driver);
		lib1.draggableAndDroppable();
	}
}

