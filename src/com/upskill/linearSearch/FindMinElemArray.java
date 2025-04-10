package com.upskill.linearSearch;

public class FindMinElemArray {
    public static void main(String[] args) {
        int[] arr = {23, 15, 18, 6, 19, 47, 25};
        System.out.println(min(arr));
    }

    static int min(int[] arr) {
        if(arr.length == 0) {
            return -1;
        }
        int ans = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}
