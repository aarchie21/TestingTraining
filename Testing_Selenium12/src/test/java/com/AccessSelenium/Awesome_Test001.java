package com.AccessSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Selenium.Testing002;
import com.Selenium.Testing03;


public class Awesome_Test001 {
	WebDriver driver= new ChromeDriver();
	Testing002 pg1= new Testing002();
	Testing03 pg0= new Testing03();
	String Exp_PageTitle="Your Store";
  @Test(priority=1)
  public void InvokeApp() {
	  pg1.init(driver);
	  pg1.InvokeAwesomeQaApp();
//	  System.out.println("Your HomePade title is "+pg1.AwesomeHome_PageTitle());
	  
  }
  @Test(priority=2)
  public void Fetch_and_Validate_Title()
  {
	  String home_pageTitle=pg1.AwesomeHome_PageTitle();
	  System.out.println("Your HomePage title is "+home_pageTitle);
	  Assert.assertEquals(home_pageTitle,Exp_PageTitle);
  }
  
  @Test
  public void Maximize()
  {
	  pg0.init0(driver);
	  pg0.Maximize_Browser_Window();
//	  pg0.Delete_all_cookies();
	  pg0.navigat_back();
  }
  	
}
