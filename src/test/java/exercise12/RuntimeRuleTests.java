package exercise12;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import static org.junit.Assert.assertTrue;

public class RuntimeRuleTests {

    @Rule
    public Timeout globalTimeout = Timeout.seconds(1);

    @Test
    public void timeoutWithError() throws InterruptedException {
        Thread.sleep(1001);
    }

}
