
package Library;

import org.openqa.selenium.WebDriver;

public class Lib1 {
   public WebDriver driver;
                 
    public Lib1(WebDriver driver) {     
        this.driver = driver;
    }
 
    public String LanuchLogin() {
        driver.get("https://awesomeqa.com/ui/index.php?route=account/register");
        return driver.getTitle();
    }
}
