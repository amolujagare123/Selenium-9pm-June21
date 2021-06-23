import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo2 {

    public static void main(String[] args) {

        // open a browser

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://gmail.com");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());



    }
}
