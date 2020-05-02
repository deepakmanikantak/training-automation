package com.trainee.geetanjali.java;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * this class is to print the even and odd elements
 *
 * @author geetanjali
 */
public class PrintEvenAndOddFromArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        try {
            int n = s.nextInt();
            int a[] = new int[n];
            System.out.println("Enter all the elements:");
            for (int i = 0; i < n; i++) {
                a[i] = s.nextInt();
            }
            System.out.print("Odd numbers:");
            //this logic is to print odd numbers in an array
            //print is used inorder print the elements in a row
            for (int i = 0; i < n; i++) {
                if (a[i] % 2 != 0) {
                    System.out.print(a[i] + " ");
                }
            }
            //println is used inorder to move to the next row after completion of every row
            System.out.println("");
            System.out.print("Even numbers:");
            //this logic is to print even numbers in an array
            //print is used inorder print the elements in a row
            for (int i = 0; i < n; i++) {
                if (a[i] % 2 == 0) {
                    System.out.print(a[i] + " ");
                }
            }
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

