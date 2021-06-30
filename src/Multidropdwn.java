import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multidropdwn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.click.in/pune/classifieds/60/post.html");
		System.out.println(driver.getTitle());
		
		//Role 
		WebElement Role = driver.findElement(By.xpath("//select[@name='fld_496[]']"));
		Select Role1 = new Select(Role);
		Role1.selectByValue("9");
	/*
		//Experience Min
		WebElement ExpMin = driver.findElement(By.xpath("//span[@id='select2-chosen-1']"));
		Select Min = new Select(Role);
		Min.selectByVisibleText("1");
		
		//Experience Max
		WebElement ExpMax = driver.findElement(By.id("select2-chosen-2"));
		Select Max = new Select(Role);
		Max.selectByVisibleText("4");*/
		

	}

}
