package TestNGDemos.Demos;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassTwo {

    @Parameters({"myUrl","os"})
    @Test
    public void classTwoTest1(String u,String os)
    {
        System.out.println(os);
        System.out.println(u);
        System.out.println("classTwoTest1");
    }
    @Test (groups = "email")
    public void classTwoTest2()
    {

        System.out.println("classTwoTest2");
    }
    @Test
    public void classTwoTest3()
    {
        System.out.println("classTwoTest3");
    }

}
