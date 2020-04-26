package com.trainee.geetanjali.java;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * this class represents sorting in both ascending and decending order
 *
 * @author geetanjali
 */
public class ArraySort {
    public static void main(String args[]) {
        int temp = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        //the code which can get exception should be placed in this block
        try {
            int n = s.nextInt();
            int arr[] = new int[n];
            System.out.println("Elements before Sorting:");
            //this loop is used to read the values from the user
            for (int i = 0; i < n; i++) {
                System.out.println("Enter a[" + i + "]=");
                arr[i] = s.nextInt();
            }
            //this logic is to sort the array in ascending order
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {

                    if (arr[i] > arr[j]) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }

            System.out.println("Elements after sorting in ascending order");
            //Arrays.toString method is used to convert array to string instead of using for loop
            System.out.println(Arrays.toString(arr));
            //this logic is to sort the array in decending order
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {

                    if (arr[i] < arr[j]) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            System.out.println("Elements after sorting in decending order");
            //Arrays.toString method is used to convert array to string instead of using for loop
            System.out.print(Arrays.toString(arr));
        }
        //this block catches the exception when we give an input other than integer
        catch (InputMismatchException IME) {
            System.out.println("Enter a valid input");
        }
        //this block catches the exception when we give array size negative
        catch (NegativeArraySizeException NASE) {
            System.out.println("Array Size should not be negative");
        }
    }
}
