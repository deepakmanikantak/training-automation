package com.trainee.aizaz.java;
import java.util.Scanner;
/**
 * the purpose of this array is to print pairs of elements which is equal tos sum
 * ::::for example::::
 * sum=5
 * arr=1,4,5,1,3,2,0
 * so the pairs are (1,4),(4,1),(5,0),(3,2)
 */
public class PrintingPairsEqualsSum extends CommonMethods {
    public static void main(String[] args) {
        PrintingPairsEqualsSum p = new PrintingPairsEqualsSum();
        int[] arr = p.arraySet();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for which you want to find pairs:");
        int sum = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println("(" + arr[i] + "," + arr[j] + ")");

                }
            }
        }
    }
}