package com.trainee.geetanjali.java;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * this code represents deletion of a particular element from an array
 *
 * @author geetanjali
 */
public class DeletingGivenElementInArray {
    public static void main(String args[]) {
        int count = 0;
        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("Enter Array Size : ");
            int n = scan.nextInt();
            System.out.print("Enter Element to be Delete : ");
            int d = scan.nextInt();
            int arr[] = new int[n];
            //read the elements from the user
            for (int i = 0; i < n; i++) {
                System.out.print("Enter arr[" + i + "]=");
                arr[i] = scan.nextInt();
            }
            //this logic is to find the element to be deleted and to delete that element
            for (int i = 0; i < n; i++) {
                if (arr[i] == d) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.print("Element Not Found..!!");
            } else {
                int[] newArray = new int[n-count];
                int j=0;
                System.out.println("Element Deleted Successfully..!!");
                System.out.println("Now the New Array is :");
                for (int i = 0; i < arr.length ; i++) {
                    if (arr[i] != d) {
                        newArray[j] = arr[i];
                        j++;
                    }
                }
                System.out.println(Arrays.toString(newArray));
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
