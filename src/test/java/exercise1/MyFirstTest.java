package exercise1;

import org.junit.Test;

public class MyFirstTest {

    @Test
    public void test1(){
        System.out.println("Test1 performed.");
    }

    @Test
    public void test2(){
        System.out.println("Test2 performed.");
    }

    public void notATest(){
        System.out.println("This message should not appear.");
    }
}
