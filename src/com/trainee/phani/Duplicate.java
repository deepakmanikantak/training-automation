package com.trainee.phani;

import java.util.Scanner;

/**
 * prg to find the duplicate elements in an array
 *
 * @author phani
 */
public class Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n value");
        int n = sc.nextInt();
        System.out.println("enter the elements");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < n; j++) {
                //comparing elemets to find duplicate elements(repeated elments in an array
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate elements are " + arr[j]);
                }
            }

        }
    }
}