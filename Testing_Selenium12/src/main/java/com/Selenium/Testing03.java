package com.Selenium;

import org.openqa.selenium.WebDriver;

public class Testing03 {
	WebDriver driver;
	public void init0(WebDriver driver) {
		this.driver=driver;
	}
	//Maximize The bowser window 
	public void Maximize_Browser_Window(){
		driver.manage().window().maximize();
	}
	
	//delete all cookies
	public void Delete_all_cookies(){
		driver.manage().deleteAllCookies();
	}
	
	public void navigat_back() {
		driver.navigate().back();
	}
	public void navigat_forward() {
		driver.navigate().forward();
	}
	public void refresh() {
		driver.navigate().refresh();
	}
	public String getSource() {
		String res= driver.getPageSource();
		return res;
	}
}
