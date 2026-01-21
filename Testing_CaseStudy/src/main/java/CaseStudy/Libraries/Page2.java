package CaseStudy.Libraries;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page2 {
	WebDriver driver;
	FileReader fr;
	Properties p=new Properties();
	public void page2_init(WebDriver driver) {
		this.driver=driver;
	}
	
	By user=By.xpath("//*[@id='txt-username']");
	By pass=By.xpath("//*[@id='txt-password']");
	By button=By.xpath("//*[@id='btn-login']");
	
	public void login_fun() throws IOException {
		fr=new FileReader("C:\\Users\\aarchie.dhawan\\eclipse-workspace\\Testing_CaseStudy\\TestData\\File.properties");
		p.load(fr);
		System.out.println("P data"+p);
		driver.findElement(user).sendKeys(p.getProperty("username"));
		driver.findElement(pass).sendKeys(p.getProperty("password"));
		driver.findElement(button).click();
	}
	
}
