package pl.b2b.eurobank.report;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReportObject {

    private List<String> dataStrings = new ArrayList<>();
    private WebDriver webDriver;
    private WebDriverWait webDriverWait;

    public ReportObject(WebDriver webDriver, WebDriverWait webDriverWait) {
        this.webDriver = webDriver;
        this.webDriverWait = webDriverWait;
        PageFactory.initElements(webDriver, this);
    }

    @FindAll(@FindBy(xpath = ReportData.DATA_TO_REPORT_LIST))
    private List<WebElement> dataToReportList;

    @FindBy(xpath = ReportData.TRANSACTION_CODE)
    private WebElement transactionCode;

    @FindBy(xpath = ReportData.TRANSFER_STATUS)
    private WebElement transferStatus;

    @FindBy(xpath = ReportData.ANOTHER_TRANSFER_BUTTON)
    private WebElement confirmButton;


    public void reportList() {

        for (WebElement webElement : dataToReportList) {
            webDriverWait.until(ExpectedConditions.visibilityOf(webElement));
            dataStrings.add(webElement.getText());
        }
        dataStrings.add(transactionCode.getText());

    }


    public void modifyExisitingFile() throws IOException, InvalidFormatException {

        FileInputStream fileInputStream = new FileInputStream("reports/eurobankDemoUS.xlsx");
        Workbook workbook = new XSSFWorkbook(fileInputStream);
        reportList();
        Sheet sheet = workbook.getSheetAt(0);
            for (int i = 0; i < dataStrings.size(); i++) {
                Row row = sheet.getRow(1);
                Cell cell = row.getCell(i);

                if (cell == null)
                    cell = row.createCell(i);


                cell.setCellType(CellType.STRING);
                cell.setCellValue(dataStrings.get(i));


                FileOutputStream fileOut = new FileOutputStream("reports/eurobankDemoUS.xlsx");
                workbook.write(fileOut);
                fileOut.close();
            }

        // Closing the workbook
        workbook.close();

    }

    public void checkingStatus() throws IOException, InvalidFormatException {

        String status = transferStatus.getText();

        FileInputStream fileInputStream = new FileInputStream("reports/eurobankDemoUS.xlsx");
        Workbook workbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = workbook.getSheetAt(0);


        Row row = sheet.getRow(1);
        Cell cell = row.getCell(9);

        if (cell == null)
            cell = row.createCell(9);


        cell.setCellType(CellType.STRING);
        cell.setCellValue(status);


        FileOutputStream fileOut = new FileOutputStream("reports/eurobankDemoUS.xlsx");
        workbook.write(fileOut);
        fileOut.close();


        // Closing the workbook
        workbook.close();

    }
}
