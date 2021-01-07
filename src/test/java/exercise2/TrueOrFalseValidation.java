package exercise2;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TrueOrFalseValidation {

    @Test
    public void trueValidation_Success(){
        boolean fieldIsPresent = true;
        assertTrue(fieldIsPresent);
    }

    @Test
    public void trueValidation_Fail(){
        boolean fieldIsPresent = true;
        assertFalse("Field is not present.", fieldIsPresent);
    }
}
