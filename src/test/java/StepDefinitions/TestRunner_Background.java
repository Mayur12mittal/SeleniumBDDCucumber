package StepDefinitions;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/BackgroundDemo.feature",
        glue = {"StepDefinitions"},
        plugin = {"pretty","html:target/HtmlReports/BackgroundReport.html","json:target/JsonReports/background.json"})
public class TestRunner_Background {
}
