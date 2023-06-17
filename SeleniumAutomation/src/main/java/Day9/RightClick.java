package Day9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class RightClick {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();

        Actions act = new Actions(driver);
        act.contextClick(driver.findElement(By.xpath("//span[text()='right click me']")));
        act.click(driver.findElement(By.xpath("//span[text()='Paste']")));
        act.build().perform();
    }
}
