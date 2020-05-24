package com.trainee.aizaz.java;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * The purpose of this programme is to  remove duplicate elements
 * from the array.
 */
public class TestRemoveDuplicates {
    public static void main(String[]args){
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of array");
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.println("Enter the array arr[" + i + "]");
                arr[i] = sc.nextInt();
            }
            int count = 0;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] == arr[i + 1]) {
                    count++;
                }
            }
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));
            System.out.println("Number of duplicates are" + count);
            int[] arr2 = new int[n - count];
            int j = 0;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] != arr[i + 1]) {
                    arr2[j] = arr[i];
                    j++;
                }
            }
            arr2[j] = arr[n - 1];
            System.out.println(Arrays.toString(arr2));
        }
        catch (InputMismatchException ime) {
            System.out.println("Please!! Enter a Valid Input");
            System.out.println("Only Numbers Allowed");
        } catch (NegativeArraySizeException nse) {
            System.out.println("Please!! Enter a Valid Input");
            System.out.println("Only Postive  Numners Allowed");
        }
    }
}