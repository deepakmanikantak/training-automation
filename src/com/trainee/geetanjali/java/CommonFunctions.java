package com.trainee.geetanjali.java;

import java.util.Scanner;

public class CommonFunctions {
    public int[] array() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter a[" + i + "]:");
            a[i] = s.nextInt();
        }
        return a;
    }

    public int[] sortingAscending(int a[]) {
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }
    public int[] sortingDescending(int a[]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }
        public int[] sumOfElementsInArray(int a[]) {
            int sum = 0;
            for (int i = 0; i < a.length; i++) {
                sum = sum + a[i];
            }
            int average=sum/a.length;
            System.out.println("Sum of elements in array=" + sum);
            System.out.println("Average of elements in array=" +average);
            return a;
        }
    }



