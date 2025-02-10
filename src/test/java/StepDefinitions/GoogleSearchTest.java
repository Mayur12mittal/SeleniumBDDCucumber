package StepDefinitions;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

    WebDriver driver = null;

    @Given("browser is open")
    public void browser_is_open() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        System.out.println("Browser opened successfully");
    }

    @And("user is on search page")
    public void user_is_on_search_page() {
        driver.get("https://google.com");
        System.out.println("Google search page opened successfully");
    }

    @When("user enters a text")
    public void user_enters_a_text() {
        driver.findElement(By.name("q")).sendKeys("Mayur Mittal");
        System.out.println("Text entered successfully");
    }

    @And("press enter")
    public void press_enter() {
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        System.out.println("Pressed enter key successfully");
    }

    @Then("user lands on result page")
    public void user_lands_on_result_page() {
        System.out.println("User search result appeared successfully");
        driver.close();
        driver.quit();
    }

}
