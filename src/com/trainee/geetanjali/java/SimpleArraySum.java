package com.trainee.geetanjali.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleArraySum {
    public static void main(String[] args) {
        int sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size of the array:");
        try {
            int n = s.nextInt();
            int a[] = new int[n];
            System.out.println("Enter array elements:");
            for (int i = 0; i < n; i++) {
                a[i] = s.nextInt();
                sum = sum + a[i];
                // Example For Merge Conflicts -- By Geetanjali
            }
            System.out.println("Sum:" + sum);
        } catch (InputMismatchException IME) {
            System.out.println("Enter valid input elements");
        }
    }
}

