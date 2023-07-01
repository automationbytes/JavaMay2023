package baseClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseTestClass {

    public static WebDriver driver;
    public static Properties properties;
    String browserName;
    String url;
    String timeouts;

    public BaseTestClass(){
        properties = new Properties();
        try {
            FileInputStream file = new FileInputStream("src/test/resources/config.properties");
            properties.load(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void initializeBrowser(){
        browserName =  properties.getProperty("browser");
        url = properties.getProperty("url");
        timeouts =  properties.getProperty("timeouts");

        if(browserName.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if(browserName.equalsIgnoreCase("edge")){
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
        else if(browserName.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        else {
            System.out.println("Supported Browser : Chrome, Edge and Firefox");
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Integer.parseInt(timeouts)));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(timeouts)));
        driver.get(url);


    }
}