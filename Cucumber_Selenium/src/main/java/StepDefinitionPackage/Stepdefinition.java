
package StepDefinitionPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class Stepdefinition {
	WebDriver driver;
//	WebElement docLink=driver.findElement(By.xpath("//*[@id='__docusaurus']/nav/div[1]/div[1]/a[2]"));
	@Given("The user must be in chrome browser")
	public void preSetup() {
	driver = new ChromeDriver();
	}
	
	 @Given("The user is in cucumber.io homepage")
	 public void The_user_is_in_cucumberio_homepage() {
		 String BaseURL="https://cucumber.io/";
		 driver.get(BaseURL);
		 driver.manage().window().maximize();
	 }
	 @When("The user clicks on Documentation link")
	 public void The_user_clicks_on_Documentation_link() {
		 WebElement docLink=driver.findElement(By.xpath("//*[@id='__docusaurus']/nav/div[1]/div[1]/a[2]"));
		 docLink.click();
	 }
	 @Then("The user can view the page content with What is Cucumber?")
	 public void The_user_can_view_the_page_content_with_What_is_Cucumber(){
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//	 WebElement cucumber=driver.findElement(By.xpath("/html/body/div/div[2]/div/div/main/div/div/div[1]/div/article/div[2]/h2[1]"));

	 WebElement cucumberHeading = wait.until(
	        ExpectedConditions.visibilityOfElementLocated(
	            By.xpath("//*[self::h1 or self::h2 or self::h3][contains(normalize-space(), 'What is Cucumber')]")
	        )
	    );

//		 String dataExtract=driver.getTitle();
		 String dataExtract1=cucumberHeading.getText();
//		 System.out.println(dataExtract);
		 System.out.println(dataExtract1);
	 }
}
