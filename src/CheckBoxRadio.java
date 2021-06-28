import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxRadio {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("file:///D:/Scriptinglogic%20docs/class%20Activities/Selenium/Mywebsite/amol.html");

        driver.findElement(By.id("rad1")).click();

        WebElement cb1 = driver.findElement(By.id("check0"));
        WebElement cb2 = driver.findElement(By.id("check1"));
        WebElement cb3 = driver.findElement(By.id("check2"));

        if(!cb1.isSelected())
            cb1.click();

      /*  if(cb1.isSelected()==false)
            cb1.click();*/

        if(!cb2.isSelected())
            cb2.click();

        if(!cb3.isSelected())
            cb3.click();

        driver.findElement(By.id("alert")).click();


        Thread.sleep(4000);

        Alert  alert = driver.switchTo().alert();

        System.out.println(alert.getText());

        alert.accept();



    }
}
