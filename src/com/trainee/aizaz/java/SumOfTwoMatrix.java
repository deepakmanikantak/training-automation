package com.trainee.aizaz.java;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * the purpose of this class is to
 * show sum of two matrix in array
 *
 * @author aizaz
 */
public class SumOfTwoMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        try {
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
            //insertion of array matrix-2(arr2)
            for (int i = 0; i < arr2.length; i++) {
                for (int j = 0; j < arr2.length; j++) {
                    System.out.println("Enter the array element arr2[" + i + "] [" + j + "]:");
                    arr2[i][j] = sc.nextInt();
                }
            }
            //logic for addition of two elements:
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    /*using print instead of println to print the
                    elements in row wise order*/
                    System.out.print(arr1[i][j] + arr2[i][j] + " ");
                }
                //this below println is to print next row in a new line.
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