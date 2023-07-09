import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class FlipkartAssignment {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.flipkart.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();

        if(driver.findElement(By.xpath("//button[text()='✕']")).isDisplayed()){
            driver.findElement(By.xpath("//button[text()='✕']")).click();
        }
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath("//img[@alt='Electronics']")));
        act.build().perform();
        act.moveToElement(driver.findElement(By.linkText("Audio")));
        act.moveToElement(driver.findElement(By.linkText("Soundbars")));
        act.click(driver.findElement(By.linkText("Soundbars")));
        act.build().perform();
        //act


    }
}
