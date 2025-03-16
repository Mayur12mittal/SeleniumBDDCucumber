package StepDefinitions;

import io.cucumber.java.en.*;

public class BackgroundTest {

    @Given("user login to website")
    public void user_login_to_website() {
        System.out.println("User login to website");
    }
    @When("user click on profile button")
    public void user_click_on_profile_button() {
        System.out.println("User clicks on Profile button");
    }
    @Then("logout button is displayed")
    public void logout_button_is_displayed() {
        System.out.println("Logout button gets displayed");
    }

    @When("user click on dashboard CTA")
    public void user_click_on_dashboard_cta() {
        System.out.println("User clicks on Dashboard CTA");
    }
    @Then("dashboard page displayed")
    public void dashboard_page_displayed() {
        System.out.println("Content of Dashboard gets displayed");
    }

    @Given("user lands on login page")
    public void user_lands_on_login_page() {
        System.out.println("User navigated to login page");
    }
    @When("user enter credentials and click login")
    public void user_enter_credentials_and_click_login() {
        System.out.println("User enters username and password and clicks on Login button");
    }
    @Then("user lands on homepage")
    public void user_lands_on_homepage() {
        System.out.println("Successful Login: Home page gets displayed");
    }
}
