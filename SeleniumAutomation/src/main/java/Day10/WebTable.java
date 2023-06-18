package Day10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class WebTable {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://admin-demo.nopcommerce.com/Admin/Product/List");

        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        Select pagesize = new Select(driver.findElement(By.name("products-grid_length")));
        pagesize.selectByVisibleText("100");

        Thread.sleep(5000);// u can try for explicit wait as well

        List<WebElement> row = driver.findElements(By.xpath("//table[@id=\"products-grid\"]//tr"));
        int rowsize = row.size();
        System.out.println(rowsize);

        for(int i = 1; i<rowsize; i++){
           String productname =  driver.findElement(By.xpath("//table[@id=\"products-grid\"]//tr["+i+"]//td[3]")).getText();
            System.out.println(productname);
            if(productname.equals("Nikon D5500 DSLR")){
                driver.findElement(By.xpath("//table[@id=\"products-grid\"]//tr["+i+"]//td[8]/a")).click();
                break;
            }
        }






    }
}
