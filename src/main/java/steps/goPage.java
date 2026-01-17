package steps;

import Driver.GoogleChromeDriver;

public class goPage {

    public static void openBrowser(String url) {
        GoogleChromeDriver.ChromeDriver(url);
    }
}
