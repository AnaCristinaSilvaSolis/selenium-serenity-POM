package steps;

import Driver.GoogleChromeDriver;
import net.serenitybdd.annotations.Step;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import utils.DataDrivenExcel;
import utils.Excel;
import utils.Logs;

import java.util.HashMap;
import java.util.Map;


public class loginStep {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    DataDrivenExcel dataDrivenExcel = new DataDrivenExcel();
    Map<String, String> data = new HashMap<>();


    @Step
    public void EnterEmail() {
        Logs.info("Ingresando usuario");
        Excel excel = new Excel(Excel.rutaExcelDev, "Login", true, 1);
        data = DataDrivenExcel.leerExcel(excel);
        GoogleChromeDriver.driver.findElement(loginPage.getTXTUSERNAME()).sendKeys(data.get("email"));
    }

    @Step
    public void EnterPassword() {
        Logs.info("Ingresando contraseña");
        Excel excel = new Excel(Excel.rutaExcelDev, "Login", true, 1);
        data = DataDrivenExcel.leerExcel(excel);
        GoogleChromeDriver.driver.findElement(loginPage.getTXTPASSWORD()).sendKeys(data.get("password"));
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
