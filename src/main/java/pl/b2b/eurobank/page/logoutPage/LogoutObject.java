package pl.b2b.eurobank.page.logoutPage;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import pl.b2b.eurobank.cfg.SingletonWebDriver;
import pl.b2b.eurobank.report.ReportObject;

import java.io.IOException;

public class LogoutObject {

    private WebDriver webDriver;
    private WebDriverWait webDriverWait;

    public LogoutObject(WebDriver webDriver, WebDriverWait webDriverWait) {
        this.webDriver = webDriver;
        this.webDriverWait = webDriverWait;
        PageFactory.initElements(webDriver, this);
    }

    ReportObject reportObject = new ReportObject(SingletonWebDriver.getWebDriver(), SingletonWebDriver.getWebDriverWait());

    @FindBy(xpath = LogoutData.LOGOUT_BUTTON)
    private WebElement logoutButton;

    @FindBy(xpath = LogoutData.LOGOUT_TEXT)
    private WebElement logoutText;

    public void logout()  {

        logoutButton.click();
    }

    public boolean isTextVisible() {

        return logoutText.isDisplayed();
    }
}
