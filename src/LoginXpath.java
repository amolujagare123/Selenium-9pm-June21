import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginXpath {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://stock.scriptinglogic.net/");

        WebElement txtUser = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUser.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@type='password']"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.xpath("//input[@value='LOG IN']"));
        btnLogin.click();

        WebElement lnkAddCustomer = driver.findElement(By.xpath("//a[text()='Add Customer']"));
       // WebElement lnkAddCustomer = driver.findElement(By.xpath("//a[@href='add_customer.php']"));
        lnkAddCustomer.click();

        WebElement txtName = driver.findElement(By.xpath("//input[@id='name']"));
        txtName.sendKeys("mithilesh");

        WebElement txtAddress = driver.findElement(By.xpath("//textarea[@name='address']"));
        txtAddress.sendKeys("xyz,pune");

        WebElement txtContact1 = driver.findElement(By.xpath("//input[@name='contact1']"));
        txtContact1.sendKeys("7788");

        WebElement txtContact2 = driver.findElement(By.xpath("//input[@name='contact2']"));
        txtContact2.sendKeys("17788");

        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }

    }
