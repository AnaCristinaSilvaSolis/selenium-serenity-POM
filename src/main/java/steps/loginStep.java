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
    public void EnterEmail(int row) {
        Logs.info("Ingresando usuario");
        Excel excel = new Excel(Excel.rutaExcelDev, "Login", true, row);
        data = DataDrivenExcel.leerExcel(excel);
        GoogleChromeDriver.driver.findElement(loginPage.getTxtUserName()).sendKeys(data.get("email"));
    }

    @Step
    public void EnterPassword(int row) {
        Logs.info("Ingresando contraseña");
        Excel excel = new Excel(Excel.rutaExcelDev, "Login", true, row);
        data = DataDrivenExcel.leerExcel(excel);
        GoogleChromeDriver.driver.findElement(loginPage.getTxtUserPassword()).sendKeys(data.get("password"));
    }

    @Step
    public void ClickLogin() {
        Logs.info("Dando clic en el botón 'login'");
        GoogleChromeDriver.driver.findElement(loginPage.getBtnLogin()).click();
    }

    @Step
    public void ViewLogo() {
        Logs.info("Verificando existencia del logo");
        final var logoObtained = GoogleChromeDriver.driver.findElement(homePage.getLogoPage());
        Assert.assertTrue(logoObtained.isDisplayed());
    }
}
