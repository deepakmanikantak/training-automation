package com.trainee.aizaz.java;
import java.util.Arrays;
import java.util.InputMismatchException;

/**
 * the purpose of this code is to merge two arrays of different
 * or same size of array into another array
 * @author aizaz
 */

public class MergingArray extends CommonMethods {
    public static void main(String args[]) {
        MergingArray m = new MergingArray();
        try {
            //inserting values in array:
            int arr1[] = m.arraySet();
            int arr2[] = m.arraySet();
            int arr3[] = new int[arr1.length + arr2.length];
            /**
             * this logic is not only applicable for same size array but
             * also merging of two different sizes of array is possible
             * that's why in for loop i have taken i < arr1.length || i<arr2.length
             * As well as why i have taken two if conditons is as the length
             * of array one is exceeded it will not enter in that if condition
             */
            for (int i = 0; i < arr1.length || i < arr2.length; i++) {
                if (i < arr1.length) {
                    arr3[i] = arr1[i];
                }
                if (i < arr2.length) {
                    arr3[arr1.length + i] = arr2[i];
                }
            }
            System.out.println("Array after merging:" + Arrays.toString(arr3));
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