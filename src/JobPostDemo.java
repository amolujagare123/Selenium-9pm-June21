import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JobPostDemo {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.click.in/pune/classifieds/60/post.html");

        WebElement cityList = driver.findElement(By.name("source_118[]"));

        Select selCityList = new Select(cityList);

        selCityList.selectByIndex(1);
        selCityList.selectByIndex(2);
        selCityList.selectByIndex(4);

        WebElement btnAdd =
        driver.findElement(By.xpath("//*[@id=\"post_form\"]/div[2]/table/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/img[1]"));

        btnAdd.click();

        WebElement addedCities = driver.findElement(By.id("fld_118"));

        Select selAddedCities = new Select(addedCities);

        selAddedCities.selectByIndex(1);
        selAddedCities.selectByIndex(2);

        WebElement btnRemove =
                driver.findElement(By.xpath("//*[@id=\"post_form\"]/div[2]/table/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/img[2]"));
        btnRemove.click();
    }
}
