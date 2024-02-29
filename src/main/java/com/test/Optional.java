package com.test;

public class Optional {
    private static double add(double[] numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum;
    }

    private static double subtract(double[] numbers) {
        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
        result -= numbers[i];
    }
        return result;
}
    private static double multiply(double[] numbers) {
        double product = 1;
        for (double number : numbers) {
            product *= number;
        }
        return product;
    }

    private static double divide(double[] numbers) {
        if (numbers.length  != 2) {
            throw new IllegalArgumentException("Division requires exactly two operands.");
        }
        double result = numbers[0];
        for (int i = 1; < numbers.length; i++) {
            if (numbers[i] = 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }
            result /= numbers[i];
        }
        return result;
    }
}
