package com.trainee.aizaz.java;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * the purpose of this class is to copy one array into another array
 */
public class ArrayCopy extends CommonMethods {
    public static void main(String[] args) {
        try {
            ArrayCopy a = new ArrayCopy();
            int[] arr1 = a.arraySet();
            int[] arr2=new int[arr1.length];
            //copying arr1 in arr2
            for (int i = 0; i < arr1.length; i++) {
                arr2[i] = arr1[i];
            }
            System.out.println("arr2:" + Arrays.toString(arr2));
        } catch (InputMismatchException ime) {
            System.out.println("Please!! Enter a Valid Input");
            System.out.println("Only Numbers Allowed");
        } catch (NegativeArraySizeException nse) {
            System.out.println("Please!! Enter a Valid Input");
            System.out.println("Only Postive  Numners Allowed");
        }
    }
}