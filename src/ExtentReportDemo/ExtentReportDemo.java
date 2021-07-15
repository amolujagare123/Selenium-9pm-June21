package ExtentReportDemo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

import static ExtentReportDemo.utilForReport.Screenshot.takescreenshot;

public class ExtentReportDemo {

    ExtentReports extent;
    @BeforeClass
    public void initReport()
    {
        ExtentSparkReporter reporter = new ExtentSparkReporter("Report\\report.html");
        extent = new ExtentReports();
        extent.attachReporter(reporter);

        reporter.config().setDocumentTitle("My Report Document");
        reporter.config().setReportName("Regression report");

        extent.setSystemInfo("Project name","stock management");
        extent.setSystemInfo("Developers name","Hemangi");
        extent.setSystemInfo("Testers Name","Avinash");
        extent.setSystemInfo("DeadLine","7 aug 2021");
        extent.setSystemInfo("Testing tool","Selenium");

    }


    @Test
    public void loginTest1() throws IOException {

        ExtentTest test = extent.createTest("valid LoginTest");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        test.info("Browser is opened");

        driver.manage().window().maximize();

        test.info("Browser is maximize");

        driver.get("http://stock.scriptinglogic.net/");

        test.info("Website is opened");

        WebElement txtUser = driver.findElement(By.id("login-username"));
        txtUser.sendKeys("admin");

        test.info("username is entered");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");
        test.info("password is entered");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();
        test.info("login button is clicked");

        String expected = "POSNIC - Dashboard-1";
        String actual = driver.getTitle();
        // using url
        System.out.println("actual="+actual);
        System.out.println("expected="+expected);

        try {
            Assert.assertEquals(actual, expected, "this is not a dashboard");
            test.pass("this is a dashboard");
        }
        catch (AssertionError e)
        {
            test.fail(e.getMessage());
            test.addScreenCaptureFromPath("./screenshots/"+takescreenshot(driver));
        }

    }

    @Test
    public void loginTest2() throws IOException {

        ExtentTest test = extent.createTest("invalid LoginTest");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        test.info("Browser is opened");

        driver.manage().window().maximize();

        test.info("Browser is maximize");

        driver.get("http://stock.scriptinglogic.net/");

        test.info("Website is opened");

        WebElement txtUser = driver.findElement(By.id("login-username"));
        txtUser.sendKeys("adewemin");

        test.info("username is entered");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("aewedmin");
        test.info("password is entered");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();
        test.info("login button is clicked");

        String expected = "http://stock.scriptinglogic.net/index.php?msg=Wrong%20Username%20or%20Password&type=error";
        String actual = driver.getCurrentUrl();
        // using url
        System.out.println("actual="+actual);
        System.out.println("expected="+expected);

        try {
            Assert.assertEquals(actual, expected, "this is not a dashboard");
            test.pass("this is a Login page");
        }
        catch (AssertionError e)
        {
            test.fail(e.getMessage());
            test.addScreenCaptureFromPath("./screenshots/"+takescreenshot(driver));
        }

    }

    @Test
    public void loginTest3() throws IOException {

        ExtentTest test = extent.createTest("Blank LoginTest");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        test.info("Browser is opened");

        driver.manage().window().maximize();

        test.info("Browser is maximize");

        driver.get("http://stock.scriptinglogic.net/");

        test.info("Website is opened");

        WebElement txtUser = driver.findElement(By.id("login-username"));
        txtUser.sendKeys("");

        test.info("username is entered");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("");
        test.info("password is entered");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();
        test.info("login button is clicked");

        String expected = "http://stock.scriptinglogic.net";
        String actual = driver.getCurrentUrl();
        // using url
        System.out.println("actual="+actual);
        System.out.println("expected="+expected);

        try {
            Assert.assertEquals(actual, expected, "this is not a dashboard");
            test.pass("this is a Login page");
        }
        catch (AssertionError e)
        {
            test.fail(e.getMessage());
            test.addScreenCaptureFromPath("./screenshots/"+takescreenshot(driver));
        }

    }

    @AfterClass
    public void writeReport()
    {
        extent.flush();
    }

}