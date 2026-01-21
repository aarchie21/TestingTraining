
package Testing;

import Library.BaseClass;
import Library.Lib1;
import Library.Lib2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestScript extends BaseClass {
	public TestScript() {
		super();
	}
  

    @Test
    public void TitleValidate() {
    	WebDriver driver=new ChromeDriver();
    	Lib1 lib1=new Lib1(driver);
    	lib1.driver= driver;
        String page_title = lib1.LanuchLogin();
        System.out.println(page_title);
//        Assert.assertEquals(page_title, ExpStr);
    }

    @Test
    public void CountLinks() {
    	Lib2 lib2=new Lib2(driver);
        int cnt = lib2.Count_links_from_homepage();
        System.out.println("Total links: " + cnt);
        Assert.assertTrue(cnt >= 0);
    }
}
