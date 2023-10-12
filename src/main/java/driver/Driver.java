package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {
    private static WebDriver driver;

    private Driver() {
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--lang=en-GB");
            driver = new ChromeDriver(chromeOptions);
        }
        return driver;
    }

    private static void maximizeWindow() {
        driver.manage().window().maximize();
    }

    private static void deleteCookies() {
        driver.manage().deleteAllCookies();
    }

    public static void openBrowser(String url) {
        getDriver();
        maximizeWindow();
        deleteCookies();
        driver.get(url);
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
