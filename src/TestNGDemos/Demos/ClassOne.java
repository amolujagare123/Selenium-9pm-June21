package TestNGDemos.Demos;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassOne {

    @BeforeTest
    public void beforeMyTest()
    {
        System.out.println("beforeMyTest");
    }

    @AfterTest
    public void afterMyTest()
    {
        System.out.println("afterMyTest");
    }


    @Parameters({"myUrl","os"})
    @Test
    public void classOneTest1(String u,String os)
    {
        System.out.println(os);
        System.out.println(u);
        System.out.println("classOneTest1");
    }
    @Test (groups = "email")
    public void classOneTest2()
    {
        System.out.println("classOneTest2");
    }
    @Test
    public void classOneTest3()
    {
        System.out.println("classOneTest3");
    }

}
