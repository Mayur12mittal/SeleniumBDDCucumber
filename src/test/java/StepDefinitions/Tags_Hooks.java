package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tags_Hooks {
    WebDriver driver = null;

    @Before
    public void setupMethod(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com/");
    }

    @After
    public void tearMethod(){
        driver.close();
        driver.quit();
    }

    @Given("user method A")
    public void user_method_a() {
        System.out.println("Method A");
    }

    @When("user method B")
    public void user_method_b() {
        System.out.println("Method B");
    }

    @Then("user method C")
    public void user_method_c() {
        System.out.println("Method C");
    }

    @Given("user method D")
    public void user_method_d() {
        System.out.println("Method D");
    }

    @When("user method E")
    public void user_method_e() {
        System.out.println("Method E");
    }

    @Then("user method F")
    public void user_method_f() {
        System.out.println("Method F");
    }

}
