package com.upskill;
import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int num1 = input.nextInt();
        System.out.println("Enter Second Number: ");
        int num2 = input.nextInt();

        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;

        System.out.println("First Number after swapping: "+ num1);
        System.out.println("Second Number after swapping: "+ num2);
    }
}
