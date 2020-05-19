package com.trainee.aizaz.java;
import java.util.InputMismatchException;

/**
 * the purpose of this class is to print the 1st repetitive element in array
 */
public class FirstRepeatedElement {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3, 2, 3, 4, 5, 6,};
            for (int i = 0; i < arr.length; i++) {
                int count = 0;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }
                if (count > 0) {
                    System.out.println("the 1st repetitive element is  " + arr[i]);
                    break;
                }
            }
        } catch (InputMismatchException ime) {
            System.out.println("Please!! Enter a Valid Input");
            System.out.println("Only Numbers Allowed");
        }
    }
}
