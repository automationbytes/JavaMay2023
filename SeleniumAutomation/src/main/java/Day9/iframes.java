package Day9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframes {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
        driver.findElement(By.xpath("//a[@onclick=\"retheme()\"]")).click();
        /*
        3 ways
        using name/id
        locators
        index

         */

       // driver.switchTo().frame("iframeResult");
      //  driver.switchTo().frame(2);
      //  driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name=\"iframeResult\"]")));
        driver.findElement(By.xpath("//button[text()='Try it']")).click();
        driver.switchTo().alert().dismiss();

        driver.findElement(By.xpath("//a[@onclick=\"retheme()\"]")).click();

    }

}
