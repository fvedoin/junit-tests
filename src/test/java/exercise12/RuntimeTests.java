package exercise12;

import org.junit.Test;

import static org.junit.Assert.*;

public class RuntimeTests {

    @Test(timeout = 1000)
    public void skipTimeout(){
        assertTrue(true);
    }

    @Test(timeout = 1000)
    public void timeoutWithError() throws InterruptedException {
        Thread.sleep(1001);
    }
}
