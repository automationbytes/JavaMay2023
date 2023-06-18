package Day10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;

public class FileDownload {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        String path = System.getProperty("user.dir")+"/src/main/java/Day10";
        System.out.println(path);
        HashMap<String, Object> pref = new HashMap<>();
        pref.put("download.default_directory",path);
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs",pref);
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.leafground.com/file.xhtml");

        driver.findElement(By.xpath("//span[text()='Download']")).click();
    }
}
