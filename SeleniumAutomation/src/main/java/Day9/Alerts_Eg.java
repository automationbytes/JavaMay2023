package Day9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_Eg {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/alert.xhtml");
        driver.findElement(By.xpath("//button[@id='j_idt88:j_idt104']")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().sendKeys("DevLabs");
        //driver.switchTo().alert().accept();
        driver.switchTo().alert().dismiss();

        /*

        Accept
        dismiss
        sendkeys
        gettext

         */
    }
}
