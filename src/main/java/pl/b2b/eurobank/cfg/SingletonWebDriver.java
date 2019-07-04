package pl.b2b.eurobank.cfg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SingletonWebDriver {

    private static WebDriver webDriver;
    private static WebDriverWait webDriverWait;
    private static SingletonWebDriver singletonWebDriver;

    private SingletonWebDriver(String driverPath) {
        System.setProperty(GeckoDriverService.GECKO_DRIVER_EXE_PROPERTY, driverPath);
        webDriver = new FirefoxDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriverWait = new WebDriverWait(webDriver, 10);
        webDriver.manage().window().maximize();
    }

    public static void initialize(String driverPath) {
        if (singletonWebDriver == null) {
            singletonWebDriver = new SingletonWebDriver(driverPath);
        }
    }

    public static WebDriver getWebDriver() {
        return webDriver;
    }

    public static WebDriverWait getWebDriverWait() {
        return webDriverWait;
    }


    public static void quitDriver() {
        webDriver.quit();
        webDriver = null;
        webDriverWait = null;
        singletonWebDriver = null;
    }


}
