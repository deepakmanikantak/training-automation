package com.trainee.geetanjali.java;

import java.util.Scanner;

public class EqualityOfTwoMatrices {
    public static void main(String args[]){
        int i=0;boolean equalOrNot=true;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n=s.nextInt();
        String[] a=new String[n];
        String[] b=new String[n];
        for(i=0;i<n;i++){
            System.out.print("Enter a["+i+"]=");
            a[i]=s.next();
        }
        for(i=0;i<n;i++){
            System.out.print("Enter b["+i+"]=");
            b[i]=s.next();
        }
            if(a.length==b.length){
                for(i=0;i<n;i++) {
                    if (a[i] != b[i]) {
                        equalOrNot = false;
                    }
                }
            }
              else {
                  equalOrNot=false;
        }
              if(equalOrNot)
                  System.out.println("Both arrays are equal");
              else
                  System.out.println("Both are not equal");
    }
}
