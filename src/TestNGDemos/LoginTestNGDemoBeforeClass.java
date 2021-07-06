package TestNGDemos;

import io.github.bonigarcia.wdm.WebDriverManager;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class LoginTestNGDemoBeforeClass {

    WebDriver driver;

    @BeforeClass // the method written below this annotation will run before first test method of class
    public void openBrowser()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass // the method written below this annotation will run after last test method of class
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }


    @Test
    public void myLoginTest1() throws InterruptedException {


        driver.get("http://stock.scriptinglogic.net/");

        WebElement txtUser = driver.findElement(By.id("login-username"));
        txtUser.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
       // btnLogin.click();


    }

    @Test
    public void myLoginTest2() throws InterruptedException {


        driver.get("http://stock.scriptinglogic.net/");

        WebElement txtUser = driver.findElement(By.id("login-username"));
        txtUser.sendKeys("adsddmin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("adsddmin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
      //  btnLogin.click();


    }

    @Test
    public void myLoginTest3() throws InterruptedException {

        driver.get("http://stock.scriptinglogic.net/");

        WebElement txtUser = driver.findElement(By.id("login-username"));
        txtUser.sendKeys("");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("");

        WebElement btnLogin = driver.findElement(By.name("submit"));
       // btnLogin.click();


    }


}
