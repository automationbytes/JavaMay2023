package StepDefn;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import util.ConfigReader;
import webdriverfactory.DriverFactory;

import java.util.Properties;

public class AppHooks {

    private WebDriver driver;
    private DriverFactory driverFactory;
    public static ConfigReader configReader;
    public static Properties properties;

    @Before()
    public void getBrowser(){
        configReader = new ConfigReader();
        driverFactory = new DriverFactory();
        driver = driverFactory.init_Driver(configReader.getConfigProperty("browser"));
    }

    @After(order = 0)
    public void tearDown(){
        DriverFactory.getDriver().close();
        DriverFactory.getDriver().quit();
    }

    @AfterStep()
    public void takeScreenshot(Scenario scenario){
       // if(scenario.isFailed()) //only for failed step
        String screenshotName = scenario.getName().replaceAll(" ","_");
        byte[] sourcePath = ((TakesScreenshot)DriverFactory.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(sourcePath,"image/png",screenshotName);
//}
    }
}
