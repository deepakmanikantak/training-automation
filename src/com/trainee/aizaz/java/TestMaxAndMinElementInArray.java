package com.trainee.aizaz.java;
import java.util.InputMismatchException;

/**
 * the purpose of this class is to find maximum and minimum element in an array.
 */
public class TestMaxAndMinElementInArray {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 100, 0, 11, 23, 45, 99};
            int max = arr[0];
            int min = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            System.out.println("max=" + max + "\nmin=" + min);
        } catch (InputMismatchException ime) {
            System.out.println("Please!! Enter a Valid Input");
            System.out.println("Only Numbers Allowed");
        }
    }
}