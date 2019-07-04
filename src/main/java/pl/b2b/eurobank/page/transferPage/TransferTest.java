package pl.b2b.eurobank.page.transferPage;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pl.b2b.eurobank.cfg.SingletonWebDriver;

public class TransferTest {

    private TransferObject transferObject;

    @BeforeClass
    private void setUp() {
        transferObject = new TransferObject(SingletonWebDriver.getWebDriver(), SingletonWebDriver.getWebDriverWait());
        Assert.assertNotNull(transferObject);
    }

    @Test
    @Parameters({"taxFormNumber", "revenueOffice", "account", "taxpayer", "address", "zipcode", "idType", "idNumber", "obligationNumber", "year", "quarter", "amount", "email"})
    public void transferFormTest(String taxFormNumber, String revenueOffice, String account, String taxpayer, String address,
                                 String zipcode, String idType, String idNumber, String obligationNumber, String year, String quarter, String amount, String email) {

        transferObject.transferForm(taxFormNumber, revenueOffice, account, taxpayer, address, zipcode, idType, idNumber, obligationNumber, year, quarter, amount, email);
        Assert.assertTrue(transferObject.isModifyButtonDisplayed());
    }


}
