package pl.b2b.eurobank.page.transferPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TransferObject {
    private WebDriver webDriver;
    private WebDriverWait webDriverWait;


    public TransferObject(WebDriver webDriver, WebDriverWait webDriverWait) {
        this.webDriver = webDriver;
        this.webDriverWait = webDriverWait;
        PageFactory.initElements(webDriver, this);
    }


//    @FindBy(xpath = TransferData.CHOOSE_TAX_FORM)
//    private WebElement chooseTaxForm;

    @FindBy(xpath = TransferData.CHOOSE_TAX_FORM_NUMBER)
    private WebElement chooseTaxFormNumber;

    @FindBy(xpath = TransferData.INSERT_REVENUE_OFFICE)
    private WebElement insertReveueOffice;

    @FindBy(xpath = TransferData.INSERT_TAX_OFFICE_ACCOUNT)
    private WebElement insertTaxOfficeAccount;

    @FindBy(xpath = TransferData.TAXPAYER_NAME)
    private WebElement taxpayerName;

    @FindBy(xpath = TransferData.SHOW_TAXPAYER_ADRRESS_BUTTON)
    private WebElement showTaxPayerAddressButoon;

    @FindBy(xpath = TransferData.TAXPAYER_ADDRESS)
    private WebElement taxpayerAddresss;

    @FindBy(xpath = TransferData.TAXPAYER_ZIPCODE)
    private WebElement taxpayerZipCode;

    @FindBy(xpath = TransferData.SELECT_ID_TYPE_LIST_BUTTON)
    private WebElement selectIdTypeListButton;

    @FindBy(xpath = TransferData.SELECT_ID_TYPE)
    private WebElement selectIdType;

    @FindBy(xpath = TransferData.INSERT_ID_NUMBER)
    private WebElement insertIdNumber;

    @FindBy(xpath = TransferData.OBLIGATION_ID)
    private WebElement obligationId;

    @FindBy(xpath = TransferData.YEAR_OF_SETTLEMENT)
    private WebElement yearOfSettlement;

    @FindBy(xpath = TransferData.SETTLEMENT_PERIOD_LIST_BUTTON)
    private WebElement settlementPeriodListButton;

    @FindBy(xpath = TransferData.CHOOSE_SETTLEMENT_PERIOD)
    private WebElement chooseSettlement;

//    @FindBy(xpath = TransferData.QUARTER_LIST_BUTTON)
//    private WebElement quarterListButton;

    @FindBy(xpath = TransferData.QUARTER_NUMBER)
    private WebElement quarterNumber;

    @FindBy(xpath = TransferData.TRANSFER_AMOUNT)
    private WebElement transferAmount;

    @FindBy(xpath = TransferData.CHECKBOX_EMAIL_CONFIRAMATION)
    private WebElement checkboxEmailConfiramtion;

    @FindBy(xpath = TransferData.INPUT_EMAIL)
    private WebElement inputEmail;

    @FindBy(xpath = TransferData.CONFIRM_BUTTON)
    private WebElement confirmButton;

    @FindBy(xpath = TransferData.MODIFIY_BUTTON_VISIBLE)
    private WebElement modifyButton;


//    private void chooseTaxForm() {
//        webDriverWait.until(ExpectedConditions.visibilityOf(chooseTaxForm));
//        chooseTaxForm.click();
//    }

    private void chooseTaxFormNumber(String taxFormNumber) {
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.id("form_payment_symbol")));
        Select select = new Select(chooseTaxFormNumber);
        select.selectByVisibleText(taxFormNumber);
    }

    private void insertRvenueOffice(String revenueOffice) {
        webDriverWait.until(ExpectedConditions.visibilityOf(insertReveueOffice));
        insertReveueOffice.clear();
        insertReveueOffice.sendKeys(revenueOffice);
    }

    private void insertTaxOfficeAccount(String account) {
        webDriverWait.until(ExpectedConditions.visibilityOf(insertTaxOfficeAccount));
        insertTaxOfficeAccount.clear();
        insertTaxOfficeAccount.sendKeys(account);
    }

    private void insertTaxPayerName(String taxpayer) {
        webDriverWait.until(ExpectedConditions.visibilityOf(taxpayerName));
        taxpayerName.clear();
        taxpayerName.sendKeys(taxpayer);
    }

    private void clickOnTaxpayerAddressButton() {
        webDriverWait.until(ExpectedConditions.visibilityOf(showTaxPayerAddressButoon));
        showTaxPayerAddressButoon.click();
    }

    private void insertTaxpayerAddress(String address) {
        webDriverWait.until(ExpectedConditions.visibilityOf(taxpayerAddresss));
        taxpayerAddresss.clear();
        taxpayerAddresss.sendKeys(address);
    }

    private void insertTaxpayerZipCode(String zipcode) {
        webDriverWait.until(ExpectedConditions.visibilityOf(taxpayerZipCode));
        taxpayerZipCode.clear();
        taxpayerZipCode.sendKeys(zipcode);
    }

    private void clickOnIdTypeListButton() {
        webDriverWait.until(ExpectedConditions.visibilityOf(selectIdTypeListButton));
        selectIdTypeListButton.click();
    }

    private void selectIdType(String idType) {
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.id("form_payer_identity_type")));
        Select select = new Select(selectIdType);
        select.selectByVisibleText(idType);
    }

    private void insertIdNumber(String idNumber) {
        webDriverWait.until(ExpectedConditions.visibilityOf(insertIdNumber));
        insertIdNumber.clear();
        insertIdNumber.sendKeys(idNumber);
    }

    private void insertObligationNumber(String obligationNumber) {
        webDriverWait.until(ExpectedConditions.visibilityOf(obligationId));
        obligationId.clear();
        obligationId.sendKeys(obligationNumber);
    }

    private void yearOfSettlement(String year) {
        webDriverWait.until(ExpectedConditions.visibilityOf(yearOfSettlement));
        yearOfSettlement.clear();
        yearOfSettlement.sendKeys(year);
    }

    private void clickOnSettlementPeriodList() {
        webDriverWait.until(ExpectedConditions.visibilityOf(settlementPeriodListButton));
        settlementPeriodListButton.click();
    }

    private void chooseSettlement() {
        webDriverWait.until(ExpectedConditions.visibilityOf(chooseSettlement));
        chooseSettlement.click();
    }

