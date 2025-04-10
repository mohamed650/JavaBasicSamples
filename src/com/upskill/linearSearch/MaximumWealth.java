package com.upskill.linearSearch;

public class MaximumWealth {
    public static void main(String[] args) {
        int [][] arr = {
                {3, 4, 1},
                {6, 2, 1, 2},
                {6, 4, 2}
        };
        System.out.println(findMaxWealth(arr));
    }

    static int findMaxWealth(int[][] accounts) {
        int maxWealth = 0;
        for(int person=0; person < accounts.length; person++) {
            int rowSum = 0;
            for(int bankAccount = 0; bankAccount < accounts[person].length; bankAccount++) {
                rowSum += accounts[person][bankAccount];
            }
            if(rowSum > maxWealth) {
                maxWealth = rowSum;
            }
        }
        return maxWealth;
    }
}
