package StepDefinitions;

import Pages.CuraLoginPage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CuraLoginTest {
    WebDriver driver = null;
    CuraLoginPage curaLoginPage;

    @Given("user lands on cura login page")
    public void user_lands_on_cura_login_page() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        curaLoginPage = new CuraLoginPage(driver);
        curaLoginPage.clickOnMakeAppointmentBtn();
//        driver.findElement(By.id("btn-make-appointment")).click();
        Thread.sleep(2000);
    }

    @When("^user enters (.*) and (.*)$")
    public void user_enters_username_and_password(String username, String password) throws InterruptedException {
        curaLoginPage.enterUsername(username);
        Thread.sleep(1000);
        curaLoginPage.enterPassword(password);
        Thread.sleep(1000);

//        driver.findElement(By.id("txt-username")).sendKeys(username);
//        Thread.sleep(1000);
//        driver.findElement(By.id("txt-password")).sendKeys(password);
//        Thread.sleep(1000);
    }

    @And("user clicks on login button")
    public void user_clicks_on_login_button() throws InterruptedException {
        curaLoginPage.clickOnLoginBtn();
//        driver.findElement(By.id("btn-login")).click();
        Thread.sleep(2000);
    }

    @Then("user gets logged in")
    public void user_gets_logged_in() throws InterruptedException {
        curaLoginPage.checkBookAppointmentBtn();
//        driver.findElement(By.id("btn-book-appointment")).isDisplayed();
        Thread.sleep(1000);
        driver.close();
        driver.quit();
    }
}
