package com.upskill;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 0;
        int num2 = 1;
        System.out.println("Enter the limit number: ");
        int limitNumber = input.nextInt();
        int finalNumber = 0;
        int count = 2;
        for(int i=count; i<=limitNumber; i++) {
            finalNumber = num1 + num2;
            num1 = num2;
            num2 = finalNumber;
        }
        System.out.println("Fibonnaci number of limit is: "+ finalNumber);
    }
}
