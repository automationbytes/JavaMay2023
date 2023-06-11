package Day8;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class dropdown_parameter {
    public static WebDriver driver;
    static void selectvalue(String locator, String value){
        List<WebElement> drop = driver.findElements(By.xpath(locator));
        for (WebElement d:drop) {
            System.out.println(d.getText());
            if (d.getText().equals(value)){
                d.click();
                break;
            }
        }
    }

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.abhibus.com/");
        driver.findElement(By.id("source")).sendKeys("Ban");
        selectvalue("//ul[@id=\"ui-id-1\"]/li","Banahatti");

        driver.findElement(By.id("destination")).sendKeys("Kol");
        selectvalue("//ul[@id=\"ui-id-2\"]/li","Kollam");

        driver.findElement(By.id("datepicker1")).click();
        selectvalue("//table[@class=\"ui-datepicker-calendar\"]//a","25");



    }


}
