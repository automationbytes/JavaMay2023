package Day10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class scrolling {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.redbus.in/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        //pixel
        js.executeScript("window.scrollBy(0,1500);");
        Thread.sleep(5000);

        js.executeScript("window.scrollBy(0,-500);");

        //scrollTo
        Thread.sleep(5000);
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

        Thread.sleep(5000);
        js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");


        //scroll toElement
        js.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//div[text()='FREQUENTY ASKED QUESTIONS']")));

//        Actions act = new Actions(driver);
//        act.scrollToElement(driver.findElement(By.xpath("//div[text()='FREQUENTY ASKED QUESTIONS']")));
//        act.build().perform();


    }
}
