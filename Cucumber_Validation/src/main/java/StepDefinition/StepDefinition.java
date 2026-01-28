package StepDefinition;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import mainpack.ExcelRead;

public class StepDefinition {
	WebDriver driver;
    ExcelRead obj = new ExcelRead();

    @Before
    @Given("The user must be in chrome Broswer")
    public void preSetup() {
        driver = new ChromeDriver();
    }

    @Given("the user is in signup page")
    public void the_user_is_in_signup_page() {
        String baseURL = "https://www.bookswagon.com/login?q=signup";
        driver.get(baseURL);
        driver.manage().window().maximize();
    }

    @And("User has entered the resgriration feilds")
    public void user_has_entered_the_resgriration_feilds() throws IOException, InterruptedException {
        List<String> userName = obj.excelRCD(0, 0);
        String userN= userName.get(0);
        driver.findElement(By.xpath("//*[@id=\"ctl00_phBody_SignUp_txtName\"]")).sendKeys(userN);
//        Thread.sleep(1000);
//        nameF.click();
//        nameF.sendKeys(userName);
//        String actual = nameF.getAttribute("value");
        Thread.sleep(3000);
        List<String>  PassData = obj.excelRCD(0, 1);
        String passD = userName.get(0);
        driver.findElement(By.xpath("//*[@id=\"ctl00_phBody_SignUp_txtEmail\"]")).sendKeys(passD);
//        phoneF.click();
//        phoneF.sendKeys(PassData);
//        String actual2 = phoneF.getAttribute("value");

        // Assert.assertTrue(actual.length() < 45);
        String status = null;
        if (((CharSequence) userName).length() < 45 && ((CharSequence) PassData).length() < 10) {
            status = "Pass";
            obj.insertData1(0, 2, status);
        } else {
            status = "fail";
            obj.insertData1(0, 2, status);
        }
    }

    @And("user checks captcha")
    public void user_checks_captcha() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"rc-anchor-container\"]")).click();
//        captchaF.click();
        Thread.sleep(600000);
    }

    @And("user clicks on continue")
    public void user_clicks_on_continue() {
        // //*[@id="ctl00_phBody_SignUp_btnContinue"]
        WebElement clickF = driver.findElement(By.xpath("//*[@id=\"ctl00_phBody_SignUp_btnContinue\"]"));
        clickF.click();
    }

    @Then("user sees otp mobile")
    public void user_sees_otp_mobile() {

    }
}