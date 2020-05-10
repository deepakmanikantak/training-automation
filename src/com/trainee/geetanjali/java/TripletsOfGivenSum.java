package com.trainee.geetanjali.java;

import java.util.Arrays;
import java.util.Scanner;

public class TripletsOfGivenSum {
    public void triplets(int a[],int n,int sum){
        for(int i=0;i<n-2;i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (a[i] + a[j] + a[k] == sum) {
                        System.out.println(a[i] + "," + a[j] + "," + a[k]);
                    }
                }
            }
        }
    }
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=s.nextInt();
        System.out.println("Enter the sum:");
        int sum=s.nextInt();
        int a[]= new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter a["+ i +"]=");
            a[i]=s.nextInt();
        }System.out.println(Arrays.toString(a));
        TripletsOfGivenSum t=new TripletsOfGivenSum();
        t.triplets(a,n,sum);


    }
}
