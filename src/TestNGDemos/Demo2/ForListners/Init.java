package TestNGDemos.Demo2.ForListners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Init {

    public static  ExtentReports initExtentReports()
    {
        ExtentSparkReporter reporter = new ExtentSparkReporter("Report\\report.html");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(reporter);

        reporter.config().setDocumentTitle("My Report Document");
        reporter.config().setReportName("Regression report");

        extent.setSystemInfo("Project name","stock management");
        extent.setSystemInfo("Developers name","Hemangi");
        extent.setSystemInfo("Testers Name","Avinash");
        extent.setSystemInfo("DeadLine","7 aug 2021");
        extent.setSystemInfo("Testing tool","Selenium");

        return extent;
    }
}
