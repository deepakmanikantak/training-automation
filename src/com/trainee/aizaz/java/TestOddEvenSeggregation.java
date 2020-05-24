package com.trainee.aizaz.java;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * The purpose of this program is to seggregate odd and even numbers
 * and sort it in ascending order.
 */
public class TestOddEvenSeggregation {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of the array");
            int n = sc.nextInt();
            int[] arr = new int[n];
            int odd = 0;
            int even = 0;
            /**
             * Here we are counting number of odd and even elements
             */
            for (int i = 0; i < n; i++) {
                System.out.println("Enter arr[" + i + "]");
                arr[i] = sc.nextInt();
                if (arr[i] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
            System.out.println(Arrays.toString(arr));
            /**
             * Here we are finding the length for even array and odd array.
             */
            int evenLength = arr.length - odd;
            int oddLength = arr.length - even;
            int[] evenArr = new int[evenLength];
            int[] oddArr = new int[oddLength];
            int j = 0;
            int k = 0;
            //here we are inserting even elements in even array and odd elements in odd array
            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 == 0) {
                    evenArr[j] = arr[i];
                    j++;
                } else {
                    oddArr[k] = arr[i];
                    k++;
                }
            }
            //here we are sorting array in ascending order.
            Arrays.sort(evenArr);
            Arrays.sort(oddArr);
            /**
             * if length of the array is greater than zero then only it will print as we dont want to show empty
             *array.
             */
            if (evenLength > 0) {
                System.out.println(Arrays.toString(evenArr));
            }
            if (oddLength > 0) {
                System.out.println(Arrays.toString(oddArr));
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