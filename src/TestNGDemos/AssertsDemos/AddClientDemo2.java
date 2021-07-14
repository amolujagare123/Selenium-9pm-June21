package TestNGDemos.AssertsDemos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AddClientDemo2 {
    WebDriver driver;
    @BeforeClass
    public void doLogin()
    {
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://stock.scriptinglogic.net/");

        WebElement txtUser = driver.findElement(By.id("login-username"));
        txtUser.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();
    }


    @Test
    public  void addClientTest() {

        WebElement lnkAddCustomer = driver.findElement(By.linkText("Add Customer"));
        lnkAddCustomer.click();

        String customerName = "mithilesh2";

        WebElement txtName = driver.findElement(By.id("name"));
        txtName.sendKeys(customerName);

        WebElement txtAddress = driver.findElement(By.name("address"));
        txtAddress.sendKeys("xyz,pune");

        WebElement txtContact1 = driver.findElement(By.name("contact1"));
        txtContact1.sendKeys("7788");

        WebElement txtContact2 = driver.findElement(By.name("contact2"));
        txtContact2.sendKeys("17788");

        driver.findElement(By.name("Submit")).click();

       String expected ="[ "+customerName+" ] Customer Details Added !";
        String actual="";
        try {
             actual = driver.findElement(By.cssSelector(".confirmation-box")).getText();
        }
        catch (Exception e)
        {

        }

        System.out.println("actual="+actual);
        System.out.println("expected="+expected);

        Assert.assertEquals(actual,expected,"incorrect error message");

    }
}
