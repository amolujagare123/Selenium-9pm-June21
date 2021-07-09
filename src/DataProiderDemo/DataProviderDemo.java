package DataProiderDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

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
    public Object[][] getData()
    {
        Object[][] data = new Object[4][2];

        data[0][0] = "user-1";
        data[0][1] = "pass-1";

        data[1][0] = "user-2";
        data[1][1] = "pass-2";

        data[2][0] = "user-3";
        data[2][1] = "pass-3";

        data[3][0] = "user-4";
        data[3][1] = "pass-4";

        return data;

    }
}
