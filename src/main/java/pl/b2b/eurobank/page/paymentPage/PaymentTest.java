package pl.b2b.eurobank.page.paymentPage;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pl.b2b.eurobank.cfg.SingletonWebDriver;

public class PaymentTest {

    private PaymentObject paymentObject;

    @BeforeClass
    public void setUp() {
        paymentObject = new PaymentObject(SingletonWebDriver.getWebDriver(),SingletonWebDriver.getWebDriverWait());
        Assert.assertNotNull(paymentObject);
    }

    @Test
    @Parameters({"url"})
    public void clickOnPaymentPageTest(String url){
        paymentObject.clickOnPayments();
        Assert.assertNotEquals(SingletonWebDriver.getWebDriver().getCurrentUrl(),url);
    }

    @Test
    @Parameters({"url"})
    public void clickOnTransferToRevenueServiceTest(String url){
        paymentObject.clickOnTransferToRevenueService();
        Assert.assertNotEquals(SingletonWebDriver.getWebDriver().getCurrentUrl(),url);
    }

}
