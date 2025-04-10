package com.upskill.linearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {23, 8, 6, 7, 19, -3, 65, -11, 29};
        int targetItem = 19;
        int itemFound = searchArray(nums, targetItem);
        int indexItemFound = searchBetweenIndexArray(nums, targetItem, 1, 5);
        System.out.println(itemFound);
        System.out.println(indexItemFound);

    }

    // search item in the array: if found return index
    // otherwise return -1
    static int searchArray(int[] arr, int targetItem) {
        if(arr.length == 0) {
            return -1;
        }

        for(int index=0; index<arr.length; index++) {
            int element = arr[index];
            if(element == targetItem) {
                return index;
            }
        }

        // with enhanced for loop
        /*for(int element : arr) {
            if(element == targetItem) {
                return element;
            }
        }*/
        // because -1 will may be an item
        /*return Integer.MAX_VALUE;*/
        return -1;
    }

    static int searchBetweenIndexArray(int[] arr, int targetItem, int start, int end) {
        if(arr.length == 0) {
            return -1;
        }

        for(int index=start; index<= end; index++) {
            int element = arr[index];
            if(element == targetItem) {
                return index;
            }
        }

        // with enhanced for loop
        /*for(int element : arr) {
            if(element == targetItem) {
                return element;
            }
        }*/
        // because -1 will may be an item
        /*return Integer.MAX_VALUE;*/
        return -1;
    }
}
