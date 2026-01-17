package stepsDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import steps.loginStep;

public class LoginStepsDefinitions {

    loginStep loginStep = new loginStep();

    @When("the user enters the credentials")
    public void theUserEntersTheCredentials() {
        loginStep.EnterCredentials();
        loginStep.ClickLogin();
    }

    @Then("the user looks at the home page")
    public void theUserLooksAtTheHomePage() {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        loginStep.ViewLogo();
    }
}
