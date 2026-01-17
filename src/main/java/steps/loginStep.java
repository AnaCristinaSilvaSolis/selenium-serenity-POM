package steps;

import Driver.GoogleChromeDriver;
import net.serenitybdd.annotations.Step;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import utils.Logs;


public class loginStep {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();


    @Step
    public void EnterCredentials() {
        Logs.info("Ingresando usuario");
        GoogleChromeDriver.driver.findElement(loginPage.getTXTUSERNAME()).sendKeys("standard_user");

        Logs.info("Ingresando contraseña");
        GoogleChromeDriver.driver.findElement(loginPage.getTXTPASSWORD()).sendKeys("secret_sauce");
    }

    @Step
    public void ClickLogin() {
        Logs.info("Dando clic en el botón 'login'");
        GoogleChromeDriver.driver.findElement(loginPage.getBTNLOGIN()).click();
    }

    @Step
    public void ViewLogo() {
        Logs.info("Verificando existencia del logo");
        final var logoObtained = GoogleChromeDriver.driver.findElement(homePage.getLOGOPAGE());

        Assert.assertTrue(logoObtained.isDisplayed());
    }
}
