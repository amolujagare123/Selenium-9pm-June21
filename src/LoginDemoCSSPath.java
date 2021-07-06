import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemoCSSPath {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://stock.scriptinglogic.net/");

        WebElement txtUser = driver.findElement(By.cssSelector("#login-username"));
        txtUser.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.cssSelector("#login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.cssSelector("[type=submit]"));
        btnLogin.click();

        driver.close();


        WebDriverManager.chromedriver().setup();
        WebDriver driver1 = new ChromeDriver();
        driver1.manage().window().maximize();

        driver1.get("http://stock.scriptinglogic.net/");

        WebElement txtUser1 = driver1.findElement(By.cssSelector("#login-username"));
        txtUser1.sendKeys("fgfgf");

        WebElement txtPassword1 = driver1.findElement(By.cssSelector("#login-password"));
        txtPassword1.sendKeys("gfgfg");

        WebElement btnLogin1 = driver1.findElement(By.cssSelector("[type=submit]"));
        btnLogin1.click();

        driver1.close();

        WebDriverManager.chromedriver().setup();
        WebDriver driver2 = new ChromeDriver();
        driver2.manage().window().maximize();

        driver2.get("http://stock.scriptinglogic.net/");

        WebElement txtUser2 = driver2.findElement(By.cssSelector("#login-username"));
        txtUser2.sendKeys("");

        WebElement txtPassword2 = driver2.findElement(By.cssSelector("#login-password"));
        txtPassword2.sendKeys("");

        WebElement btnLogin2 = driver2.findElement(By.cssSelector("[type=submit]"));
        btnLogin2.click();

        driver2.close();

    }
}
