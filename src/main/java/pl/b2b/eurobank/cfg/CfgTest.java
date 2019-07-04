package pl.b2b.eurobank.cfg;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CfgTest {

    @Test
    @Parameters({"driverPath"})
    public void setUp(String driverPath) {
        SingletonWebDriver.initialize(driverPath);
        Assert.assertNotNull(SingletonWebDriver.getWebDriver());
    }

    @Test
    @Parameters({"url"})
    public void openSite(String url) {
        SingletonWebDriver.getWebDriver().get(url);
        Assert.assertTrue(SingletonWebDriver.getWebDriver().getCurrentUrl().contains(url));
    }

    @Test
    public void tearUp() {
        SingletonWebDriver.quitDriver();
        Assert.assertNull(SingletonWebDriver.getWebDriver());
    }
}
