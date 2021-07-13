package TestNGDemos.AssertsDemos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertDemo1 {

    @Test
    public void loginOperation()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://stock.scriptinglogic.net/");

        WebElement txtUser = driver.findElement(By.id("login-username"));
        txtUser.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

       /* String expected = "POSNIC - Dashboard1";
        String actual = driver.getTitle();
        // using url
        System.out.println("actual="+actual);
        System.out.println("expected="+expected);

        Assert.assertEquals(actual,expected,"this is not a dashboard");*/

        //org.junit.Assert.assertEquals("",expected,actual);

        String expected ="Log out";
        String actual="";
        try {
             actual = driver.findElement(By.cssSelector("a.menu-logoff")).getText();
        }
        catch (Exception e)
        {

        }
        System.out.println("actual="+actual);
        System.out.println("expected="+expected);
        Assert.assertEquals(actual,expected,"this is not a dashboard");


    }

}
