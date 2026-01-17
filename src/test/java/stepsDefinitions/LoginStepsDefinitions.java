package stepsDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import steps.loginStep;

public class LoginStepsDefinitions {

    loginStep loginStep = new loginStep();

    @Then("the user looks at the home page")
    public void theUserLooksAtTheHomePage() {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        loginStep.ViewLogo();
    }

    @When("the user enters the {string} as email")
    public void theUserEntersTheEmail(String email) {
        loginStep.EnterEmail(email);
    }

    @When("the user enters the {string} as password")
    public void theUserEntersThePassword(String password) {
        loginStep.EnterPassword(password);
        loginStep.ClickLogin();
    }
}
