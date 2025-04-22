package com.upskill.patterns;
import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int numRows = in.nextInt();
        for(int i=1; i<=(2*numRows)-1; i++){
            int stars = i;
            if(i > numRows) {
                stars = (2*numRows) - i;
            }
            for(int j=1; j<=stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
