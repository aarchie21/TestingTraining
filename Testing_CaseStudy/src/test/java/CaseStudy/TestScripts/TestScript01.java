package CaseStudy.TestScripts;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import CaseStudy.Libraries.Page1;
import CaseStudy.Libraries.Page2;

public class TestScript01 {
	WebDriver driver= new ChromeDriver();
	Page1 s1=new Page1();
	Page2 s2 = new Page2();
	@Test
	public void f1() {
		s1.page1_init(driver);
		s1.launch_app();
		s1.click_appoint();
	}
	@Test
	public void f2() throws IOException {
		s2.page2_init(driver);
		s2.login_fun();
	}
}
