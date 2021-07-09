package TestNGDemos.Sites;

import TestNGDemos.Sites.init.Initialize;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SocialSites extends Initialize {

    @Test
    public void facebook()
    {
        driver.get("http://facebook.com");
    }

    @Test (priority = 4)
    public void twitter()
    {
        driver.get("http://twitter.com");
    }

    @Test (priority = 3)
    public void instagram()
    {
        driver.get("http://instagram.com");
    }

    @Test (priority = 1)
    public void linkedIn()
    {
        driver.get("http://linkedIn.com");
    }

}
