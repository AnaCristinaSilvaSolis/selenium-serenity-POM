package stepsDefinitions;

import Driver.GoogleChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import steps.goPage;

public class OpenBrowserStepsDefinitions {

    @After
    public void tearDown() {
        GoogleChromeDriver.quitBrowser();
    }

    @Given("the user enter the page")
    public void theUserEnterThePage() {
        goPage.openBrowser("https://www.saucedemo.com/");
    }
}
