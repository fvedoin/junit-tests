package exercise13;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class FluentValidations {

    @Test
    public void equalsToValidation(){
        String product = "TV 40 inch";
        assertThat(product, equalTo("TV 40 inch"));
    }

    @Test
    public void isValidation(){
        int code = 50;
        assertThat(code, is(50));
    }

    @Test
    public void anyOfValidation(){
        String result = "The selected color was red.";
        assertThat(result, anyOf(containsString("red"), containsString("blue")));
    }

    @Test
    public void hasItemsValidation(){
        List<String> productList = new ArrayList<String>();
        productList.add("IPhone 12 pro");
        productList.add("Pocophone F2");
        productList.add("MiBand 5");

        assertThat(productList, hasItem("MiBand 5"));
    }
}
