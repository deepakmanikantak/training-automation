package com.trainee.aizaz.java;
import java.util.InputMismatchException;

/**
 * the purpose of this code is to find the number which
 * is repeated odd number of times.
 */
public class TestNumberOccuringOddTimes {
    static int oddRepeat;
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 1, 2, 3, 3, 4, 5, 5, 1};
            for (int i = 0; i < arr.length; i++) {
                int count = 0;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }
                //this is the logic to find odd times repeated elements:
                if (count % 2 != 0) {
                    oddRepeat = arr[i];
                }
            }
            System.out.println(oddRepeat);
        } catch (InputMismatchException ime) {
            System.out.println("Please!! Enter a Valid Input");
            System.out.println("Only Numbers Allowed");
        }
    }
}