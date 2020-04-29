package com.trainee.phani;

import java.util.Scanner;

/**
 * program to find minimum element of an array
 *
 * @author Phani
 */
public class Minimumelementinarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n value");
        int n = sc.nextInt();
        System.out.println("enter the elements");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            //comparing with elements to identify minimum element
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("The maximum number of an array: "+min);
    }
}

