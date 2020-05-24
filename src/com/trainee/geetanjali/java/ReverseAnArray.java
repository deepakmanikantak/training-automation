package com.trainee.geetanjali.java;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseAnArray {
    int j=0;

    public void reverse(int a[],int b[],int n) {
            for(int i=n;i>0;i--,j++){
              b[j]=a[i-1];
            System.out.print(b[j]+" ");
            }
            }


        public static void main (String args[]){
            Scanner s = new Scanner(System.in);
            System.out.println("Enter size of an array:");
            int n = s.nextInt();
            int a[] = new int[n];
            int b[]=new int[n];
            for (int i = 0; i < n; i++) {
                System.out.println("Enter a["+i+"]:");
                a[i] = s.nextInt();
            }
            ReverseAnArray rev=new ReverseAnArray();
            rev.reverse(a,b,n);

        }
    }

