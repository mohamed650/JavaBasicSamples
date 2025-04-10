package com.upskill.linearSearch;

public class EvenDigitsInArray {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7839};
        System.out.println(findEvenNumberDigits(nums));
        System.out.println(digitsCount2(2568));
    }

    static int findEvenNumberDigits(int[] arr) {
        int countEvenDigits = 0;
        for(int num: arr){
            if(even(num)) {
                countEvenDigits++;
            }
        }
        return countEvenDigits;
    }

    static boolean even(int num) {
        int numDigits = digitsCount(num);
        return numDigits%2 == 0;
    }

    static int digitsCount2(int num) {
        if(num < 0){
            num = num * -1;
        }
        return (int) (Math.log10(num)) + 1;
    }

    static int digitsCount(int num) {
        int count = 0;
        if( num < 0) {
            num = num * -1;
        }

        if( num == 0) {
            return 1;
        }

        while(num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }
}
