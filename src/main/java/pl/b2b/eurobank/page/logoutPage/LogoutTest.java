package pl.b2b.eurobank.page.logoutPage;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pl.b2b.eurobank.cfg.SingletonWebDriver;

import java.io.IOException;

public class LogoutTest {

    private LogoutObject logoutObject;

    @BeforeClass
    public void setUp() {
        logoutObject = new LogoutObject(SingletonWebDriver.getWebDriver(), SingletonWebDriver.getWebDriverWait());
        Assert.assertNotNull(logoutObject);
    }



    @Test
    public void logoutTest() throws IOException, InvalidFormatException {
        logoutObject.logout();
        Assert.assertTrue(logoutObject.isTextVisible());
    }
}
