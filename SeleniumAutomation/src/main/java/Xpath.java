import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Xpath {
    /*
    Xpath = Xml path
    2 types
    1) Absolute xpath - html node. /
    2) relative xpath - starts anywhere in doc. //

    //tagname[@attribute = 'value']
    //input[@name='email']
    //input[@placeholder='Email address or phone number']

    //tagname[contains(@attribute, 'val')]
    //input[contains(@placeholder,'Email addres')]

    //tagname[@attribute1 = 'value1' and @attribute2 = 'value2']

    //tagname[text()='value']
    //button[text()='Log in']


     */
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Tom");

    }
}
