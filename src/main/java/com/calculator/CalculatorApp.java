package com.calculator;

import java.util.Scanner;


public class CalculatorApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an expression (e.g. (-2-3)+(10*8)):");
        String expression = scanner.nextLine();

        double result = Calculator.evaluateExpression(expression);
        System.out.println("The result is: " + result);
    }
}
