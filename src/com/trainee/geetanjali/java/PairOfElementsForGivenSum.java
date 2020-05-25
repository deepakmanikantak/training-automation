package com.trainee.geetanjali.java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PairOfElementsForGivenSum {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter sum:");
        int sum=s.nextInt();
        System.out.println("Enter size of an array:");
        int n=s.nextInt();

        Integer a[]=new Integer[n];
        for(int i=0;i<n;i++) {
            System.out.println("Enter a[" + i + "]=");
            a[i] = s.nextInt();
        }
        Set<Integer> set=new HashSet<Integer>(Arrays.asList(a));
        System.out.println("set:"+set);
        Integer[] array = set.toArray(new Integer[set.size()]);
        for(int i=0;i<set.size();i++){
            for(int j=i+1;j<set.size();j++){
                if(array[i]+array[j]==sum){
                    System.out.println("("+array[i]+","+array[j]+")");
                }

            }
        }
    }
}
