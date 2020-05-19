package com.trainee.aizaz.java;
import java.util.InputMismatchException;
/**
 * The purpose of this class is to find most repetitive element in an array.
 */
public class TestMostRepetitiveElement {
    static int mostFrequent;
    public static void main(String[] args) {
        try {
            int[] arr = {1, 4, 3, 3, 4, 5, 3, 9};
            int countMore = 0;
            for (int i = 0; i < arr.length; i++) {
                int count = 0;
                for (int j = 0; j < arr.length; j++) {
                    //here we are counting hoe many time the number is repeating
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }
                //this the logic for finding the most repetitive element
                if (countMore < count) {
                    countMore = count;
                    mostFrequent = arr[i];
                }
            }
            System.out.println(mostFrequent);
        } catch (InputMismatchException ime) {
            System.out.println("Please!! Enter a Valid Input");
            System.out.println("Only Numbers Allowed");
        }
    }
}