package com.trainee.geetanjali.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiplicationOfTwoMatrices {
        public static void main(String args[]) {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the size of a matrix:");
            try {
                int n = s.nextInt();
                int a[][] = new int[n][n];
                int b[][] = new int[n][n];
                int c[][] = new int[n][n];
                //read the first matrix elements from the user
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.println("Enter the array element a[" + i + "] [" + j + "]:");

                        a[i][j] = s.nextInt();
                    }
                }
                //read the second matrix elements from the user
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.println("Enter the array element b[" + i + "] [" + j + "]:");
                        b[i][j] = s.nextInt();
                    }
                }
                //two matrices will  be added and stored in the third matrix
                //print is used inorder print the elements in a row
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        c[i][j]=0;
                        for(int k=0;k<n;k++)
                        c[i][j] = a[i][k] + b[k][j];
                        System.out.print(c[i][j] + " ");
                    }
                    //println is used inorder to move to the next row after completion of every row
                    System.out.println();
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


