package exercise11;

import org.junit.Ignore;
import org.junit.Test;

public class TestIgnore {

    @Test
    public void test1(){

    }

    @Test
    @Ignore
    public void ignoredTest(){

    }

    @Test
    @Ignore(value = "Test ignored because of ...")
    public void ignoredTestReason(){

    }
}
