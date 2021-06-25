import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class WebDriverManagerDemo {

    public static void main(String[] args) {

      /*  WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();*/

      /*  WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();*/

     /*   WebDriverManager.operadriver().setup();
        WebDriver driver = new OperaDriver();*/

        WebDriverManager.iedriver().setup();
        WebDriver driver = new InternetExplorerDriver();

        WebDriverManager.edgedriver().setup();
        WebDriver driver1 = new EdgeDriver();


    }
}
