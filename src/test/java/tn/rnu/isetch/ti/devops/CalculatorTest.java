package tn.rnu.isetch.ti.devops;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator= new Calculator();

    @org.junit.Test
    public void add() {
        assertEquals(5, calculator.add(3,2));
    }
}