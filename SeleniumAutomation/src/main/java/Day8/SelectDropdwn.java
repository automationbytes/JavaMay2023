package Day8;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class SelectDropdwn {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://admin-demo.nopcommerce.com/Admin/Order/List");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.findElement(By.id("RememberMe")).click();
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        WebElement countrydrpdwn = driver.findElement(By.id("BillingCountryId"));
        Select dropdown = new Select(countrydrpdwn);
        //dropdown.selectByIndex(9);
       // dropdown.selectByVisibleText("Bangladesh");
        dropdown.selectByValue("6");

        for (WebElement d: dropdown.getOptions()) {
            System.out.println(d.getAttribute("value")+"   "+d.getText());
        }

    }
}
