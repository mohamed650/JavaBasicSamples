package com.upskill;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to be reversed: ");
        int userNum = input.nextInt();

        int revNum = 0;

        while(userNum > 0) {
            int remNum = userNum % 10;
            revNum = (revNum * 10) + remNum;
            userNum = userNum / 10;
        }
        System.out.println("The Reversed number is: " + revNum);
    }
}
