package com.trainee.geetanjali.java;
/**
 * This class represents the diagonal difference between the sum of the  two diagonals
 * @author geetanjali
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String args[]) {
        int s1 = 0, s2 = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Size of a matrix:");
        //the code which can get exception should be placed in this block
        try {
            int n = s.nextInt();
            int a[][] = new int[n][n];
            System.out.println("Enter the elements in  matrix");
            //This piece of code is to read the values from user
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.println("Enter a[" + i + "] [" + j + "]=");
                    a[i][j] = s.nextInt();
                }
            }
            //this piece of code is to add the  diagonal elements
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    //this logic is to add 1st(left) diagonal elements
                    if (i == j) {
                        s1 = s1 + a[i][j];
                    }
                    //this logic is to add 2nd(right) diagonal elements
                    if (i + j == n - 1) {
                        s2 = s2 + a[i][j];
                    }
                }
            }
            System.out.println("Sum of First diagonal elements:" + s1);
            System.out.println("Sum of Second diagonal elements:" + s2);
            //Math.abs(s1-s2) is used inorder to get absolute value
            System.out.println("Difference between first and second Sum diagonal elements:" + Math.abs(s1 - s2));
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
