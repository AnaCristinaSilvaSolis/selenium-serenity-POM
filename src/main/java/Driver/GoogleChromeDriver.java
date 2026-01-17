package Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GoogleChromeDriver {

    public static WebDriver driver;

    public static void ChromeDriver(String url) {
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--start-maximized");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--disable-infobars");

        driver = new org.openqa.selenium.chrome.ChromeDriver(options);
        driver.get(url);
    }

    public static void quitBrowser() {
        driver.quit();
    }
}
