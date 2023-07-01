package listeners;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import baseClass.BaseTestClass;
public class ExtentManager extends BaseTestClass {
    private static ExtentReports extent;
    public static String reportFilePath = "";


    public static ExtentReports createInstance(String fileName) {

        if(System.getProperty("os.name").contains("Windows")) {
            reportFilePath = System.getProperty("user.dir")+"\\src\\test\\resources\\reports\\";
        }
        else {
            reportFilePath = System.getProperty("user.dir")+"/src/test/resources/reports/";
        }

        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(reportFilePath+fileName);
        System.out.println("Report will be generated at: " + reportFilePath);

        htmlReporter.config().setTheme(Theme.DARK);
        htmlReporter.config().setDocumentTitle("Automation Report");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        return extent;

    }

    public static String screenshotPath;
    public static String screenshotName;
    public static String captureScreenshot() {
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Date d = new Date();
        screenshotName = "Screenshot"+d.toString().replace(":", "_").replace(" ", "_")+".png";
        try {
            FileUtils.copyFile(scrFile, new File(reportFilePath+screenshotName));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(screenshotName);
        return screenshotName;
    }
}
