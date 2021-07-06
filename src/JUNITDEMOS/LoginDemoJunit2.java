package JUNITDEMOS;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemoJunit2 {

    static WebDriver driver;

    @BeforeClass // the method written below this annotation will run before first test method of the class
    public static void openBrowser()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass //the method written below this annotation will run after the last test method of the class
    public static void closeBrowser() throws InterruptedException {
        Thread.sleep(4000);
        driver.close();
    }



    @Test
    public void Test1() throws InterruptedException {


        driver.get("http://stock.scriptinglogic.net/");

        WebElement txtUser = driver.findElement(By.cssSelector("#login-username"));
        txtUser.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.cssSelector("#login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.cssSelector("[type=submit]"));
      //  btnLogin.click();


    }

    @Test
    public void Test2() throws InterruptedException {


        driver.get("http://stock.scriptinglogic.net/");

        WebElement txtUser = driver.findElement(By.cssSelector("#login-username"));
        txtUser.sendKeys("jkjk");

        WebElement txtPassword = driver.findElement(By.cssSelector("#login-password"));
        txtPassword.sendKeys("kjkk");

        WebElement btnLogin = driver.findElement(By.cssSelector("[type=submit]"));
      //  btnLogin.click();


    }

    @Test
    public void Test3() throws InterruptedException {



        driver.get("http://stock.scriptinglogic.net/");

        WebElement txtUser = driver.findElement(By.cssSelector("#login-username"));
        txtUser.sendKeys("");

        WebElement txtPassword = driver.findElement(By.cssSelector("#login-password"));
        txtPassword.sendKeys("");

        WebElement btnLogin = driver.findElement(By.cssSelector("[type=submit]"));
       // btnLogin.click();


    }
}
