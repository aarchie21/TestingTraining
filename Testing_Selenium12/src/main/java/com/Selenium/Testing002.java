package com.Selenium;

import org.openqa.selenium.WebDriver;

public class Testing002 {
	WebDriver driver;
	public void init(WebDriver driver) {
		this.driver=driver;
	}
	//To Invoke the app
	public void InvokeAwesomeQaApp() {
		driver.get("https://www.awesomeqa.com/ui");
	}
	//Extract Page title
	public String AwesomeHome_PageTitle() {
		String pgTitleHome=driver.getTitle();
		return pgTitleHome;
	}

}
