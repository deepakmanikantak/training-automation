package com.trainee.aizaz.java;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * The purpose of this class is to sort the elements
 * in ascending order using pre-define function
 *
 * @author aizaz
 */
public class Sorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        try {
            int n = sc.nextInt();
            int[] arr = new int[n];
            //insertion of elements:
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Enter arr[" + i + "]=");
                arr[i] = sc.nextInt();
            }
            //logic for sorting array elements in ascending order:
            Arrays.sort(arr);
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





