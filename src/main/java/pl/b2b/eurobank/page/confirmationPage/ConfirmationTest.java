package pl.b2b.eurobank.page.confirmationPage;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pl.b2b.eurobank.cfg.SingletonWebDriver;

public class ConfirmationTest {

    private ConfirmationObject confirmationObject;

    @BeforeClass
    private void setUp() {
        confirmationObject = new ConfirmationObject(SingletonWebDriver.getWebDriver(), SingletonWebDriver.getWebDriverWait());
        Assert.assertNotNull(confirmationObject);
    }

    @Test
    @Parameters({"token"})
    public void confirmationPageTest(String token) {
        confirmationObject.confirmPage(token);
        Assert.assertTrue(confirmationObject.visibilityOfAotherTransferButton());
    }
}
