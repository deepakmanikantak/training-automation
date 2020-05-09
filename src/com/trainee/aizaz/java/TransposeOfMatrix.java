package com.trainee.aizaz.java;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * The purpose of this code is to show transpose of matrix
 */
public class TransposeOfMatrix {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of array");
            int n = sc.nextInt();
            int[][] arr1 = new int[n][n];
            int[][] arr2 = new int[n][n];
            //insertion of array matrix-1(arr1)
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr1.length; j++) {
                    System.out.println("Enter the array element arr1[" + i + "] [" + j + "]:");
                    arr1[i][j] = sc.nextInt();
                }
            }
            //logic for transpose of array
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr1.length; j++) {
                    arr2[j][i] = arr1[i][j];
                }
            }
            System.out.println("TRANSPOSE ARRAY");
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr1.length; j++) {
                    System.out.print(arr2[i][j] + " ");
                }
                System.out.println(" ");
            }
        } catch (InputMismatchException ime) {
            System.out.println("Please!! Enter a Valid Input");
            System.out.println("Only Numbers Allowed");
        } catch (NegativeArraySizeException nse) {
            System.out.println("Please!! Enter a Valid Input");
            System.out.println("Only Postive  Numners Allowed");
        }
    }
}