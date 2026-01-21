package Library;

import org.openqa.selenium.WebDriver;

public class BaseClass {
	public WebDriver driver;
	public BaseClass(WebDriver driver){
		this.driver=driver;
	}
	public BaseClass() {
		this.driver=null;
	}

}
