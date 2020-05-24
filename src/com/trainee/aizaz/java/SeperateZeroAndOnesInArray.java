package com.trainee.aizaz.java;
import java.util.Arrays;
import java.util.Scanner;
/**
 * The purpose of this class is to seperate zero's and one's
 * in the given array.
 */
public class SeperateZeroAndOnesInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int count=0;
        for (int i = 0; i < n; i++) {
            System.out.println("enter arr[" + i + "]");
            arr[i] = sc.nextInt();
            if(arr[i]==0){
                count++;
            }
        }
        for(int i=0;i<n;i++){
           if(i<count){
               arr[i]=0;
           }
           else{
               arr[i]=1;
           }
        }
        System.out.println(Arrays.toString(arr));
    }
}