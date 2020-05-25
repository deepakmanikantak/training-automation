package com.trainee.geetanjali.java;

public class PrintFirstOccuredElement {
    public static void main(String args[]) {
        int temp = 0;
        int a[] = {1, 4, 5, 3, 4, 3};
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    System.out.println(a[i]);
                    break;
                }
            }
        }
    }
}



