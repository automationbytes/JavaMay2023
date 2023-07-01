//package util.extentreports;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;
//
//public class ExtentManager {
//
//    public static final ExtentReports extentReports = new ExtentReports();
//
//    public synchronized static ExtentReports createExtentReports(){
//        ExtentSparkReporter reporter = new ExtentSparkReporter("./extent-reports/reports.html");
//        reporter.config().setReportName("Dev Labs Extent Report");
//        extentReports.attachReporter(reporter);
//        extentReports.setSystemInfo("Author","Vignesh");
//        extentReports.setSystemInfo("Institute","Dev Labs");
//        return extentReports;
//
//
//    }
//}
