package Day8;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class ListDropdown {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.abhibus.com/");
        driver.findElement(By.id("source")).sendKeys("Ban");
        List<WebElement> source = driver.findElements(By.xpath("//ul[@id=\"ui-id-1\"]/li"));
        for(WebElement s : source){
            System.out.println(s.getText());
            if(s.getText().equals("Banahatti")){
                s.click();
                break;
            }
        }

        driver.findElement(By.id("destination")).sendKeys("Kol");
        List<WebElement> dest = driver.findElements(By.xpath("//ul[@id=\"ui-id-2\"]/li"));
        for (WebElement d : dest){
            System.out.println(d.getText());
            if(d.getText().contains("Tamil Nadu")){
                d.click();
                break;
            }

        }

        driver.findElement(By.id("datepicker1")).click();
        List<WebElement> dates = driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//a"));
        for (WebElement d : dates){
            System.out.println(d.getText());
            if(d.getText().equals("19")){
                d.click();
                break;
            }
        }

    }
}
