package ExtentReportDemo.utilForReport;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Screenshot {

    public static String takescreenshot(WebDriver driver) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;

        File scrFile = ts.getScreenshotAs(OutputType.FILE);

        String timeStamp = new SimpleDateFormat("_yyyyddMM_hhmmss")
                .format(new Date());

        String fileName = "IMG"+timeStamp+".png";

        FileUtils.copyFile(scrFile,new File("Report\\screenshots\\"+fileName));

        return fileName;

    }

}