//    private void clickOnQuarterListButton() {
//        webDriverWait.until(ExpectedConditions.visibilityOf(quarterListButton));
//        quarterListButton.click();
//    }

    private void insertQuarterNumber(String quarter) {
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.id("form_period_quarter")));
        Select select = new Select(quarterNumber);
        select.selectByVisibleText(quarter);
    }

    private void inserTransferAmount(String amount) {
        webDriverWait.until(ExpectedConditions.visibilityOf(transferAmount));
        transferAmount.clear();
        transferAmount.sendKeys(amount);
    }

    private void clickOnCheckboxEmailConfiramtion() {
        webDriverWait.until(ExpectedConditions.visibilityOf(checkboxEmailConfiramtion));
        checkboxEmailConfiramtion.click();
    }

    private void insertEmailAddress(String email) {
        webDriverWait.until(ExpectedConditions.visibilityOf(inputEmail));
        inputEmail.clear();
        inputEmail.sendKeys(email);
    }

    private void clickOnConfirmButton() {
        webDriverWait.until(ExpectedConditions.visibilityOf(confirmButton));
        confirmButton.click();
    }

    public boolean isModifyButtonDisplayed() {
        return modifyButton.isDisplayed();
    }

    public void transferForm(String taxFormNumber, String revenueOffice, String account, String taxpayer, String address,
                             String zipcode, String idType, String idNumber, String obligationNumber, String year, String quarter, String amount, String email) {

        //   chooseTaxForm();
        chooseTaxFormNumber(taxFormNumber);
        insertRvenueOffice(revenueOffice);
        insertTaxOfficeAccount(account);
        insertTaxPayerName(taxpayer);
        clickOnTaxpayerAddressButton();
        insertTaxpayerAddress(address);
        insertTaxpayerZipCode(zipcode);
        clickOnIdTypeListButton();
        selectIdType(idType);
        insertIdNumber(idNumber);
        insertObligationNumber(obligationNumber);
        yearOfSettlement(year);
        clickOnSettlementPeriodList();
        chooseSettlement();
       // clickOnQuarterListButton();
        insertQuarterNumber(quarter);
        inserTransferAmount(amount);
        clickOnCheckboxEmailConfiramtion();
        insertEmailAddress(email);
        clickOnConfirmButton();
    }

}
