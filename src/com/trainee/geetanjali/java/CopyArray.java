package com.trainee.geetanjali.java;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * this class is used to copy onn array into another array
 *
 * @author geetanjali
 */
public class CopyArray {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Size of an array");
        try {
            int n = s.nextInt();
            int a[] = new int[n];
            int b[] = new int[n];
            //read the values from the user
            for (int i = 0; i < n; i++) {
                System.out.println("Enter a[" + i + "]=");
                a[i] = s.nextInt();
            }
            //storing the elements of a[i] into b[i]
            for (int i = 0; i < n; i++) {
                b[i] = a[i];
            }
            System.out.println("Copied array b[i]=" + Arrays.toString(b));
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
