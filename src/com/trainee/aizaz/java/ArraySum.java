package com.trainee.aizaz.java;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter arr[" + i + "]=");
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        System.out.println("The sum of array elements =" + sum);

    }
}
