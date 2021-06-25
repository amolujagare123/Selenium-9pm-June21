import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDrpListDemo {


    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("file:///D:/Scriptinglogic%20docs/class%20Activities/Selenium/Mywebsite/amol.html");

        WebElement mulSelList = driver.findElement(By.id("multiSel"));

        Select selList = new Select(mulSelList);

        Thread.sleep(4000);

        selList.selectByVisibleText("text 1");
        Thread.sleep(4000);
        selList.selectByIndex(2);
        Thread.sleep(4000);
        selList.selectByIndex(3);

        /*Thread.sleep(4000);
        selList.deselectByIndex(3);

        Thread.sleep(4000);
        selList.deselectByIndex(2);

        Thread.sleep(4000);
        selList.deselectByIndex(0);*/
        Thread.sleep(4000);
        selList.deselectAll();




    }


}
