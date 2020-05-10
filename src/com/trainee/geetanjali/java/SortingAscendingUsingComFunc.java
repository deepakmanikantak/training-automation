package com.trainee.geetanjali.java;

public class SortingAscendingUsingComFunc extends CommonFunctions {
    public static void main(String args[]){
        SortingAscendingUsingComFunc sacf= new SortingAscendingUsingComFunc();
        int a[]=sacf.sortingAscending(sacf.array());
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
