package CaseStudy.Libraries;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page1 {
	WebDriver driver;
	public void page1_init(WebDriver driver) {
		this.driver=driver;
	}
	By heading = By.xpath("//*[@id='top']/div/h1");
	By appoint = By.xpath("//*[@id='btn-make-appointment']");
	
	public void launch_app() {
		driver.get("https://katalon-demo-cura.herokuapp.com/");
		driver.findElement(heading);
		if(driver.findElement(heading).isDisplayed()) {
			System.out.println("Head found");
		} else {
			System.out.println("head Not Found");
		}
	}
	public void click_appoint() {
		if(driver.findElement(appoint).isDisplayed()) {
			System.out.println("Button Found");
			driver.findElement(appoint).click();
		}
		else {
			System.out.println("Button not Found");
		}
	}
}
