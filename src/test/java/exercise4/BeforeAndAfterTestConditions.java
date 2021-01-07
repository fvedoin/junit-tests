package exercise4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BeforeAndAfterTestConditions {

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
}
