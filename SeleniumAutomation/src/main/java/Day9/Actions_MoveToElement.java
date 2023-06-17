package Day9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Actions_MoveToElement {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.snapdeal.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();

        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath("//span[text()='Electronics']")));
        act.moveToElement(driver.findElement(By.xpath("//span[text()='Ceiling Fans']")));
        act.click(driver.findElement(By.xpath("//span[text()='Ceiling Fans']")));
        act.build().perform();

    }
}
