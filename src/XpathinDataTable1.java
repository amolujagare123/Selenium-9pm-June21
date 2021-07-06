import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathinDataTable1 {

    public static void main(String[] args) {

        //tr[td[text()='Galaxy']]//img[@alt='edit']

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://openclinic.sourceforge.net/openclinic/admin/staff_list.php");
        String name ="Galaxy";

        driver.findElement(By.xpath("//tr[td[text()='"+name+"']]//img[@alt='edit']")).click();
    }
}
