package com.upskill;
import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int number = input.nextInt();
        int originalNum = number;
        int sum = 0;
        while(number > 0) {
            int rem = number % 10;
            sum = sum + rem*rem*rem;
            number /= 10;
        }
        System.out.println("The number is: "+ (originalNum == sum ? "Armstrong" : "Not Armstrong"));
    }
}
