package com.test;

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculating = true;

        while (continueCalculating) {
            System.out.println.("Enter the numbers separetad by space:");
            String input = scanner.nextLine();
            String[] numbers = input.split("");
            if (numbers.length < 2) {
                System.out.println("Invalid input. Please enter at least two numbers.");
                continue;
            }

            double [] operands = new double[ numbers.length -1];
            for (int i = 0; i < numbers.length -1; i++) {
                try {
                    operands[i] = Double.parseDouble(numbers[i]);
                } catch (NumbersFormatException e) {
                    System.out.println("Invalid input. Please enter at least two numbers.");
                    continueCalculating = false;
                    break;
                }
            }

            if (!continueCalculating) {
                continue;
            }

            char operator = numbers[numbers.length -1].charAt(0);

            double result;

            switch (operator) {
                case'+':
                    result = add(operands);
                    break;
                case '-':
                    result = subtract(operands);
                    break;
                case '*':
                    result = multiply(operands);
                    break;
                case '/':
                    result = divide(operands);
                    break;
                default:
                    System.out.println("Invalid operator. Please enter a valid operator(+, -, *, /).");
                    continueCalculating = false;
                    continue;
            }

            System.out.println("Result: " + result);

            System.out.println("Do you want to perform another calculation? (y/n)");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("n")) {
                continueCalculating = false;
            }
        }
        scanner.close();
    }

}
