package edu.unac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.add(1, 2));
    }

    @Test
    void testMultiplication(){
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    void testSubtraction(){
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.sub(2, 1));
    }

    @Test
    void testDivision(){
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.div(4, 2));
    }
}