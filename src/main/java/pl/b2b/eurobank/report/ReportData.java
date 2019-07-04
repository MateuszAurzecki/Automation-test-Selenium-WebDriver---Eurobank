package pl.b2b.eurobank.report;

public class ReportData {

    public static final String DATA_TO_REPORT_LIST = "//div[@class=\"grid-20 grid-mt-23 grid-ms-48 form-detail\"]";
    public static final String TRANSACTION_CODE = "//div[@class =\"grid-24 grid-mt-12 grid-ms-16 form-static\"]";
    public static final String TRANSFER_STATUS = "//div[contains(@class, 'flash-msg flash-success') and text()= 'Przelew został przyjęty do realizacji. \n" +
            "                            ']";
    public static final String ANOTHER_TRANSFER_BUTTON = "//a[@class=\"btn red arrow\"]";
}
