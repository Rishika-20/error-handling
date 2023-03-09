package com.knoldus.randomnumber;

import java.util.Scanner;

public class RandomNumber {

    public static void main(String[] args) {
        int result = (int)(Math.random()*100)+1;
//        System.out.println("Random Number is:"+result);
        Scanner scan = new Scanner(System.in);

        int number=0;
        while(number!= result) {
            System.out.println("Please enter a number:");

            try {
                number = Integer.parseInt(scan.next());

                if (number < result) {
                    System.out.println("Too Low");
                }
                else if (number > result) {
                    System.out.println("Too High");
                }
                else  {
                    System.out.println("You guessed it!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input.Please enter a number.");
            }
        }
    }
}
