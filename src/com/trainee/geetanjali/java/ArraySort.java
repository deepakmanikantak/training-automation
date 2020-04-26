package com.trainee.geetanjali.java;
/**
 * this class represents sorting in both ascending and decending order
 *
 * @author geetanjali
 */

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

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

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    //this logic is to sort the array in ascending order
                    if (arr[i] > arr[j]) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }


                }

            }
            System.out.println("Elements after sorting in ascending order");
            System.out.println(Arrays.toString(arr));
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    //this logic is to sort the array in decending order
                    if (arr[i] < arr[j]) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }


                }

            }
            System.out.println("Elements after sorting in decending order");
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
