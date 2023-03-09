package com.knolduserrorhandling;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        try  {
            System.out.println("please Enter the first number.");
            int firstNumber = Integer.parseInt(scan.next());
            System.out.println("please Enter the second number.");
            int secondNumber = Integer.parseInt(scan.next());
            System.out.println("Sum of two numbers: "+Calculator.getSum(firstNumber,secondNumber));
            System.out.println("Difference of two numbers: "+Calculator.getDifference(firstNumber,secondNumber));
            System.out.println("Multiplication of two numbers: "+Calculator.getMultiply(firstNumber,secondNumber));
            System.out.println("Division of two numbers: "+Calculator.getDivide(firstNumber,secondNumber));

        } catch (DivisionByZeroException e) {
            throw new RuntimeException(e);
        }
    }
}
