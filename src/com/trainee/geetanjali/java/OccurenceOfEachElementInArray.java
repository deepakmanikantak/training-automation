package com.trainee.geetanjali.java;

import java.util.Scanner;

public class OccurenceOfEachElementInArray {
    public static void main(String args[]){
        int count=1;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size of an array:");
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter a["+i+"]=");
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j]){
                    count++;
                }
            }

            }


        }
    }

