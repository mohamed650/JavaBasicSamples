package com.upskill;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int number = in.nextInt();
        if(checkPalindrome(number)) {
            System.out.println("Yes it is Palindrome.");
        } else {
            System.out.println("No, not a palindrome");
        }
    }

    static boolean checkPalindrome(int num) {
        int reverse = 0;
        int temp = num;
        while(temp != 0) {
            reverse = (reverse * 10) + (temp % 10);
            temp = temp / 10;
        }
        return (reverse == num);
    }
}
