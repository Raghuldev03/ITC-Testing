package step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepDefinitions {

    @Given("User launches the application")
    public void user_launches_the_application() {
        System.out.println("App launched");
    }

    @Then("Login page should be displayed")
    public void login_page_should_be_displayed() {
        System.out.println("Login page displayed");
    }
}
