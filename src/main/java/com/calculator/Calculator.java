package com.calculator;

import java.util.ArrayList;
import java.util.Stack;

public class Calculator {


    public static double evaluateExpression(String expression) {
        // Remove spaces
        expression = expression.replaceAll(" ", "");

        ArrayList<Character> operators = new ArrayList<>();
        ArrayList<Double> numbers = new ArrayList<>();
        Stack<Double> stack = new Stack<>();

        int i = 0;
        while (i < expression.length()) {
            char currentChar = expression.charAt(i);

            if (Character.isDigit(currentChar) || currentChar == '.') {
                StringBuilder number = new StringBuilder();
                while (i < expression.length() && (Character.isDigit(expression.charAt(i)) || expression.charAt(i) == '.')) {
                    number.append(expression.charAt(i));
                    i++;
                }
                numbers.add(Double.parseDouble(number.toString()));
            } else if (currentChar == '(') {
                stack.push((double) i);
                i++;
            } else if (currentChar == ')') {
                int start = stack.pop().intValue();
                String subExpression = expression.substring(start + 1, i);
                numbers.add(evaluateExpression(subExpression));
                i++;
            } else if (currentChar == '+' || currentChar == '-' || currentChar == '*' || currentChar == '/') {
                operators.add(currentChar);
                i++;
            }
        }

        return calculate(numbers, operators);
    }

    private static double calculate(ArrayList<Double> numbers, ArrayList<Character> operators) {
        Stack<Double> numStack = new Stack<>();
        numStack.push(numbers.get(0));
        for (int i = 1; i < numbers.size(); i++) {
            char operator = operators.get(i - 1);
            double number = numbers.get(i);
            if (operator == '+') {
                numStack.push(numStack.pop() + number);
            } else if (operator == '-') {
                numStack.push(numStack.pop() - number);
            } else if (operator == '*') {
                numStack.push(numStack.pop() * number);
            } else if (operator == '/') {
                numStack.push(numStack.pop() / number);
            }
        }
        return numStack.pop();
    }
}
