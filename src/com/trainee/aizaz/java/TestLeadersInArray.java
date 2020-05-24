package com.trainee.aizaz.java;
import java.util.InputMismatchException;

/**
 * The purpose of this class is to find leaders in array.leaders are the elements
 * which are greater than their all previous elements.
 */
public class TestLeadersInArray {
    public static void main(String[] args) {
        try {
            int[] arr = {91, 98, 97, 100, 55, 99};
            for (int i = 1; i < arr.length; i++) {
                int count = 0;
                for (int j = 0; j < i; j++) {
                    if (arr[i] > arr[j]) {
                        count++;
                    }
                }
                if (count == i) {
                    System.out.println(arr[i] + " is leader");
                }
            }
        } catch (InputMismatchException ime) {
            System.out.println("Please!! Enter a Valid Input");
            System.out.println("Only Numbers Allowed");
        }
    }
}