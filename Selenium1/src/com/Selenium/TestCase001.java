package com.Selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestCase001 {
	public static void main(String[] args)
	{
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.awesomeqa.com/ui");
	}

}
