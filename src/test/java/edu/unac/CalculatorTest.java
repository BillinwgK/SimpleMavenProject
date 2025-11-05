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
}