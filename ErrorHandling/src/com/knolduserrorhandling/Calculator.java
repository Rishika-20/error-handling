package com.knolduserrorhandling;

public class Calculator {
    public static int getSum ( int firstNumber, int secondNumber) {
        int sum = firstNumber + secondNumber;
         return sum;
    }
    public static double getDifference ( int firstNumber, int secondNumber) {
        int difference = firstNumber - secondNumber;
        return difference;
    }
    public static int getMultiply ( int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
    public static int getDivide ( int firstNumber, int secondNumber) throws DivisionByZeroException {
        if (secondNumber == 0) {
            throw new DivisionByZeroException(" Division by zero is not allowed!");
        }
        return firstNumber / secondNumber;
    }
}
class DivisionByZeroException extends Exception {
    DivisionByZeroException(String message) {
        super(message);
    }
}
