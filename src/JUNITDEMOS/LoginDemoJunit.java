package JUNITDEMOS;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemoJunit {

    WebDriver driver;

    @Before // the method written below this annotation will run before every test method
    public void openBrowser()
    {
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After //the method written below this annotation will run after every test method
    public void closeBrowser() throws InterruptedException {
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
        btnLogin.click();


    }

    @Test
    public void Test2() throws InterruptedException {


        driver.get("http://stock.scriptinglogic.net/");

        WebElement txtUser = driver.findElement(By.cssSelector("#login-username"));
        txtUser.sendKeys("jkjk");

        WebElement txtPassword = driver.findElement(By.cssSelector("#login-password"));
        txtPassword.sendKeys("kjkk");

        WebElement btnLogin = driver.findElement(By.cssSelector("[type=submit]"));
        btnLogin.click();


    }

    @Test
    public void Test3() throws InterruptedException {



        driver.get("http://stock.scriptinglogic.net/");

        WebElement txtUser = driver.findElement(By.cssSelector("#login-username"));
        txtUser.sendKeys("");

        WebElement txtPassword = driver.findElement(By.cssSelector("#login-password"));
        txtPassword.sendKeys("");

        WebElement btnLogin = driver.findElement(By.cssSelector("[type=submit]"));
        btnLogin.click();


    }
}
