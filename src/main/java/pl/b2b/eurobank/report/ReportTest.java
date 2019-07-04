package pl.b2b.eurobank.report;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pl.b2b.eurobank.cfg.SingletonWebDriver;

import java.io.IOException;

public class ReportTest {

    private ReportObject reportObject;

    @BeforeClass
    private void setUp() {
        reportObject = new ReportObject(SingletonWebDriver.getWebDriver(), SingletonWebDriver.getWebDriverWait());
        Assert.assertNotNull(reportObject);
    }

    @Test
    public void reportTest() throws IOException, InvalidFormatException {
        reportObject.modifyExisitingFile();
    }

    @Test
    public void checkingStatus() throws IOException, InvalidFormatException {
        reportObject.checkingStatus();
    }





}
