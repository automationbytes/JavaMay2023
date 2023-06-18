package Day10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/file.xhtml");
        String path = System.getProperty("user.dir");
        System.out.println(path+"/src/main/java/Day10/file.txt");

        driver.findElement(By.xpath("//input[@id=\"j_idt88:j_idt89_input\"]")).sendKeys(path+"/src/main/java/Day10/file.txt");


    }
}
