package Day7;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    /*
    id
    name
    classname
    tagname
    linktext
    partial linktext
    xpath
    css

     */
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("email")).sendKeys("Tom");
        driver.findElement(By.id("pass")).sendKeys("ad123");
      //  driver.findElement(By.name("login")).click();
     //   driver.findElement(By.linkText("Forgotten password?")).click();
        driver.findElement(By.partialLinkText("Meta")).click();

    }
}
