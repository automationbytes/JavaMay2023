package Day9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class WinHandling {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.irctc.co.in/nget/train-search");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[text()=' BUSES ']")).click();
        driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
        driver.findElement(By.xpath("//a[text()=' HOTELS ']")).click();
        System.out.println(driver.getCurrentUrl());

        String parentwindow = driver.getWindowHandle();
        System.out.println(parentwindow);
        Set<String> allwindows = driver.getWindowHandles();
        System.out.println(allwindows);
        for(String a : allwindows){
            if(!a.equals(parentwindow)){
                driver.switchTo().window(a);
                Thread.sleep(5000);
                System.out.println(driver.getCurrentUrl());
                System.out.println(driver.getTitle());

                if(driver.getTitle().contains("Air")){
                    driver.findElement(By.name("defenceForce")).click();
                }
                else {
                    driver.close();
                }

            }
        }

    }
}
