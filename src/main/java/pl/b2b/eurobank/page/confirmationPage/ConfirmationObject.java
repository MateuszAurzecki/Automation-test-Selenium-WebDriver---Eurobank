package pl.b2b.eurobank.page.confirmationPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfirmationObject {

    private WebDriver webDriver;
    private WebDriverWait webDriverWait;

    public ConfirmationObject(WebDriver webDriver, WebDriverWait webDriverWait) {
        this.webDriver = webDriver;
        this.webDriverWait = webDriverWait;
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = ConfirmationData.TOKEN_INPUT)
    private WebElement tokenInput;

    @FindBy(xpath = ConfirmationData.CONFIRM_BUTTON)
    private WebElement confirm;

    @FindBy(xpath = ConfirmationData.ANOTHER_TRANSFER_BUTTON)
    private WebElement anotherTransfer;



    private void tokenInput(String token) {
        webDriverWait.until(ExpectedConditions.visibilityOf(tokenInput));
        tokenInput.clear();
        tokenInput.sendKeys(token);
    }

    private void clickOnConfirmButton() {
        webDriverWait.until(ExpectedConditions.visibilityOf(confirm));
        confirm.click();
    }

    public boolean visibilityOfAotherTransferButton() {
        return anotherTransfer.isDisplayed();
    }


    public void confirmPage(String token) {
        tokenInput(token);
        clickOnConfirmButton();


    }


}
