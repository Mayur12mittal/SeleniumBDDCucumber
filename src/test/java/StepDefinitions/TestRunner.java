package StepDefinitions;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/GoogleSearch.feature",
        glue = {"StepDefinitions"},
        plugin = {"pretty","html:target/HtmlReports/Report.html"})
public class TestRunner {
}
