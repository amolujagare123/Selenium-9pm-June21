package TestNGDemos.Sites;

import TestNGDemos.Sites.init.Initialize;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class forumsSites extends Initialize {


    @Test
    public void stackoverflow()
    {
        driver.get("http://stackoverflow.com");
    }

    @Test
    public void sqaforums()
    {
        driver.get("http://sqaforums.com");

        Assert.assertEquals(true,false,"forums test is failed");

    }

    @Test
    public void quora()
    {
        driver.get("http://quora.com");
    }


}
