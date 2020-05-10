package com.trainee.geetanjali.java;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicatesInArray extends CommonFunctions {
    int j=0;
    public void removeDuplicates(int[] a) {
       for(int i=0;i<a.length-1;i++){
           if(a[i]!=a[i+1]){
               a[j++]=a[i];

           }
       }
       a[j++]=a[a.length-1];
       for(int i=0;i<j;i++) {
            System.out.println(a[i]+" ");
       }
           System.out.println(Arrays.toString(a));

    }
    public static void main(String args[]){
            RemoveDuplicatesInArray removeArray=new RemoveDuplicatesInArray();
            int a[]=removeArray.sortingAscending(removeArray.array());
            removeArray.removeDuplicates(a);
        }
    }

