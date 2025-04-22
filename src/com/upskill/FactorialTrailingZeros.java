package com.upskill;
import java.util.Scanner;

public class FactorialTrailingZeros {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = in.nextInt();
        System.out.println("The trailing zeros count is: "+ trailingZeros(number));
    }

    static int trailingZeros(int num) {
        int count = 0;
        for(int i=5; num/i >= 1; i=i*5){
            count = count + (num/5);
        }
        return count;
    }
}
