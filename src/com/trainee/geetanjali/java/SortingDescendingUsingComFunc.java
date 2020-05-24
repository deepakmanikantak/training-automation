package com.trainee.geetanjali.java;

public class SortingDescendingUsingComFunc extends CommonFunctions {
    public static void main(String args[]) {
        SortingDescendingUsingComFunc sdcf = new SortingDescendingUsingComFunc();
        int a[] = sdcf.sortingDescending(sdcf.array());
        System.out.print("Sorting in descending:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
