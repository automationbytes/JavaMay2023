package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/FeaturesFiles"},
        glue = {"StepDefn"},
        plugin = {"pretty","html:html-reports/reports.html",
                "junit:junit-report/report.xml","json:json-report/report.json"},
        publish = true,
        tags = "@Sanity"
)






public class TestRunner {
}
