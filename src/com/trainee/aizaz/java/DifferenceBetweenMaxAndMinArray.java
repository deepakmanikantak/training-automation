package com.trainee.aizaz.java;
import java.util.Arrays;
import java.util.InputMismatchException;

public class DifferenceBetweenMaxAndMinArray extends CommonMethods {
    public static void main(String[] args) {
        DifferenceBetweenMaxAndMinArray m = new DifferenceBetweenMaxAndMinArray();
        try {
            int[] arr = m.arraySet();
            System.out.println(Arrays.toString(arr));
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
            int diff = max - min;
            System.out.println("The difference between max and min element in array is" + diff);
        } catch (InputMismatchException ime) {
            //FOR ARRAY ELEMENTS
            System.out.println("Please!! Enter a Valid Input");
            System.out.println("Only Numbers Allowed");
        } catch (NegativeArraySizeException nse) {
            //FOR ARRAY SIZE
            System.out.println("Please!! Enter a Valid Input");
            System.out.println("Only Postive  Numericals Allowed");
        }
    }
}