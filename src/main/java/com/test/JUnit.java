package com.test;
import static org.junit.jupiter.api.Assertions.asserEquals;

public class JUnit {

    @Test
    public void testAdd() {
        double[] numbers = {1, 2, 3};
        assertEquals(6,Calculator.add(numbers));
    }

    @Test
    public void testSubtract() {
        double[] numbers = {10, 5, 2};
        assertEquals(3,Calculator.subtract(numbers));
    }
    @Test
    public void testMultiply() {
        double[] numbers = {1, 2, 3};
        assertEquals(6,Calculator.Multiply(numbers));
    }
}