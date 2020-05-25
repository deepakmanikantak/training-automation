package com.trainee.geetanjali.java;

import java.util.Arrays;
import java.util.Scanner;

public class MovingZerosToTheEnd {
    public static void main(String args[]){
        int j=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size of an array:");
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++) {
            System.out.println("Enter a[" + i + "]=");
            a[i] = s.nextInt();
        }
        System.out.println(Arrays.toString(a));
        for(int i=0;i<a.length;i++){
            if (a[i]!=0) {
                a[j] = a[i];
                j++;
            }
        }
        while(j<a.length){
            a[j]=0;
             j++;
        }

        System.out.println(Arrays.toString(a));
            }
        }


