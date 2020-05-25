package com.trainee.geetanjali.java;

import java.util.Scanner;

public class TransposeOfMatrix {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of an array:");
        int n = s.nextInt();
        int array[][] = new int[n][n];
        int transposeArray[][] = new int[array.length][array.length];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter array[" + i + "]" + "[" + j + "]");
                array[i][j] = s.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                transposeArray[i][j] = array[j][i];
                    System.out.print(transposeArray[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
