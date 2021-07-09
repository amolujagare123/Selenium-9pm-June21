package TestNGDemos.Demos;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassThree {

    @BeforeSuite
    public void beforeMySuite()
    {
        System.out.println("beforeMySuite");
    }

    @AfterSuite
    public void afterMySuite()
    {
        System.out.println("afterMySuite");
    }

    @BeforeSuite
    public void anotherBeforeMySuite()
    {
        System.out.println("anotherBeforeMySuite");
    }

    @AfterSuite
    public void anotherAfterMySuite()
    {
        System.out.println("anotherAfterMySuite");
    }

    @Parameters({"myUrl","os"})
    @Test
    public void classThreeTest1(String u,String os)
    {
        System.out.println(os);
        System.out.println(u);
        System.out.println("classThreeTest1");
    }
    @Test(groups = "email")
    public void classThreeTest2()
    {
        System.out.println("classThreeTest2");
    }
    @Test
    public void classThreeTest3()
    {
        System.out.println("classThreeTest3");
    }

}
