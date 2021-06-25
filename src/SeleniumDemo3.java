import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo3 {

    public static void main(String[] args) throws InterruptedException {

        // open a browser

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.naukri.com/");

        Thread.sleep(4000);

       // driver.close();

        driver.quit();



    }
}
