package com.trainee.vamsi;
import java.util.Scanner;


public class ArraySum
{
    public static void main(String[] args)
    {
        int n;int sum =0;
        Scanner s = new Scanner (System.in);
        System.out.println("no.of elements in array");
        n=s.nextInt();
        int[] ar = new int[n];
        System.out.println("enter values");
        for(int i=0;i<n;i++)
        {
            ar[i] = s.nextInt();
        }
        for(int k=0;k<n;k++)
        {
            sum = sum+ar[k];
        }
        System.out.println(sum);
    }
}
