package com.upskill;
import java.util.Scanner;

public class LargestProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        // Assume num1 as maximum number
        /*int maxNum = num1;
        if(num2 > num1) {
            maxNum = num2;
        }
        if(num3 > num1) {
            maxNum = num3;
        }*/

        //Another approach
        int maxNum = Math.max(num3, Math.max(num1, num2));

        System.out.println("Largest number is: " + maxNum);
    }
}
