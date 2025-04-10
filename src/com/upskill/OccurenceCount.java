package com.upskill;
import java.util.Scanner;

public class OccurenceCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = input.nextInt();
        System.out.println("Enter the occurence number: ");
        int occNum = input.nextInt();

        int occCount = 0;

        while(number > 0) {
            int remainder = number % 10;
            if(remainder == occNum) {
                occCount++;
            }
            number = number / 10;
        }
        System.out.println("The number of occurences are: "+ occCount);
    }
}
