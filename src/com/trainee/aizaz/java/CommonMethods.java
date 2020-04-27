package com.trainee.aizaz.java;
import java.util.Scanner;

/**
 * This class contains methods which can be re-usable for other classes
 */
public class CommonMethods {
    public int[] arraySet() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        //insertion of array elements:
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter arr[" + i + "]=");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public int[] sortedArrayDescending(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                //Logic for sorting in ascending order
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

}