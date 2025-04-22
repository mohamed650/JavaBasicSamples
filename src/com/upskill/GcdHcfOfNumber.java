package com.upskill;
import java.util.Scanner;

public class GcdHcfOfNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int numA = in.nextInt();
        System.out.println("Enter second number: ");
        int numB = in.nextInt();

        System.out.println("The GCD or HCF of the numbers is: " + gcdNum(numA, numB));
    }

    static int gcdNum(int numA, int numB) {
        if(numB == 0){
            return numA;
        } else {
            return gcdNum(numB, numA%numB);
        }
        /*if(numA == 0) {
            return numB;
        }
        if(numB == 0) {
            return numA;
        }
        if(numA == numB) {
            return numA;
        }
        if(numA > numB) {
            return gcdNum(numA-numB, numB);
        } else {
            return gcdNum(numA, numB-numA);
        }*/
    }
}
