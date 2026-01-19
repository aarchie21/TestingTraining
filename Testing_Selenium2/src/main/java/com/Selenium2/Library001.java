package com.Selenium2;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class Library001 {
	WebDriver driver;
	
	public void init(WebDriver driver) {
		this.driver=driver;
	}
	
//	public void Lanuch_0cartLogin() {
//		driver.get("https://awesomeqa.com/ui/index.php?route=account/login");
////		String LoginPageTitle = driver.getTitle();
////		return LoginPageTitle;
//	}
//	public String Title()
//	{
//		String LoginPageTitle = driver.getTitle();
//		return LoginPageTitle;
//	}
//	
//	public String Perform_Login_Valid(String email,String password) throws InterruptedException
//	{
//		driver.findElement(By.xpath("//*[@id='input-email']")).sendKeys(email);
//		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(password);
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
//		Thread.sleep(2000);
//		String LoginPageTitle = driver.getTitle();
//		return LoginPageTitle;
//		Actions act = new Actions(driver);
//		WebElement el = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/i"));
//		act.moveToElement(el).click().build().perform();
//		WebElement el2 = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a"));
//		el2.click();
//		WebElement el3 =driver.findElement(By.xpath("//*[@id='content']/div/div/a"));
//		el3.click();
//		String confirmation_message=driver.findElement(By.xpath("//h2[contains(text(),'My Orders')]")).getText();
//		return confirmation_message;
//		return "true";
//	}
//	public String Perform_Login_INValid(String email,String password) throws InterruptedException
//	{
//		driver.findElement(By.xpath("//input[@id ='input-email']")).sendKeys(email);
//		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(password);
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
//		String confirmation_message=driver.findElement(By.xpath("//div[@class=\"alert alert-danger alert-dismissible\"]")).getText();
//		return confirmation_message;
//	}
//	
//	public void Logout()
//	{
//		driver.findElement(By.xpath("//a[@class='list-group-item'][13]")).click();
//		driver.findElement(By.xpath("//a[@class='list-group-item'][1]")).click();
//	}
	
//	public int Count_links_from_homepage() {
//		driver.get("https://www.amazon.in/ref=nav_logo");
//		List<WebElement> Links = driver.findElements(By.tagName("a"));
//		int LinkCounts=Links.size();
//		for(int i=0;i<LinkCounts;i++)
//		{
//			String name=Links.get(i).getText();
//			System.out.println("Link "+i+" "+ name);
//		}
//		return LinkCounts;
//	}
	
//	public int Count_links_from_homepage() throws InterruptedException {
//		driver.get("https://www.google.com/?zx=1768797073965&no_sw_cr=1");
//		driver.findElement(By.xpath("/html/body/div[2]/div[4]/form/div[1]/div[1]/div[1]/div[1]/div[3]/textarea")).sendKeys("java complete reference");
//		Thread.sleep(2000);
//		List<WebElement> Links= driver.findElements(By.xpath("/html/body/div[2]/div[4]/form/div[1]/div[1]/div[2]/div[4]/div[2]/div[1]/div/ul/li"));
//		int LinkCounts=Links.size();
//		Actions act= new Actions(driver);
//		for(int i=0;i<LinkCounts;i++)
//		{
//			String name=Links.get(i).getText();
//			System.out.println(name);
//		}
//		act.moveToElement(Links.get(3)).click().build().perform();
//		return LinkCounts;
//	}

	
//	public int CountTable() throws InterruptedException {
//		driver.get("https://www.w3schools.com/html/html_tables.asp");
//		Thread.sleep(2000);
//		List<WebElement> Links= driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/td"));
//		List<WebElement> heading= driver.findElements(By.xpath("//table[@id=\"customers\"]//tr//th"));
//		int LinkCounts=Links.size();
//		int HeadingCounts=heading.size();
//		Actions act= new Actions(driver);
//		for(int i=0;i<LinkCounts;i++)
//		{
//			String name=Links.get(i).getText();
//			System.out.println(name);
//		}
//		act.moveToElement(Links.get(3)).click().build().perform();
//		for(int i=0;i<HeadingCounts;i++)
//		{
//			System.out.println(heading.get(i).getText());
//			String xpath = String.format("//table[@id='customers']/tbody/tr/td[%d]", i + 1);
//			List<WebElement> Links= driver.findElements(By.xpath(xpath));
//			int LinkCounts=Links.size();
//			for(int j=0;j<LinkCounts;j++)
//			{
//				System.out.println(Links.get(j).getText());
//			}
//		}
//		return 1;
//	}
		
//		public List <WebElement> Select_Drop_list() throws InterruptedException{
//			driver.get("https://www.amazon.in/ref=nav_logo");
//			WebElement data=driver.findElement(By.cssSelector("#searchDropdownBox"));
//			Select data1= new Select(data);
//			List<WebElement> option= data1.getOptions();
//			for(int i=0;i<option.size();i++)
//			{
//				String Options = option.get(i).getText();
//				System.out.println(Options);
//			}
//			data1.selectByIndex(3);
////			data1.selectByVisibleText("Baby");
//			return option;
//		}
//		
//		public List <WebElement> Drop_list() throws InterruptedException{
//			driver.get("https://demo.guru99.com/test/newtours/register.php");
//			Thread.sleep(3000);
//			WebElement data=driver.findElement(By.name("#country "));
//			Select data1= new Select(data);
//			List<WebElement> option= data1.getOptions();
//			for(int i=0;i<option.size();i++)
//			{
//				String Options = option.get(i).getText();
//				System.out.println(Options);
//			}
//			data1.selectByIndex(3);
////			data1.selectByVisibleText("Baby");
//			return option;
//		}
		public String Alert() throws InterruptedException {
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			Thread.sleep(3000);
			
			WebElement unm=driver.findElement(By.id("login1"));
			WebElement pwd=driver.findElement(By.id("password"));
			Thread.sleep(2000);
			WebElement submessage=driver.findElement(By.id("//button[@type='submit']"));
			submessage.click();
			Alert act=driver.switchTo().alert();
			String Act_AlertMessage=act.getText();
			return Act_AlertMessage;
					
						
		}
	
	
	
	
	
	
	
	
}
