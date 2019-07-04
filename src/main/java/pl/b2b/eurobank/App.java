package pl.b2b.eurobank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pl.b2b.eurobank.cfg.SingletonWebDriver;
import pl.b2b.eurobank.report.ReportObject;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        ReportObject reportObject = new ReportObject(SingletonWebDriver.getWebDriver(), SingletonWebDriver.getWebDriverWait());
        reportObject.reportList();
        System.out.println("Hello World!");
    }
}
