package exercise3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EqualityValidation {

    @Test
    public void equalityValidation_Success(){
        String result = "Registration saved successfully!";
        assertEquals("Registration saved successfully!", result);
    }

    @Test
    public void equalityValidation_Fail(){
        String result = "Registration deleted successfully!";
        assertEquals("Registration saved successfully!", result);
    }
}
