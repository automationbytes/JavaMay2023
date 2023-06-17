package Day9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DragnDrop {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://emicalculator.net/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();

        Actions act = new Actions(driver);
//        act.dragAndDrop(driver.findElement(By.xpath("//span[text()='50L']/parent::span")),driver.findElement(By.xpath("//span[text()='150L']/parent::span")));
//        act.build().perform();

        act.clickAndHold(driver.findElement(By.xpath("//span[text()='50L']/parent::span")));
        act.release(driver.findElement(By.xpath("//span[text()='100L']/parent::span")));
        act.build().perform();


        act.scrollToElement(driver.findElement(By.xpath("//h2[text()='Recent Articles']")));
        act.build().perform();
    }
}
