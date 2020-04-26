package com.trainee.aizaz.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DiagnolDiffernceArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        try {
            int n = sc.nextInt();
            int[][] arr = new int[n][n];
            //insertion of the elements:
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    System.out.println("Enter the array element arr[" + i + "] [" + j + "]:");
                    arr[i][j] = sc.nextInt();
                }
            }

            int primarySum = 0;
            int secondarySum = 0;

            //finding the sum of each diagnol elements:
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (i == j) {
                        primarySum = primarySum + arr[i][j];

                    }

                    if ((i + j) == (n - 1)) {
                        secondarySum = secondarySum + arr[i][j];


                    }
                }


            }
            System.out.println("the sum of primary diagnol is =" + primarySum);
            System.out.println("the sum of secondary diagnol is=" + secondarySum);
            int sum = Math.abs(primarySum - secondarySum);
            System.out.println("the absolute difference between primary and secondary diagnols is=" + sum);
        } catch (InputMismatchException ime) {
            System.out.println("Please!! Enter a Valid Input");
            System.out.println("Only Numbers Allowed");


        } catch (NegativeArraySizeException nse) {

            System.out.println("Please!! Enter a Valid Input");
            System.out.println("Only Postive  Numners Allowed");

        }


    }
}

