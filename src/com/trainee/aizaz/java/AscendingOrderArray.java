package com.trainee.aizaz.java;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * The purpose of this program is to sort the elemnts in ascending order
 * without predefine functions
 *
 * @author aizaz
 */

public class AscendingOrderArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        try {
            int n = sc.nextInt();
            int[] arr = new int[n];
            //insertion of array elements:
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Enter arr[" + i + "]=");
                arr[i] = sc.nextInt();
            }
            //sorting of elements
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    //Logic for sorting in ascending order
                    if (arr[i] < arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            //printing sorted array elements:
            for (int e : arr) {
                /**
                 * The purpose of using print instead of println
                 *is to show all sorted elements in same line
                 *with space
                 */
                System.out.print(e + " ");
            }
        } catch (InputMismatchException ime) {
            //FOR ARRAY ELEMENTS
            System.out.println("Please!! Enter a Valid Input");
            System.out.println("Only Numbers Allowed");
        } catch (NegativeArraySizeException nse) {
            //FOR ARRAY SIZE
            System.out.println("Please!! Enter a Valid Input");
            System.out.println("Only Postive  Numbers Allowed");
        }
    }
}
