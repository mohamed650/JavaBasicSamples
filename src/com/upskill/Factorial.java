package com.upskill;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = in.nextInt();
        System.out.println("The factorial of "+ num +" is: "+ factorialNum(num));
    }

    static int factorialNum(int number) {
        /*if(number == 0) {
            return number;
        }
        return number * (factorialNum(number - 1));*/
        int res = 1;
        for(int i=2; i<= number; i++) {
            res = res * i;
        }
        return res;
    }
}
