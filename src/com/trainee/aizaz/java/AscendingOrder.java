package com.trainee.aizaz.java;
import java.util.*;

public class AscendingOrder {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the element of arr["+i+"]");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int e:arr){
            System.out.println(e);

        }



    }
}
