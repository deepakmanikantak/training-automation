package com.trainee.geetanjali.java;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This class represents merging of two arrays into third array
 *
 *
 * @author geetanjali
 */
public class MergingTwoArraysIntoThirdArray {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        try {
            System.out.println("Enter the size of an array:");
            int n = s.nextInt();
            int a[] = new int[n];
            int b[] = new int[n];
            int c[] = new int[a.length + b.length];
            // read the values of array a[i] from the user
            System.out.println("Enter first array elements:");
            for (int i = 0; i < n; i++) {
                System.out.println("Enter a[" + i + "]=");
                a[i] = s.nextInt();
            }
            // read the values of array b[i] from the user
            System.out.println("Enter second array elements:");
            for (int i = 0; i < n; i++) {
                System.out.println("Enter b[" + i + "]=");
                b[i] = s.nextInt();
            }
            // storing a[i] into c[i] and adding the array b[i] to the end of a[i]
            for (int i = 0; i < n; i++) {
                c[i] = a[i];
                c[a.length + i] = b[i];
            }
            System.out.println("Array after merging:" + Arrays.toString(c));
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


