package com.upskill;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int number = input.nextInt();
        boolean ans = isPrime(number);
        System.out.println("The Number is: "+ (ans ? "Prime" : "Not Prime"));
    }

    static boolean isPrime(int number) {
        int count = 2;
        if(number <= 1){
            return false;
        } else {
            while(count*count <= number) {
                if(number % count == 0) {
                    return false;
                }
                count = count + 1;
            }
        }
        return count*count > number;
    }
}
