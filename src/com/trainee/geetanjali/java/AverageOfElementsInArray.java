package com.trainee.geetanjali.java;

import java.util.Scanner;

public class AverageOfElementsInArray {
    public static void main(String args[]) {
        int sum=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of an array:");
        int n = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a[" +i+"]");
            a[i]=s.nextInt();
            sum+=a[i];}
            System.out.println("Sum Of Elements in Array:"+sum);
        int avg=sum/n;
        System.out.println("AverageOfElementsInArray:"+avg);
    }

}

