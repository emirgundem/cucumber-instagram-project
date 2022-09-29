package StepDefiniton;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Features",glue = {"StepDefiniton"},monochrome = true,
        plugin = {"pretty","html:target/HtmlReports/report.html",
                  "pretty","json:target/JsonReports/report.json",
                  "pretty", "junit:target/JunitReports/report.xml"},

        tags = "@smoke"
)

public class TestRunner {


}
