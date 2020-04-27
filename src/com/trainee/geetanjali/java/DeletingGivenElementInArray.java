package com.trainee.geetanjali.java;

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
                break;
            }
        }
        if (count == 0) {
            System.out.print("Element Not Found..!!");
        } else {
            System.out.println("Element Deleted Successfully..!!");
            System.out.println("Now the New Array is :");
            for (int i = 0; i < (n - 1); i++) {
                System.out.print(arr[i] + " ");
            }//System.out.println(Arrays.toString(arr));
        }
    }
}
