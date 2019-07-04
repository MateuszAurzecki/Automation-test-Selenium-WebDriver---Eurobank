package pl.b2b.eurobank.page.loginPage;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pl.b2b.eurobank.cfg.SingletonWebDriver;

public class LoginTest {

    private LoginObject loginObject;

    @BeforeClass
    public void setUp() {
        loginObject = new LoginObject(SingletonWebDriver.getWebDriver(), SingletonWebDriver.getWebDriverWait());
        Assert.assertNotNull(loginObject);
    }

    @Test
    @Parameters({"login", "password", "url"})
    public void loginTest(String login, String password, String url) {
        loginObject.logIn(login, password);
        Assert.assertNotNull(SingletonWebDriver.getWebDriver().getCurrentUrl(), url);
    }
}
