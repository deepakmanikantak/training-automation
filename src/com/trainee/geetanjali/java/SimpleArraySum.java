package com.trainee.geetanjali.java;
import java.util.*;
public class SimpleArraySum {
    public static void main(String args[]){
        int sum=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int n=s.nextInt();
        try{
        System.out.println("Enter array elements:");
        int a[]=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=s.nextInt();
            sum=sum+a[i];}
            System.out.println("Sum of elements:"+sum);}
        catch(InputMismatchException IME){
            System.out.println("Enter a valid input");
            }

    }

}
