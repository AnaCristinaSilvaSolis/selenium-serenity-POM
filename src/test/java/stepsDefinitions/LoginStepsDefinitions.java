package stepsDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import steps.loginStep;

public class LoginStepsDefinitions {

    loginStep loginStep = new loginStep();

    @Then("the user looks at the home page")
    public void theUserLooksAtTheHomePage() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        loginStep.ViewLogo();
    }

    @When("the user enters the email as email with the row={int}")
    public void theUserEntersTheEmailAsEmailWithTheRow(int row) {
        loginStep.EnterEmail(row);
    }

    @And("the user enters the password as password with the row={int}")
    public void theUserEntersThePasswordAsPasswordWithTheRow(int row) {
        loginStep.EnterPassword(row);
        loginStep.ClickLogin();
    }

}
