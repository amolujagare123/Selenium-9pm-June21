import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class SeleniumOpera {

    public static void main(String[] args) {

        System.setProperty("webdriver.opera.driver","Drivers/operadriver.exe");

        WebDriver driver = new OperaDriver();

        driver.manage().window().maximize();

        driver.get("http://gmail.com");


    }
}
