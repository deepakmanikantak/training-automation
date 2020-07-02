package com.trainee.aizaz.java;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * this purpose of this class is to
 * find the sum of all array elements
 *
 * @author aizaz
 */
public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        try {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Enter arr[" + i + "]=");
                arr[i] = sc.nextInt();
                sum = sum + arr[i];
            }
            System.out.println("The sum of array elements = " + sum);
        } catch (InputMismatchException ime) {
            //FOR ARRAY ELEMENTS
            System.out.println("Please!! Enter a Valid Input");
            System.out.println("Only Numbers Allowed");
        } catch (NegativeArraySizeException nse) {
            //FOR ARRAY SIZE
            System.out.println("Please!! Enter a Valid Input");
            System.out.println("Only Postive  Numericals Allowed");

        }

    }
}