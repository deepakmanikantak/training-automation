package com.trainee.geetanjali.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String args[]) {
        int s1 = 0, s2 = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Size of a matrix:");
        try {
            int n = s.nextInt();
            int a[][] = new int[n][n];
            System.out.println("Enter the elements in  matrix");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.println("Enter a[" + i + "] [" + j + "]=");
                    a[i][j] = s.nextInt();
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == j) {
                        s1 = s1 + a[i][j];
                    }
                }
            }
            System.out.print("Sum of First diagonal elements:" + s1);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i + j == n - 1) {
                        s2 = s2 + a[i][j];
                    }
                }
            }
            System.out.println("Sum of Second diagonal elements:" + s2);
            System.out.println("Difference between first and second Sum diagonal elements:" + (s1 - s2));
        } catch (InputMismatchException IME) {
            System.out.println("Enter a valid input");
        } catch (NegativeArraySizeException NASE) {
            System.out.println("Array Size should not be negative");
        }
    }
}
