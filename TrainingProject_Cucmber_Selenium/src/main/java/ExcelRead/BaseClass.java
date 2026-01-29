package ExcelRead;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public static WebDriver driver;
	
	Properties P=new Properties();
	public BaseClass(){
		if(driver !=null)
		{
			return;
		}
		try {
			FileReader fr= new FileReader("C:\\Users\\aarchie.dhawan\\eclipse-workspace\\SeleniumTrainningProject\\src\\main\\java\\configApp\\config.properties");
			P.load(fr);
			String Browser=P.getProperty("Browser");
			switch(Browser) {
			case "Chrome":
				driver=new ChromeDriver();
				break;
			case "Edge":
				driver= new EdgeDriver();
				break;
			case "Friefox":
				driver = new FirefoxDriver();
				break;
			default:
				driver=new ChromeDriver();
				break;
				}
			maximize_browser();
		}
		catch(Exception e) {
			driver=new ChromeDriver();
			maximize_browser();
		}
	}
	public void invokeBrowser() {
		String baseURL = "https://www.bookswagon.com/login?q=signup";
		driver.get(baseURL);
	}
	public void maximize_browser() {
		driver.manage().window().maximize();
	}
	public void navigate_back() {
		driver.navigate().back();
	}
	public void navigate_forward() {
		driver.navigate().forward();
	}
	public void scroll_down(int time) {
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,%d"+time);
	}
	public void app_refresh() {
		driver.navigate().refresh();
	}
	public void delete_cookies() {
		driver.manage().deleteAllCookies();
	}
	public void close_browser() {
		driver.close();
	}
	public void quit_browser() {
		if(driver!=null) {
		driver.quit();
		driver =  null;
		}
	}
	public void Wait_static(int time) {
		try {
			Thread.sleep(time);
		}
		catch(Exception e){
			System.out.println("Exception occured: "+e.getMessage());
		}
	}
	public void dynamic_wait_implicitly(int time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}
	public WebElement dynamic_wait_explicitly_visible(int time,WebElement locator) {
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(time));
		return wait.until(ExpectedConditions.visibilityOf(locator));
	}
	public WebElement dynamic_wait_explicitly_clickable(int time,By locator) {
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(time));
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
}
