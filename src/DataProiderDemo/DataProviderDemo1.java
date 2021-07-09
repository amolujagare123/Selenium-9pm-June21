package DataProiderDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataProviderDemo1 {

    @Test (dataProvider = "getData")
    public void loginTest(String username, String password) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://stock.scriptinglogic.net/");

        WebElement txtUser = driver.findElement(By.id("login-username"));
        txtUser.sendKeys(username);

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys(password);

        Thread.sleep(4000);

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();
        driver.close();
    }

    @DataProvider
    public Object[][] getData() throws IOException {
        FileInputStream fis = new FileInputStream("Data/mydata.xls");
        HSSFWorkbook workbook = new HSSFWorkbook(fis);
        HSSFSheet sheet = workbook.getSheet("Sheet1");

        int rowCount = sheet.getPhysicalNumberOfRows();

        Object[][] data = new Object[rowCount][2];

        for(int i=0;i<rowCount;i++)
        {
            HSSFRow row = sheet.getRow(i);

            data[i][0] = row.getCell(0).toString().trim();
            data[i][1] = row.getCell(1).toString().trim();
        }
        return data;

    }
}
