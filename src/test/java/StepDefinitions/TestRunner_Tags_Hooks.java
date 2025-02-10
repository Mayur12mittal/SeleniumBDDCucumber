package StepDefinitions;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/Tags_Hooks.feature",
        glue = {"StepDefinitions"},
        tags = "@Smoke or @Regression",
        plugin = {"pretty","html:target/HtmlReports/TagsHooksReport.html"})
public class TestRunner_Tags_Hooks {
}
