package pl.b2b.eurobank.page.paymentPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaymentObject {

    private WebDriver webDriver;
    private WebDriverWait webDriverWait;

    public PaymentObject(WebDriver webDriver, WebDriverWait webDriverWait) {
        this.webDriver = webDriver;
        this.webDriverWait = webDriverWait;
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = PaymentData.PAYMENTS)
    private WebElement payment;

    @FindBy(xpath = PaymentData.TRANSFER_TO_REVENUE_SERVICE)
    private WebElement transfer;

    public void clickOnPayments(){
        webDriverWait.until(ExpectedConditions.visibilityOf(payment));
        payment.click();
    }

    public void clickOnTransferToRevenueService(){
        webDriverWait.until(ExpectedConditions.visibilityOf(transfer));
        transfer.click();
    }




}
