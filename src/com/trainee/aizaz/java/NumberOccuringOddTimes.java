package com.trainee.aizaz.java;
/**
 * the purpose of this code is to find the number which
 * is repeated odd number of times.
 */
public class NumberOccuringOddTimes {
    static int oddRepeat;
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 3, 4, 4, 3, 5, 3, 5};
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                oddRepeat = arr[i];
            }
        }
        System.out.println(oddRepeat);
    }
}