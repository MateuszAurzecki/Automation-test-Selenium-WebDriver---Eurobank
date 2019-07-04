package pl.b2b.eurobank.page.loginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginObject {
    private WebDriver webDriver;
    private WebDriverWait webDriverWait;

    public LoginObject(WebDriver webDriver, WebDriverWait webDriverWait) {
        this.webDriver = webDriver;
        this.webDriverWait = webDriverWait;
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = LoginData.LOGIN_FIELD)
    private WebElement loginField;

    @FindBy(xpath = LoginData.LOGIN_NEXT_BUTTON)
    private WebElement loginNextButton;

    @FindBy(xpath = LoginData.PASSWORD_INPUT)
    private WebElement passworInput;

    private void inputLogin(String login) {
        webDriverWait.until(ExpectedConditions.visibilityOf(loginField));
        loginField.clear();
        loginField.sendKeys(login);
    }

    private void clickNextButton() {
        webDriverWait.until(ExpectedConditions.visibilityOf(loginNextButton));

        loginNextButton.click();
    }

    private void inputPassword(String password) {
        webDriverWait.until(ExpectedConditions.visibilityOf(passworInput));
        passworInput.clear();
        passworInput.sendKeys(password);
    }

    public void logIn(String login, String password) {
        inputLogin(login);
        clickNextButton();
        inputPassword(password);
        clickNextButton();
    }


}
