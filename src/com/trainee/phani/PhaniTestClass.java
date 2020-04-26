package com.trainee.phani;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * program to find the sum of an array
 *
 * @author phani
 */
public class PhaniTestClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("enter n value");
        try {
            int n = sc.nextInt();
            int array[] = new int[n];
            System.out.println("enter the values");
            for (int i = 0; i < n; i++) {
                array[i] = sc.nextInt();
            }
            for (int j = 0; j < n; j++) {
                //This logic is for to get sum of the elements
                sum = sum + array[j];
            }
            System.out.println("Sum of the array is:" + sum);
        } catch (InputMismatchException IME) {
            System.out.println("Invalid input pls enter valid input");
        }
    }
}


