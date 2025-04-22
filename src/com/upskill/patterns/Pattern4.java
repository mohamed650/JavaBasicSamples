package com.upskill.patterns;
import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int numRows = in.nextInt();
        for(int i=0; i< numRows; i++){
            for(int spaceStart = 0; spaceStart<(numRows-i-1); spaceStart++) {
                System.out.print(" ");
            }
            for(int stars = 0; stars<(2*i)+1; stars++) {
                System.out.print("*");
            }
            for(int spaceEnd = 0; spaceEnd<(numRows-i-1); spaceEnd++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        for(int i=numRows; i> 0; i--){
            for(int spaceStart = 0; spaceStart<(numRows-i); spaceStart++) {
                System.out.print(" ");
            }
            for(int stars = 0; stars<(2*i)-1; stars++) {
                System.out.print("*");
            }
            for(int spaceEnd = 0; spaceEnd<(numRows-i); spaceEnd++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
