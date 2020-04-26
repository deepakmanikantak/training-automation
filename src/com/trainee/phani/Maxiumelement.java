package com.trainee.phani;
import java.util.Scanner;
/**
program to find a maximum element in an array
 @ author phani
 **/
public class Maxiumelement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value");
        int n=sc.nextInt();
        System.out.println("enter the elements");
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for(int i=1;i<n;i++){
            //comparing the elements to find out the maximum value element in an array
            if(max<arr[i]){
                max=arr[i];
            }
        }
         System.out.println("The maximum number of an array: "+max);
    }
}
