package com.upskill.linearSearch;

import java.util.Arrays;

public class Search2DArray {
    public static void main(String[] args) {
        int [][] arr = {
                {23, 4, 1},
                {16, 15, 85, 25},
                {6, 48, 22}
        };
        int targetItem = 25;
        int[] ans = search2dArray(arr, targetItem);
        /*System.out.println(search2dArray(arr, targetItem));*/
        System.out.println(Arrays.toString(ans));
    }

    static int[] search2dArray(int[][] arr, int targetItem) {
        if(arr.length == 0) {
            return new int[]{-1, -1};
            /*return -1;*/
        }

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] == targetItem) {
                    /*return arr[i][j];*/
                    return new int[]{i, j};
                }
            }
        }

        // with enhanced for
        /*for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt == targetItem) {
                    return anInt;
                }
            }
        }*/

        return new int[]{-1, -1};
    }
}
