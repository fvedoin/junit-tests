package exercise5;

import org.junit.*;

public class BeforeAndAfterClassTestConditions {

    @BeforeClass
    public static void beforeCondition_Class(){
        System.out.println("Runned before all");
    }

    @Before
    public void beforeCondition(){
        System.out.println("Before condition runned");
    }

    @Test
    public void test1(){
        System.out.println("Test1 runned");
    }

    @Test
    public void test2(){
        System.out.println("Test2 runned");
    }

    @After
    public void afterCondition(){
        System.out.println("After condition runned");
    }

    @AfterClass
    public static void afterCondition_Class(){
        System.out.println("Runned after all");
    }
}
