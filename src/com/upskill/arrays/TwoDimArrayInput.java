package com.upskill.arrays;
import java.util.Arrays;
import java.util.Scanner;

public class TwoDimArrayInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println("Enter the Array values.");
        for(int row=0; row< arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                arr[row][col] = in.nextInt();
            }
        }

        System.out.println("The Array values are: ");
        /*for(int row=0; row< arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }*/

        /*for(int row=0; row<arr.length; row++){
            System.out.println(Arrays.toString(arr[row]));
        }*/

        for(int[] ar: arr){
            System.out.println(Arrays.toString(ar));
        }
    }
}
