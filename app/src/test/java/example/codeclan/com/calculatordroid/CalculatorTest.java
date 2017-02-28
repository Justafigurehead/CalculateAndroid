package example.codeclan.com.calculatordroid;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculate;

    @Before
    public void before(){
        calculate = new Calculator();
    }

// Tests

    @Test
    public void addTwoNumbersTogether(){
        assertEquals(5, calculate.add(2,3) );
    }

    @Test
    public void subtractNumbers(){
        assertEquals(2, calculate.subtract(2,4));
    }
}
