package com.example.bai05;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        assertEquals(15, calculator.add(10, 5));
    }

    @Test
    void testSubtract() {
        assertEquals(5, calculator.subtract(10, 5));
    }

    @Test
    void testMultiply() {
        assertEquals(50, calculator.multiply(10, 5));
    }

    @Test
    void testDivide() {
        assertEquals(2, calculator.divide(10, 5));
    }

    @Test
    void testDivideByZero() {
        assertThrows(
                IllegalArgumentException.class,
                () -> calculator.divide(10, 0)
        );
    }

    @Test
    void testMaxWhenFirstNumberIsGreater() {
        assertEquals(10, calculator.max(10, 5));
    }

    @Test
    void testMaxWhenSecondNumberIsGreater() {
        assertEquals(20, calculator.max(10, 20));
    }

    @Test
    void testMin() {
        assertEquals(5, calculator.min(10, 5));
    }

    @Test
    void testIsEven() {
        assertEquals(true, calculator.isEven(10));
    }

    @Test
    void testAbs() {
        assertEquals(10, calculator.abs(-10));
    }
}