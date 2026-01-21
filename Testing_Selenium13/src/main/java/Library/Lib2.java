
package Library;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Lib2 {
    WebDriver driver;

    public Lib2() {}                    // no-arg
    public Lib2(WebDriver driver) {     // existing
        this.driver = driver;
    }

    public int Count_links_from_homepage() {
        driver.get("https://awesomeqa.com/ui/index.php?route=account/register");
        List<WebElement> Links = driver.findElements(By.tagName("a"));
        int LinkCounts = Links.size();
        for (int i = 0; i < LinkCounts; i++) {
            String name = Links.get(i).getText();
            System.out.println("Link " + i + " " + name);
        }
        return LinkCounts;
    }
}
